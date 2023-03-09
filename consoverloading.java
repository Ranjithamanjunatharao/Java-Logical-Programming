class Student
  {
    int id;
    String name;
    int age;
    Student(int i,String str)
    {
      id=i;
      name=str;
    }
    Student(int i,String str,int n)
    {
      id=i;
      name=str;
      age=n;
    }
    void display()
    {
      System.out.println(id+" "+name+" "+age);
    }

  }
class consoverloading
  {
    public static void main(String args[])
    {
    Student obj1=new Student(1,"Ranju");
   Student obj2=new Student(2,"Manju",65);
      obj1.display();
      obj2.display();
  }
  }