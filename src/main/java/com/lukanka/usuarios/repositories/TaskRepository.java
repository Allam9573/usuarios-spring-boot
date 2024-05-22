package com.lukanka.usuarios.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.lukanka.usuarios.models.Task;

@Repository
public interface TaskRepository extends CrudRepository<Task, Integer>{
    
}
