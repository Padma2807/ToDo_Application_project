package com.padmacodes.todo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.padmacodes.todo.model.Task;

public interface TaskRepository extends JpaRepository<Task,Long> {
    
}
