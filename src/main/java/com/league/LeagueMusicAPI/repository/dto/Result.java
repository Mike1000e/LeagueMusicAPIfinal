package com.league.LeagueMusicAPI.repository.dto;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;

import java.util.HashMap;
import java.util.Map;

public class Result {

    public class AverageSpeed {
        private String units;
        private Double content;

        public String getUnits() {
            return units;
        }

        public void setUnits(String units) {
            this.units = units;
        }

        public Double getContent() {
            return content;
        }

        public void setContent(Double content) {
            this.content = content;
        }
    }

    public class Circuit {
        private String circuitName;
        private String circuitId;
        private String url;
        private Location location;

        public String getCircuitName() {
            return circuitName;
        }

        public void setCircuitName(String circuitName) {
            this.circuitName = circuitName;
        }

        public String getCircuitId() {
            return circuitId;
        }

        public void setCircuitId(String circuitId) {
            this.circuitId = circuitId;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public Location getLocation() {
            return location;
        }

        public void setLocation(Location location) {
            this.location = location;
        }
    }

    public class Constructor {
        private String constructorId;
        private String url;
        private String nationality;
        private String name;

        public String getConstructorId() {
            return constructorId;
        }

        public void setConstructorId(String constructorId) {
            this.constructorId = constructorId;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getNationality() {
            return nationality;
        }

        public void setNationality(String nationality) {
            this.nationality = nationality;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    public class Driver {
        private String dateOfBirth;
        private Integer permanentNumber;
        private String code;
        private String driverId;
        private String familyName;
        private String givenName;
        private String url;
        private String nationality;

        public String getDateOfBirth() {
            return dateOfBirth;
        }

        public void setDateOfBirth(String dateOfBirth) {
            this.dateOfBirth = dateOfBirth;
        }

        public Integer getPermanentNumber() {
            return permanentNumber;
        }

        public void setPermanentNumber(Integer permanentNumber) {
            this.permanentNumber = permanentNumber;
        }

        public String getCode() {
            return code;
        }

        public void setCode(String code) {
            this.code = code;
        }

        public String getDriverId() {
            return driverId;
        }

        public void setDriverId(String driverId) {
            this.driverId = driverId;
        }

        public String getFamilyName() {
            return familyName;
        }

        public void setFamilyName(String familyName) {
            this.familyName = familyName;
        }

        public String getGivenName() {
            return givenName;
        }

        public void setGivenName(String givenName) {
            this.givenName = givenName;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getNationality() {
            return nationality;
        }

        public void setNationality(String nationality) {
            this.nationality = nationality;
        }
    }

    public class FastestLap {
        private AverageSpeed averageSpeed;
        private Integer rank;
        private Integer lap;
        private String time;

        public AverageSpeed getAverageSpeed() {
            return averageSpeed;
        }

        public void setAverageSpeed(AverageSpeed averageSpeed) {
            this.averageSpeed = averageSpeed;
        }

        public Integer getRank() {
            return rank;
        }

        public void setRank(Integer rank) {
            this.rank = rank;
        }

        public Integer getLap() {
            return lap;
        }

        public void setLap(Integer lap) {
            this.lap = lap;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }
    }

    public class Location {
        private String locality;
        private String country;
        private Double lat;
        private Double _long;

        public String getLocality() {
            return locality;
        }

        public void setLocality(String locality) {
            this.locality = locality;
        }

        public String getCountry() {
            return country;
        }

        public void setCountry(String country) {
            this.country = country;
        }

        public Double getLat() {
            return lat;
        }

        public void setLat(Double lat) {
            this.lat = lat;
        }

        public Double getLong() {
            return _long;
        }

        public void setLong(Double _long) {
            this._long = _long;
        }
    }

    public class MRData {
        private RaceTable raceTable;
        private String xmlns;
        private Integer total;
        private Integer offset;
        private String series;
        private Integer limit;
        private String url;

        public RaceTable getRaceTable() {
            return raceTable;
        }

        public void setRaceTable(RaceTable raceTable) {
            this.raceTable = raceTable;
        }

        public String getXmlns() {
            return xmlns;
        }

        public void setXmlns(String xmlns) {
            this.xmlns = xmlns;
        }

        public Integer getTotal() {
            return total;
        }

        public void setTotal(Integer total) {
            this.total = total;
        }

        public Integer getOffset() {
            return offset;
        }

        public void setOffset(Integer offset) {
            this.offset = offset;
        }

        public String getSeries() {
            return series;
        }

        public void setSeries(String series) {
            this.series = series;
        }

        public Integer getLimit() {
            return limit;
        }

        public void setLimit(Integer limit) {
            this.limit = limit;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }
    }

    public class Race {
        private Integer round;
        private Integer season;
        private Circuit circuit;
        private String time;
        private ResultsList resultsList;
        private String raceName;
        private String url;
        private String date;

        public Integer getRound() {
            return round;
        }

        public void setRound(Integer round) {
            this.round = round;
        }

        public Integer getSeason() {
            return season;
        }

        public void setSeason(Integer season) {
            this.season = season;
        }

        public Circuit getCircuit() {
            return circuit;
        }

        public void setCircuit(Circuit circuit) {
            this.circuit = circuit;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }

        public ResultsList getResultsList() {
            return resultsList;
        }

        public void setResultsList(ResultsList resultsList) {
            this.resultsList = resultsList;
        }

        public String getRaceName() {
            return raceName;
        }

        public void setRaceName(String raceName) {
            this.raceName = raceName;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getDate() {
            return date;
        }

        public void setDate(String date) {
            this.date = date;
        }
    }

    public class RaceTable {
        private Integer round;
        private Race race;
        private Integer season;
        private Integer position;

        public Integer getRound() {
            return round;
        }

        public void setRound(Integer round) {
            this.round = round;
        }

        public Race getRace() {
            return race;
        }

        public void setRace(Race race) {
            this.race = race;
        }

        public Integer getSeason() {
            return season;
        }

        public void setSeason(Integer season) {
            this.season = season;
        }

        public Integer getPosition() {
            return position;
        }

        public void setPosition(Integer position) {
            this.position = position;
        }
    }

    public class RaceResult {
        private Status status;
        private Integer number;
        private Integer positionText;
        private FastestLap fastestLap;
        private Constructor constructor;
        private Integer grid;
        private Driver driver;
        private Status.Time time;
        private Integer position;
        private Integer laps;
        private Integer points;

        public Status getStatus() {
            return status;
        }

        public void setStatus(Status status) {
            this.status = status;
        }

        public Integer getNumber() {
            return number;
        }

        public void setNumber(Integer number) {
            this.number = number;
        }

        public Integer getPositionText() {
            return positionText;
        }

        public void setPositionText(Integer positionText) {
            this.positionText = positionText;
        }

        public FastestLap getFastestLap() {
            return fastestLap;
        }

        public void setFastestLap(FastestLap fastestLap) {
            this.fastestLap = fastestLap;
        }

        public Constructor getConstructor() {
            return constructor;
        }

        public void setConstructor(Constructor constructor) {
            this.constructor = constructor;
        }

        public Integer getGrid() {
            return grid;
        }

        public void setGrid(Integer grid) {
            this.grid = grid;
        }

        public Driver getDriver() {
            return driver;
        }

        public void setDriver(Driver driver) {
            this.driver = driver;
        }

        public Status.Time getTime() {
            return time;
        }

        public void setTime(Status.Time time) {
            this.time = time;
        }

        public Integer getPosition() {
            return position;
        }

        public void setPosition(Integer position) {
            this.position = position;
        }

        public Integer getLaps() {
            return laps;
        }

        public void setLaps(Integer laps) {
            this.laps = laps;
        }

        public Integer getPoints() {
            return points;
        }

        public void setPoints(Integer points) {
            this.points = points;
        }
    }

    public class ResultsList {
        private Result result;

        public Result getResult() {
            return result;
        }

        public void setResult(Result result) {
            this.result = result;
        }
    }

    public class Root {
        private MRData mRData;

        public MRData getMRData() {
            return mRData;
        }

        public void setMRData(MRData mRData) {
            this.mRData = mRData;
        }
    }

    public class Status {
        private Integer statusId;
        private String content;

        public Integer getStatusId() {
            return statusId;
        }

        public void setStatusId(Integer statusId) {
            this.statusId = statusId;
        }

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public class Time {
            private Integer millis;
            private String content;

            public Integer getMillis() {
                return millis;
            }

            public void setMillis(Integer millis) {
                this.millis = millis;
            }

            public String getContent() {
                return content;
            }

            public void setContent(String content) {
                this.content = content;
            }
        }
    }
}
