package pattern.behavior.state;

import lombok.Getter;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Getter
public class OnlineCourse {
    private State state = new DraftState(this);
    private Set<Student> students = new HashSet<>();
    private List<String> reviews = new ArrayList<>();

    public void changeState(State newState) {
        this.state = newState;
    }

    public boolean isRegisteredStudent(Student student) {
        return this.students.contains(student);
    }

    // add -> 직접 online course 에 적용
    public void addStudent(Student student) {
        this.students.add(student);
    }

    public void addReview(String review) {
        this.reviews.add(review);
    }
    // register -> state 에 위임.
    public void registerStudent(Student student) {
        if (isRegisteredStudent(student)) throw new IllegalArgumentException("이미 등록된 학생입니다.");
        this.state.addStudent(student);
    }

    public void registerReview(Student student, String review) {
        this.state.addReview(student, review);
    }
}
