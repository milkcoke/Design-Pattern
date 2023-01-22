package m.falcon.designpattern.domain.plan;

import lombok.Getter;

@Getter
public class DetailPlan {
    private String plan;

    public DetailPlan(String plan) {
        this.plan = plan;
    }
}
