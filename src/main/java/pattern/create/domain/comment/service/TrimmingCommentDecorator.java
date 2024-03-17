package pattern.create.domain.comment.service;

public class TrimmingCommentDecorator extends CommentDecorator {
    public TrimmingCommentDecorator(CommentService commentService) {
        super(commentService);
    }
    @Override
    public void addComment(String comment) {
        super.addComment(trimComment(comment));
    }

    private String trimComment(String comment) {
        return comment.replace("..", "");
    }
}
