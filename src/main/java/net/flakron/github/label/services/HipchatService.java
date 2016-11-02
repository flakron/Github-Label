package net.flakron.github.label.services;

import net.flakron.github.label.entity.Notification;

public interface HipchatService {

    void notify(Notification notification);

}
