package nl.mpfglaser.seatscoutbackend;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class JourneyController {
    @RequestMapping("/")
    public String index() {
        return "Greetings from the JourneyController!";
    }
}
