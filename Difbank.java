import java.util.Scanner;
class Savingac{
    int amount=0;
    void calculateinterest(){
        System.out.println("the interse in saving A/c "+amount*4/100);
        }
    }
    class Fixed extends Savingac{
    int amount=0;
    void calculateinterest(){
        System.out.println("the interse is fd A/c "+amount*7/100);
        }
    }

class Difbank {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enetr the amount : ");
        int amount=sc.nextInt();
        Savingac sa=new Savingac();
        sa.amount=amount;
        sa.calculateinterest();
        Fixed fd=new Fixed();
        fd.amount=amount;
        fd.calculateinterest();
    }
}