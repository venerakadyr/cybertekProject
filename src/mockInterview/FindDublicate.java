package mockInterview;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.jar.JarOutputStream;

public class FindDublicate {
    //    getDup accepts an array and returns an int.
//
//If there is any element is duplicated, method counts how many of those present in the array.
//For example
//getDup(["1","2","aa"',"1"])
//returns:2 ("1" is duplicated and there are two "1"s so return is 2
//getDup(["1","g","aabb',"7","7","2","aa"',"7"])
//returns:3
    public static int getDup(String[] array) {
        String helper = " ";
        int total = 0;
        for (int i = 0; i < array.length; i++) {
            int count = 0;
            if (!helper.contains(array[i])) {
                for (int j = 0; j < array.length; j++) {
                    if (array[i].equals(array[j])) {
                        count++;
                    }
                    helper += array[i];
                }
                if (count > 1) {
                    total += count;
                }
            }

        }
        return total;
    }
    public static void main(String[] args) {



//        System.out.println(Arrays.toString(number));

//       String numb= new Integer(number).toString();
//        System.out.println(numb);


//Dublicate only

//        int[] arr={1,2,3,4,1,3,4,5,6,7};
//        String nonDup="";
//        String dup="";
//         for( int i=0; i<arr.length;i++){
//             if(!nonDup.contains(arr[i]+"")){
//                 nonDup+=arr[i]+" ";
//
//             }else{
//                 dup+=arr[i]+" ";
//             }
//         }
//        System.out.println(dup);
//        System.out.println(nonDup);


// DublicATE    with sort
//        int[] num = {3, 1, 2, 5, 6, 7, 7, 8, 9, 10, 3, 3};
//        Arrays.sort(num);
//        System.out.println(Arrays.toString(num));
//        for (int i = 0; i < num.length - 1; i++) {
//            if (num[i] == num[i + 1]) {
//
//                System.out.println(num[i]);
//
//            }
//        }
//=====================================================================================================
//        int[] num = {3, 1, 2, 5, 6, 7, 7, 8, 9, 10, 3, 3};
//        Arrays.sort(num);
//       String helper="";
//        for (int i = 0; i < num.length - 1; i++) {
//            if (num[i] == num[i + 1]) {
//                if (helper.contains(num[i] + "")){
//
//                }
//                  else {
//                    helper += num[i] + "";
//                }
//
//            }
//
//        }
//        System.out.println(helper);




////Count how many of the is dublicates
        String[] str = {"1", "1","g", "aabb", "aa","aa", "7", "3", "7","7"};

        int count=0;
        String dup="";
        String non="";

        for(int i=0;i<str.length;i++){ // looping through str array

            for(int j=0; j<str.length;j++){

                if(i!=j&&str[i]==str[j]){
                    count++;
                    dup+=str[j]+", ";
                    break;
                }



                }


            }



        System.out.println(count+"\n"+dup+"\n"+non);











//        int count=0;
//        for (int i = 0; i<str.length;i++){
//            for(int j=0; j<str.length;j++){
//                if(str[i]==str[j]&&i!=j){
//
//                    count++;
//                    break;
//                }
//            }
//        }
//        System.out.println(count);

//      STRING ARRAY FIND  THE DUBLICATES

//        String[] str = {"1", "1","g", "aabb", "aa","aa", "2", "3", "2","7"};
//          String count="";
//        for (int i = 0; i<str.length;i++) {
//            for (int j = 0; j < str.length; j++) {
//                if (str[i]==str[j] && i != j) {
//                    if (!count.contains(str[i])) {
//                        count += str[j]+" ";
//                        break;
//                    }
//                }
//            }
//        }
//        System.out.println(count);
//
//
//
//  INT ARRAY FIND DUBLICATE
//        int[] num = {3, 1, 2, 5, 6, 7, 7, 8, 9, 10, 3, 3};
//        Arrays.sort(num);
//        for (int i = 0; i < num.length - 1; i++) {
//            if (num[i] != num[i + 1]) {
//            } else
//                System.out.println(num[i]);
//        }
//	}
//    }


    }
}