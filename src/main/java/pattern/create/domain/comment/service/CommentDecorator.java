package pattern.create.domain.comment.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

// 생성자 주입
@Component
@RequiredArgsConstructor
public abstract class CommentDecorator implements CommentService {
    // 구현체가 아닌 Interface(역할) 에만 의존 => DIP 원칙 준수
    private final CommentService commentService;

    @Override
    public void addComment(String comment) {
        this.commentService.addComment(comment);
    }

    @Override
    public void printAllComments() {
        this.commentService.printAllComments();
    }
}
