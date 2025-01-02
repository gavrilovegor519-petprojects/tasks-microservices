package ru.gavrilovegor519.tasks_task_write.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import ru.gavrilovegor519.tasks_task_write.constant.TaskPriority;
import ru.gavrilovegor519.tasks_task_write.constant.TaskStatus;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "tasks")
@Getter
@Setter
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "name", length = 100, nullable = false)
    private String name;

    @Column(name = "description", length = 300, nullable = false)
    private String description;

    @Column(name = "status", nullable = false)
    private TaskStatus status;

    @Column(name = "priority", nullable = false)
    private TaskPriority priority;

    @Column(name = "commentIds", nullable = false)
    private List<Long> commentIds = new ArrayList<>();

    @Column(name = "authorEmail", length = 100, nullable = false)
    private String authorEmail;

    @Column(name = "assignedEmail", length = 100, nullable = false)
    private String assignedEmail;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Task task)) return false;
        return Objects.equals(id, task.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
