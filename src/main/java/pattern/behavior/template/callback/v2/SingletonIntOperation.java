package pattern.behavior.template.callback.v2;

import lombok.RequiredArgsConstructor;

import java.util.function.BiFunction;

@RequiredArgsConstructor
enum SingletonIntOperation implements Operation<Integer> {
  PLUS((accumulator, currentValue)-> accumulator + currentValue),
  MULTIPLY((accumulator, currentValue)-> accumulator * currentValue);

  private final BiFunction<Integer, Integer, Integer> operation;

  @Override
  public Integer operate(Integer accumulator, Integer currentValue) {
    return this.operation.apply(accumulator, currentValue);
  }
}
