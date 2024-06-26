package com.example.demo;



import java.util.List;

import org.springframework.data.repository.CrudRepository;



public interface DogRepository extends CrudRepository<Dog, Integer>
{
	List<Dog> findByName(String name);
}

