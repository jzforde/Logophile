package quiz.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import quiz.app.model.Quiz;

import java.util.HashMap;
import java.util.Map;


@Controller
public class QuizController {

    private Map<String, Object> map = new HashMap<>();

    //mapping to bring user to the first question in the quiz
    @RequestMapping("/start.do")
    public ModelAndView start()
    {
        Quiz q = new QuizEngine();
        this.map.put("thisQuiz", q);
        this.map.put("index", 0);
        return new ModelAndView("start-quiz", "thisMap", this.map);
    }

    //mapping to bring user to the welcome page of the quiz
    @RequestMapping("/quiz")
    public String quizStart(ModelMap modelMap){
            Quiz quiz = new QuizEngine();
            modelMap.put("thisQuiz", quiz);
            modelMap.put("index", 0);
            return "homepageQuiz";
    }

    //
    @RequestMapping(value = "/next.do", method = RequestMethod.POST)
    public ModelAndView next(@RequestParam String option)
    {
        int i =(int)map.get ("index");
        Quiz q = ((Quiz)map.get("thisQuiz"));
        q.getQuestions().get(i).setGivenAnswer(option);
        i++;
        if (i >= q.getQuestions().size ()) {
            return new ModelAndView("results", "theResults", q.getResults());
        }
        map.put ("index", i);
        return new ModelAndView("start-quiz", "thisMap", map);
    }



}
