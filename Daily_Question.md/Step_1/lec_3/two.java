public class two {
    public static void main(String[] args) {
        int [] arr = { 1,2,3,2,1,2,2,3,4,4,5 };
        int [] countArr = new int[10]; 
        for(int i=0; i<arr.length; i++){
            countArr[arr[i]]++;
        }
        System.out.println("Element frequencies: ");
        for(int num : countArr){
            System.out.print(num + " ");
        }
    }
}
