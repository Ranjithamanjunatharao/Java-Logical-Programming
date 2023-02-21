class overriding1
{
       void disp()
         {
            System.out.println("Its Super Class");
         } 
}
class overriding2 extends overriding1
{
         void disp()
         {
            System.out.println("Its Sub Class");
         }
}
class Methodoverriding
{
   public static void main(String args[])
   {
          overriding1 v1=new overriding1();
          overriding2 v2=new overriding2();
           overriding1 r;
           r=v1;
           r.disp();
           r=v2;
           r.disp();
       }
}