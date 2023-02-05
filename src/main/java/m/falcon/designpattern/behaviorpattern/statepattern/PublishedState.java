package m.falcon.designpattern.behaviorpattern.statepattern;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class PublishedState implements State {
    private final OnlineCourse onlineCourse;

    @Override
    public void addStudent(Student student) {
        this.onlineCourse.addStudent(student);
    }

    @Override
    public void addReview(Student student, String review) {
        this.onlineCourse.addReview(review);
    }
}
