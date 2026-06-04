package com.example.CICD;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Disabled("Skipping until database configuration is added to CI/CD")
class CicdApplicationTests {

	@Test
	void contextLoads() {
	}

}
