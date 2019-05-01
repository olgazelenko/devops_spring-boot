package com.neo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
@ComponentScan(basePackages={"com.neo.controller"})
public class ApplicationTests {

	@Test
	public void contextLoads() {
	}

}
