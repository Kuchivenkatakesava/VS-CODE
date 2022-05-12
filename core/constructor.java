package core;

public class constructor {
    String name;
    int age;

    constructor() {
        this.name= "Kesava";
        this.age= 23; 
    }    


    constructor(String n, int a) {

        this.name=n;
        this.age=a;
    }
    public static void main(String[] args) {
        constructor obj1= new constructor ();
        constructor obj2= new constructor("Kishore",24);


        System.out.println(obj1.name+" "+obj1.age);
        System.out.println(obj2.name+" "+obj2.age);
    }    







    
}
