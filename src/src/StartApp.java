package src;

import org.apache.commons.logging.Log;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication // same as @Configuration @EnableAutoConfiguration @ComponentScan
@ComponentScan(basePackages = {"src"})
public class StartApp extends SpringBootServletInitializer{
	private static final Log  logger = null;

	public static void main(String[] args) {
		System.out.println("Hello in Main");
		logger.info("inside start App");
	      SpringApplication.run( StartApp.class, args );

	}

}
