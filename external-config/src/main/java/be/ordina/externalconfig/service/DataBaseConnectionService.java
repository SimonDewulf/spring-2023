package be.ordina.externalconfig.service;

import be.ordina.externalconfig.model.DataSource;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class DataBaseConnectionService {
    private final DataSource dataSource;

    public void connect() {
        log.info("connecting to db with following url: {}", dataSource.getUrl());
        log.info("connecting to db with following username: {}", dataSource.getUsername());
        log.info("connecting to db with following password: {}", dataSource.getPassword());
        log.info("connecting to db with following driverClassName: {}", dataSource.getDriverClassName());
    }
}
