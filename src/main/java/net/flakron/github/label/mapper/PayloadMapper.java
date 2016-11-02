package net.flakron.github.label.mapper;

import net.flakron.github.label.entity.Notification;
import net.flakron.github.label.entity.Payload;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import java.text.MessageFormat;

@Component
public class PayloadMapper implements Converter<Payload, Notification> {

    @Override
    public Notification convert(Payload payload) {
        Notification notification = null;

        if (payload.getAction().equals("labeled")) {
            notification = new Notification();

            String status = "";
            if (payload.getLabel().getName().equals("need help")) {
                status += "needs help";
            } else {
                status += "is " + payload.getLabel().getName();
            }

            String message = MessageFormat.format(
                "PR <a href=\"{0}\">#{1}</a> <strong>{2}</strong>",
                payload.getPullRequest().getUrl(),
                payload.getPullRequest().getNumber(),
                status
            );

            notification.setColor("green");
            notification.setMessage(message);
            notification.setMessageFormat("html");
            notification.setNotify(true);
        }

        return notification;
    }
}
