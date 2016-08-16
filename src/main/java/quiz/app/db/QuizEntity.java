package quiz.app.db;

import quiz.app.model.Option;
import quiz.app.model.Question;

import javax.persistence.*;
import java.util.List;

/**
 * Created by jillianforde on 7/19/16.
 */
public class QuizEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name="QUESTIONS")
    private List<Question> questions;


    private List<Option>optionsForQuestion1;
    private List<Option>optionsForQuestion2;

//    @Entity
//    @Table(name="USER")
    private class User {
        @Column(name="NAME")
        private String name;

        @Column(name="EMAIL")
        private String email;
    }

//    @Entity
//    @Table(name="RESULT")
    private class Result {
        @Column(name="QUESTIONS_RIGHT")
        private boolean isCorrect;

        @Column(name="QUESTIONS_WRONG")
        private boolean isWrong;
    }

}
