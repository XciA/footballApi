package com.sapienttest.springboot.utils;

import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class HttpUtil {

    public CloseableHttpResponse get(CloseableHttpClient client, String url) throws IOException {
        String getUrl =  url;
        HttpGet request = new HttpGet(getUrl);
        CloseableHttpResponse response = client.execute(request);
        return response;
    }
}
