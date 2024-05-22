package com.lukanka.usuarios.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lukanka.usuarios.models.Task;
import com.lukanka.usuarios.repositories.TaskRepository;
import com.lukanka.usuarios.services.TaskService;

@Service
public class TaskServiceImpl implements TaskService {

    @Autowired
    private TaskRepository taskRepository;

    @Override
    public Task createTask(Task task) {
        return this.taskRepository.save(task);
    }

    @Override
    public List<Task> listarTasks() {
        return (List<Task>) this.taskRepository.findAll();
    }

}
