package appliedstatsprogramming;
import java.util.*;
import java.io.*;
public class Car {
	
	//Declaring global variables
	private String carType;		//e.g. Sedan, SUV, Minivan
	private int Year;			//e.g. 2002
	private String Color;		//e.g. black, gray, red
	private int Miles;			//e.g. 121,000 
	
	//Constructors
	public Car(String carType, int Year, String Color, int Miles) {
		this.carType = carType;
		this.Year = Year;
		this.Color = Color;
		this.Miles = Miles;
	}

	public String getCartype() {
		return carType;
	}

	public void setCartype(String cartype) {
		carType = cartype;
	}

	public int getYear() {
		return Year;
	}

	public void setYear(int year) {
		Year = year;
	}

	public String getColor() {
		return Color;
	}

	public void setColor(String color) {
		Color = color;
	}

	public int getMiles() {
		return Miles;
	}
	
	public void setMiles(int miles) {
		Miles = miles;
	}
	class CarFactory {

		 private static final String[] CAR_TYPES = {"Sedan", "SUV", "Truck", "Sports Car"};
		    private static final int CURRENT_YEAR = 2023;

		    public static Car createRandomCar() {
		        Random random = new Random();
		        String carType = CAR_TYPES[random.nextInt(CAR_TYPES.length)];
		        int year = CURRENT_YEAR - random.nextInt(50);
		        String color = random.nextBoolean() ? "Red" : "Other";
		        int miles = random.nextInt(250001);

		        return new Car(carType, year, color, miles);
		    }
		}
}
