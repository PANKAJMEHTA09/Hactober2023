import java.util.*;

public class sumofnumber{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(Sum_Of_Number(n));
    }

    public static int Sum_Of_Number(int n) {
        if (n == 1) {
            return 1;
        }

        int temp = Sum_Of_Number(n-1);
        return temp + n;

    }

}