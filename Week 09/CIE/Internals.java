package CIE;
import java.util.Scanner;
public class Internals extends Student {
    Scanner s=new Scanner(System.in);
public int[] cie=new int[5];
         public void get()
          {
              for(int i=0;i<5;i++){
              System.out.println("ENTER THE CIE MARK IN SUBJECT(OUT OF 50)"+(i+1));
                cie[i]=s.nextInt();
          }
        }
}
