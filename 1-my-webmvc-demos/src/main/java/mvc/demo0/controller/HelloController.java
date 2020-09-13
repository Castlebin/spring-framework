package mvc.demo0.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/")
public class HelloController {

	// http://localhost:8080/hello?name=LiLei
	@ResponseBody
	@RequestMapping("/hello")
	public String sayHello(String name) {
		return "Hello, " + name;
	}

}
