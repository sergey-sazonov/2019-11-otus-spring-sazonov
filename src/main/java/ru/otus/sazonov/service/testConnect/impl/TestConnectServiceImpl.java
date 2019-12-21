package ru.otus.sazonov.service.testConnect.impl;


import lombok.Data;
import org.springframework.stereotype.Service;
import ru.otus.sazonov.repository.testConnect.TestConnectRepository;
import ru.otus.sazonov.service.testConnect.TestConnectService;

import javax.annotation.PostConstruct;

@Data
@Service
public class TestConnectServiceImpl implements TestConnectService {

    private final TestConnectRepository testConnectRepository;

    @Override
    @PostConstruct
    public void getDate() {
        // если не упали, то к базе подключились
        testConnectRepository.getDate();
    }
}
