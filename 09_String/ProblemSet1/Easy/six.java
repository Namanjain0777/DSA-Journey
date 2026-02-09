public class six {
    public static void main(String[] args) {
        String str = "Hello I am doing java in dsa +  Web Dev";
        int countVowel = 0;
        int countConsonant = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'||
                ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
                countVowel++;
            }
            else if (Character.isLetter(ch)) {
                countConsonant++;
            }
        }

        System.out.println("Vowels: " + countVowel);
        System.out.println("Consonants: " + countConsonant);
    }
}
