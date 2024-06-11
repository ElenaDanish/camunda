package ru.bft.demo.camunda;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Component;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Component
public class SignAct implements JavaDelegate {

    private static final Logger log = LoggerFactory.getLogger(SignAct.class);

    @Override
    public void execute(DelegateExecution execution) {
        log.info("Подписание акта передающей стороной и отправка в ФинБлок");
        execution.setVariable("actPpOneSign", true);
    }
}
