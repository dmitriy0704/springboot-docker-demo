package dev.folomkin.springdockerdemo.controller.repository;

import dev.folomkin.springdockerdemo.controller.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
}
