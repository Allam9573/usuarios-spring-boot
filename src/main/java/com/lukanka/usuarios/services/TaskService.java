package com.lukanka.usuarios.services;

import java.util.List;

import com.lukanka.usuarios.models.Task;

public interface TaskService {
    public Task createTask(Task task);

    public List<Task> listarTasks();

}
