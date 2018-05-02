package com.ericardo.tasks.repositories;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;

import com.ericardo.tasks.models.Task;

public interface TaskRepository extends CrudRepository<Task, Long> {
	ArrayList<Task> findAll();
}
