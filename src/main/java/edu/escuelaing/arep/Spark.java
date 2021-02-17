package edu.escuelaing.arep;

import com.google.gson.Gson;

import static spark.Spark.*;

public class Spark {

	private  static  Connection connection;

	public static void main(String[] args) {
		Gson gson = new Gson();
		port(getPort());
		System.out.println(getPort());
		connection = new Connection();

		get("/clima", (req, res) -> {
			String ciudad = req.queryParams("ciudad");
			String rta = "";
			System.out.println(ciudad);

			rta = getClima(ciudad);
			System.out.println(rta);
			return rta;
		});
	}

	private static String getClima(String city) throws Exception {
		String rta = "";
		rta = connection.getWeather(city);

		return rta;
	}
	

	
	/**
	 * retorna el puerto
	 * @return retorna el puerto
	 */
	static int getPort() {
		if (System.getenv("PORT") != null) {
		return Integer.parseInt(System.getenv("PORT"));
		}
		return 4567; //returns default port if heroku-port isn't set (i.e. on localhost)
		}
}
