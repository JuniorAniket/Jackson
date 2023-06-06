package jacson;

import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonToJava {
	
	public static void main(String[] args) {
		
		ObjectMapper objectMapper = new ObjectMapper();

		try {
			String json = "{ \"color\" : \"Black\", \"type\" : \"BMW\" }";
			Car car = objectMapper.readValue(json, Car.class);
			
			System.out.println("Deserialized Car object:");
			System.out.println("Color: " + car.getColor());
			System.out.println("Type: " + car.getType());
		} catch (IOException e) {
			System.out.println("Error occurred while deserializing JSON to Car object: " + e.getMessage());
		}
	}
}
