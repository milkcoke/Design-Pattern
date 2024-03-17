package pattern.behavior.template.method;

class MultiplyFileProcessor extends AbstractFileProcessor {
  @Override
  protected int calculate(int prevValue, int nextValue) {
    return prevValue * nextValue;
  }
}
