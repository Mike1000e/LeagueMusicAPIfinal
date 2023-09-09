package com.league.LeagueMusicAPI.presentation;


import com.league.LeagueMusicAPI.repository.dto.Result;
import com.league.LeagueMusicAPI.service.LocService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.http.HttpStatus;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
public class LocController {

    private final LocService locService;

    public LocController(LocService locService) {
        this.locService = locService;
    }

    @GetMapping("/searchLocResults")
    @Operation(summary = "Searches for books matching the search term",
            description = "Response may include multiple Result values.")
            //responses = Result.class)


    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Result(s) found",
            content = {@Content(mediaType = "application/json",
            schema = @Schema(implementation = Result.class))}),
            @ApiResponse(responseCode = "400", description = "Result(s) not found")
    })
    public List<Result> getResults(@RequestParam String query) {
        System.out.println(query);
        List<Result> results =  locService.getResults(query);
        if(CollectionUtils.isEmpty(results)){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Result(s) not found.");
        }
        System.out.println(results.toString());
        return results;
    }

}