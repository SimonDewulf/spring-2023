package be.ordina.externalconfig;

import be.ordina.externalconfig.config.DataSourceConfig;
import be.ordina.externalconfig.service.DataBaseConnectionService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = DataSourceConfig.class)
public class DatasourceConnectionTest {

    @Autowired
    private DataBaseConnectionService dataBaseConnectionService;
    @Test
    void dbConnectionServiceConnects() {
        dataBaseConnectionService.connect();
    }
}
