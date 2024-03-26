package ru.yandex.practicum.filmorate.storage.dal.dao;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import ru.yandex.practicum.filmorate.storage.dal.MpaDal;
import ru.yandex.practicum.filmorate.model.Mpa;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collection;

@Repository
public class MpaDao implements MpaDal {
    private final JdbcTemplate jdbcTemplate;

    public MpaDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public Collection<Mpa> getMpa() {
        String sql = "SELECT * FROM mpa";
        return jdbcTemplate.query(sql, this::makeMpa);
    }

    @Override
    public Mpa getMpaById(Long id) {
        String sql = "SELECT * FROM mpa WHERE mpa_id = ?";
        return jdbcTemplate.queryForObject(sql, this::makeMpa, id);
    }

    private Mpa makeMpa(ResultSet rs, int rowNum) throws SQLException{
        return Mpa.builder()
                .id(rs.getLong("mpa_id"))
                .name(rs.getString("mpa_name"))
                .build();
    }
}
