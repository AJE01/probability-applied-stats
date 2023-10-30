package appliedstatsprogramming;


import java.util.ArrayList;
import java.util.List;

public class TestStatsLibrary {

	public static void main(String[] args) {
		StatsLibrary test = new StatsLibrary();
		ArrayList<Integer> someNumbers = new ArrayList<>();
		someNumbers.add(1);
		someNumbers.add(2);
		someNumbers.add(3);
		someNumbers.add(4);
		someNumbers.add(5);
		double result = test.findMean(someNumbers);
		double result1 = test.findMedian(someNumbers);
		List<Double> result2 = test.findMode(someNumbers);
		double result3 = test.findStandardDeviation(someNumbers);
		
		System.out.println("Average of input: " +result);
		System.out.println("Median of input: " +result1);
		System.out.println("Mode of input: " +result2);
		System.out.println("Standard Deviation of input: " +result3);
		
		
	}
	

}
