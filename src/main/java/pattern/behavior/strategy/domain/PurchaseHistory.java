package pattern.behavior.strategy.domain;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public class PurchaseHistory {
  private final int totalAmount;
  private final int purchaseFrequencyPerMonth;
  private final double returnRate;
}
