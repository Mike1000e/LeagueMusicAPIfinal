package com.league.LeagueMusicAPI.repository.dto;

import ch.qos.logback.core.net.SyslogOutputStream;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import java.util.*;

public class LocResponce {

    List<Result> results = null;

    @JsonProperty("results")
    public List<Result> getResults(){
    return results;
    }

    @JsonProperty("results")
    void setResults(List<Result> resultList){
        this.results = resultList;
    }


}
