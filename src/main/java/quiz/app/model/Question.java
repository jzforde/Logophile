package quiz.app.model;

import javax.persistence.*;
import java.util.List;

/**
 * Created by jillianforde on 7/19/16.
 */

@Entity
public class Question {
    @Id
    @Column(name = "id")
    private int questionId;

    @Column(name = "question")
    private String question;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "OPTIONS",
            joinColumns = @JoinColumn(name = "ID"),
            inverseJoinColumns = @JoinColumn(name = "QUIZ_ID")
    )
    private List<Option> options;

    private String givenAnswer;

    public String getGivenAnswer ()
    {
        return givenAnswer;
    }

    public void setGivenAnswer (String givenAnswer)
    {
        this.givenAnswer = givenAnswer;
    }

    public Question(int questionId, String question, List<Option> options)
    {
        this.questionId = questionId;
        this.question = question;
        this.options = options;
    }

    public int getQuestionId ()
    {
        return questionId;
    }

    public void setQuestionId (int questionId)
    {
        this.questionId = questionId;
    }

    public String getQuestion ()
    {
        return question;
    }

    public void setQuestion (String question)
    {
        this.question = question;
    }

    public List<Option> getOptions ()
    {
        return options;
    }

    public void setOptions (List<Option> options)
    {
        this.options = options;
    }

}
