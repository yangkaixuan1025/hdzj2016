package wl.hdzj;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;
import wl.hdzj.domain.NewsRepository;
import wl.hdzj.entity.News;
import wl.hdzj.web.BackController;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class Hdzj2016ApplicationTests {
	@Test
	public void contextLoads() {
	}

}
