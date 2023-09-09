package com.league.LeagueMusicAPI.repository.dto;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import jakarta.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import jakarta.validation.Valid;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "lat",
        "long",
        "locality",
        "country"

})
public class Result {
    //@JsonProperty("Races")
   // private Map<String,Object> races = new LinkedHashMap<String,Object>();

    @JsonProperty("lat")
    private String lat;

    public void setLat(String newLat){
        this.lat=newLat;
    }
    public String getLat(){
        return lat;
    }

    @JsonProperty("long")
    private String longtitude;

    public void setLong(String newLong){
        this.longtitude = newLong;
    }
    public String getLong(){
        return longtitude;
    }

    @JsonProperty("locality")
    private String locality;

    public void setLocality(String newLocality){
        this.locality= newLocality;
    }
    public String getLocality(){
        return locality;
    }

    @JsonProperty("country")
    private String country;

    public void setCountry(String newCountry){
        this.country=newCountry;
    }
    public String getCountry(){
        return country;
    }

}