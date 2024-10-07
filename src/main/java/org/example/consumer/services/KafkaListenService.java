package org.example.consumer.services;

import org.example.consumer.model.dto.FriendshipEvent;
import org.example.consumer.model.dto.WishCreateEvent;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListenService {

    @KafkaListener(topics = "new_friendship", groupId = "#{@groupId}")
    public void listenGroupMU(FriendshipEvent friendshipEvent) {
        System.out.println("New friendship! Received Message in topic wish_update group g1: " + friendshipEvent.toString());
    }

    @KafkaListener(topics = "wish_create", groupId = "#{@groupId}")
    public void listenGroupMC(WishCreateEvent wishCreateEvent) {
        System.out.println("New movie! Received Message in topic wish_create group g1: " + wishCreateEvent.toString());
    }

    @KafkaListener(topics = "wish_update", groupId = "#{@groupId}")
    public void listenGroupMU(WishCreateEvent wishCreateEvent) {
        System.out.println("Movie has been watched! Received Message in topic wish_update group g1: " + wishCreateEvent.toString());
    }
}
