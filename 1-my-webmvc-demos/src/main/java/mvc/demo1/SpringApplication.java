package mvc.demo1;

import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;

import javax.servlet.ServletException;

public class SpringApplication {

	public static void run() {
		Tomcat tomcat = new Tomcat();
		tomcat.setPort(8080);
		try {
			tomcat.addWebapp("/", "/Users/heller/tmp");
			tomcat.start();
			tomcat.getServer().await();
		} catch (LifecycleException e) {
			e.printStackTrace();
		}
	}

}
