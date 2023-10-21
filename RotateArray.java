import java.util.*;
public class RotateArray {
public static void ReverseArray(int num[] , int n1,int n2){
    int start =n1;
    int end  = n2;
    while(start<end){
        int temp = num[start];
        num[start] = num[end];
        num[end] = temp;
        start++;
        end--;
    }



}


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int array[] =new int[n];
        for(int i =0;i<n;i++){
            array[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        k = k%n;
ReverseArray(array,0,n-1);
ReverseArray(array,0,k-1);
ReverseArray(array, k,n-1);
for(int i =0 ; i<n;i++){
    System.out.print (array[i] + " ");
}





    }
}
