package mvc.demo2;

import org.apache.catalina.LifecycleException;
import org.apache.catalina.Wrapper;
import org.apache.catalina.startup.Tomcat;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class SpringApplication {
	public static void run() {
		Tomcat tomcat = new Tomcat();
		tomcat.setPort(8080);

		// 注意，这里的 nihao，也要作为 url path 的前缀 ！！！
	//	tomcat.addWebapp("/nihao", "/Users/heller/tmp");
		// 使用 了 addContext() 代替 addWebapp() ，所以 不会 需要 jsp 包，不会启动时报 jsp 的异常了
		// Spring Boot 内部也是类似，在 context 的 onfresh() 方法中，新建 并 初始化 web 容器。但是，要比这里复杂得多
		tomcat.addContext("/nihao", "/Users/heller/tmp");

		AnnotationConfigWebApplicationContext ac = new AnnotationConfigWebApplicationContext();
		ac.register(AppConfig.class);

		// 如果 配置类上 加了 @EnableWebMvc ，此处 refresh() 会发生异常，启动失败  （理解一下）
	//	ac.refresh();

		DispatcherServlet servlet = new DispatcherServlet(ac);
		// 此处的 tomcat.addServlet() 中 contextPath 参数，必须 和 上面 tomcat.addContext() 中 一样 （理解一下）
		Wrapper demo2 = tomcat.addServlet("/nihao", "demo2", servlet);
		demo2.setLoadOnStartup(1);
		demo2.addMapping("/demo2/*");

		try {

			tomcat.start();
			tomcat.getServer().await();
		} catch (LifecycleException e) {
			e.printStackTrace();
		}
	}
}
