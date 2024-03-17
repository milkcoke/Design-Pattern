package pattern.behavior.chainofresponsibility;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class Request {

    private final int id;
    private final String body;
}
