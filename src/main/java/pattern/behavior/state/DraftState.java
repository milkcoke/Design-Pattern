package pattern.behavior.state;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class DraftState implements State {
    // 일종의 컨텍스트
    private final OnlineCourse onlineCourse;
    @Override
    public void addStudent(Student student) {
        this.onlineCourse.addStudent(student);
        // 등록된 학생 수가 2명 이상이면 상태 변경
        if (this.onlineCourse.getStudents().size() > 1) {
            this.onlineCourse.changeState(new PrivateState(this.onlineCourse));
        }
    }

    @Override
    public void addReview(Student student, String review) {
        throw new UnsupportedOperationException("드래프트 상태에서는 리뷰를 남길 수 없습니다.");
    }
}
