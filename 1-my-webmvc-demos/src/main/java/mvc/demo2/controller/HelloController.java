package mvc.demo2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping
public class HelloController {

	// !! URL  注册 DispatcherServlet 有个 demo1 的前缀 ，之后，才是代码中 我们自定义的url
	// 而且 又在 new tomcat 容器时，设置了 contextPath为 /nihao
	// http://localhost:8080/nihao/demo2/hello?name=LiLei
	@RequestMapping("/hello")
	@ResponseBody
	public String sayHello(String name) {
		System.out.println("Hello, " + name);
		return "Hello, " + name;
	}

}
