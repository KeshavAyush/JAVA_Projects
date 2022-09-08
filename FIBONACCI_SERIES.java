//THE PROGRAM TAKE SERIES LENGTH AS INPUT FROM USER AND PRINT REQUIRED SERIES

import java.util.Scanner;

public class FIBONACCI_SERIES {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter Length of series  ");
        int len = sc.nextInt();
        System.out.println();
        int frst =0;
        int secnd =1;
        
        for (int i = 0; i <len; i++) {
            if (i==0) {
                System.out.print(frst+" ");
            } 
            else if (i==1){
                System.out.print(secnd+" ");                
            }else{
                int tmp = frst+secnd;
                System.out.print(tmp+" ");
                frst = secnd;
                secnd = tmp;
            }

            
        }
    }
    
}
