class Bank
{
  double p,n,r,Sinterest,Iinterest,Ainterest;
  void get(double pr,double no)
  {
   p=pr;
   n=no;
  }
  void SBI(double r)
  {
    Sinterest=p*n*r/100;
  }
  void ICICI(double r)
  {
    Iinterest=p*n*r/100;
  }
  void Axis(double r)
  {
    Ainterest=p*n*r/100;
  }
  void display()
  {
    System.out.println("SBI interest:"+Sinterest);
    System.out.println("ICICI interest:"+Iinterest);
    System.out.println("Axis interest:"+Ainterest);
  }
  public static void main(String args[])
  {
   Bank b=new Bank();
   b.get(100000,5);
   b.SBI(8.4);
   b.ICICI(7.3);
   b.Axis(9.7);
   b.display();
   }
}

  
