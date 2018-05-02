package com.ericardo.tasko.services;

import java.util.List;

import com.ericardo.tasko.models.Task;

public interface TaskService {
	
	// Create task
	Task saveTask(Task task);
	
	// Update task
	Task updateTask(Task task);
	
	// Delete task
	void deleteTask(Task task);
	
	// Get a single task
	Task getTaskById(int id);
	
	// Get all tasks
	List<Task> getAllTasks();
}
