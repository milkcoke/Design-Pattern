package m.falcon.designpattern.behavior.strategy.asis.light;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class BlueLightRedLight { // Context
  private final int speed; // Strategy

  public void blueLight() { // Operation 1
    if (this.speed == 1) {
      System.out.println("무 궁 화     꽃  이");
    } else if (this.speed == 2) {
      System.out.println("무궁화 꽃이");
    } else{
      System.out.println("무광꼬치");
    }
  }


  public void redLight() { // Operation 2
    if (this.speed == 1) {
      System.out.println("피 었 습 니 다.");
    } else if(this.speed == 2) {
      System.out.println("피었습니다.");
    } else{
      System.out.println("피었슴다.");
    }
  }
}
