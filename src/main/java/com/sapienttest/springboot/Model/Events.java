package com.sapienttest.springboot.Model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "time",
        "substitution"
})
 class Away {

    @JsonProperty("time")
    private String time;
    @JsonProperty("substitution")
    private String substitution;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("time")
     String getTime() {
        return time;
    }

    @JsonProperty("time")
     void setTime(String time) {
        this.time = time;
    }

    @JsonProperty("substitution")
     String getSubstitution() {
        return substitution;
    }

    @JsonProperty("substitution")
     void setSubstitution(String substitution) {
        this.substitution = substitution;
    }

    @JsonAnyGetter
     Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
     void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "starting_lineups",
        "substitutes",
        "coach",
        "missing_players"
})
class Away_ {

    @JsonProperty("starting_lineups")
    private List<StartingLineup_> startingLineups = null;
    @JsonProperty("substitutes")
    private List<Substitute_> substitutes = null;
    @JsonProperty("coach")
    private List<Coach_> coach = null;
    @JsonProperty("missing_players")
    private List<MissingPlayer_> missingPlayers = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("starting_lineups")
     List<StartingLineup_> getStartingLineups() {
        return startingLineups;
    }

    @JsonProperty("starting_lineups")
     void setStartingLineups(List<StartingLineup_> startingLineups) {
        this.startingLineups = startingLineups;
    }

    @JsonProperty("substitutes")
     List<Substitute_> getSubstitutes() {
        return substitutes;
    }

    @JsonProperty("substitutes")
     void setSubstitutes(List<Substitute_> substitutes) {
        this.substitutes = substitutes;
    }

    @JsonProperty("coach")
     List<Coach_> getCoach() {
        return coach;
    }

    @JsonProperty("coach")
     void setCoach(List<Coach_> coach) {
        this.coach = coach;
    }

    @JsonProperty("missing_players")
     List<MissingPlayer_> getMissingPlayers() {
        return missingPlayers;
    }

    @JsonProperty("missing_players")
     void setMissingPlayers(List<MissingPlayer_> missingPlayers) {
        this.missingPlayers = missingPlayers;
    }

    @JsonAnyGetter
     Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
     void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "time",
        "home_fault",
        "card",
        "away_fault",
        "info"
})
 class Card {

    @JsonProperty("time")
    private String time;
    @JsonProperty("home_fault")
    private String homeFault;
    @JsonProperty("card")
    private String card;
    @JsonProperty("away_fault")
    private String awayFault;
    @JsonProperty("info")
    private String info;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("time")
     String getTime() {
        return time;
    }

    @JsonProperty("time")
     void setTime(String time) {
        this.time = time;
    }

    @JsonProperty("home_fault")
     String getHomeFault() {
        return homeFault;
    }

    @JsonProperty("home_fault")
     void setHomeFault(String homeFault) {
        this.homeFault = homeFault;
    }

    @JsonProperty("card")
     String getCard() {
        return card;
    }

    @JsonProperty("card")
     void setCard(String card) {
        this.card = card;
    }

    @JsonProperty("away_fault")
     String getAwayFault() {
        return awayFault;
    }

    @JsonProperty("away_fault")
     void setAwayFault(String awayFault) {
        this.awayFault = awayFault;
    }

    @JsonProperty("info")
     String getInfo() {
        return info;
    }

    @JsonProperty("info")
     void setInfo(String info) {
        this.info = info;
    }

    @JsonAnyGetter
     Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
     void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "lineup_player",
        "lineup_number",
        "lineup_position"
})
 class Coach {

    @JsonProperty("lineup_player")
    private String lineupPlayer;
    @JsonProperty("lineup_number")
    private String lineupNumber;
    @JsonProperty("lineup_position")
    private String lineupPosition;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("lineup_player")
     String getLineupPlayer() {
        return lineupPlayer;
    }

    @JsonProperty("lineup_player")
     void setLineupPlayer(String lineupPlayer) {
        this.lineupPlayer = lineupPlayer;
    }

    @JsonProperty("lineup_number")
     String getLineupNumber() {
        return lineupNumber;
    }

    @JsonProperty("lineup_number")
     void setLineupNumber(String lineupNumber) {
        this.lineupNumber = lineupNumber;
    }

    @JsonProperty("lineup_position")
     String getLineupPosition() {
        return lineupPosition;
    }

    @JsonProperty("lineup_position")
     void setLineupPosition(String lineupPosition) {
        this.lineupPosition = lineupPosition;
    }

    @JsonAnyGetter
     Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
     void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "lineup_player",
        "lineup_number",
        "lineup_position"
})
 class Coach_ {

    @JsonProperty("lineup_player")
    private String lineupPlayer;
    @JsonProperty("lineup_number")
    private String lineupNumber;
    @JsonProperty("lineup_position")
    private String lineupPosition;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("lineup_player")
     String getLineupPlayer() {
        return lineupPlayer;
    }

    @JsonProperty("lineup_player")
     void setLineupPlayer(String lineupPlayer) {
        this.lineupPlayer = lineupPlayer;
    }

    @JsonProperty("lineup_number")
     String getLineupNumber() {
        return lineupNumber;
    }

    @JsonProperty("lineup_number")
     void setLineupNumber(String lineupNumber) {
        this.lineupNumber = lineupNumber;
    }

    @JsonProperty("lineup_position")
     String getLineupPosition() {
        return lineupPosition;
    }

    @JsonProperty("lineup_position")
     void setLineupPosition(String lineupPosition) {
        this.lineupPosition = lineupPosition;
    }

    @JsonAnyGetter
     Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
     void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "match_id",
        "country_id",
        "country_name",
        "league_id",
        "league_name",
        "match_date",
        "match_status",
        "match_time",
        "match_hometeam_id",
        "match_hometeam_name",
        "match_hometeam_score",
        "match_awayteam_name",
        "match_awayteam_id",
        "match_awayteam_score",
        "match_hometeam_halftime_score",
        "match_awayteam_halftime_score",
        "match_hometeam_extra_score",
        "match_awayteam_extra_score",
        "match_hometeam_penalty_score",
        "match_awayteam_penalty_score",
        "match_hometeam_ft_score",
        "match_awayteam_ft_score",
        "match_hometeam_system",
        "match_awayteam_system",
        "match_live",
        "match_round",
        "match_stadium",
        "match_referee",
        "team_home_badge",
        "team_away_badge",
        "goalscorer",
        "cards",
        "substitutions",
        "lineup",
        "statistics"
})
 public class Events {

    @JsonProperty("match_id")
    private String matchId;
    @JsonProperty("country_id")
    private String countryId;
    @JsonProperty("country_name")
    private String countryName;
    @JsonProperty("league_id")
    private String leagueId;
    @JsonProperty("league_name")
    private String leagueName;
    @JsonProperty("match_date")
    private String matchDate;
    @JsonProperty("match_status")
    private String matchStatus;
    @JsonProperty("match_time")
    private String matchTime;
    @JsonProperty("match_hometeam_id")
    private String matchHometeamId;
    @JsonProperty("match_hometeam_name")
    private String matchHometeamName;
    @JsonProperty("match_hometeam_score")
    private String matchHometeamScore;
    @JsonProperty("match_awayteam_name")
    private String matchAwayteamName;
    @JsonProperty("match_awayteam_id")
    private String matchAwayteamId;
    @JsonProperty("match_awayteam_score")
    private String matchAwayteamScore;
    @JsonProperty("match_hometeam_halftime_score")
    private String matchHometeamHalftimeScore;
    @JsonProperty("match_awayteam_halftime_score")
    private String matchAwayteamHalftimeScore;
    @JsonProperty("match_hometeam_extra_score")
    private String matchHometeamExtraScore;
    @JsonProperty("match_awayteam_extra_score")
    private String matchAwayteamExtraScore;
    @JsonProperty("match_hometeam_penalty_score")
    private String matchHometeamPenaltyScore;
    @JsonProperty("match_awayteam_penalty_score")
    private String matchAwayteamPenaltyScore;
    @JsonProperty("match_hometeam_ft_score")
    private String matchHometeamFtScore;
    @JsonProperty("match_awayteam_ft_score")
    private String matchAwayteamFtScore;
    @JsonProperty("match_hometeam_system")
    private String matchHometeamSystem;
    @JsonProperty("match_awayteam_system")
    private String matchAwayteamSystem;
    @JsonProperty("match_live")
    private String matchLive;
    @JsonProperty("match_round")
    private String matchRound;
    @JsonProperty("match_stadium")
    private String matchStadium;
    @JsonProperty("match_referee")
    private String matchReferee;
    @JsonProperty("team_home_badge")
    private String teamHomeBadge;
    @JsonProperty("team_away_badge")
    private String teamAwayBadge;
    @JsonProperty("goalscorer")
    private List<Goalscorer> goalscorer = null;
    @JsonProperty("cards")
    private List<Card> cards = null;
    @JsonProperty("substitutions")
    private Substitutions substitutions;
    @JsonProperty("lineup")
    private Lineup lineup;
    @JsonProperty("statistics")
    private List<Statistic> statistics = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("match_id")
     String getMatchId() {
        return matchId;
    }

    @JsonProperty("match_id")
     void setMatchId(String matchId) {
        this.matchId = matchId;
    }

    @JsonProperty("country_id")
     String getCountryId() {
        return countryId;
    }

    @JsonProperty("country_id")
     void setCountryId(String countryId) {
        this.countryId = countryId;
    }

    @JsonProperty("country_name")
     String getCountryName() {
        return countryName;
    }

    @JsonProperty("country_name")
     void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    @JsonProperty("league_id")
     String getLeagueId() {
        return leagueId;
    }

    @JsonProperty("league_id")
     void setLeagueId(String leagueId) {
        this.leagueId = leagueId;
    }

    @JsonProperty("league_name")
     String getLeagueName() {
        return leagueName;
    }

    @JsonProperty("league_name")
     void setLeagueName(String leagueName) {
        this.leagueName = leagueName;
    }

    @JsonProperty("match_date")
     String getMatchDate() {
        return matchDate;
    }

    @JsonProperty("match_date")
     void setMatchDate(String matchDate) {
        this.matchDate = matchDate;
    }

    @JsonProperty("match_status")
     String getMatchStatus() {
        return matchStatus;
    }

    @JsonProperty("match_status")
     void setMatchStatus(String matchStatus) {
        this.matchStatus = matchStatus;
    }

    @JsonProperty("match_time")
     String getMatchTime() {
        return matchTime;
    }

    @JsonProperty("match_time")
     void setMatchTime(String matchTime) {
        this.matchTime = matchTime;
    }

    @JsonProperty("match_hometeam_id")
     String getMatchHometeamId() {
        return matchHometeamId;
    }

    @JsonProperty("match_hometeam_id")
     void setMatchHometeamId(String matchHometeamId) {
        this.matchHometeamId = matchHometeamId;
    }

    @JsonProperty("match_hometeam_name")
     String getMatchHometeamName() {
        return matchHometeamName;
    }

    @JsonProperty("match_hometeam_name")
     void setMatchHometeamName(String matchHometeamName) {
        this.matchHometeamName = matchHometeamName;
    }

    @JsonProperty("match_hometeam_score")
     String getMatchHometeamScore() {
        return matchHometeamScore;
    }

    @JsonProperty("match_hometeam_score")
     void setMatchHometeamScore(String matchHometeamScore) {
        this.matchHometeamScore = matchHometeamScore;
    }

    @JsonProperty("match_awayteam_name")
     String getMatchAwayteamName() {
        return matchAwayteamName;
    }

    @JsonProperty("match_awayteam_name")
     void setMatchAwayteamName(String matchAwayteamName) {
        this.matchAwayteamName = matchAwayteamName;
    }

    @JsonProperty("match_awayteam_id")
     String getMatchAwayteamId() {
        return matchAwayteamId;
    }

    @JsonProperty("match_awayteam_id")
     void setMatchAwayteamId(String matchAwayteamId) {
        this.matchAwayteamId = matchAwayteamId;
    }

    @JsonProperty("match_awayteam_score")
     String getMatchAwayteamScore() {
        return matchAwayteamScore;
    }

    @JsonProperty("match_awayteam_score")
     void setMatchAwayteamScore(String matchAwayteamScore) {
        this.matchAwayteamScore = matchAwayteamScore;
    }

    @JsonProperty("match_hometeam_halftime_score")
     String getMatchHometeamHalftimeScore() {
        return matchHometeamHalftimeScore;
    }

    @JsonProperty("match_hometeam_halftime_score")
     void setMatchHometeamHalftimeScore(String matchHometeamHalftimeScore) {
        this.matchHometeamHalftimeScore = matchHometeamHalftimeScore;
    }

    @JsonProperty("match_awayteam_halftime_score")
     String getMatchAwayteamHalftimeScore() {
        return matchAwayteamHalftimeScore;
    }

    @JsonProperty("match_awayteam_halftime_score")
     void setMatchAwayteamHalftimeScore(String matchAwayteamHalftimeScore) {
        this.matchAwayteamHalftimeScore = matchAwayteamHalftimeScore;
    }

    @JsonProperty("match_hometeam_extra_score")
     String getMatchHometeamExtraScore() {
        return matchHometeamExtraScore;
    }

    @JsonProperty("match_hometeam_extra_score")
     void setMatchHometeamExtraScore(String matchHometeamExtraScore) {
        this.matchHometeamExtraScore = matchHometeamExtraScore;
    }

    @JsonProperty("match_awayteam_extra_score")
     String getMatchAwayteamExtraScore() {
        return matchAwayteamExtraScore;
    }

    @JsonProperty("match_awayteam_extra_score")
     void setMatchAwayteamExtraScore(String matchAwayteamExtraScore) {
        this.matchAwayteamExtraScore = matchAwayteamExtraScore;
    }

    @JsonProperty("match_hometeam_penalty_score")
     String getMatchHometeamPenaltyScore() {
        return matchHometeamPenaltyScore;
    }

    @JsonProperty("match_hometeam_penalty_score")
     void setMatchHometeamPenaltyScore(String matchHometeamPenaltyScore) {
        this.matchHometeamPenaltyScore = matchHometeamPenaltyScore;
    }

    @JsonProperty("match_awayteam_penalty_score")
     String getMatchAwayteamPenaltyScore() {
        return matchAwayteamPenaltyScore;
    }

    @JsonProperty("match_awayteam_penalty_score")
     void setMatchAwayteamPenaltyScore(String matchAwayteamPenaltyScore) {
        this.matchAwayteamPenaltyScore = matchAwayteamPenaltyScore;
    }

    @JsonProperty("match_hometeam_ft_score")
     String getMatchHometeamFtScore() {
        return matchHometeamFtScore;
    }

    @JsonProperty("match_hometeam_ft_score")
     void setMatchHometeamFtScore(String matchHometeamFtScore) {
        this.matchHometeamFtScore = matchHometeamFtScore;
    }

    @JsonProperty("match_awayteam_ft_score")
     String getMatchAwayteamFtScore() {
        return matchAwayteamFtScore;
    }

    @JsonProperty("match_awayteam_ft_score")
     void setMatchAwayteamFtScore(String matchAwayteamFtScore) {
        this.matchAwayteamFtScore = matchAwayteamFtScore;
    }

    @JsonProperty("match_hometeam_system")
     String getMatchHometeamSystem() {
        return matchHometeamSystem;
    }

    @JsonProperty("match_hometeam_system")
     void setMatchHometeamSystem(String matchHometeamSystem) {
        this.matchHometeamSystem = matchHometeamSystem;
    }

    @JsonProperty("match_awayteam_system")
     String getMatchAwayteamSystem() {
        return matchAwayteamSystem;
    }

    @JsonProperty("match_awayteam_system")
     void setMatchAwayteamSystem(String matchAwayteamSystem) {
        this.matchAwayteamSystem = matchAwayteamSystem;
    }

    @JsonProperty("match_live")
     String getMatchLive() {
        return matchLive;
    }

    @JsonProperty("match_live")
     void setMatchLive(String matchLive) {
        this.matchLive = matchLive;
    }

    @JsonProperty("match_round")
     String getMatchRound() {
        return matchRound;
    }

    @JsonProperty("match_round")
     void setMatchRound(String matchRound) {
        this.matchRound = matchRound;
    }

    @JsonProperty("match_stadium")
     String getMatchStadium() {
        return matchStadium;
    }

    @JsonProperty("match_stadium")
     void setMatchStadium(String matchStadium) {
        this.matchStadium = matchStadium;
    }

    @JsonProperty("match_referee")
     String getMatchReferee() {
        return matchReferee;
    }

    @JsonProperty("match_referee")
     void setMatchReferee(String matchReferee) {
        this.matchReferee = matchReferee;
    }

    @JsonProperty("team_home_badge")
     String getTeamHomeBadge() {
        return teamHomeBadge;
    }

    @JsonProperty("team_home_badge")
     void setTeamHomeBadge(String teamHomeBadge) {
        this.teamHomeBadge = teamHomeBadge;
    }

    @JsonProperty("team_away_badge")
     String getTeamAwayBadge() {
        return teamAwayBadge;
    }

    @JsonProperty("team_away_badge")
     void setTeamAwayBadge(String teamAwayBadge) {
        this.teamAwayBadge = teamAwayBadge;
    }

    @JsonProperty("goalscorer")
     List<Goalscorer> getGoalscorer() {
        return goalscorer;
    }

    @JsonProperty("goalscorer")
     void setGoalscorer(List<Goalscorer> goalscorer) {
        this.goalscorer = goalscorer;
    }

    @JsonProperty("cards")
     List<Card> getCards() {
        return cards;
    }

    @JsonProperty("cards")
     void setCards(List<Card> cards) {
        this.cards = cards;
    }

    @JsonProperty("substitutions")
     Substitutions getSubstitutions() {
        return substitutions;
    }

    @JsonProperty("substitutions")
     void setSubstitutions(Substitutions substitutions) {
        this.substitutions = substitutions;
    }

    @JsonProperty("lineup")
     Lineup getLineup() {
        return lineup;
    }

    @JsonProperty("lineup")
     void setLineup(Lineup lineup) {
        this.lineup = lineup;
    }

    @JsonProperty("statistics")
     List<Statistic> getStatistics() {
        return statistics;
    }

    @JsonProperty("statistics")
     void setStatistics(List<Statistic> statistics) {
        this.statistics = statistics;
    }

    @JsonAnyGetter
     Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
     void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "time",
        "home_scorer",
        "score",
        "away_scorer",
        "info"
})
 class Goalscorer {

    @JsonProperty("time")
    private String time;
    @JsonProperty("home_scorer")
    private String homeScorer;
    @JsonProperty("score")
    private String score;
    @JsonProperty("away_scorer")
    private String awayScorer;
    @JsonProperty("info")
    private String info;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("time")
     String getTime() {
        return time;
    }

    @JsonProperty("time")
     void setTime(String time) {
        this.time = time;
    }

    @JsonProperty("home_scorer")
     String getHomeScorer() {
        return homeScorer;
    }

    @JsonProperty("home_scorer")
     void setHomeScorer(String homeScorer) {
        this.homeScorer = homeScorer;
    }

    @JsonProperty("score")
     String getScore() {
        return score;
    }

    @JsonProperty("score")
     void setScore(String score) {
        this.score = score;
    }

    @JsonProperty("away_scorer")
     String getAwayScorer() {
        return awayScorer;
    }

    @JsonProperty("away_scorer")
     void setAwayScorer(String awayScorer) {
        this.awayScorer = awayScorer;
    }

    @JsonProperty("info")
     String getInfo() {
        return info;
    }

    @JsonProperty("info")
     void setInfo(String info) {
        this.info = info;
    }

    @JsonAnyGetter
     Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
     void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "time",
        "substitution"
})
 class Home {

    @JsonProperty("time")
    private String time;
    @JsonProperty("substitution")
    private String substitution;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("time")
     String getTime() {
        return time;
    }

    @JsonProperty("time")
     void setTime(String time) {
        this.time = time;
    }

    @JsonProperty("substitution")
     String getSubstitution() {
        return substitution;
    }

    @JsonProperty("substitution")
     void setSubstitution(String substitution) {
        this.substitution = substitution;
    }

    @JsonAnyGetter
     Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
     void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "starting_lineups",
        "substitutes",
        "coach",
        "missing_players"
})
 class Home_ {

    @JsonProperty("starting_lineups")
    private List<StartingLineup> startingLineups = null;
    @JsonProperty("substitutes")
    private List<Substitute> substitutes = null;
    @JsonProperty("coach")
    private List<Coach> coach = null;
    @JsonProperty("missing_players")
    private List<MissingPlayer> missingPlayers = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("starting_lineups")
     List<StartingLineup> getStartingLineups() {
        return startingLineups;
    }

    @JsonProperty("starting_lineups")
     void setStartingLineups(List<StartingLineup> startingLineups) {
        this.startingLineups = startingLineups;
    }

    @JsonProperty("substitutes")
     List<Substitute> getSubstitutes() {
        return substitutes;
    }

    @JsonProperty("substitutes")
     void setSubstitutes(List<Substitute> substitutes) {
        this.substitutes = substitutes;
    }

    @JsonProperty("coach")
     List<Coach> getCoach() {
        return coach;
    }

    @JsonProperty("coach")
     void setCoach(List<Coach> coach) {
        this.coach = coach;
    }

    @JsonProperty("missing_players")
     List<MissingPlayer> getMissingPlayers() {
        return missingPlayers;
    }

    @JsonProperty("missing_players")
     void setMissingPlayers(List<MissingPlayer> missingPlayers) {
        this.missingPlayers = missingPlayers;
    }

    @JsonAnyGetter
     Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
     void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "home",
        "away"
})
 class Lineup {

    @JsonProperty("home")
    private Home_ home;
    @JsonProperty("away")
    private Away_ away;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("home")
     Home_ getHome() {
        return home;
    }

    @JsonProperty("home")
     void setHome(Home_ home) {
        this.home = home;
    }

    @JsonProperty("away")
     Away_ getAway() {
        return away;
    }

    @JsonProperty("away")
     void setAway(Away_ away) {
        this.away = away;
    }

    @JsonAnyGetter
     Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
     void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "lineup_player",
        "lineup_number",
        "lineup_position"
})
 class MissingPlayer {

    @JsonProperty("lineup_player")
    private String lineupPlayer;
    @JsonProperty("lineup_number")
    private String lineupNumber;
    @JsonProperty("lineup_position")
    private String lineupPosition;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("lineup_player")
     String getLineupPlayer() {
        return lineupPlayer;
    }

    @JsonProperty("lineup_player")
     void setLineupPlayer(String lineupPlayer) {
        this.lineupPlayer = lineupPlayer;
    }

    @JsonProperty("lineup_number")
     String getLineupNumber() {
        return lineupNumber;
    }

    @JsonProperty("lineup_number")
     void setLineupNumber(String lineupNumber) {
        this.lineupNumber = lineupNumber;
    }

    @JsonProperty("lineup_position")
     String getLineupPosition() {
        return lineupPosition;
    }

    @JsonProperty("lineup_position")
     void setLineupPosition(String lineupPosition) {
        this.lineupPosition = lineupPosition;
    }

    @JsonAnyGetter
     Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
     void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "lineup_player",
        "lineup_number",
        "lineup_position"
})
 class MissingPlayer_ {

    @JsonProperty("lineup_player")
    private String lineupPlayer;
    @JsonProperty("lineup_number")
    private String lineupNumber;
    @JsonProperty("lineup_position")
    private String lineupPosition;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("lineup_player")
     String getLineupPlayer() {
        return lineupPlayer;
    }

    @JsonProperty("lineup_player")
     void setLineupPlayer(String lineupPlayer) {
        this.lineupPlayer = lineupPlayer;
    }

    @JsonProperty("lineup_number")
     String getLineupNumber() {
        return lineupNumber;
    }

    @JsonProperty("lineup_number")
     void setLineupNumber(String lineupNumber) {
        this.lineupNumber = lineupNumber;
    }

    @JsonProperty("lineup_position")
     String getLineupPosition() {
        return lineupPosition;
    }

    @JsonProperty("lineup_position")
     void setLineupPosition(String lineupPosition) {
        this.lineupPosition = lineupPosition;
    }

    @JsonAnyGetter
     Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
     void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "lineup_player",
        "lineup_number",
        "lineup_position"
})
 class StartingLineup {

    @JsonProperty("lineup_player")
    private String lineupPlayer;
    @JsonProperty("lineup_number")
    private String lineupNumber;
    @JsonProperty("lineup_position")
    private String lineupPosition;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("lineup_player")
     String getLineupPlayer() {
        return lineupPlayer;
    }

    @JsonProperty("lineup_player")
     void setLineupPlayer(String lineupPlayer) {
        this.lineupPlayer = lineupPlayer;
    }

    @JsonProperty("lineup_number")
     String getLineupNumber() {
        return lineupNumber;
    }

    @JsonProperty("lineup_number")
     void setLineupNumber(String lineupNumber) {
        this.lineupNumber = lineupNumber;
    }

    @JsonProperty("lineup_position")
     String getLineupPosition() {
        return lineupPosition;
    }

    @JsonProperty("lineup_position")
     void setLineupPosition(String lineupPosition) {
        this.lineupPosition = lineupPosition;
    }

    @JsonAnyGetter
     Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
     void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "lineup_player",
        "lineup_number",
        "lineup_position"
})
 class StartingLineup_ {

    @JsonProperty("lineup_player")
    private String lineupPlayer;
    @JsonProperty("lineup_number")
    private String lineupNumber;
    @JsonProperty("lineup_position")
    private String lineupPosition;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("lineup_player")
     String getLineupPlayer() {
        return lineupPlayer;
    }

    @JsonProperty("lineup_player")
     void setLineupPlayer(String lineupPlayer) {
        this.lineupPlayer = lineupPlayer;
    }

    @JsonProperty("lineup_number")
     String getLineupNumber() {
        return lineupNumber;
    }

    @JsonProperty("lineup_number")
     void setLineupNumber(String lineupNumber) {
        this.lineupNumber = lineupNumber;
    }

    @JsonProperty("lineup_position")
     String getLineupPosition() {
        return lineupPosition;
    }

    @JsonProperty("lineup_position")
     void setLineupPosition(String lineupPosition) {
        this.lineupPosition = lineupPosition;
    }

    @JsonAnyGetter
     Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
     void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "type",
        "home",
        "away"
})
 class Statistic {

    @JsonProperty("type")
    private String type;
    @JsonProperty("home")
    private String home;
    @JsonProperty("away")
    private String away;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("type")
     String getType() {
        return type;
    }

    @JsonProperty("type")
     void setType(String type) {
        this.type = type;
    }

    @JsonProperty("home")
     String getHome() {
        return home;
    }

    @JsonProperty("home")
     void setHome(String home) {
        this.home = home;
    }

    @JsonProperty("away")
     String getAway() {
        return away;
    }

    @JsonProperty("away")
     void setAway(String away) {
        this.away = away;
    }

    @JsonAnyGetter
     Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
     void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "lineup_player",
        "lineup_number",
        "lineup_position"
})
 class Substitute {

    @JsonProperty("lineup_player")
    private String lineupPlayer;
    @JsonProperty("lineup_number")
    private String lineupNumber;
    @JsonProperty("lineup_position")
    private String lineupPosition;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("lineup_player")
     String getLineupPlayer() {
        return lineupPlayer;
    }

    @JsonProperty("lineup_player")
     void setLineupPlayer(String lineupPlayer) {
        this.lineupPlayer = lineupPlayer;
    }

    @JsonProperty("lineup_number")
     String getLineupNumber() {
        return lineupNumber;
    }

    @JsonProperty("lineup_number")
     void setLineupNumber(String lineupNumber) {
        this.lineupNumber = lineupNumber;
    }

    @JsonProperty("lineup_position")
     String getLineupPosition() {
        return lineupPosition;
    }

    @JsonProperty("lineup_position")
     void setLineupPosition(String lineupPosition) {
        this.lineupPosition = lineupPosition;
    }

    @JsonAnyGetter
     Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
     void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "lineup_player",
        "lineup_number",
        "lineup_position"
})
 class Substitute_ {

    @JsonProperty("lineup_player")
    private String lineupPlayer;
    @JsonProperty("lineup_number")
    private String lineupNumber;
    @JsonProperty("lineup_position")
    private String lineupPosition;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("lineup_player")
     String getLineupPlayer() {
        return lineupPlayer;
    }

    @JsonProperty("lineup_player")
     void setLineupPlayer(String lineupPlayer) {
        this.lineupPlayer = lineupPlayer;
    }

    @JsonProperty("lineup_number")
     String getLineupNumber() {
        return lineupNumber;
    }

    @JsonProperty("lineup_number")
     void setLineupNumber(String lineupNumber) {
        this.lineupNumber = lineupNumber;
    }

    @JsonProperty("lineup_position")
     String getLineupPosition() {
        return lineupPosition;
    }

    @JsonProperty("lineup_position")
     void setLineupPosition(String lineupPosition) {
        this.lineupPosition = lineupPosition;
    }

    @JsonAnyGetter
     Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
     void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "home",
        "away"
})
class Substitutions {

    @JsonProperty("home")
    private List<Home> home = null;
    @JsonProperty("away")
    private List<Away> away = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("home")
     List<Home> getHome() {
        return home;
    }

    @JsonProperty("home")
     void setHome(List<Home> home) {
        this.home = home;
    }

    @JsonProperty("away")
     List<Away> getAway() {
        return away;
    }

    @JsonProperty("away")
     void setAway(List<Away> away) {
        this.away = away;
    }

    @JsonAnyGetter
     Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
     void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}