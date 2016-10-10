package quiz.app.model;

import java.util.List;


public interface Quiz {
    String getQuizName();
    int getNumberOfQuestions();
    List<Question> getQuestions();
    String getResults();

}
