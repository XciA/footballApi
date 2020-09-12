package com.sapienttest.springboot.Model;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "team_key",
        "team_name",
        "team_badge"
})

public class TeamResponseItem {

    @JsonProperty("team_key")
    private String teamKey;
    @JsonProperty("team_name")
    private String teamName;
    @JsonProperty("team_badge")
    private String teamBadge;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("team_key")
    public String getTeamKey() {
        return teamKey;
    }

    @JsonProperty("team_key")
    public void setTeamKey(String teamKey) {
        this.teamKey = teamKey;
    }

    @JsonProperty("team_name")
    public String getTeamName() {
        return teamName;
    }

    @JsonProperty("team_name")
    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    @JsonProperty("team_badge")
    public String getTeamBadge() {
        return teamBadge;
    }

    @JsonProperty("team_badge")
    public void setTeamBadge(String teamBadge) {
        this.teamBadge = teamBadge;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }
}