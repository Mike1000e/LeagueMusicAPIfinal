package com.league.LeagueMusicAPI.repository;

import com.league.LeagueMusicAPI.repository.dto.LocResponce;
import com.league.LeagueMusicAPI.repository.dto.Result;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;
import org.springframework.web.util.UriBuilder;

import java.net.URI;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;


class LocRepositoryTest {
    private LocRepository locRepository;

    @Mock
    WebClient webClientMock;

    @Mock
    WebClient.RequestHeadersUriSpec requestHeadersUriSpecMock;

    @Mock
    WebClient.RequestHeadersSpec requestHeadersSpecMock;

    @Mock
    WebClient.ResponseSpec responseSpecMock;

    @Mock
    Mono<LocResponce> LocResponseMonoMock;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);

        locRepository = new LocRepository(webClientMock);
    }

    @Test
    void whenGetResults_thenReturnLocResponse() {
        //given
        String query = "Java";
        LocResponce locResponse = new LocResponce();
        Result result = new Result();
        result.setTitle("Java: A Drink, an Island, and a Programming Language");
        result.setAuthors(Collections.singletonList("AUTHOR"));
        result.setLink("LINK");
        List<Result> expectedResults = Collections.singletonList(result);
        locResponse.setResults(expectedResults);

        when(webClientMock.get())
                .thenReturn(requestHeadersUriSpecMock);
        when(requestHeadersUriSpecMock.uri((Function<UriBuilder, URI>) any()))
                .thenReturn(requestHeadersSpecMock);
        when(requestHeadersSpecMock.retrieve())
                .thenReturn(responseSpecMock);
        when(responseSpecMock.bodyToMono(LocResponce.class))
                .thenReturn(LocResponseMonoMock);
        when(LocResponseMonoMock.block())
                .thenReturn(locResponse);
        //when
        List<Result> actualResults = locRepository.getResults(query);
        //then
        assertEquals(actualResults, expectedResults);
    }
}