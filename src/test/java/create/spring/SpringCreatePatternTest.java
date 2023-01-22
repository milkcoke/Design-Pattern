package create.spring;

import org.junit.jupiter.api.Test;
import org.springframework.web.util.UriComponentsBuilder;

import static org.assertj.core.api.Assertions.*;

public class SpringCreatePatternTest {

    @Test
    void uriComponentTest() {
        var uriComponents = UriComponentsBuilder.newInstance()
                .scheme("https")
                .host("www.m-falcon.tistory")
                .path("656")
                .build()
                .encode()
                .toUriString();

        var designPatternUri = "https://www.m-falcon.tistory/656";

        assertThat(uriComponents).isEqualTo(designPatternUri);
    }
}
