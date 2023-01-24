package m.falcon.designpattern.domain.comment;

import m.falcon.designpattern.domain.comment.service.CommentService;
import m.falcon.designpattern.domain.comment.service.DefaultCommentService;
import m.falcon.designpattern.domain.comment.service.HttpFilteringCommentDecorator;
import m.falcon.designpattern.domain.comment.service.TrimmingCommentDecorator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ClientCommentTest {
    private CommentService commentService = new DefaultCommentService();
    private static boolean enabledHttpFilter = true;
    private static boolean enabledTrimFilter = true;

    @DisplayName("Http 및 Trim 필터 동시 적용")
    @Test
    void dynamicCommentPolicyApplyTest() {
        // 💡Decorator 를 통한 생성자 주입으로 Http, Trimming 동시 필터 적용
        if (enabledHttpFilter) {
            commentService = new HttpFilteringCommentDecorator(commentService);
        }
        if (enabledTrimFilter) {
            commentService = new TrimmingCommentDecorator(commentService);
        }

        Client client = new Client(commentService);
        client.writeComment("카르마..");
        client.writeComment("http://karma.com");
        client.writeComment("https://karma.com");
        client.getCommentService().printAllComments();
    }
}