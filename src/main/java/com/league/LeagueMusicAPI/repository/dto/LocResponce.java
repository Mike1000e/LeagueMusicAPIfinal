package com.league.LeagueMusicAPI.repository.dto;

import ch.qos.logback.core.net.SyslogOutputStream;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import org.springframework.stereotype.Service;

import java.util.*;
public class LocResponce {

    List<Result> results = null;

    @JsonProperty("results")
    public List<Result> getResults(){
    return results;
    }

    @JsonProperty("results")
    public void setResults(List<Result> resultList){
        this.results = resultList;
    }


}
