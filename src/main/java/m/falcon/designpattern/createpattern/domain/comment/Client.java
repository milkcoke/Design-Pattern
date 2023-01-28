package m.falcon.designpattern.createpattern.domain.comment;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import m.falcon.designpattern.createpattern.domain.comment.service.CommentService;
import org.springframework.stereotype.Component;

@Component
@Getter
@RequiredArgsConstructor
public class Client {
    private final CommentService commentService;
    public void writeComment(String comment) {
        this.commentService.addComment(comment);
    }
}
