class factorial
{
int f=1,n=5,i;
void fact()
  {
for(i=1;i<=n;i++)
f=f*i;
System.out.println("The Factorial of "+n+" is:"+f);
}
       void fact(int x)
        {
           f=1;
            for(i=1;i<=x;i++)
              f=f*i;
          System.out.println("The Factorial of "+x+" is:"+f);
          }
}
class Methodoverloading
{
    public static void main(String args[])
     {
          factorial f1=new factorial();
           f1.fact();
           f1.fact(4);
       }
}