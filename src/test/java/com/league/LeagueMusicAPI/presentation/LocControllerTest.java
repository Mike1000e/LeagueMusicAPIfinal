package com.league.LeagueMusicAPI.presentation;

import com.league.LeagueMusicAPI.repository.dto.Result;
import com.league.LeagueMusicAPI.service.LocService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.web.server.ResponseStatusException;

import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

class LocControllerTest {
    private LocController controller;
    @Mock
    private LocService service;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);

        controller = new LocController(service);
    }

    @Test
    void givenGoodQuery_whenGetResults_thenReturnListOfResults() {
        String query = "Java";
        Result result = new Result();
        result.setTitle("TITLE");
        result.setLink("LINK");
        result.setAuthors(Collections.singletonList("AUTHORS"));
        List<Result> expectedResults = Collections.singletonList(result);
        when(service.getResults(query)).thenReturn(expectedResults);

        List<Result> actual = controller.getResults(query);

        assertEquals(actual, expectedResults);
    }

   @Test
   void givenBadQuery_whenGetResults_thenThrowsException(){
        String query = "Java";


       Throwable exceptionThrown = assertThrows(ResponseStatusException.class, () -> controller.getResults(query));
       assertEquals(exceptionThrown.getMessage(), "404 NOT_FOUND \"Result(s) not found.\"");
   }


   }
