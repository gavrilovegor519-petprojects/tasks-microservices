package ru.gavrilovegor519.tasks_task_write.dto;

import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;
import ru.gavrilovegor519.tasks_task_write.constant.TaskPriority;

@Getter
@Setter
public class EditTaskPriorityDto {
    @NotNull
    private Long taskId;

    @NotNull
    private TaskPriority priority;
}
