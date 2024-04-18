package org.mvp.simpleboard;

import org.junit.jupiter.api.Test;
import org.mvp.simpleboard.question.Question;
import org.mvp.simpleboard.question.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class SimpleBoardApplicationTests {

    @Autowired
    private QuestionRepository questionRepository;

    @Test
    void testJpa() {
        Question q1 = new Question();
        q1.setSubject("sb가 무었인가요?");
        q1.setContent("sb에 대해 알고 싶어요");
        q1.setCreateDate(LocalDateTime.now());
        this.questionRepository.save(q1);

        Question q2 = new Question();
        q2.setSubject("스프링 부트 모델 질문");
        q2.setContent("id는 자동 생성인가요?");
        q2.setCreateDate(LocalDateTime.now());
        this.questionRepository.save(q2);

        List<Question> all = this.questionRepository.findAll();
        assertEquals(2, all.size());

    }

    @Test
    void contextLoads() {
    }

}
