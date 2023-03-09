class Student
  {
    int id;
    String name;
    Student(int n,String str)
    {
     id=n;
      name=str;
    }
    Student() {}
    void display()
    {
      System.out.println(id+" "+name);
    }
  }
class constructorcopy
  {
    public static void main(String args[])
    {
      Student obj1=new Student(1,"Ranju");
       Student obj2=new Student();
      obj2.id=obj1.id;
      obj2.name=obj1.name;
      obj1.display();
      obj2.display();
      }
  }