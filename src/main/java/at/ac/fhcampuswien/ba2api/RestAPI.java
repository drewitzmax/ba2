package at.ac.fhcampuswien.ba2api;

import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("data")
public class RestAPI {
    private final static Map<Integer, String> TEXTS = new HashMap();

    @GetMapping("/{length}")
    public String getPayloadWithLength(@PathVariable int length) {
        var text = TEXTS.get(length);
        if (text == null) {
            text = RandomStringUtils.randomAlphabetic(length);
            TEXTS.put(length, text);
        }
        return text;
    }
}
