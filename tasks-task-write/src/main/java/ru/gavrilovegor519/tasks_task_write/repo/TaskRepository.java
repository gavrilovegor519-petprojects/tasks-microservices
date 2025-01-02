package ru.gavrilovegor519.tasks_task_write.repo;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import ru.gavrilovegor519.tasks_task_write.entity.Task;

public interface TaskRepository extends JpaRepository<Task, Long> {
    Page<Task> findAllByAuthorEmail(String authorEmail, Pageable pageable);
}
