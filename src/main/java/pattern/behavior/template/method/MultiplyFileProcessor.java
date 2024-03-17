package pattern.behavior.template.method;

public class MultiplyFileProcessor extends AbstractFileProcessor {
  @Override
  protected int calculate(int prevValue, int nextValue) {
    return prevValue * nextValue;
  }
}
