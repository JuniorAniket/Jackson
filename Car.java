package jacson;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;


public class Car {

	private String color;
	private String type;

	public Car(){
		
	}
	public Car(String color, String type) {
		this.color = color;
		this.type = type;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public static void main(String[] args) {
		Car car = new Car("yellow", "renault");

		ObjectMapper objectMapper = new ObjectMapper();

		try {
			String carAsString = objectMapper.writeValueAsString(car);
			System.out.println("Car object serialized to JSON: " + carAsString);
			objectMapper.writeValue(new File("target/car.json"), car);
			System.out.println("Car object serialized to JSON and written to file successfully.");
		} catch (IOException e) {
			System.out.println("Error occurred while serializing Car object to JSON: " + e.getMessage());
		}
	}
}
