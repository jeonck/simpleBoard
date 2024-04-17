package org.mvp.simpleboard.answer;

import jakarta.persistence.*;
import jakarta.persistence.ManyToOne; // many answer to one question
import lombok.Getter;
import lombok.Setter;
import org.mvp.simpleboard.question.Question;

import java.time.LocalDateTime;

@Getter
@Setter
@Entity
public class Answer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(columnDefinition = "TEXT")
    private String content;

    private LocalDateTime createDate;

        @ManyToOne
        private Question question;

}
