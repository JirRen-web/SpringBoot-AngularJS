package smarthome.controller;
import java.util.Date;
import java.util.Map;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PathVariable;
@Controller
public class WelcomeController {

	@Value("${application.message:Hello World}")
	private String message = "Hello World";

	@RequestMapping("/")
	public String welcome(Map<String, Object> model) {
		model.put("time", new Date());
		model.put("message", this.message);
		return "welcome";
	}

	@RequestMapping("/foo")
	public String foo(Map<String, Object> model) {
		throw new RuntimeException("Foo");
	}
	
	@RequestMapping("/jsp/{view}")
	public String getJsp(@PathVariable String view) {
		return view;
	}
	/**
	 * 映射到{path}文件夹的{view}的jsp
	 * @param view
	 * @param path
	 * @return
	 */
	@RequestMapping("/jsp/{path}/{view}")
	public String getJsp(@PathVariable String view,@PathVariable String path) {
		
		return "/"+path+"/"+view;
	}
	@RequestMapping("/html/{path}/{view}")
	public String getHtml(@PathVariable String view,@PathVariable String path) {
		
		return "/"+path+"/"+view;
	}
}