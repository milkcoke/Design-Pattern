package m.falcon.designpattern.createpattern.builderpattern.plan;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;
import java.util.MissingFormatArgumentException;

// 캘린더 기반의 여행 계획을 기록하므로
// 시작-종료일이 필수.
@Getter
@NoArgsConstructor(access =  AccessLevel.PUBLIC)
public class CalendarTourBuilder implements TourPlanBuilder {
    private String title;
    private int nights;
    private int days;

    private LocalDate startDate;

    private LocalDate endDate;

    private String stayPlace;

    private List<DetailPlan> plans = new ArrayList();

    private void updateNightsAndDaysByDate(LocalDate startDate, LocalDate endDate) {
        this.days = Period.between(startDate, endDate).getDays() + 1;
        this.nights = days - 1;
    }
    @Override
    public TourPlanBuilder title(String title) {
        this.title = title;
        return this;
    }

    @Override
    public TourPlanBuilder date(LocalDate startDate, LocalDate endDate) throws IllegalArgumentException {

        if (endDate.isBefore(startDate)) {
            throw new IllegalArgumentException("startDate should precede endDate.");
        }
        this.startDate = startDate;
        this.endDate = endDate;

        // 자동으로 N박 N+1일이 정해짐
        updateNightsAndDaysByDate(startDate, endDate);

        return this;
    }

    @Override
    public TourPlanBuilder days(int days) {
        this.days = days;
        return this;
    }

    @Override
    public TourPlanBuilder stayPlace(String stayPlace) {
        this.stayPlace = stayPlace;
        return this;
    }

    @Override
    public TourPlan build() {
        if (this.startDate == null || this.endDate == null) {
            throw new MissingFormatArgumentException("You are required to input " + "startDate and endDate");
        } else if (this.title == null) {
            throw new MissingFormatArgumentException("You are required to input " + "title");
        }

        return new TourPlan(title, nights, days, startDate, endDate, stayPlace, plans);
    }
}
