package com.in28minutes.example.spring.business.examples;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.in28minutes.example.spring.business.examples.HiService;

// Commenting the below line to make use of XML context instead of Java context
/*
@Configuration
@ComponentScan(basePackages = "com.in28minutes.example.spring.business.examples")
class JavaTestContext {

}
*/

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "/BusinessApplicationContext.xml" })
public class DependencyInjectionExamples {

	@Autowired
	// @Qualifier(value = 'hiService')
	private HiService service;

	@Test
	public void dummyTest() {
		//assertEquals("Good Morning", service.sayHi());
		System.out.println(service.sayHi());
	}
}
