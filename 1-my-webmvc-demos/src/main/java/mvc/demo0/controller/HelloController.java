package mvc.demo0.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/demo0")
public class HelloController {

	// !! URL
	// http://localhost:8080/demo0/demo0/hello?name=LiLei
	@RequestMapping("/hello")
	@ResponseBody
	public String sayHello(String name) {
		System.out.println("Hello, " + name);
		return "Hello, " + name;
	}

}
