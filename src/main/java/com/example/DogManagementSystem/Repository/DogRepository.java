/**
 * 
 */
package com.example.DogManagementSystem.Repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.DogManagementSystem.Models.Dog;

/**
 * @author Spurthi Ravula S559190
 */
@Repository
public interface DogRepository extends CrudRepository<Dog, Integer>{
	List<Dog> findByName(String name);
}
