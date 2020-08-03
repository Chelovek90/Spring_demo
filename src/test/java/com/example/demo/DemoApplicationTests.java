package com.example.demo;

import com.example.demo.entity.DemoApplication;
import com.example.demo.entity.ResolutionStatus;
import com.example.demo.repository.DemoApplicationRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.List;

@SpringBootTest
class DemoApplicationTests {

	@Autowired
	private DemoApplicationRepository repository;

	@BeforeEach
	public void setup() {
		repository.deleteAll();

//		List<DemoApplication> applicationList = Arrays.asList(
//				new DemoApplication("Ivanov Ivan", ResolutionStatus.SUCCESSFUL),
//				new DemoApplication("Ivanov Ivan", ResolutionStatus.BAD_CLIENT),
//				new DemoApplication("Ivanov Ivan", ResolutionStatus.LOW_BUDGET),
//				new DemoApplication("Ivanov Ivan", ResolutionStatus.SUCCESSFUL),
//				new DemoApplication("Ivanov Ivan", ResolutionStatus.SUCCESSFUL),
//				new DemoApplication("Ivanov Ivan", ResolutionStatus.SUCCESSFUL)
//		);
//		repository.saveAll(applicationList);

	}

	@Test
	void contextLoads() {
//		List<DemoApplication> status = repository.getAllByStatusEquals(ResolutionStatus.BAD_CLIENT);
//		Assertions.assertThat(status.size() == 1);
	}

}
