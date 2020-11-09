import java.util.Scanner;
class stud{
    Scanner s=new Scanner(System.in);
    int usn;
    String name;
    int sem;
    void get(){
        System.out.println("ENTER THE USN");
        usn=s.nextInt();
        System.out.println("ENTER THE NAME");
        name=s.next();
        System.out.println("ENTER THE SEM");
        sem=s.nextInt();
    }
    void print()
    {
        System.out.println("THE USN OF STUDENT IS="+usn);
        System.out.println("THE NAME OF STUDENT IS "+name);
    }
}
class test extends stud{
    Scanner s=new Scanner(System.in);
    int[] cie=new int[4];
    int[] credit=new int[4];
    void get()
    {
        super.get();
        for(int i =0;i<4;i++)
       {
        System.out.println("ENTER THE CREDIT OF  SUBJECT"+(i+1));
           credit[i]=s.nextInt();
       }  
       for(int i =0;i<4;i++)
       {
        System.out.println("ENTER THE CIE MARKS OF  SUBJECT"+(i+1));
           cie[i]=s.nextInt();
       }  
    }
    void print(){
        super.print();
        for(int i =0;i<4;i++)
        {
         System.out.println(" THE CIE MARK OF  SUBJECT"+(i+1)+"="+cie[i]);
        }
        for(int i =0;i<4;i++)
        {
         System.out.println(" THE CREDITS OF  SUBJECT"+(i+1)+"="+credit[i]);     
        }           
    }
}

class exam extends test{
    Scanner s=new Scanner(System.in);
    int[] see=new int[4];
    void get()
    {
        super.get();
        for(int i =0;i<4;i++)
       {
        System.out.println("ENTER THE SEE MARKS OF  SUBJECT"+(i+1));
           see[i]=s.nextInt();
       }  
}
void print(){
    super.print();
    for(int i =0;i<4;i++)
       {
        System.out.println(" THE SEE MARK OF  SUBJECT"+(i+1)+"="+see[i]);
       }
}
}

class result extends exam{
    double sgpa;
    int[] total=new int[4];
    double tc=0.0;
    double t=0.0;
    int[] marks=new int[4];
    void get(){
        super.get();
    }
    double calculate()
    {      
        for(int i=0;i<4;i++)
        {
            marks[i]=cie[i]+see[i];
        }
        for(int i=0;i<4;i++)
        {
            if(marks[i]>=85 && marks[i]<=100)
               total[i]=credit[i]*10;
               else if(marks[i]>=70 && marks[i]<85)
               total[i]=credit[i]*9;
               else if(marks[i]>=60 && marks[i]<70)
               total[i]=credit[i]*8;
               else if(marks[i]>=50 && marks[i]<60)
               total[i]=credit[i]*7;
               else
                total[i] =credit[i]*6;
        }
        for(int i=0;i<4;i++)
        {
            tc=tc+credit[i];
        }
        for(int i=0;i<4;i++)
        {
            t=t+total[i];
        }
        sgpa=(t/(tc+0.0));
       return sgpa;
    }
    void print(){
       super.print();
      System.out.println("THE SGPA OF STUDENT IS="+sgpa);
    }
}
 class studmain{
     public static void main(String args[]){
        Scanner ss=new Scanner(System.in);
        System.out.println("ENTER THE NUMBER OF STUDENTS");
        int n=ss.nextInt();
        result r[]=new result[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("ENTER THE DETAILS OF STUDENT"+(i+1));
            r[i]=new result();
            r[i].get();
        }
        for(int i=0;i<n;i++)
        {
            System.out.println(" THE DETAILS OF STUDENT"+(i+1));
            r[i].calculate();
           r[i].print();
    }
     }
 }
