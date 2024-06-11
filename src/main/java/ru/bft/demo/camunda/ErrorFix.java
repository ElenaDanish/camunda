package ru.bft.demo.camunda;

import org.camunda.bpm.engine.delegate.BpmnError;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class ErrorFix implements JavaDelegate {

    private static final Logger log = LoggerFactory.getLogger(AnswerSent.class);

    @Override
    public void execute(DelegateExecution execution) {
        log.info("Исправление ошибки");

        int random = ((int) (Math.random() * 7));
        Boolean errorFixed = random % 2 == 0;

        log.info("random = " + random);
        log.info("errorFixed = " + errorFixed);

        if(Boolean.FALSE.equals(errorFixed)) {
            throw new BpmnError("ERROR_FB", "Ошибка не исправлена");
        }
    }
}