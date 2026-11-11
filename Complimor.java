class User{
    void name(int a){
        System.out.println("function 1");}
  void name(){
    System.out.println("function2");}
    void name(int a,int b){
        System.out.println("function 3");}
    void name(double a){
    System.out.println("functiom 4");
    }
}
class Complimor{
    public static void main(String [] args){
        User us=new User();
        us.name();
        us.name(10);
        us.name(2.02);
    }
}