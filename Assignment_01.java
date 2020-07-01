package assignment_01;

import java.util.Scanner;

class Person {

    private String name;
    private String address;

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        Scanner ip = new Scanner(System.in);
        address = ip.next();
    }

    public String toString() {
        return "Person name= " + getName() + "Person address= " + getAddress();
    }
}
// sub class extends Person

class Student extends Person {

    private String program;
    private int year;
    private double fee;

    public Student(String name, String address, String program, int year, double fee) {

        super(name, address);

        this.program = program;
        this.year = year;
        this.fee = fee;
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        Scanner ip = new Scanner(System.in);
        program = ip.next();
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        Scanner ip = new Scanner(System.in);
        year = ip.nextInt();
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        Scanner ip = new Scanner(System.in);
        fee = ip.nextDouble();
    }

    public String toString() {
        return "Student name= " + super.getName() + " " + "Student address= " + super.getAddress() + " " + "program= " + getProgram() + " " + "year= " + getYear() + " " + "fee= " + getFee();
    }
}

// sub class extends Student
class Staff extends Person {

    private String school;
    private double pay;

    public Staff(String name, String address, String school, double pay) {

        super(name, address);

        this.school = school;
        this.pay = pay;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public double getPay() {
        return pay;
    }

    public void setPay(double pay) {
        Scanner ip = new Scanner(System.in);
        pay = ip.nextDouble();
    }

    public String toString() {
        return "Staff name= " + super.getName() + " " + "Staff address= " + super.getAddress() + " " + "school= " + getSchool() + " " + "pay= " + getPay();
    }
}

public class Assignment_01 {

    public static void main(String[] args) {

        String name;
        String addr;
        String program;
        int year;
        Double fee;
        String school;
        Double pay;
//        int input
//        
//        Scanner ip = new Scanner(System.in);
//        input = ip.nextInt();

        Student[] std = new Student[1];

        for (int i = 0; i < 1; i++) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter Student Name: ");
            name = scan.next();

            System.out.println("Enter Student Address: ");
            addr = scan.next();

            System.out.println("Enter Student Program: ");
            program = scan.next();

            System.out.println("Enter Student Year: ");
            year = scan.nextInt();

            System.out.println("Enter Student Fee: ");
            fee = scan.nextDouble();

            std[i] = new Student(name, addr, program, year, fee);

        }

        for (int i = 0; i < std.length; i++) {
            System.out.println(std[i]);
        }

        Staff[] Staff = new Staff[1];

        for (int i = 0; i < 1; i++) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter Staff Name: ");
            name = scan.next();

            System.out.println("Enter Staff Address: ");
            addr = scan.next();

            System.out.println("Enter Staff School: ");
            school = scan.next();

            System.out.println("Enter Staff Pay: ");
            pay = scan.nextDouble();

            Staff[i] = new Staff(name, addr, school, pay);
        }

        for (int i = 0; i < Staff.length; i++) {
            System.out.println(Staff[i]);
        }

        // Test constructor and toString()
//        Person Person = new Person("Ahsan", "Orangi Town Karachi");
//
//        System.out.println("name : " + Person.getName());
//        System.out.println("Adress : " + Person.getAddress());
//
//        Student Ahsan = new Student("Ahsan", "Orangi Town Karachi", "BSCS", 2019, 30000);
//
//        System.out.println("program : " + Ahsan.getProgram());
//        System.out.println("year : " + Ahsan.getYear());
//        System.out.println("fee : " + Ahsan.getFee());
//
//        Staff Staff = new Staff("Ahsan", "Orangi Town Karachi", "UBIT", 3000);
//
//        System.out.println("School : " + Staff.getSchool());
//        System.out.println("Pay : " + Staff.getPay());
        // TODO code application logic here
    }
}
