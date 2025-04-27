package Week4;

public class CodingProject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ages = {3,9,23,64,2,8,28,93};
		
		int differnce = ages[ages.length - 1] - ages[0];
		System.out.println("Difference between the last and first element of ages: " + difference);
		
		int[] ages2 = new int[9];
		ages2[0] = 10; 
		ages2[1] = 20;
		ages2[2] = 30;
		ages2[3] = 40;
		ages2[4] = 50;
		ages2[5] = 60;
		ages2[6] = 70;
		ages2[7] = 80;
		ages2[8] = 90;
		
		int difference2 = ages2[ages2.length - 1] - ages2[0];
		System.out.println("Difference between the last and first element of ages2: " + difference2);
		
		int sumAges = 0;
		for(int age : ages ) {
			sumAges += age;
		}
		
		double averageAge = (double) sumAges / ages.length;
		System.out.println("Average age: " + averageAge);
		
		String[] names = {"Sam", "Tommy", "Tim", "sally", "Buck", "Bob"};
		
		int totalLetters = 0;
		for (String name : names) {
			totalLetters += name.length();
		}
		
		double averageLetters = (double) totalLetters / names.length;
		System.out.println("Average number of letters per name: " + averageLetters);
		
		String allNames = "";
		for (int i = 0; i < names.length; i++) {
            allNames += names[i];
            if (i < names.length - 1) {
                allNames += " ";
	}

}
        System.out.println("All names concatenated: " + allNames);

        System.out.println("\n3. To access the last element of any array, use the array's length property minus one as the index (arrayName[arrayName.length - 1]).");

        System.out.println("4. To access the first element of any array, use the index 0 (arrayName[0]).");

        int[] nameLengths = new int[names.length];
        for (int i = 0; i < names.length; i++) {
            nameLengths[i] = names[i].length();

        	
}
        System.out.println("\nLengths of names array: " + java.util.Arrays.toString(nameLengths));
        
        int sumOfLengths = 0;
        for (int length : nameLengths) {
            sumOfLengths += length;

        }
        System.out.println("Sum of the lengths of the names: " + sumOfLengths);
        System.out.println("\n7. Concatenating 'Hello' 3 times: " + concatenateWord("Hello", 3));
        System.out.println("8. Full name: " + getFullName("John", "Doe"));

        int[] testArray1 = {20, 30, 60};
        int[] testArray2 = {50, 60, 10};
        System.out.println("9. Sum of testArray1 greater than 100? " + isSumGreaterThan100(testArray1));
        System.out.println("   Sum of testArray2 greater than 100? " + isSumGreaterThan100(testArray2));
        
        double[] doubleArray1 = {1.5, 2.5, 3.5};
        double[] doubleArray2 = {10.0, 20.0};
        System.out.println("10. Average of doubleArray1: " + calculateAverage(doubleArray1));
        System.out.println("    Average of doubleArray2: " + calculateAverage(doubleArray2));
        System.out.println("11. Average of doubleArray1 > average of doubleArray2? " + isAverageGreater(doubleArray1, doubleArray2));
        System.out.println("    Average of doubleArray2 > average of doubleArray1? " + isAverageGreater(doubleArray2, doubleArray1));
        System.out.println("12. Will buy drink (hot=true, money=12.0)? " + willBuyDrink(true, 12.0));
        System.out.println("    Will buy drink (hot=false, money=15.0)? " + willBuyDrink(false, 15.0));
        System.out.println("    Will buy drink (hot=true, money=9.0)? " + willBuyDrink(true, 9.0));
        System.out.println("\n13. Is 'racecar' a palindrome? " + isPalindrome("racecar"));
        System.out.println("    Is 'hello' a palindrome? " + isPalindrome("hello"));
	}

        public static String concatenateWord(String word, int n) {
            String result = "";
            for (int i = 0; i < n; i++) {
                result += word;

            }
            return result;


}
        public static String getFullName(String firstName, String lastName) {
            return firstName + " " + lastName;

        }
        
        public static boolean isSumGreaterThan100(int[] numbers) {
            int sum = 0;
            for (int number : numbers) {
                sum += number;

            }
            return sum > 100;

        }
        public static double calculateAverage(double[] numbers) {
        	if (numbers.length == 0) {
        		return 0; 
        	}
        	double sum / numbers.length;
        	
        }
        
        public static boolean isAverageGreater(double[] arr1, double[] arr2) {        
            double avg1 = calculateAverage(arr1);
            double avg2 = calculateAverage(arr2);
            return avg1 > avg2;

        }
        public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
            return isHotOutside && moneyInPocket > 10.50;

        }
        public static boolean isPalindrome(String text) {
            String cleanedText = text.replaceAll("\\s+", "").toLowerCase();
            int left = 0;
            int right = cleanedText.length() - 1;
            while (left < right) {
                if (cleanedText.charAt(left) != cleanedText.charAt(right)) {
                    return false;

                }
                left++;
                right--;

            }
            return true;

        }
}