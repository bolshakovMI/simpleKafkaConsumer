package org.example.consumer.model.dto;

import lombok.*;
import lombok.experimental.FieldDefaults;
import lombok.experimental.SuperBuilder;
import org.example.consumer.model.enums.RequestConfirmationStatus;

import java.util.List;

@Getter
@Setter
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)
public class FriendshipEvent {
    Long user1Id;
    String user1Login;
    List<String> user1friendsLogins;

    Long user2Id;
    String user2Login;
    List<String> user2friendsLogins;

    boolean isWithdrawn;
    RequestConfirmationStatus status;
}
