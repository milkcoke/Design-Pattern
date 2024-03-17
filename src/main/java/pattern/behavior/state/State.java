package pattern.behavior.state;

public interface State {
    void addStudent(Student student);
    void addReview(Student student, String review);
}
