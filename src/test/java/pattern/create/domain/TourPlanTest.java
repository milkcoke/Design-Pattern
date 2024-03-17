package pattern.create.domain;

import pattern.create.builder.CalendarTourBuilder;
import pattern.create.builder.TourPlan;
import pattern.create.builder.TourPlanDirector;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.MissingFormatArgumentException;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class TourPlanTest {

    private CalendarTourBuilder calendarTourBuilder;
    @BeforeEach()
    void beforeEach(){
        calendarTourBuilder = new CalendarTourBuilder();
    }

    @DisplayName("생성자로 시작-종료 일자로 여행 계획 세우기")
    @Test
    void createTourPlanTest() {
        TourPlan shortTrip = new TourPlan();
        // 시작 - 종료일과 N박 M일은 필수다.
        // 시작 - 종료일을 지정했음에도 별도로 nights 와 days 를 지정할 수 있게하면
        // 데이터 정합성이 깨지게된다.
        // 1. nights, days 를 직접 지정하지 않고
        // startDate - endDate 만으로 값이 정해지도록 강제하려면 ?
        // 2. 날짜 정보는 Required, 나머지 정보는 Optional 로 지정하고 싶다면?
        var days = 3;
        var nights = days - 1;
        shortTrip.changeDays(days);

        assertThat(shortTrip.getDays()).isEqualTo(days);
        assertThat(shortTrip.getNights()).isEqualTo(nights);
    }

    @DisplayName("Start and end date are required")
    @Test
    void createTourPlanWithDateRequired() {
        // 이렇게 덩그러니 생성하는걸 금지시켜야함.
        TourPlan shortTrip = new TourPlan();

        var days = 3;
        var nights = days - 1;
        shortTrip.changeDays(days);
    }

    @DisplayName("시작일이 종료일 초과 에러")
    @Test
    void createCalendarExceptionTest() throws IllegalAccessException {
        assertThrows(IllegalArgumentException.class, () ->
                this.calendarTourBuilder
                        .date(LocalDate.of(2023, 2, 15), LocalDate.now())
                        .build()
        );
    }

    @DisplayName("날짜 미지정 오류")
    @Test
    void createCalendarWithoutDate() throws MissingFormatArgumentException {
        assertThrows(MissingFormatArgumentException.class, () -> this.calendarTourBuilder
                .title("부다 페스트 가을 여행")
                .build()
        );
    }

    @DisplayName("성공적인 계획 여행 생성")
    @Test
    void createCalendar() throws IllegalArgumentException {
        TourPlan tourPlan = this.calendarTourBuilder
                                .title("부다 페트스 가을 여행")
                                .date(LocalDate.of(2023, 01, 15), LocalDate.of(2023, 01, 21))
                                .build();

        assertThat(tourPlan.getNights()).isEqualTo(6);
        assertThat(tourPlan.getDays()).isEqualTo(7);
    }
    // 이런 로직이 자주 재사용되야 한다면
    // ex) 여행 판매사
    // Director 라는 것을 구현하여 재사용성을 높일 수 있다.

    @DisplayName("하와이 여행 디렉터로 패키지 상품 생성")
    @Test
    void createHawaiiPackageTourTest() {
        TourPlanDirector tourPlanDirector = new TourPlanDirector(new CalendarTourBuilder());
        TourPlan tourPlan = tourPlanDirector.createHawaiiPackageTourPlan(LocalDate.of(2023, 01, 23), LocalDate.of(2023, 01, 27));

        assertThat(tourPlan.getDays()).isSameAs(5);
        assertThat(tourPlan.getNights()).isSameAs(4);
    }

    @DisplayName("동네 뒷산 등산 패키지 상품 생성")
    @Test
    void createClimbingTourTest() {
        TourPlanDirector tourPlanDirector = new TourPlanDirector(new CalendarTourBuilder());
        TourPlan tourPlan = tourPlanDirector.createClimbingPlan(LocalDate.of(2023, 01, 28), LocalDate.of(2023, 01, 28));
        assertThat(tourPlan.getDays()).isSameAs(1);
        assertThat(tourPlan.getNights()).isSameAs(0);
    }
}
