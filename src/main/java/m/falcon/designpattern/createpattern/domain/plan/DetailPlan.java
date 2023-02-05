package m.falcon.designpattern.createpattern.domain.plan;

import lombok.Getter;

@Getter
public class DetailPlan {
    private final String plan;

    public DetailPlan(String plan) {
        this.plan = plan;
    }
}
