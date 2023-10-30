package appliedstatsprogramming;
import java.util.*;

public class birthday {
//https://www.geeksforgeeks.org/getting-random-elements-from-arraylist-in-java/
	public static void main(String[] args) {
		//User input
        Scanner scanner = new Scanner(System.in);

        System.out.print("Count how many people we are: ");
        int classSize = scanner.nextInt();
        System.out.print("Number of runs: ");
        int Runs = scanner.nextInt();

        scanner.close();

        double sharedBirthday = 0;
        //Loop to find shared birthdays
        for (int run = 0; run < Runs; run++) {
            if (hasSharedBirthday(classSize)) {
                sharedBirthday++;
            }
        }
        //Finding probability of shared birthday in class
        double probability = sharedBirthday / Runs;
        System.out.println("Probability of at least two people sharing a birthday: " + probability);
    }

    public static boolean hasSharedBirthday(int classSize) {
        List<Person> people = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < classSize; i++) {
            int randomBirthday = random.nextInt(365); // Randomized day 
            Person person = new Person(randomBirthday);
            if (people.contains(person)) {
                return true; // Shared birthday
            }
            people.add(person);
        }

        return false; // No shared birthday 
    }

}
