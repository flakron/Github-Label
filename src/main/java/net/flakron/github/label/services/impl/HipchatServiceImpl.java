package net.flakron.github.label.services.impl;

import net.flakron.github.label.entity.Notification;
import net.flakron.github.label.services.HipchatService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.logging.Logger;

@Service
public class HipchatServiceImpl implements HipchatService {

    private final Logger logger = Logger.getLogger(HipchatServiceImpl.class.getName());

    @Value("${hipchat.url}")
    private String hipchatUrl;

    @Async
    public void notify(Notification notification) {
        if (notification != null) {
            RestTemplate rest = new RestTemplate();

            logger.info("Got notification");

            rest.postForEntity(hipchatUrl, notification, Notification.class);
        }
    }

}
