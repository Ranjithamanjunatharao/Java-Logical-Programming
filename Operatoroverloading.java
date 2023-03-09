class Operatoroverloading
  {
    int a=2,b=3;
    public static void main(String args[])
    {
     Operatoroverloading obj= new Operatoroverloading();
      System.out.println("a + b= "+(obj.a+obj.b));//add
      System.out.println("a + b= "+obj.a+obj.b);//Concat
    }
  }