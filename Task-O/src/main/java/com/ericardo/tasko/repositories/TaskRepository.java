package com.ericardo.tasko.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ericardo.tasko.models.Task;

@Repository
public interface TaskRepository extends JpaRepository<Task, Integer> {

}
