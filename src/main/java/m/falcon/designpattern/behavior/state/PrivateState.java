package m.falcon.designpattern.behavior.state;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class PrivateState implements State {
    private final OnlineCourse onlineCourse;

    @Override
    public void addStudent(Student student) {
        if (student.isRegistered(this.onlineCourse)) {
            this.onlineCourse.addStudent(student);
        } else {
            throw new UnsupportedOperationException("프라이빗 코스에 사전 등록된 학생만 정식 등록 가능합니다.");
        }
    }

    @Override
    public void addReview(Student student, String review) {
        if (this.onlineCourse.isRegisteredStudent(student)) {
            this.onlineCourse.addReview(review);
        } else {
            throw new UnsupportedOperationException("프라이빗 코스에 사전 등록된 학생만 리뷰를 남길 수 있습니다.");
        }
    }
}
