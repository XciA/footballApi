package com.sapienttest.springboot.Controller;

import com.sapienttest.springboot.Model.*;


import com.sapienttest.springboot.Service.FootBallApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.text.MessageFormat;
import java.util.*;
import java.util.stream.Collectors;

@RestController
@RequestMapping(value = "/api/v1")
public class FootballApiServiceController {
    @Autowired
    Environment environment;
    @Autowired
    private FootBallApiService footBallApiService;
    @Autowired
    private final RestTemplate restTemplate;

    public FootballApiServiceController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @RequestMapping(value = "/country", method = RequestMethod.GET)
    public List<CountryResponseItem> getCountry() throws InterruptedException {
        String apiKey = environment.getProperty("apiKey");
        Map<String, Object> response = new HashMap<>();
        String fetchCountryUrl = MessageFormat.format(Objects.requireNonNull(environment.getProperty("apiGetCountries")), apiKey);
        CountryResponseItem[] countryResponseItems = restTemplate.getForObject(fetchCountryUrl, CountryResponseItem[].class);
        return Arrays.asList(countryResponseItems);
    }

    @RequestMapping(value = "/leagues", method = RequestMethod.GET,
            params = {"country_id"}
    )
    public List<LeagueResponseItem> getLeagues(
            @RequestParam(value = "country_id") String countryId
    ) throws InterruptedException {
        String apiKey = environment.getProperty("apiKey");
        String url = MessageFormat.format(Objects.requireNonNull(environment.getProperty("apiGetLeagues")), countryId, apiKey);
        return Arrays.asList(restTemplate.getForObject(url, LeagueResponseItem[].class));
    }

    @RequestMapping(
                value = "/teams",
                method = RequestMethod.GET,
                params = {"league_id"}
            )
    public List<TeamResponseItem> getTeams(
            @RequestParam(value = "league_id") String leagueId
            ) throws InterruptedException {
        String apiKey = environment.getProperty("apiKey");
        String url = MessageFormat.format(Objects.requireNonNull(environment.getProperty("apiGetTeams")), leagueId, apiKey);
        return Arrays.asList(restTemplate.getForObject(url, TeamResponseItem[].class));
    }
    @RequestMapping(value = "/standing", method = RequestMethod.GET,
            params = {"country_id", "league_id", "team_id"}
    )
    public Map<String, String> getStanding(
            @RequestParam(value = "country_id") String countryId,
            @RequestParam(value = "league_id") String leagueId,
            @RequestParam(value = "team_id") String teamId
    ) throws InterruptedException {

        Map<String, String> response = new HashMap<>();
//        List<Events> eventsList = footBallApiService.fetchEvents(countryId, leagueId, teamId);
        List<LeagueStandingItem> standingItems =  footBallApiService.fetchStandings( leagueId);
        if(standingItems != null && standingItems.isEmpty() == false){
            standingItems = standingItems.stream().filter(item->item.getTeamId().equals(teamId)).collect(Collectors.toList());
            if(standingItems.isEmpty() == false && standingItems.size() > 0){
                response.put(countryId, standingItems.get(0).getCountryName());
                response.put(standingItems.get(0).getLeagueId(), standingItems.get(0).getLeagueName());
                response.put(standingItems.get(0).getTeamId(), standingItems.get(0).getTeamName());
                response.put("Overall League Position", standingItems.get(0).getOverallLeaguePosition());
            }
        }
        return response;
    }
}
