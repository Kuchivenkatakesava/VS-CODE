package core;

public class student {
    String name;
    int age;
    int phoneno;
    String address;
    //constructor

    student(String name,int age,int phoneno,String address) {
        this.name="Kishore";
        this.age=24;
        this.phoneno=123456;
        this.address="Nagulavellatur village";
    }
    public student() {
    }
    public static void main(String[] args) {
        student obj1 = new student();

        System.out.println(obj1.name+ " "+ obj1.age+" "+ obj1.phoneno+ " "+ obj1.address);
        
    }    






}
