package pattern.create.builder;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Getter
@NoArgsConstructor(access = AccessLevel.PUBLIC)
// Don't recommend input al fields into constructor
@AllArgsConstructor(access = AccessLevel.PUBLIC)
public class TourPlan {
    private String title;
    private int nights;
    private int days;

    private LocalDate startDate;

    private LocalDate endDate;

    private String stayPlace;

    private List<DetailPlan> plans = new ArrayList();


    // nights - days 는 별도로 지정하지 않아도
    // startDate - endDate 연산 만으로 쉽게 구해진다.
    public void changeDays(int days) {
        if (days <= 0) {
            throw new IllegalArgumentException("days should be greater than 0");
        }

        this.nights = days - 1;
        this.days = days;
    }

    // 필수 지정 메소드
    public void changeDate(LocalDate startDate, LocalDate endDate) {
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public void changeStayPlace(String stayPlace) {
        this.stayPlace = stayPlace;
    }

    @Override
    public String toString() {
        return "title : " + this.title + "\n" +
                "start date:  " + this.startDate + "\n"
                + "endDate: " + this.endDate;
    }
}
