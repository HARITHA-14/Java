public class NextAlphabetSwapPalindrome {
    public static void main(String[] args) {
        String input = "india";
        
        // Get the next alphabet
        String nextAlphabet = getNextAlphabet(input);
        System.out.println("Next alphabet: " + nextAlphabet);
        
        // Swap adjacent alphabets
        String swappedString = swapAdjacentAlphabets(nextAlphabet);
        System.out.println("Swapped string: " + swappedString);
        
        // Get the next alphabet of the swapped string
        String nextAlphabetOfSwappedString = getNextAlphabet(swappedString);
        System.out.println("Next alphabet of the swapped string: " + nextAlphabetOfSwappedString);
        
        // Convert the next alphabet of the swapped string to palindrome
        String palindrome = makePalindrome(nextAlphabetOfSwappedString);
        System.out.println("Palindrome: " + palindrome);
        
        // Convert the first and last letter to uppercase
        String modifiedPalindrome = convertFirstAndLastToUppercase(palindrome);
        System.out.println("Modified Palindrome: " + modifiedPalindrome);
    }

    public static String getNextAlphabet(String input) {
        char[] charArray = input.toCharArray();
        StringBuilder sb = new StringBuilder();

        for (char c : charArray) {
            if (Character.isLetter(c)) {
                c++;
            }
            sb.append(Character.toString(c));
        }

        return sb.toString();
    }
    
    public static String swapAdjacentAlphabets(String input) {
        char[] charArray = input.toCharArray();

        for (int i = 0; i < charArray.length - 1; i += 2) {
            char temp = charArray[i];
            charArray[i] = charArray[i + 1];
            charArray[i + 1] = temp;
        }

        return String.valueOf(charArray);
    }
    
    public static String makePalindrome(String input) {
        StringBuilder sb = new StringBuilder(input);
        return input + sb.reverse().toString();
    }
    
    public static String convertFirstAndLastToUppercase(String input) {
        char[] charArray = input.toCharArray();
        
        if (charArray.length >= 1) {
            charArray[0] = Character.toUpperCase(charArray[0]);
        }
        
        if (charArray.length >= 2) {
            charArray[charArray.length - 1] = Character.toUpperCase(charArray[charArray.length - 1]);
        }
        
        return String.valueOf(charArray);
    }
}
