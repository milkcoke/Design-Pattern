package m.falcon.designpattern.createpattern.domain.comment.service;

import lombok.Getter;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@Getter
public class DefaultCommentService implements CommentService {
    private final List<String> comments = new ArrayList<String>();

    @Override
    public void addComment(String comment) {
        this.comments.add(comment);
    }

    @Override
    public void printAllComments() {
        for (var comment : comments) {
            System.out.println(comment);
        }
    }
}
