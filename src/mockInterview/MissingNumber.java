package mockInterview;

import java.util.Arrays;

public class MissingNumber {
//     public   int missingNumber(int [] arr){
////         int[] number={1,2,3,4,5,6,7,9,10,14};

    public static void main(String[] args) {

    int [] arr={1,2,3,4,9};
        Arrays.sort(arr);
         for( int i=0; i<arr.length-1;i++){
              if(arr[i+1]-arr[i]!=1){
//                  arr[i+1]===2 -arr[i]===1 so difference between them is 1
                  for (int j=arr[i]+1;j<arr[i+1];j++){
//                      arr[i]+1==5
//
                      System.out.println(j);
                  }
              }
         }





     }
}
