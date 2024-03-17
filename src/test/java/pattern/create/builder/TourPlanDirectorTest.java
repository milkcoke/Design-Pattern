package pattern.create.builder;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

class TourPlanDirectorTest {

    @DisplayName("디렉터로 생성 과정 숨겨서 계획 생성하기")
    @Test
    void createPlanWithDirector() {
        var planBuilder = new CalendarTourBuilder();
        TourPlanDirector planDirector = new TourPlanDirector(planBuilder);
        TourPlan tourPlan = planDirector.createClimbingPlan(LocalDate.now(), LocalDate.now());

        System.out.println(tourPlan.toString());
    }

    @DisplayName("계획 빌더를 통해 체이닝으로 계획 생성하기")
    @Test
    void createPlanWithBuilder() {
        var planBuilder = new CalendarTourBuilder();
        TourPlan tourPlan = planBuilder
                .title("무등산")
                .date(LocalDate.now(), LocalDate.now())
                .build();

        System.out.println(tourPlan.toString());
    }
}
