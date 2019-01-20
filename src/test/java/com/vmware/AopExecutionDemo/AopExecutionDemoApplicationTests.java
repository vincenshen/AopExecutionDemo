package com.vmware.AopExecutionDemo;

import com.vmware.AopExecutionDemo.log.LogService;
import com.vmware.AopExecutionDemo.service.ProductService;
import com.vmware.AopExecutionDemo.service.sub.SubService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AopExecutionDemoApplicationTests {

	@Autowired
	ProductService productService;

	@Autowired
	SubService subService;

	@Autowired
	LogService logService;

	@Test
	public void test() {
		System.out.println("###begin test###");
		productService.findById(1);
		productService.findByTwoArgs(1,"hello");
		productService.getName();
		subService.demo();
		try {
			productService.exDemo();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}

		logService.log();
		logService.log2();

		productService.log();
	}


}

