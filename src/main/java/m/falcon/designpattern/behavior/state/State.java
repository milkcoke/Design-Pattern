package m.falcon.designpattern.behavior.state;

public interface State {
    void addStudent(Student student);
    void addReview(Student student, String review);
}
