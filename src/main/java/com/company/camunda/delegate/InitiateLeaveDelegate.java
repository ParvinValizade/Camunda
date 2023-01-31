package com.company.camunda.delegate;

import com.company.camunda.service.LeaveService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

import javax.inject.Named;


@Slf4j
@Named(value = "initiateDelegate")
@RequiredArgsConstructor
public class InitiateLeaveDelegate implements JavaDelegate {

    private final LeaveService leaveService;

    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception {
        delegateExecution.setVariable("userManager","Parvin");
        log.info("Initiate leave on delegate");
        leaveService.initLeave();
    }
}
