package oops;

public class oop {
    public static void main(String[] args){
         int[] arr={1,2,3,4,5};
        System.out.println(sumOfArray(arr));
    }
    public static int sumOfArray(int[] arr){
         int sum=0;
          for(int e:arr){
              sum+=e;
          }
           return sum;
    }
};
