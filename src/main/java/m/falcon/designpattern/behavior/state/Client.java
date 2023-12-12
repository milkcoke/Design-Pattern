package m.falcon.designpattern.behavior.state;

public class Client {

    public static void main(String[] args) {
        Student vladimir = new Student("valdimir");
        Student falcon = new Student("falcon");

        OnlineCourse onlineCourse = new OnlineCourse(); // 기본적으로 Draft 상태로 시작.
        onlineCourse.registerStudent(vladimir);
        onlineCourse.registerReview(vladimir,"나 블라디미르인데 이 수업 진짜 안좋음");

    }
}