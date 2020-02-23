package com.salaheddine.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.salaheddine.demo.model.Consumer;
import com.salaheddine.demo.repo.ConsumerRepository;
import com.salaheddine.demo.service.ConsumerService;

@RestController
@RequestMapping("consumerController")
@CrossOrigin("*")
public class ConsumerController {

	@Autowired
	private ConsumerService consumerService;
	
	@GetMapping(value = "/data")
	public Page<Consumer> getDataConsumer(@RequestParam("page") Integer pageNumber,@RequestParam("size") Integer pageSize){
		
		return this.consumerService.getConsumerData(pageNumber, pageSize);
	}
	
	
}
