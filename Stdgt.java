class Student{
    private int id=0;
    void getter(){
        System.out.println(id);
    }
    void setter(int num){
id=num;

    }
}
class Stdgt{
    public static void main(String[] args){
    Student st =new Student();
        st.setter(20221);
        st.getter();
    }
}