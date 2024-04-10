package ru.yandex.practicum.filmorate.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;

@Data
@Builder
@NoArgsConstructor(force = true)
@AllArgsConstructor
public class UserFeed {
    Long eventId;
    Instant timestamp;
    Long userId;
    EventType eventType;
    Operation operation;
    Long entityId;
}
