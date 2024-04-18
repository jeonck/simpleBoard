package org.mvp.simpleboard;

import org.junit.jupiter.api.Test;
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

//        List<Question> all = this.questionRepository.findAll();
//        assertEquals(2, all.size());

//        Optional<Question> oq = this.questionRepository.findById(1);
//        if(oq.isPresent()) {
//            Question q = oq.get();
//            assertEquals("sb가 무엇인가요?", q.getSubject());
//        }
//        Question q = this.questionRepository.findBySubject("sb가 무엇인가요?");
//        assertEquals(1, q.getId());

//        Question q = this.questionRepository.findBySubjectAndContent("sb가 무엇인가요?", "sb에 대해 알고 싶어요");
//        assertEquals(1, q.getId());

//        List<Question> qList = this.questionRepository.findBySubjectLike("sb%");
//        Question q = qList.get(0);
//        assertEquals("sb가 무엇인가요?", q.getSubject());
        Optional<Question> oq = this.questionRepository.findById(1);
        assertTrue(oq.isPresent());
        Question q = oq.get();
        q.setSubject("수정된 제목");
        this.questionRepository.save(q);

    }

    @Test
    void contextLoads() {
    }

}
