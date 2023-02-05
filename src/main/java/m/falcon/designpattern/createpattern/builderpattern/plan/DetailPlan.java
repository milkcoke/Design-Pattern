package m.falcon.designpattern.createpattern.builderpattern.plan;

import lombok.Getter;

@Getter
public class DetailPlan {
    private String plan;

    public DetailPlan(String plan) {
        this.plan = plan;
    }
}
