package be.ordina.beans.model;

import lombok.Builder;
import lombok.RequiredArgsConstructor;

@Builder
@RequiredArgsConstructor
public class Player {
    private final String name;
}
