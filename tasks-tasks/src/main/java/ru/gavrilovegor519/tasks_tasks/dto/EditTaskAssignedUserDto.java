package ru.gavrilovegor519.tasks_tasks.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EditTaskAssignedUserDto {
    @NotNull
    private Long taskId;

    @Email
    @NotBlank
    @Size(max = 50)
    private String assignedEmail;
}
