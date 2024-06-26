package org.mvp.simpleboard;

import org.junit.jupiter.api.Test;
import org.mvp.simpleboard.answer.Answer;
import org.mvp.simpleboard.answer.AnswerRepository;
import org.mvp.simpleboard.question.Question;
import org.mvp.simpleboard.question.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class SimpleBoardApplicationTests {

    @Autowired
    private QuestionRepository questionRepository;
//
    @Autowired
    private AnswerRepository answerRepository;

    @Test
    void testJpa() {
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

        Optional<Question> oq = this.questionRepository.findById(2);
        assertTrue(oq.isPresent());
        Question q = oq.get();

        Answer a = new Answer();
        a.setContent("네 자동으로 생성됩니다.");
        a.setQuestion(q);
        a.setCreateDate(LocalDateTime.now());
        this.answerRepository.save(a);

//        Optional<Answer> oa = this.answerRepository.findById(1);
//        assertTrue(oa.isPresent());
//        Answer a = oa.get();
//        assertEquals(2, a.getQuestion().getId());
    }

    @Test
    void contextLoads() {
    }

}
