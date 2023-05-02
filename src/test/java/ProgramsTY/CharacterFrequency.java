package ProgramsTY;

public class CharacterFrequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Malyalam";
        str = str.toLowerCase(); // Convert string to lowercase

        // Create an integer array to store the frequency of each character
        int[] frequency = new int[26];

        // Iterate over each character in the string
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            // If the character is a lowercase letter, increment its frequency in the array
            if (c >= 'a' && c <= 'z') {
                frequency[c - 'a']++;
            }
        }

        // Create a StringBuilder to store the formatted output
        StringBuilder output = new StringBuilder();

        // Iterate over each character in the alphabet
        for (char c = 'a'; c <= 'z'; c++) {
            int count = frequency[c - 'a'];
            if (count > 0) {
                output.append(c);
                output.append(":");
                output.append(count);
                if (c != 'z') {
                    output.append(",");
                }
            }
        }

        System.out.println(output.toString());
	}

}
