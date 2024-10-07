package org.example.consumer.model.dto;

import lombok.*;
import lombok.experimental.FieldDefaults;
import lombok.experimental.SuperBuilder;
import java.util.List;

@Getter
@Setter
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)
public class WishCreateEvent {
    Long movieId;
    String title;

    Long userId;
    String userLogin;

    List<String> friendsLogins;
}