package com.spring.temp.app.services;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

import javax.annotation.PostConstruct;
import javax.net.ssl.HttpsURLConnection;

import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.spring.temp.app.model.Root;
@Service
public class Temp_Service {
@PostConstruct
public Root getDelhiData() throws Exception {
	String apiURL="http://api.openweathermap.org/data/2.5/weather?q=delhi&appid=0e580936ec4fc58acd491149507ccf1d";
	
		URL url=new URL(apiURL);
		
		HttpURLConnection con = (HttpURLConnection) url.openConnection();
		con.setRequestMethod("GET");
		con.connect();
		//Object c = con.getContent();
		String json="";
		Scanner s=new Scanner(url.openStream());
		while(s.hasNext()) {
			json=json+s.nextLine();
		}
		s.close();
		ObjectMapper mapper=new ObjectMapper();
		Root root = mapper.readValue(json, Root.class);
		//System.out.println(root);
		//System.out.println(json);
		return root;
	
}
public Root getSearchData(String City) throws Exception {
		String apiURL="http://api.openweathermap.org/data/2.5/weather?q="+City+"&appid=0e580936ec4fc58acd491149507ccf1d";
		URL url=new URL(apiURL);
		HttpURLConnection con = (HttpURLConnection) url.openConnection();
		con.setRequestMethod("GET");
		con.connect();
		int responseCode=con.getResponseCode();
		if(responseCode!=200) {
			return null;
		}
		
		String json="";
		Scanner s=new Scanner(url.openStream());
		while(s.hasNext()) {
			json=json+s.nextLine();
		}
		s.close();
		ObjectMapper mapper=new ObjectMapper();
		Root root = mapper.readValue(json, Root.class);
		
		return root;
}
}
