package com.league.LeagueMusicAPI.repository;

import com.league.LeagueMusicAPI.repository.dto.LocResponce;
import com.league.LeagueMusicAPI.repository.dto.Result;
import org.springframework.stereotype.Repository;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.List;

@Repository
public class LocRepository {

    private final WebClient webClient;

    private static final String baseUrl = "http://ergast.com/api/";

    public LocRepository() {
        webClient = WebClient
                .builder()
                .baseUrl(baseUrl)
                .build();
    }

    public List<Result> getResults(String query) {

        System.out.println(query);
        LocResponce lc = webClient.get()
                .uri(uriBuilder -> {
                    System.out.println(uriBuilder
                            .path(query + ".json")
                            .build()
                            .toString());
                           return uriBuilder.build();

                }
                )
                .retrieve()
                .bodyToMono(LocResponce.class)
                .block();
        System.out.println(lc);
        return lc.getResults();
    }
}
