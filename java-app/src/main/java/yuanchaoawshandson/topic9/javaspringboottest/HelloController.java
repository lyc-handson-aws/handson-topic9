package yuanchaoawshandson.topic9.javaspringboottest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping("/")
	public String index() {
		return "Yuanchao aws hands-on porject topic 9 - Java Springboot Hello world example!";
	}

}
