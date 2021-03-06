package quiz.app.model;

/**
 * POJO of an option to a question
 */

public class Option {
    private int id;
    private boolean correctAnswer;
    private String option;
    private int quiz_id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Option() {

    }

    public int getQuiz_id() {
        return quiz_id;
    }

    public void setQuiz_id(int quiz_id) {
        this.quiz_id = quiz_id;
    }

    public Option(boolean correctAnsr, String optn)
    {
        option = optn;
        correctAnswer = correctAnsr;
    }

    public boolean isCorrectAnswer ()
    {
        return correctAnswer;
    }

    public void setCorrectAnswer (boolean correctAnswer)
    {
        this.correctAnswer = correctAnswer;
    }

    public String getOption ()
    {
        return option;
    }


    public void setOption (String option)
    {
        this.option = option;
    }

    @Override
    public int hashCode ()
    {
        final int prime = 31;
        int result = 1;
        result = prime * result + (correctAnswer
                ? 1231
                : 1237);
        result = prime * result + ((option == null)
                ? 0
                : option.hashCode ());
        return result;
    }

    @Override
    public boolean equals (Object obj)
    {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass () != obj.getClass ())
            return false;
        Option other = (Option) obj;
        if (correctAnswer != other.correctAnswer)
            return false;
        if (option == null)
        {
            if (other.option != null)
                return false;
        }
        else if (!option.equals (other.option))
            return false;
        return true;
    }

    @Override
    public String toString ()
    {
        return "Option [correctAnswer=" + correctAnswer + ", option=" + option
                + "]";
    }

}
