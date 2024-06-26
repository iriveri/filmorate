package ru.yandex.practicum.filmorate.validation;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

import java.io.IOException;
import java.time.Instant;

public class InstantSerializer extends JsonSerializer<Instant> {

    @Override
    public void serialize(Instant instant, JsonGenerator gen, SerializerProvider serializers) throws IOException {
        long seconds = instant.toEpochMilli();
        gen.writeNumber(seconds);
    }
}