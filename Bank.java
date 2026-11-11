import java.util.Scanner;
class DepositAc{
    void deposit(int amount){
        System.out.println("the amount is : "+amount);}
    void deposit(double amount){
        System.out.println(" the amont after depositing : "+amount);}
    void deposit(int amount,String description){
        System.out.println("the Amount : "+amount);
        System.out.println("the discription   : "+description);}
   }
class Bank{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int amount;
        String description;
        System.out.println("enetr the amount : ");
        amount=sc.nextInt();
        sc.nextLine();
        System.out.println("enetr the des");
        description=sc.nextLine();
        DepositAc dp=new DepositAc();
        dp.deposit(amount);
        dp.deposit(2000.0+amount);
        dp.deposit(amount,description);
    }
}