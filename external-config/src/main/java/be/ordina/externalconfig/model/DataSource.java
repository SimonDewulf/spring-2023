package be.ordina.externalconfig.model;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class DataSource {
    private final String driverClassName;
    private final String username;
    private final String password;
    private final String url;
}
