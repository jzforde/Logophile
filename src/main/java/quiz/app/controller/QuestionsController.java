package quiz.app.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import quiz.app.model.Option;
import quiz.app.model.Question;

import java.util.ArrayList;
import java.util.List;

@RestController
public class QuestionsController {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @RequestMapping("/questions")
    List<Question> getAllQuestions() {
        return this.jdbcTemplate.query
                ("SELECT *, o.id as oid " +
                        "FROM questions q " +
                        "INNER JOIN options o ON o.quiz_id = q.id",
                        rs -> {

                            List<Question> list = new ArrayList<Question>();
                            while (rs.next()) {
                                Question q = new Question();
                                q.setQuestion(rs.getString("question"));
                                q.setQuestionId(rs.getInt("id"));

                                if (!list.contains(q)) {
                                    q.setOptions(new ArrayList<Option>());
                                    list.add(q);
                                } else {
                                    q = list.get(list.indexOf(q));
                                }

                                Option o = new Option();
                                // map option here
                                o.setId(rs.getInt("oid"));
                                o.setOption(rs.getString("option"));
                                o.setQuiz_id(rs.getInt("quiz_id"));
                                q.getOptions().add(o);

                            }
                            return list;
                        });

    }
    //Sends the answers that the user selected back to the database
    @RequestMapping(value = "/user-answers", method = RequestMethod.POST)
    public void userAnswers(@RequestBody UserAnswerRequest answer) {
        System.out.println(answer.optionId);
        System.out.println(answer.questionId);
        jdbcTemplate.update
                ("INSERT INTO user_answers(selected_option, quiz_id) VALUES(?,?)",
                        answer.optionId, answer.questionId);


    }
    public static class UserAnswerRequest {
        public int optionId;
        public int questionId;
    }

    //Calculates the user's score in the database and returns the score
    @RequestMapping(value = "/user-score", method = RequestMethod.GET)
    public Double userScore() {
        double score = jdbcTemplate.queryForObject("select avg(points) as score \n" +
                "from (select case ua.selected_option when o.id then 1.0 else 0.0 end as points\n" +
                "from options o\n" +
                "left outer join user_answers ua on ua.quiz_id = o.quiz_id\n" +
                "where o.correct_answer = true);", Double.class);
        return score;
    }



}


