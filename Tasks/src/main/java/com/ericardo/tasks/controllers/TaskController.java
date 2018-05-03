package com.ericardo.tasks.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ericardo.tasks.models.Task;
import com.ericardo.tasks.services.TaskService;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/")
public class TaskController {

	@Autowired
	private TaskService _tS;
	
	@GetMapping("tasks")
	public ArrayList<Task> all(){
		return _tS.all();
	}
	
	@PostMapping("new")
	public String createTask(@RequestBody Task task) {
//		System.out.println();
		return _tS.create(task);
	}
	
	@GetMapping("task/{id}")
	public Task getTask(@PathVariable("id") Long id) {
		return _tS.findById(id);
	}
	
	@DeleteMapping("task/{id}")
	public String deleteTask(@PathVariable("id") Long id) {
		return _tS.destroy(id);
	}
	
	@PutMapping("task")
	public String updateTask(@RequestBody Task task) {
		return _tS.update(task);
	}
}
