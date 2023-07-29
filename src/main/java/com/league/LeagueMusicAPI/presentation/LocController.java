package com.league.LeagueMusicAPI.presentation;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LocController {

    @GetMapping("/searchLocResults")
    @Operation(value = "Searches for books matching the search term",
            notes = "Response may include multiple Result values.",
            response = String.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Result(s) found")
    })
    public String getResults(@RequestParam(value="q") String query){
    return "Searching for books related to " + query;
}
}