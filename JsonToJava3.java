package jacson;

import java.io.IOException;
import java.net.URL;

import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonToJava3 {

	public static void main(String[] args) {

		ObjectMapper objectMapper = new ObjectMapper();

		try {
			Car car = objectMapper.readValue(new URL("file:src/test/resources/json_car.json"), Car.class);

			System.out.println("Deserialized Car object:");

			System.out.println("Color: " + car.getColor());
			System.out.println("Type: " + car.getType());

		} catch (IOException e) {
			System.out.println("Error occurred while deserializing JSON to Car object: " + e.getMessage());
		}
	}
}
