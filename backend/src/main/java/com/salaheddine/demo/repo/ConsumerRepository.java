package com.salaheddine.demo.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.salaheddine.demo.model.Consumer;

@Repository 
public interface ConsumerRepository extends PagingAndSortingRepository<Consumer,Integer>, JpaRepository<Consumer,Integer>{

}
