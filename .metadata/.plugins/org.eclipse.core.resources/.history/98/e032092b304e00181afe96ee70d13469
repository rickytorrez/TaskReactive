package com.ericardo.tasko.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ericardo.tasko.models.Task;
import com.ericardo.tasko.repositories.TaskRepository;

@Service
public class TaskServiceImpl implements TaskService {
	
	@Autowired
	private TaskRepository _tR;

	@Override
	public Task saveTask(Task task) {
		return _tR.save(task);
	}

	@Override
	public Task updateTask(Task task) {
		return _tR.save(task);
	}

	@Override
	public void deleteTask(Task task) {
		_tR.delete(task);
	}

	@Override
	public Task getTaskById(int id) {
		return _tR.findOne(id);
	}

	@Override
	public List<Task> getAllTasks() {
		return _tR.findAll();
	}

	public TaskRepository get_tR() {
		return _tR;
	}

	public void set_tR(TaskRepository _tR) {
		this._tR = _tR;
	}

}
