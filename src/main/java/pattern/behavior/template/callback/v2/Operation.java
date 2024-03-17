package pattern.behavior.template.callback.v2;

public interface Operation<T> {
  T operate(T accumulator, T currentValue);
}
