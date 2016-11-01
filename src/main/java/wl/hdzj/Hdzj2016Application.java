package wl.hdzj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;


@SpringBootApplication
@Controller
public class Hdzj2016Application {

	@RequestMapping("/")
	public String index(ModelMap map) {
		// return模板文件的名称，对应src/main/resources/templates/home.html
		return "home";
	}

	public static void main(String[] args) {
		SpringApplication.run(Hdzj2016Application.class, args);
	}
}
