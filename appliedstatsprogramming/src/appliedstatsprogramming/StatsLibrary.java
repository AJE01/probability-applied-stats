package appliedstatsprogramming;

/* Alvin Estevez Jr

 This program contains the parameters set to attain the mean, median, mode,
 and standard deviation*/
import java.util.*;
import java.math.*;
//https://www.simplilearn.com/tutorials/java-tutorial/set-in-java
//https://stackoverflow.com/questions/22949281/java-generalized-hypergeometric-function
//https://stackoverflow.com/questions/9832919/generate-poisson-arrival-in-java
//https://stackoverflow.com/questions/4253500/uniform-distribution-with-random

public class StatsLibrary {
	
	
	public static double findMean(ArrayList<Integer> inputNumbers) {
        double sum = 0;
        for (int singleElement : inputNumbers) {
            sum = sum + singleElement;
        }

        double result = sum / inputNumbers.size();
        return result;
    }

    public static double findMedian(ArrayList<Integer> someNumbers) {
        Collections.sort(someNumbers);
        int middleIndex = someNumbers.size() / 2;
        if (someNumbers.size() % 2 == 0) {
            return (someNumbers.get(middleIndex - 1) + someNumbers.get(middleIndex)) / 2.0;
        } else {
            return someNumbers.get(middleIndex);
        }
    }

    public static List<Double> findMode(ArrayList<Integer> someNumbers) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : someNumbers) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        List<Double> modes = new ArrayList<>();
        int maxFrequency = Collections.max(frequencyMap.values());
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() == maxFrequency) {
                modes.add((double) entry.getKey());
            }
        }
        return modes;
    }

    public static double findStandardDeviation(ArrayList<Integer> someNumbers) {
        double mean = findMean(someNumbers);
        double sumSquaredDiffs = 0.0;
        for (double num : someNumbers) {
            sumSquaredDiffs += Math.pow(num - mean, 2);
        }
        return Math.sqrt(sumSquaredDiffs / someNumbers.size());
    }

    public static void main1(String[] args) {
        ArrayList<Integer> someNumbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 5, 6, 6));
        System.out.println("Mean: " + findMean(someNumbers));
        System.out.println("Median: " + findMedian(someNumbers));
        System.out.println("Mode: " + findMode(someNumbers));
        System.out.println("Standard Deviation: " + findStandardDeviation(someNumbers));

        // Example usage
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3, 4));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(3, 4, 5, 6));

        // Set theory operations
        Set<Integer> unionSet = union(set1, set2);
        Set<Integer> intersectionSet = intersection(set1, set2);
        Set<Integer> complementSet = complement(set1, set2);

        System.out.println("Union: " + unionSet);
        System.out.println("Intersection: " + intersectionSet);
        System.out.println("Complement: " + complementSet);
    }


        private static Set<Integer> complement(Set<Integer> set1, Set<Integer> set2) {
		// TODO Auto-generated method stub
		return null;
	}

		private static Set<Integer> intersection(Set<Integer> set1, Set<Integer> set2) {
		// TODO Auto-generated method stub
		return null;
	}

		private static Set<Integer> union(Set<Integer> set1, Set<Integer> set2) {
		// TODO Auto-generated method stub
		return null;
	}

		public static void main(String[] args) {
    		
    		//coin flips used to demonstrate distribution and probability
           
    		// Hypergeometric distribution
            System.out.println("Hypergeometric distribution:");
            int C = 52; 
            int A = 4; 
            int CDrawn = 2;
            int AAces = 2; 
            double hypergeometricProb = hypergeometricProbability(C, A, CDrawn, AAces);
            System.out.println("Probability of drawing 2 aces from a deck of cards: " + hypergeometricProb);
            
            // Poisson probability
            System.out.println("\nPoisson probability:");
            double p = 0.5; 
            int n = 10; 
            int k = 8; 
            double poissonProb = poissonProbability(p, n, k);
            System.out.println("Probability of getting 8 heads in 10 coin flips: " + poissonProb);
            
           
        	// Uniform distribution
            System.out.println("\nUniform distribution:");
            Random rand = new Random();
            for (int i = 0; i < 5; i++) {
                System.out.println(rand.nextDouble());
            }
        }
        
        public static double poissonProbability(double p, int n, int k) {
            double lambda = p * n;
            double numerator = Math.pow(lambda, k) * Math.exp(-lambda);
            double denominator = factorial(k);
            return numerator / denominator;
        }
        
        public static double hypergeometricProbability(int C, int A, int CDrawn, int AAces) {
            double numerator = choose(A, AAces) * choose(C - A, CDrawn - AAces);
            double denominator = choose(C, CDrawn);
            return numerator / denominator;
        }
        private static int choose(int C, int AAces) {
    		return 0;
    	}
    	public static double factorial(int n) {
            double result = 1;
            for (int i = 2; i <= n; i++) {
                result *= i;
            }
            return result;
        }
    	
    	
        
}
