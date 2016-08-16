package quiz.app.controller;

import org.springframework.stereotype.Service;
import quiz.app.model.Option;
import quiz.app.model.Question;
import quiz.app.model.Quiz;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jillianforde on 7/22/16.
 */
@Service
public class QuizEngine implements Quiz{

    private List<Question> questions;
    private List<Option> optionsForQuestion1 = new ArrayList<> ();
    protected List<Option> optionsForQuestion2 = new ArrayList<> ();
    List<Option> optionsForQuestion3 = new ArrayList<> ();
    List<Option> optionsForQuestion4 = new ArrayList<> ();
    List<Option> optionsForQuestion5 = new ArrayList<> ();

    public QuizEngine ()
        {
            loadQuestions();
        }
        //Create questions with their answers
    private void loadQuestions ()
    {
        questions = new ArrayList<>();

        optionsForQuestion1.add (new Option (true, "cavort"));
        optionsForQuestion1.add (new Option (false, "obsolesence"));
        optionsForQuestion1.add (new Option (false, "definiens"));
        optionsForQuestion1.add (new Option (false, "shivaree"));
        Question question1 = new Question (1,
                "To prance or jump around excitedly", optionsForQuestion1);
        questions.add (question1);


        optionsForQuestion2.add (new Option (false, "telesthesia"));
        optionsForQuestion2.add (new Option (true, "aggrandize"));
        optionsForQuestion2.add (new Option (false, "oxter"));
        optionsForQuestion2.add (new Option (false, "agog"));
        Question question2 = new Question (2,
                "To increase in size or intensity",
                optionsForQuestion2);
        questions.add (question2);


        optionsForQuestion3.add (new Option (false, "gainsay"));
        optionsForQuestion3.add (new Option (true, "middling"));
        optionsForQuestion3.add (new Option (false, "moonbow"));
        optionsForQuestion3.add (new Option (false, "quidnunc"));
        Question question3 = new Question (3,
                "Mediocre or ordinary",
                optionsForQuestion3);
        questions.add (question3);


        optionsForQuestion4.add (new Option (false, "blithe"));
        optionsForQuestion4.add (new Option (false, "cynosure"));
        optionsForQuestion4.add (new Option (false, "syzygy"));
        optionsForQuestion4.add (new Option (true, "hidebound"));
        Question question4 = new Question (4,
                "Narrow and rigid in opinion",
                optionsForQuestion4);
        questions.add (question4);


        optionsForQuestion5.add (new Option (true, "scroop"));
        optionsForQuestion5.add (new Option (false, "bucolic"));
        optionsForQuestion5.add (new Option (false, "pifle"));
        optionsForQuestion5.add (new Option (false, "aver"));
        Question question5 = new Question (5,
                "To emit a harsh, grating sound",
                optionsForQuestion5);
        questions.add (question5);
    }

    @Override
    public String getQuizName ()
    {
        // TODO Auto-generated method stub
        return "Words";
    }

    @Override
    public int getNumberOfQuestions ()
    {
        // TODO Auto-generated method stub
        return questions.size ();
    }

    @Override
    public List<Question> getQuestions ()
    {
        // TODO Auto-generated method stub
        return questions;
    }

    void setQuestions (List<Question> questions)
    {
        this.questions = questions;
    }

    private boolean isCorrect (Question q)
    {
        for (Option opt : q.getOptions ())
        {
            if (q.getGivenAnswer().equals (opt.getOption ()))
            {
                return opt.isCorrectAnswer ();

            }
        }
        return false;
    }

    public String getResults ()
    {
        double numberCorrect = 0;
        for (Question question : questions)
        {
            if (isCorrect (question))
            {
                numberCorrect++;
            }

            else
            {
                //create a list of the incorrect words and their respective definition
                //create a table of the words to work on
                //use CSS to manipulate when and position of this table being shown to the user
            }
        }
        double percentRight = (numberCorrect/questions.size()) * 100;
        return "Your score: " + percentRight + "%";

    }

}
