```java
package lab1;

class Student {

    String name = "umaiya";
    int id = 995;
    String section = "69-i1";
    String address = "DHAKA";

    void read() {
        System.out.println("       Student Information");
    }

    void displayInfo() {
        System.out.println("NAME : " + name + "\n"
                + "ID : " + id + "\n"
                + "SECTION : " + section + "\n"
                + "ADDRESS : " + address);
    }
}

public class Lab1 {

    public static void main(String[] args) {

        Student stu = new Student();
        stu.read();
        stu.displayInfo();

        System.out.println();

        Student student = new Student();
        student.name = "Nira";
        student.id = 8;
        student.section = "69-i2";
        student.displayInfo();
    }
}
```