package com.league.LeagueMusicAPI.repository;

import com.league.LeagueMusicAPI.repository.dto.LocResponce;
import com.league.LeagueMusicAPI.repository.dto.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.List;

@Repository
public class LocRepository {

    private final WebClient webClient;

    private static final String baseUrl = "https://loc.gov/books";

    public LocRepository(WebClient webClientMock) {
        webClient = WebClient
                .builder()
                .baseUrl(baseUrl)
                .build();
    }
    public LocRepository(){
        webClient = WebClient
                .builder()
                .baseUrl(baseUrl)
                .build();
    }

    public List<Result> getResults(String query) {
System.out.println(webClient.get()
        .uri(uriBuilder -> uriBuilder
                .queryParam("fo", "json")
                .queryParam("at", "results")
                .queryParam("q", query)
                .build()
        ).retrieve()
        .bodyToMono(LocResponce.class)
        .block()
        .getResults());


        return webClient.get()
                .uri(uriBuilder -> uriBuilder
                            .queryParam("fo", "json")
                            .queryParam("at", "results")
                            .queryParam("q", query)
                            .build()
                ).retrieve()
                .bodyToMono(LocResponce.class)
                .block()
                .getResults();
                }
    }

