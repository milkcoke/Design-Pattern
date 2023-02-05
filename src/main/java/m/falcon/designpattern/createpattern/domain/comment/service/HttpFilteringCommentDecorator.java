package m.falcon.designpattern.createpattern.domain.comment.service;

public class HttpFilteringCommentDecorator extends CommentDecorator {
    public HttpFilteringCommentDecorator(CommentService commentService) {
        super(commentService);
    }
    @Override
    public void addComment(String comment) {
        if (isSpamComment(comment)) {
            return;
        }
        super.addComment(comment);
    }

    private Boolean isSpamComment(String comment) {
        return comment.contains("http://");
    }
}
