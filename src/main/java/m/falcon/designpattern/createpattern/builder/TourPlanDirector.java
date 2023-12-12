package m.falcon.designpattern.createpattern.builder;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
@RequiredArgsConstructor
public class TourPlanDirector {
    private final TourPlanBuilder tourPlanBuilder;

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
