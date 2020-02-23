package com.salaheddine.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.salaheddine.demo.model.Consumer;
import com.salaheddine.demo.repo.ConsumerRepository;
import com.salaheddine.demo.service.ConsumerService;

@SpringBootApplication
public class DemoApplication implements ApplicationRunner {

	@Autowired
	private ConsumerRepository consumerRepo;
	
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {	
		List<Consumer> consumers = new ArrayList<>();
		consumers.add(new Consumer("test1", "test1"));
		consumers.add(new Consumer("test2", "test2"));
		consumers.add(new Consumer("test3", "test3"));
		consumers.add(new Consumer("test4", "test4"));
		consumers.add(new Consumer("test5", "test5"));
		consumers.add(new Consumer("test6", "test6"));
		
		consumerRepo.saveAll(consumers);
		
		List<Consumer> list = consumerRepo.findAll();
		list.stream().forEach(c -> System.out.println(c.getName()));
	}

}
