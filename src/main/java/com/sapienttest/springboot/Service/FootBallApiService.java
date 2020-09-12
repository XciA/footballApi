package com.sapienttest.springboot.Service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.sapienttest.springboot.Model.Events;
import com.sapienttest.springboot.Model.LeagueStandingItem;
import com.sapienttest.springboot.utils.HttpUtil;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.text.MessageFormat;
import java.util.List;
import java.util.Objects;

@Component
public class FootBallApiService {
    @Autowired
    Environment environment;

    @Autowired
    private HttpUtil httpUtil;

    private  static ObjectMapper objectMapper = new ObjectMapper();
    private static CloseableHttpClient client = HttpClients.createDefault();
    CloseableHttpResponse responseEvents = null;


    public List<Events> fetchEvents(String countryId, String leagueId, String teamId){
        String apiKey = environment.getProperty("apiKey");
        String fetchEventsUrl = MessageFormat.format(Objects.requireNonNull(environment.getProperty("apiGetEvents")), leagueId, teamId, countryId, apiKey);
        List<Events> eventsResult = null;
        try {
            responseEvents = httpUtil.get(client, fetchEventsUrl);
            if(responseEvents.getStatusLine().getStatusCode() == 200){
                String responseEventsJson = EntityUtils.toString(responseEvents.getEntity(), "UTF-8");
                eventsResult = objectMapper.readValue(responseEventsJson, objectMapper
                        .getTypeFactory().constructCollectionType(List.class, Events.class));
            }
        }catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                responseEvents.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return eventsResult;
    }

    public List<LeagueStandingItem> fetchStandings(String leagueId){
        String apiKey = environment.getProperty("apiKey");
        String fetchStandingUrl = MessageFormat.format(Objects.requireNonNull(environment.getProperty("apiGetStandings")), leagueId, apiKey);
        List<LeagueStandingItem> result = null;
        try {
            responseEvents = httpUtil.get(client, fetchStandingUrl);
            if(responseEvents.getStatusLine().getStatusCode() == 200){
                String responseJson = EntityUtils.toString(responseEvents.getEntity(), "UTF-8");
                result = objectMapper.readValue(responseJson, objectMapper
                        .getTypeFactory().constructCollectionType(List.class, LeagueStandingItem.class));
            }
        }catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                responseEvents.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return result;
    }
}
