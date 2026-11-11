import java.util.Scanner;
class Employee{
    private int id=0;
    private String name="";
    private Double salary=0.0; 
    void getter(){
        System.out.println("The empid : "+id);
        System.out.println("The employeeName: "+name);
        System.out.println("The Salary is: "+salary);
    }
    void setter(int num,String nam,Double sal){
id=num;
name=nam;
salary=sal;
  }
}
class Empgt{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num;
        String nam;
        Double sal;
        System.out.println("empid");
        num=sc.nextInt();
        sc.nextLine();
        System.out.println("name");
        nam=sc.nextLine();
        System.out.println("salary");
        sal=sc.nextDouble();
        Employee ep =new Employee();
        ep.setter(num,nam,sal);
        ep.getter();
    }
}