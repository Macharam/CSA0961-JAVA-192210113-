class Box  
{ 
    double l,b,h,v; 
    Box() 
    { 
        l= 10.5; 
        b = 20.5; 
        h = 5.5; 
    } 
    void volumecal()  
    { 
      v= l*b*h; 
      System.out.print("Volume of Box = "+v); 
    } 
public static void main(String[] args)  
{ 
Box mybox = new Box(); 
mybox.volumecal(); 
} 
}