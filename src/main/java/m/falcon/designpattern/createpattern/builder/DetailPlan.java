package m.falcon.designpattern.createpattern.builder;

import lombok.Getter;

@Getter
public class DetailPlan {
    private String plan;

    public DetailPlan(String plan) {
        this.plan = plan;
    }
}
