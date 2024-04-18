package org.mvp.simpleboard;

import org.mvp.simpleboard.question.Question;
import org.mvp.simpleboard.question.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.time.LocalDateTime;
import java.util.List;

@Controller
public class MainController {

    @Autowired
    private QuestionRepository questionRepository;

    @GetMapping("/sb")
    @ResponseBody
    public String index() {
        return "안녕하세요. Simple Board 에 오신 것을 환영합니다.";
    }

//    @GetMapping("/sb2")
//    @ResponseBody
//    public void sb2() {
//        List<Question> list = this.questionRepository.findAll();
//
//        System.out.println(list.size());
//    }
}
