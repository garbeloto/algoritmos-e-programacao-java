package ExerciciosJava04;

import java.util.Scanner;

public class Ex01 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        int[] A = new int[5];
        int[] B = new int[5];

        B[0] = A[0]= 1;
        B[1] = A[1]= 2;
        B[2] = A[2]= 3;
        B[3] = A[3]= 4;
        B[4] = A[4]= 5;


        for (int i = 0; i <= A.length && i<=B.length; i++) {
            System.out.println("A["+ (i + 1) + "] = B[" + (i + 1) + "];" );
        }


    }
}
