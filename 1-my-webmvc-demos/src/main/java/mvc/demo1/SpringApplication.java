package mvc.demo1;

import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;

public class SpringApplication {
	public static void run() {
		Tomcat tomcat = new Tomcat();
		tomcat.setPort(8080);

		// 注意，这里的 nihao，也要作为 url path 的前缀 ！！！
		tomcat.addWebapp("/nihao", "/Users/heller/tmp");

		try {

			tomcat.start();
			tomcat.getServer().await();
		} catch (LifecycleException e) {
			e.printStackTrace();
		}
	}
}
