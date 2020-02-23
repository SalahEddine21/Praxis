package com.salaheddine.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.salaheddine.demo.model.Consumer;
import com.salaheddine.demo.repo.ConsumerRepository;

@Service
public class ConsumerService {

	@Autowired
	private ConsumerRepository consumerRepository;
	
	public Page<Consumer> getConsumerData(Integer pageNumber, Integer pageSize){
		Pageable page = PageRequest.of(pageNumber, pageSize);
		return this.consumerRepository.findAll(page);
	}
	
	public void save(Consumer c) {
		this.consumerRepository.save(c);
	}
}
