public class three {
    public static void main(String[] args) {
        String str = "A man who once love a girl and rejected is the reason to go to war";
        int vowelCount = 0;
        int consonantCount = 0;
        
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            ch = Character.toLowerCase(ch);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowelCount++;
            } else if (ch >= 'a' && ch <= 'z') {
                consonantCount++;
            }
        }
        
        System.out.println("Vowels: " + vowelCount);
        System.out.println("Consonants: " + consonantCount);
    }
}