package m.falcon.designpattern.createpattern.domain.plan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class TourPlanDirector {
    private final TourPlanBuilder tourPlanBuilder;

    @Autowired
    public TourPlanDirector(TourPlanBuilder tourPlanBuilder) {
        this.tourPlanBuilder = tourPlanBuilder;
    }

    public TourPlan createHawaiiPackageTourPlan(LocalDate startDate, LocalDate endDate) {
        return this.tourPlanBuilder
                .title("Hawaii")
                .date(startDate, endDate)
                .build();
    }

    public TourPlan createClimbingPlan(LocalDate startDate, LocalDate endDate) {
        return this.tourPlanBuilder
                .title("동네뒷산")
                .date(startDate, endDate)
                .build();
    }
}
