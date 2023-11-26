/**
 * 
 */
package com.example.DogManagementSystem.Repository;

import org.springframework.data.repository.CrudRepository;

import com.example.DogManagementSystem.Models.Dog;
import com.example.DogManagementSystem.Models.Trainer;

/**
 * @author Spurthi Ravula S559190
 */
public interface TrainerRepository extends CrudRepository<Trainer, Integer> {

}
