import java.util.Scanner;
    class A {
    String sname;
    int sno, phy, chem, bio, total;
    double average;
    
    
       void input() 
  {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter student name: ");
        sname = scanner.nextLine();
        System.out.print("Enter student number: ");
        sno = scanner.nextInt();
        
        System.out.print("Enter physics marks: ");
        phy = scanner.nextInt();
        System.out.print("Enter chemistry marks: ");
        chem = scanner.nextInt();
        System.out.print("Enter Biology marks: ");
        bio = scanner.nextInt();
  
    }
    
    
     void calculate()  
      {
        total = phy + chem + bio;
        average = total / 3.0;
     }
}


     interface B 
     {
    void display();
      }

    class C extends A implements B 
     {
        public void display() 
        {
        System.out.println("Student Report:");
        System.out.println("---------------");
        System.out.println("Name: " + sname);
        System.out.println("Number: " + sno);
        System.out.println("Physics: " + phy);
        System.out.println("Chemistry: " + chem);
        System.out.println("Biology: " + bio);
        System.out.println("Total: " + total);
        System.out.println("Average: " + average);
    }
}

       class Implementation1 
       {
        public static void main(String[] args)
        {
        C studentReport = new C();
        studentReport.input();
        studentReport.calculate();
        studentReport.display();
    }
}