package m.falcon.designpattern.behavior.state;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.HashSet;
import java.util.Set;

@Getter
@RequiredArgsConstructor
public class Student {

    private String name;
    public Student(String name) {
        this.name = name;
    }
    private Set<OnlineCourse> registeredCourses = new HashSet<>();

    public boolean isRegistered(OnlineCourse onlineCourse) {
        return this.registeredCourses.contains(onlineCourse);
    }

    public void registerCourse(OnlineCourse onlineCourse) {
        this.registeredCourses.add(onlineCourse);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }
}

