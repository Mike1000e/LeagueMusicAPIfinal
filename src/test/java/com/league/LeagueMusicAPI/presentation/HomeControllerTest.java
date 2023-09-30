package com.league.LeagueMusicAPI.presentation;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class HomeControllerTest {

    @BeforeEach
    void setUp() {

    }

    @Test
    void whenHome_thenReturnRedirect() {
        //given
        String expected = "redirect:swagger-ui.html";
        //when
        String actual = HomeController.home();
        //then
        assertEquals(expected,actual);
    }
}