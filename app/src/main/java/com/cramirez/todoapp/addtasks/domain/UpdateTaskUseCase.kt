package com.cramirez.todoapp.addtasks.domain

import com.cramirez.todoapp.addtasks.data.TaskRepository
import com.cramirez.todoapp.addtasks.ui.model.TaskModel
import javax.inject.Inject

class UpdateTaskUseCase @Inject constructor(private val taskRepository: TaskRepository) {
    suspend operator fun invoke(taskModel: TaskModel) {
        taskRepository.update(taskModel)

    }
}