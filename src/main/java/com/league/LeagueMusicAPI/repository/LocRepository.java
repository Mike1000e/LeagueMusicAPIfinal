package com.league.LeagueMusicAPI.repository;

import org.springframework.stereotype.Repository;
import org.springframework.web.reactive.function.client.WebClient;

@Repository
public class LocRepository {

    private final WebClient webClient;

    private static final String baseUrl = "http://ergast.com/api";

    public LocRepository() {
        webClient = WebClient
                .builder()
                .baseUrl(baseUrl)
                .build();
    }


    public String getResults(String query) {
        return "Searching for race results in the year " + query;
    }
}
