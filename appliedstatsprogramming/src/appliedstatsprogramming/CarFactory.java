package appliedstatsprogramming;
import java.util.*;
import java.io.*;
import java.util.Random;
//https://stackoverflow.com/questions/40007735/java-eclipse-output-to-csv-file
//https://www.youtube.com/watch?v=1sCgEKAp-lU

//Alvin Estevez Jr

	public class CarFactory {
	    public static void main(String[] args) {
	        // Generate 1000 random cars
	        List<Car> cars = new ArrayList<>();
	        for (int i = 0; i < 1000; i++) {
	            Car car = CarFactory.createRandomCar();
	            cars.add(car);
	        }

	        // Export car data to CSV
	        exportToCSV(cars, "car.csv");

	        // Load car data from CSV
	        List<Car> loadedCars = loadFromCSV("car.csv");
	        for (Car car : loadedCars) {
	            System.out.println(car);
	        }
	    }

	    private static Car createRandomCar() {
			// TODO Auto-generated method stub
			return null;
		}

		public static void exportToCSV(List<Car> cars, String fileName) {
	        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
	            for (Car car : cars) {
	                writer.write(car.toString());
	                writer.newLine();
	            }
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }

	    public static List<Car> loadFromCSV(String fileName) {
	        List<Car> loadedCars = new ArrayList<>();
	        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
	            String line;
	            while ((line = reader.readLine()) != null) {
	                String[] carData = line.split(",");
	                if (carData.length == 4) {
	                    String carType = carData[0];
	                    int year = Integer.parseInt(carData[1]);
	                    String color = carData[2];
	                    int miles = Integer.parseInt(carData[3]);
	                    loadedCars.add(new Car(carType, year, color, miles));
	                }
	            }
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	        return loadedCars;
	    }

}
