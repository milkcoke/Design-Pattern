package pattern.behavior.template.callback;

import lombok.RequiredArgsConstructor;

import java.util.function.BiFunction;

@RequiredArgsConstructor
public enum SingletonIntOperation implements IntOperation {
  PLUS((accumulator, currentValue)-> accumulator + currentValue),
  MULTIPLY((accumulator, currentValue)-> accumulator * currentValue);

  private final BiFunction<Integer, Integer, Integer> operation;

  @Override
  public int operate(int accumulator, int currentValue) {
    return this.operation.apply(accumulator, currentValue);
  }
}
