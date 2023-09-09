package be.ordina.externalconfig.model;

import lombok.Builder;
import lombok.Getter;
import lombok.NonNull;

@Builder
@Getter
public class DataSource {
    @NonNull
    private final String driverClassName;
    @NonNull
    private final String username;
    @NonNull
    private final String password;
    @NonNull
    private final String url;
}
