package pattern.create.builder;

import java.time.LocalDate;

public interface TourPlanBuilder {
    // interface 타입과 동일한 리턴타입 => method chaining 가능.
    // Required 한 메소드와 Optional 한 속성을 지정하는 메소드를 분리

    /**
     * Required
     * @param title
     */
    TourPlanBuilder title(String title);

    /**
     * Required
     * @param (startDate, endDate)
     */
    TourPlanBuilder date(LocalDate startDate, LocalDate endDate) throws IllegalArgumentException;

    // Optional
    // date() 만 지정되면 알아서 days, nights 지정.
    // 오히려 아예 지정되지 않는게 맞음.
    TourPlanBuilder days(int days);

    /**
     * Oprtional
     * @param stayPlace
     */
    TourPlanBuilder stayPlace(String stayPlace);

    // 이 안에서 빌드 시점에 데이터를 검증할 수 있음.
    // ex) Required 가 모두 빠짐없이 입력되었는가?
    TourPlan build();
}
