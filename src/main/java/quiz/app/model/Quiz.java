package quiz.app.model;

import java.util.List;

/**
 * Created by jillianforde on 7/19/16.
 */
//@Entity
//@Table(name="QUIZ")
public interface Quiz {
    public String getQuizName();
    public int getNumberOfQuestions();
    public List<Question> getQuestions();
    public String getResults();

}
