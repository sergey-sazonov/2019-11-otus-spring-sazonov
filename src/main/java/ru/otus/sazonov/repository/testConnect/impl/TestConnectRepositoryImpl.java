package ru.otus.sazonov.repository.testConnect.impl;

import lombok.Data;
import org.springframework.jdbc.core.JdbcOperations;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ru.otus.sazonov.repository.testConnect.TestConnectRepository;

import java.util.Date;

@Transactional
@Repository
@Data
public class TestConnectRepositoryImpl implements TestConnectRepository {

    private final JdbcOperations jdbcOperations;

    @Override
    public Date getDate() {
        return jdbcOperations.queryForObject("select now()", Date.class);
    }

}
