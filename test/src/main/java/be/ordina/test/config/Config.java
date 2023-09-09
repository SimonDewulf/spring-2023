package be.ordina.test.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("be.ordina.test")
public class Config {

    /* todo: test the code in at least 2 ways:
                - write an integration test on the PieceController
                - test the PieceMappers by autowiring the selector, passing in Pieces and asserting the result

     */

}
