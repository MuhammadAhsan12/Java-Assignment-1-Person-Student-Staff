
import java.util.Scanner;

class Person {

    private String name;
    private String address;

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        this.name = name;
        return (name);
    }

    public String getAddress() {
        this.address = address;
        return (address);
    }

    public void setAddress(String address) {
        Scanner ip = new Scanner(System.in);
        address = ip.next();
    }

    public String toString() {
        return "Person name= " + getName() + "Person address= " + getAddress();
    }

}

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
        this.program = program;
        return (program);
    }

    public void setProgram(String program) {
        Scanner ip = new Scanner(System.in);
        program = ip.next();
    }

    public int getYear() {
        this.year = year;
        return (year);
    }

    public double getFee() {
        this.fee = fee;
        return (fee);
    }

    public void setFee(double fee) {
        Scanner ip = new Scanner(System.in);
        fee = ip.nextDouble();
    }

    public void setYear(int year) {
        Scanner ip = new Scanner(System.in);
        year = ip.nextInt();
    }

    public String toString() {
        return "Student name= " + super.getName() + " " + "Student address= " + super.getAddress() + " " + "program= " + getProgram() + " " + "year= " + getYear() + " " + "fee= " + getFee();
    }
}

class Staff extends Person {

    private String school;
    private Double pay;

    public Staff(String name, String address, String school, double pay) {
        super(name, address);

        this.school = school;
        this.pay = pay;
    }

    public String getSchool() {
        this.school = school;
        return (school);
    }

    public double getPay() {
        this.pay = pay;
        return (pay);
    }

    public void setPay(double pay) {
        Scanner ip = new Scanner(System.in);
        pay = ip.nextDouble();
    }

    public void setSchool(String school) {
        Scanner ip = new Scanner(System.in);
        school = ip.next();
    }

    public String toString() {
        return "Staff name= " + super.getName() + " " + "Staff address= " + super.getAddress() + " " + "school= " + getSchool() + " " + "pay= " + getPay();
    }
}

public class Main {

    public static void main(String[] args) {

        String name;
        String addr;
        String program;
        int year;
        Double fee;
        String school;
        Double pay;

        Student[] std = new Student[10];

        for (int i = 0; i < 10; i++) {
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

        Staff[] Staff = new Staff[10];

        for (int i = 0; i < 10; i++) {
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

    }
}
