package com.company.camunda.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class LeaveService {

    public void initLeave(){
        log.info("initLeave on service");
    }

    public void approvedRequest(){
        log.info("approved Request");
    }

    public void rejectedRequest(){
        log.info("rejected Request");
    }
}
