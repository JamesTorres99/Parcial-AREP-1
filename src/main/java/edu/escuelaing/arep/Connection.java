package edu.escuelaing.arep;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class Connection implements HttpConnection {

	private String url, key;

	public Connection() {
		url = "http://api.openweathermap.org/data/2.5";
		key = "cacc365971fdc4c009bca29a9d6850cb";

	}

	public String getWeather(String ciudad) throws Exception {

		try {
			System.out.println("Hola");
			URL obj = new URL(url + "/weather?q=" + ciudad + "&appid=" + key);
			HttpURLConnection con = (HttpURLConnection) obj.openConnection();
			con.setRequestMethod("GET");
			System.out.println("Holi");
			System.out.println(con.getResponseCode());
			StringBuffer response = null;
			int responseCode = con.getResponseCode();

			if (responseCode == HttpURLConnection.HTTP_OK) {
				System.out.println("Holiii");
				BufferedReader in = new BufferedReader(new InputStreamReader(
						con.getInputStream()));
				String inputLine;
				response = new StringBuffer();
				while ((inputLine = in.readLine()) != null) {
					response.append(inputLine);
				}
				in.close();
			} else {
				System.out.println("holaa");
			}
			return String.valueOf(response);
		} catch (MalformedURLException ex) {
			throw new Exception(ex.getMessage());
		} catch (IOException ex) {
			throw new Exception(ex.getMessage());
		}
	}
}


