
import java.util.*;
 public class Q23 {
   
        public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
          int n = in.nextInt();
          int pro =1;
          int sum = 0;
          int diff;
          while(n>0){
            int rem = n%10;
            pro = pro* rem;
            sum = sum + rem;
            n = n/10;
          } 
          diff = pro - sum;
          System.out.print(diff);
        }
    }
    
