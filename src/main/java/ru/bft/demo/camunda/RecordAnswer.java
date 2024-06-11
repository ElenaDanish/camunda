package ru.bft.demo.camunda;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class RecordAnswer implements JavaDelegate {
    private static final Logger log = LoggerFactory.getLogger(AnswerSent.class);

    @Override
    public void execute(DelegateExecution execution) {
        log.info("Запись ответа");

        Boolean fbAnswerOne = (Boolean) execution.getVariable("fbAnswerOne");
        log.info("fbAnswerOne is " + fbAnswerOne);

        Boolean fbAnswerTwo = (Boolean) execution.getVariable("fbAnswerTwo");
        log.info("fbAnswerTwo is " + fbAnswerTwo);
    }
}
