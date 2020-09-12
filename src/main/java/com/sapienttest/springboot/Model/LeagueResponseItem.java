package com.sapienttest.springboot.Model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class LeagueResponseItem {
        @JsonProperty("country_id")
        private String CountryId;
        @JsonProperty("country_name")
        private String CountryName;
        @JsonProperty("league_id")
        private String LeagueId;
        @JsonProperty("league_name")
        private String leagueName;
        @JsonProperty("league_season")
        private String leagueSeason;
        @JsonProperty("league_logo")
        private String leagueLogo;
        @JsonProperty("country_logo")
        private String countryLogo;

        public String getCountryId() {
            return CountryId;
        }

        public void setCountryId(String countryId) {
            CountryId = countryId;
        }

        public String getCountryName() {
            return CountryName;
        }

        public void setCountryName(String countryName) {
            CountryName = countryName;
        }

        public String getLeagueId() {
            return LeagueId;
        }

        public void setLeagueId(String leagueId) {
            LeagueId = leagueId;
        }

        public String getLeagueName() {
            return leagueName;
        }

        public void setLeagueName(String leagueName) {
            this.leagueName = leagueName;
        }

        public String getLeagueSeason() {
            return leagueSeason;
        }

        public void setLeagueSeason(String leagueSeason) {
            this.leagueSeason = leagueSeason;
        }

        public String getLeagueLogo() {
            return leagueLogo;
        }

        public void setLeagueLogo(String leagueLogo) {
            this.leagueLogo = leagueLogo;
        }

        public String getCountryLogo() {
            return countryLogo;
        }

        public void setCountryLogo(String countryLogo) {
            this.countryLogo = countryLogo;
        }
}
