package ru.gavrilovegor519.tasks_tasks.controller;

import lombok.AllArgsConstructor;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/1.0/tasks")
@PreAuthorize("isAuthenticated()")
@AllArgsConstructor
public class TaskController {

}
