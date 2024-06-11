package ru.bft.demo.camunda;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class SignActTwo implements JavaDelegate {

    private static final Logger log = LoggerFactory.getLogger(SignActTwo.class);

    @Override
    public void execute(DelegateExecution execution) {
        log.info("Подписание акта принимающей стороной и отправка в ФинБлок");
        execution.setVariable("actPpTwoSign", true);
    }
}
