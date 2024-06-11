package ru.bft.demo.camunda;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class AnswerSent implements JavaDelegate {

    private static final Logger log = LoggerFactory.getLogger(AnswerSent.class);

    @Override
    public void execute(DelegateExecution execution) {
        log.info("Отправка ответа из ФБ о загрузке акта");

        int randomOne = ((int) (Math.random() * 7));
        int randomTwo = ((int) (Math.random() * 7));
        Boolean fbAnswerOne = randomOne % 2 == 0;
        Boolean fbAnswerTwo = randomTwo % 2 == 0;

        if (execution.getVariable("actPpTwoSign") != null && (Boolean) execution.getVariable("actPpTwoSign")) {
            log.info("randomTwo = " + randomTwo);
            execution.setVariable("fbAnswerTwo", fbAnswerTwo);
        } else {
            log.info("randomOne = " + randomOne);
            execution.setVariable("fbAnswerOne", fbAnswerOne);
        }
    }
}
