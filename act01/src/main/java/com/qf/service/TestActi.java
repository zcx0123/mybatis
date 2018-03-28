package com.qf.service;

import org.activiti.engine.ProcessEngine;
import org.activiti.engine.ProcessEngineConfiguration;

/**
 * Created by Administrator on 2018/3/13.
 */
public class TestActi {
    public void createTable(){
        ProcessEngineConfiguration configuration = ProcessEngineConfiguration.createStandaloneProcessEngineConfiguration();
        configuration.setJdbcDriver("com.mysql.jdbc.Driver");
        configuration.setJdbcUrl("jdbc:mysql://localhost:3306/db_activiti?characterEncoding=utf-8");
        configuration.setJdbcUsername("root");
        configuration.setJdbcPassword("123456");
        configuration.setDatabaseSchemaUpdate(ProcessEngineConfiguration.DB_SCHEMA_UPDATE_TRUE);
        ProcessEngine processEngine = configuration.buildProcessEngine();
    }
    public void createTableWwithXML(){
        ProcessEngineConfiguration configuration =
                ProcessEngineConfiguration.createProcessEngineConfigurationFromResource("activiti.cfg.xml");
        ProcessEngine processEngine = configuration.buildProcessEngine();

    }

    public static void main(String[] args) {
        TestActi testActi = new TestActi();
        //testActi.createTable();
        testActi.createTableWwithXML();
    }
}
