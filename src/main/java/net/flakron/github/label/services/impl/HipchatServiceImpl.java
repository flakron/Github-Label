package net.flakron.github.label.services.impl;

import net.flakron.github.label.entity.Notification;
import net.flakron.github.label.services.HipchatService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class HipchatServiceImpl implements HipchatService {

    @Value("${hipchat.url}")
    private String hipchatUrl;

    @Async
    public void notify(Notification notification) {
        if (notification != null) {
            RestTemplate rest = new RestTemplate();
            rest.postForEntity(hipchatUrl, notification, Notification.class);
        }
    }

}
