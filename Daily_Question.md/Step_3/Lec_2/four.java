public class four {
    public static void main(String[] args) {
        int [] arr = {2,5,1,5,3,6,2,4,7,9,8,0};
        int freq [] = new int[10]; // Assuming elements are in the range 0-9
        for(int i = 0 ; i< arr.length ; i++){
            freq[arr[i]]++;
        }
        for(int i = 0 ; i< freq.length ; i++){
            if(freq[i]>0){
                System.out.println("Element " + i + " occurs " + freq[i] + " times");
            }
        }
    }
}
