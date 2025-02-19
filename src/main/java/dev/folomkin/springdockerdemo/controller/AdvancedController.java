package dev.folomkin.springdockerdemo.controller;

import dev.folomkin.springdockerdemo.controller.entity.Task;
import dev.folomkin.springdockerdemo.controller.repository.TaskRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/task")
public class AdvancedController {

    private final TaskRepository repository;

    public AdvancedController(TaskRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public String sayHello() {
        return "Hello World!";
    }


    @PostMapping("/create-task")
    public ResponseEntity<Task> createTask(@RequestBody Task task) {
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(repository.save(task));
    }
}
