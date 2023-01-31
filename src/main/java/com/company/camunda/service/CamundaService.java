package com.company.camunda.service;

import lombok.RequiredArgsConstructor;
import org.camunda.bpm.engine.RepositoryService;
import org.camunda.bpm.engine.RuntimeService;
import org.camunda.bpm.engine.TaskService;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CamundaService {

    private final RepositoryService repositoryService;

    private final TaskService taskService;

    private final RuntimeService runtimeService;

    public void completeTask(String taskId){
        taskService.complete(taskId);
    }

}
