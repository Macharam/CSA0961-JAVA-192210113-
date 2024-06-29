import java.util.*; 
class SumArray  
{ 
   public static void main(String arg[]) 
   { 
     Scanner sc=new Scanner(System.in); 
     int sum=0,i,n; 
     System.out.println("enter size of array:"); 
     n=sc.nextInt(); 
     System.out.println("enter elements:"); 
     int a[]=new int[n]; 
     try 
     { 
       for(i=0;i<5;i++) 
       { 
       a[i]=sc.nextInt(); 
       sum=sum+a[i]; 
       } 
       System.out.println("sum:"+sum); 
     }
     catch(Exception ex) 
     { 
      System.out.println("more than n values"); 
      System.out.println("change n value"); 
     } 
     finally 
     {
        System.out.println("always executed");
     }
   }
}