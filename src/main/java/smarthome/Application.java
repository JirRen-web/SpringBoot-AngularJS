package smarthome;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration()
@ComponentScan
public class Application extends SpringBootServletInitializer {
	//<!--5-->
    @Override
	protected SpringApplicationBuilder configure(
			SpringApplicationBuilder builder) {
		// TODO Auto-generated method stub
		return builder.sources(Application.class);
	}

	public static void main(String[] args) {
    	SpringApplication app=new SpringApplication(Application.class);
    	app.setShowBanner(false);
    	app.run(args);
    }
/**
 * 测试URL：
 * 
 * 添加employee，其中ssn是主键，不能唯一，测试的时候注意一下:http://localhost:8080/employee/add?name=denghuizhi&date=12/10/1991&salary=10000&ssn=abcd87
 * 
 * 列出所有employee:http://localhost:8080/employee/list
 * 
 */
}
