package pattern.behavior.template.method;

public class PlusFileProcessor extends AbstractFileProcessor {
  @Override
  protected int calculate(int prevValue, int nextValue) {
    return prevValue + nextValue;
  }
}
