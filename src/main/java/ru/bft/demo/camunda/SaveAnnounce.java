package ru.bft.demo.camunda;

import org.camunda.bpm.engine.delegate.BpmnError;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class SaveAnnounce implements JavaDelegate {
    private static final Logger log = LoggerFactory.getLogger(SaveAnnounce.class);

    @Override
    public void execute(DelegateExecution execution) {
        log.info("Сохранение извещения");

        int random = ((int) (Math.random() * 7));
        Boolean announceSaved = random % 2 == 0;
        log.info("random = " + random);
        log.info("announceSaved = " + announceSaved);

        if(Boolean.FALSE.equals(announceSaved)) {
            throw new BpmnError("ERROR_SAVE", "Извещение не сохранено");
        }
    }
}
