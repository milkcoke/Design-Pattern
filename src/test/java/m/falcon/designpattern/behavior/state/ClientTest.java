package m.falcon.designpattern.behavior.state;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClientTest {
    private Student falcon;
    private Student vladimir;
    private OnlineCourse onlineCourse;

    @BeforeEach
    void beforeEach() {
        falcon = new Student("falcon");
        vladimir = new Student("vladimir");
        onlineCourse = new OnlineCourse();
    }

    @DisplayName("드래프트 상태 리뷰 등록 실패")
    @Test
    void addReviewFailTest() {
        assertThrows(UnsupportedOperationException.class, () -> onlineCourse.registerReview(falcon, "나 팰콘인데 이거 ㄹㅇ 개좋음"));
    }

    @DisplayName("프리이빗 상태 사전 미등록 학생 등록 실패")
    @Test
    void addStudentFailTest() {
        this.onlineCourse.changeState(new PrivateState(onlineCourse));

        falcon.registerCourse(onlineCourse);
        onlineCourse.registerStudent(falcon); // 성공

        // vladimir 는 미등록
        assertThrows(UnsupportedOperationException.class, () -> onlineCourse.registerStudent(vladimir));
    }

    @DisplayName("공개 수업은 모든 학생 등록 및 리뷰 등록 성공")
    @Test
    void addStudentsAndReviewsTest() {
        this.onlineCourse.changeState(new PublishedState(onlineCourse));

        onlineCourse.registerStudent(falcon);
        onlineCourse.registerReview(vladimir, "나 블라디인데 이거 듣지도 않았지만 리뷰 등록 된다해서 해봄 ㅋ");
    }
}