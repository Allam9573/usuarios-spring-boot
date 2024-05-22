package com.lukanka.usuarios.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lukanka.usuarios.models.Task;
import com.lukanka.usuarios.services.impl.TaskServiceImpl;

@RestController
@RequestMapping("/api/tasks")
public class TaskController {

    @Autowired
    private TaskServiceImpl taskServiceImpl;

    @GetMapping("")
    public List<Task> listarTasks() {
        return this.taskServiceImpl.listarTasks();
    }

    @PostMapping("/crear")
    public Task crearTask(@RequestBody Task task) {
        return this.taskServiceImpl.createTask(task);
    }

}
