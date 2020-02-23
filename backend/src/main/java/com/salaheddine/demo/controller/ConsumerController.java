package com.salaheddine.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
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
	private ConsumerRepository consumerRepository;
	
//	si on met PageRequest comme arg dans la method avec l'annotation requestbody, on aura besoin 
//	en plus du page et size d'un attribut sort de type la class Sort, il est indéniable pour la création des objets
//	PageRequest et il y 'a pas dans l'api une setter pour l'injecter.
//	du coups on doit passer par l'api pageable elle même pour créer l'object
//	voir les constructeurs du class PageRequest

	@GetMapping(value = "/data")
	public Page<Consumer> getDataConsumer(@RequestParam("page") Integer pageNumber,@RequestParam("size") Integer pageSize){
		Pageable page = PageRequest.of(pageNumber, pageSize);
		return this.consumerRepository.findAll(page);
	}
	
	
}
