package be.ordina.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RestApplication {

    public static void main(String[] args) {
        SpringApplication.run(RestApplication.class, args);
    }

    /* todo: ex1: define the following rest endpoints:
                   fetch a chess game by Id
                   create a new chess game
                   delete a chess game
                   update a chess players points

              ex2: define exceptionHandling for generic and specific exception cases


    */
}
