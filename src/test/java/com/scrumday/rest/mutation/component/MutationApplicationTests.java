package com.scrumday.rest.mutation.component;

import com.scrumday.rest.mutation.controller.MutationController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class MutationApplicationTests {

	@Autowired
	private MutationController mutationController;

	@Value("${local.server.port}")
	private int port;


	@Test
	public void contextLoads() {
		assertThat(mutationController,is(not(nullValue())));
	}

	@Test
	public void mutationServiceShouldReturnHello() throws Exception {
		RestTemplate restTemplate = new RestTemplate();
		String response = restTemplate.getForObject("http://localhost:" + port, String.class);
		assertThat(response,is("Hello"));
	}

}
