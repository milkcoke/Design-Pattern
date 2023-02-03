package m.falcon.designpattern.behaviorpattern.statepattern;

public interface State {
    void addStudent(Student student);
    void addReview(Student student, String review);
}
