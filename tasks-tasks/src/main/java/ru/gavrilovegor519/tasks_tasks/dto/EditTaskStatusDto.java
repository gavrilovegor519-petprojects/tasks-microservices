package ru.gavrilovegor519.tasks_tasks.dto;

import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;
import ru.gavrilovegor519.tasks_tasks.constant.TaskStatus;

@Getter
@Setter
public class EditTaskStatusDto {
    @NotNull
    private Long taskId;

    @NotNull
    private TaskStatus status;
}
