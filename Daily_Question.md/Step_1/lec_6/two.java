public class two {
    public static void main(String[] args) {
        int [] a = {1,2,2,3,4,4,5,1,6,8,8,9,9,9};
        int [] freq = new int[a.length];
        for(int i = 0; i < a.length; i++){
            freq[i] = -1;
        }
        for(int i = 0 ; i<a.length; i++){
            int count = 1;
            for(int j = i+1; j<a.length; j++){
                if(a[i] == a[j]){
                    count++;
                    freq[j] = 0;
                }
            }
            if(freq[i] != 0){
                freq[i] = count;
            }
        }
        int maxFreq = 0, index = -1;
        for (int i = 0; i < a.length; i++) {
            if (freq[i] > maxFreq) {
                maxFreq = freq[i];
                index = i;
            }
        }
        System.out.println("Element with max frequency: " + a[index] + " (freq = " + maxFreq + ")");
    
    }
}
