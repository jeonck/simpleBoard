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
        Question q1 = new Question();
        q1.setSubject("sb가 무엇인가요?");
        q1.setContent("sb에 대해 알고 싶어요");
        q1.setCreateDate(LocalDateTime.now());
        this.questionRepository.save(q1);

        Question q2 = new Question();
        q2.setSubject("스프링 부트 모델 질문");
        q2.setContent("id는 자동 생성인가요?");
        q2.setCreateDate(LocalDateTime.now());
        this.questionRepository.save(q2);

        return "안녕하세요. Simple Board 에 오신 것을 환영합니다.";
    }

    @GetMapping("/sb2")
    @ResponseBody
    public void sb2() {
        List<Question> list = this.questionRepository.findAll();

        System.out.println(list.size());
    }


}
