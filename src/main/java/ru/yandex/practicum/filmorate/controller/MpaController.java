package ru.yandex.practicum.filmorate.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import ru.yandex.practicum.filmorate.model.Mpa;
import ru.yandex.practicum.filmorate.service.MpaService;

import java.util.Collection;

@Slf4j
@RestController
@RequestMapping("/mpa")
public class MpaController {
    private final MpaService mpaService;

    @Autowired
    public MpaController(MpaService mpaService) {
        this.mpaService = mpaService;
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public Collection<Mpa> getMpas() {
        log.info("Получен запрос GET на вывод всех mpa");
        Collection<Mpa> mpaCollection = mpaService.getMpas();
        log.info("Вывод списка всех рейтингов. Размер списка: {}", mpaCollection.size());
        return mpaCollection;
    }

    @GetMapping(value = "/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Mpa getMpaById(@PathVariable Long id) {
        log.info("Получен запрос GET на получение mpa по ID: {}", id);
        Mpa mpa = mpaService.getMpaById(id);
        log.info("Вывод рейтинга с Id: {}", id);
        return mpa;
    }
}
