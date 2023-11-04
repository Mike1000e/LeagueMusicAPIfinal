package com.league.LeagueMusicAPI.service;

import com.league.LeagueMusicAPI.presentation.LocController;
import com.league.LeagueMusicAPI.repository.LocRepository;
import com.league.LeagueMusicAPI.repository.dto.Result;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

class LocServiceTest {
    @Mock
    private LocRepository repository;

    private LocService service;


    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);

        service = new LocService(repository);
    }

    @Test
    void givenResults_ReturnGoodResultList() {
        String query = "Java";
        Result result = new Result();
        result.setTitle("TITLE");
        result.setLink("LINK");
        result.setAuthors(Collections.singletonList("AUTHORS"));
        List<Result> expectedResults = Collections.singletonList(result);
        when(repository.getResults(query)).thenReturn(expectedResults);

        List<Result> actualResults = service.getResults(query);

        assertEquals(actualResults,expectedResults);
    }
}