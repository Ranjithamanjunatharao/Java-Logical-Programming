class Student
{
    private int number = 9001;
    private String name = "Karun";
 
    public void setNumber(int number) 
    {
        this.number = number;
    }
 
    public int getNumber()
    {
        return number;
    }
 
    public void setName(String name) 
    {
        this.name = name;
    }
 
    public String getName() 
     {
        return name;
    }
 
    
    public void printStudent() 
    {
        System.out.println("Number is..." + number);
        System.out.println("Name is..." + name);
    }
}
 
public class Main
{
    public static void main(String[] args) 
   {
        Student st = new Student();
        st.printStudent();
 
        st.setNumber(4005);
        st.setName("suma");
 
        // st.printStudent();
        System.out.println("name is.." + st.getName());
        System.out.println("Number is..." + st.getNumber());
    }
 
}
 