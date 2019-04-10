/**
 *  * This Prints a pattern showing where the prime and twin prime numbers are
 * a "_" character is printed for non prime numbers and a "-" printed for primes
 * [_] printed for twin primes
 * @author Enrique Vargas
 *
 */
public class TwinPrimes {
	public static void main(String[] args) {
		int newLine = 50;  //add a new line every 50 characters
		int maxLines = 30; //how many rows to print
		int lastPrime = 2;  //2 is the first prime
		int numbersToScan = maxLines * newLine;
		char[] output = new char[numbersToScan];
		for (int i = 1; i < numbersToScan; i++) {
			// This loop will go through every positive integer
			int testFactor = 2;
			while ( (i % testFactor != 0) && (testFactor <= i) ) {
				// This loop tests if testFactor is a factor of i 
				testFactor++;
			}
			if ( (testFactor < i) || (i == 1)) {
				// print something when i is not prime (has a factor > 1 and <i)
				output[i-1] = '_';  //array first index is 0 for integer number 1
			} 
			else {
				// print something else to flag a prime
				output[i-1] = '-';  //Standard prime 
				if (i - lastPrime == 2) {
					output[i-1] = ']';
					output[i-3] = '[';
				}
				lastPrime = i;  
			} 
		}			
		// Print characters, every newLine skip a line
		for (int i=0; i <= numbersToScan-1; i++) {
			if ( (i >= 1) && (i % newLine == 0) ) {
				System.out.print(" " + i + "\n");
			}
			System.out.print(output[i]);
		}
	}
}
