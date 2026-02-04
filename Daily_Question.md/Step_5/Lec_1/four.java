public class four {
    public static void main(String[] args) {
        String str = "A man who once love a girl and rejected is the reason to go to war";
        int[] freq = new int[26];
        for(int i = 0 ; i< str.length() ; i++){
            char ch = str.charAt(i);
            if(ch >= 'a' && ch <= 'z'){
                freq[ch - 'a']++;
            } else if(ch >= 'A' && ch <= 'Z'){
                freq[ch - 'A']++;
            }
        }
        for(int i = 0 ; i< 26 ; i++){
            if(freq[i]>0){
                System.out.println((char)(i + 'a') + ": " + freq[i]);
            }
        }
    }
}
