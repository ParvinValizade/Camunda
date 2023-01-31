package com.company.camunda.config;

import org.camunda.bpm.engine.ProcessEngine;
import org.camunda.bpm.engine.impl.cfg.ProcessEngineConfigurationImpl;
import org.camunda.bpm.engine.impl.cfg.ProcessEnginePlugin;
import org.camunda.bpm.spring.boot.starter.configuration.Ordering;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(Ordering.DEFAULT_ORDER - 1)
public class MyProcessEnginePlugin implements ProcessEnginePlugin {
    @Override
    public void preInit(ProcessEngineConfigurationImpl processEngineConfiguration) {

    }

    @Override
    public void postInit(ProcessEngineConfigurationImpl processEngineConfiguration) {
        MyHistoryEventHandler myHistoryEventHandler = new MyHistoryEventHandler();
        processEngineConfiguration.setHistoryEventHandler(myHistoryEventHandler);
    }

    @Override
    public void postProcessEngineBuild(ProcessEngine processEngine) {

    }
}
