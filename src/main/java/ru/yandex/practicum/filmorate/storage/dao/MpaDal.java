package ru.yandex.practicum.filmorate.storage.dao;

import ru.yandex.practicum.filmorate.model.Mpa;

import java.util.Collection;

public interface MpaDal {
    Collection<Mpa> getMpa();

    Mpa getMpaById(Long id);

    String getMpaNameById(Long id);
}