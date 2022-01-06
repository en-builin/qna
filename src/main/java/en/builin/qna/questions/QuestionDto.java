package en.builin.qna.questions;

import en.builin.qna.topics.Topic;
import en.builin.qna.users.User;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;

@Data
@NoArgsConstructor
public class QuestionDto {

    private Long id;
    private User author;
    private Topic topic;
    private String text;
    private Instant createdAt;
    private Instant updatedAt;
}
