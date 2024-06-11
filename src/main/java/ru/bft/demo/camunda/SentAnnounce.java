package ru.bft.demo.camunda;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class SentAnnounce implements JavaDelegate {

    private static final Logger log = LoggerFactory.getLogger(SentAnnounce.class);

    @Override
    public void execute(DelegateExecution execution) {
        log.info("ФБ отправил извещение");
    }
}
