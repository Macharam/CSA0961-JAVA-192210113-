class Marks
{
   int pythonMarks;
   int cMarks;
   int phyMarks;
   int chemMarks;
   int javaMarks;
   int pdMarks;
   void get(int m1,int m2,int m3,int m4,int m5,int m6)
   {
     pythonMarks=m1;
     cMarks=m2;
     phyMarks=m3;
     chemMarks=m4;
     javaMarks=m5;
     pdMarks=m6;
    }
}
class Average extends Marks
{
 int total;
 double avg;
 void cal()
 {
  total=(pythonMarks+cMarks+phyMarks+chemMarks+javaMarks+pdMarks);
  avg=total/6.0;
 }
 void display()
 {
   System.out.println("Total = " + total); 
   System.out.println("Average = " + avg); 
 }
}
class Grade extends Average 
{
 void grade_display() 
 { 
  if(avg>75)  
  { 
   System.out.println("DISTINCTION"); 
  }  
  else if(avg>=60 && avg<75)  
  { 
   System.out.println("First Division"); 
  }  
  else if (avg>=50 && avg<60)  
  { 
   System.out.println("Second Division"); 
  }  
  else if (avg>=40 && avg<50)  
  { 
   System.out.println("Third Division"); 
  }  
  else  
  { 
    System.out.println("Fail"); 
  } 
 } 
 public static void main(String[] args)  
 { 
  Grade obj=new Grade(); 
  obj.get(95,90,95,100,65,78); 
  obj.cal(); 
  obj.display(); 
  obj.grade_display(); 
 } 
}