package basics;

import java.util. ArrayDeque;
import java.util.Queue;
import java.util.Scanner;
import java.util.UUID;

public class medicalbill {
    static Queue<Details> q= new ArrayDeque<>();
    public static Details inputDetails() {
        Scanner sc = new Scanner(system.in);

        string id = UUID.randomUUID().tostring();

        System.out.print("enter name: ");
        string name = sc.nextline();

        System.out.print("enter age: ");
        int age =sc.nextline();

        System.out.print("disease name: ");
        string diseasename = sc.nextline();

        System.out.print("enter you phone no: ");
        int phoneno =sc.nextline();

        Details d= new details (id,name,age,diseasename,phoneno);

        sc.close();
        return d;

    }
    
    public static void main (String[] args)  {
        Details d = inputDetails();
        q.add(d);


        q.forEach(e -> {
            System.out.println("ID : " + e.getId());
            System.out.println("Name : " + e.getName());
            System.out.println("Age : " + e.getAge());
            System.out.println("disease : " e.getDiseasename());
            System.out.println("phonen no :" + e.getphoneno());
        });
        
    }
}
class Details {
    string id;
    string name;
    int age;
    string diseasename;
    int phoneno;
    public Details(String id,String name, Int age, String diseasename, int phoneo) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.diseasename = diseasename;
        this.phoneno = phoneno;

    }
    public String getName() {
        return null;
    }
    public String getid() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

