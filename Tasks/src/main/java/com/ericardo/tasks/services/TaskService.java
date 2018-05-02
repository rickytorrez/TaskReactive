package com.ericardo.tasks.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ericardo.tasks.models.Task;
import com.ericardo.tasks.repositories.TaskRepository;

@Service
public class TaskService {
	
	@Autowired
	private TaskRepository _tR;
	
	public String create(Task task) {
		_tR.save(task);
		return "you created a task";
	}
	
	public String update(Task task) {
		_tR.save(task);
		return "you updated a task";
	}
	
	public String destroy(Long id) {
		_tR.delete(id);
		return "you deleted a task";
	}
	
	public ArrayList<Task> all (){
		return _tR.findAll();
	}
	
	public Task findById(long id) {
		return _tR.findOne(id);
	}
	
}
