import java.util.HashSet;
import java.util.Scanner;
class Student {
    private int id;
    private String First_name;
    private String last_name;
    private int  age;
    private String gender;
    private String email;
    private String address;
    private String department;
    private long  phone_num ;
    
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getFName() {
        return First_name;
    }
    public void setFName(String First_name) {
        this.First_name = First_name;
    }
    public String getLName() {
        return last_name;
    }
    public void setLName(String last_name) {
        this.last_name = last_name;
    }
    public String getGender(){
        return gender;
    }
    public void setGender(String gender){
        this.gender=gender;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.desiganation = address;
    }
    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
    public double getPhone_num() {
        return phone_num;
    }
    public void setPhone_num(long phone_num) {
        this.phone_num = phone_num;
    }
    public String toString() {
        return "Student [id=" + id + ", First_name=" + First_name + ", last_name=" + last_name +", age=" + age + ", gender=" + gender +", Email=" + email +", Address=" + address
                + ", department=" + department + ", phone_num=" + phone_num +" + "]";
    }
    public Student(int id, String First_name, String last_name ,int age, String gender, String email, String address, String department, long phone_num) {
        super();
        this.id = id;
        this.First_name = First_name;
        this.last_name = last_name;
        this.age = age;
        this.gender=gender;
        this.email=email;
        this.address = address;
        this.department = department;
        this.phone_num = phone_num;
    }
}
class StudentDetails {
    
    HashSet<Student> stdset=new HashSet<Student>();
    
    Student std1=new Student(101,"Pavani", "Sankati", 21, "Female", "pavanisankati18@gmail.com", "Mandamarri", "CSE",8978828070);
    Student std2=new Student(102, "Bhavana","Vembadi", 21, "Female", "vembadibhavana@gmail.com", "Hyderbad", "ECE", 8985864433);
    Student std3=new Student(102, "Sudha", "vadla", 21, "Female", "sudha2002@gmail.com", "warangal", "IT",9567859058);
    Student std4=new Student(103, "vaka", "Likhitha", 21, "Female", "vakalikhitha@gmail.com", "Banglore", "Civil", 9867948944);
    
    
    Scanner sc=new Scanner(System.in);
    boolean found=false;
    int id;
    String First_name;
    String last_name;
    int age;
    String gender;
    String email;
    String department;
    String address;
    long phone_num;
    
    public StudentDetails() {
        
        stdset.add(std1);
        stdset.add(std2);
        stdset.add(std3);
        stdset.add(std4);
        
        
    }
    public void viewAllEmps() {
        for(Employee emp:empset) {
            System.out.println(emp);
        }
    }
    public void viewStd(){
        
        System.out.println("Enter id: ");
        id=sc.nextInt();
        for(Student std:stdset) {
            if(std.getId()==id) {
                System.out.println(std);
                found=true;
            }
            
        }
        if(!found) {
            System.out.println("Student id is not found");
        }
    }
    public void updateStudent() {
        System.out.println("Enter id: ");
        id=sc.nextInt();
        boolean found=false;
        for(Student std:stdset) {
            if(std.getId()==id) {
                System.out.println("Enter First_name: ");
                First_name=sc.next();
                System.out.println("Enter last_name: ");
                last_name=sc.next();
                System.out.println("Enter age: ");
                age=sc.nextInt();
                System.out.println("Enter gender: ");
                gender=sc.next();
                System.out.println("Enter email: ");
                email=sc.next();
                System.out.println("Enter address: ");
                address=sc.next();
                System.out.println("Enter department: ");
                department=sc.next();
                System.out.println("Enter new phone_num");
                phone_num=sc.nextlong();
                std.setDepartment(department);
                std.setAddress(address);
                std.setEmail(email);
                std.setAge(age);
                std.setLName(last_name);
                std.setFName(First_name);
                std.setGender(gender);
                std.setPhone_num(phone_num);
                System.out.println("Updated Details of student are: ");
                System.out.println(std);
                found=true;
            }
        }
        if(!found) {
            System.out.println("Student is not present");
        }
        else {
            System.out.println("Student details updated successfully !!");
        }
    }
    public void deleteStd() {
        System.out.println("Enter id");
        id=sc.nextInt();
        boolean found=false;
        Student stddelete=null;
        for(Student std:stdset) {
            if(std.getId()==id) {
                stddelete=emp;
                found=true;
            }
        }
        if(!found) {
            System.out.println("Student is not present");
        }
        else {
            stdset.remove(stddelete);
            System.out.println("Student deleted successfully!!");
        }
    }
    public void addStd() {
        System.out.println("Enter id:");
        id=sc.nextInt();
        System.out.println("Enter First_name");
        First_name=sc.next();
        System.out.println("Enter last_name");
        last_name=sc.next();
        System.out.println("Enter age");
        age=sc.nextInt();
        System.out.println("Enter gender");
        gender=sc.next();
        System.out.println("Enter email");
        email=sc.next();
        System.out.println("enter address");
        address=sc.next();
        System.out.println("Enter Department");
        department=sc.next();
        System.out.println("Enter phone_num");
        phone_num=sc.nextlong();
        Student std=new Student(id, First_name, last_name, age, gender, email, address, department, phone_num);
        
        stdset.add(std);
        System.out.println(std);
        System.out.println("Student added successsfully");
        
    }
    
    }


public class Main {

    StudentDetails obj=new StudentDetails();
    static boolean continue = true;
    public static void list() {
        System.out.println("Student System :  "
                + "\n1. Add Student "
                + "\n2.View Student"
                + "\n3.Update Student"
                + "\n4. Delete Student"
                + "\n5.View All Student"
                + "\n6. Exist ");
    }
     
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        StudentDetails obj=new StudentDetails();
        
        do {
            list();
            System.out.println("Enter your Choice");
            int ch=sc.nextInt();
            switch(ch) {
            
            case 1:
                System.out.println("Add Student");
                obj.addStd();
                break;
            case 2:
                System.out.println("View Student");
                obj.viewStd();
                break;
            case 3:import java.util.HashSet;
import java.util.Scanner;
class Student {
    private int id;
    private String First_name;
    private String last_name;
    private int  age;
    private String gender;
    private String email;
    private String address;
    private String department;
    private double phone_num;

    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getFName() {
        return First_name;
    }
    public void setFName(String First_name) {
        this.First_name = First_name;
    }
    public String getLName() {
        return last_name;
    }
    public void setLName(String last_name) {
        this.last_name = last_name;
    }
    public String getGender(){
        return gender;
    }
    public void setGender(String gender){
        this.gender=gender;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
    public double getPhone_num() {
        return phone_num;
    }
    public void setPhone_nume(long phone_num) {
        this.phone_num = phone_numy;
    }
    public String toString() {
        return "Student [id=" + id + ", First_name=" + First_name + ", last_name=" + last_name +", age=" + age + ", gender=" + gender +", Email=" + email +", address=" + address
                + ", department=" + department + ", phone_num=" + phone_num +"+ "]";
    }
    public Student(int id, String First_name, String last_name ,int age, String gender, String email, String address, String department, long phone_num) {
        super();
        this.id = id;
        this.First_name = First_name;
        this.last_name = last_name;
        this.age = age;
        this.gender=gender;
        this.email=email;
        this.desiganation = desiganation;
        this.department = department;
        this.salary = salary;
        this.Noofyears_Exp=Noofyears_Exp;
    }
}
class EmployeeDetails {
    
    HashSet<Employee> empset=new HashSet<Employee>();
    Student std1=new Student(101,"Pavani", "Sankati", 21, "Female", "pavanisankati18@gmail.com", "Mandamarri", "CSE",8978828070);
    Student std2=new Student(102, "Bhavana","Vembadi", 21, "Female", "vembadibhavana@gmail.com", "Hyderbad", "ECE", 8985864433);
    Student std3=new Student(102, "Sudha", "vadla", 21, "Female", "sudha2002@gmail.com", "warangal", "IT",9567859058);
    Student std4=new Student(103, "vaka", "Likhitha", 21, "Female", "vakalikhitha@gmail.com", "Banglore", "Civil", 9867948944);
    
    Scanner sc=new Scanner(System.in);
    boolean found=false;
    int id;
    String First_name;
    String last_name;
    int age;
    String gender;
    String email;
    String department;
    String address;
    double phone_num;
    
    public StudentDetails() {
        
        stdset.add(std1);
        stdset.add(std2);
        stdset.add(std3);
        stdset.add(std4);
        
    }
    public void viewAllStds() {
        for(Student std:stdset) {
            System.out.println(std);
        }
    }
    public void viewStd(){
        
        System.out.println("Enter id: ");
        id=sc.nextInt();
        for(Student std:stdset) {
            if(std.getId()==id) {
                System.out.println(std);
                found=true;
            }
            
        }
        if(!found) {
            System.out.println("Student  id is not found");
        }
    }
    public void updateStudent() {
        System.out.println("Enter id: ");
        id=sc.nextInt();
        boolean found=false;
        for(Student std:stdset) {
            if(std.getId()==id) {
                System.out.println("Enter First_name: ");
                First_name=sc.next();
                System.out.println("Enter last_name: ");
                last_name=sc.next();
                System.out.println("Enter age: ");
                age=sc.nextInt();
                System.out.println("Enter gender: ");
                gender=sc.next();
                System.out.println("Enter email: ");
                email=sc.next();
                System.out.println("Enter address: ");
                address=sc.next();
                System.out.println("Enter department: ");
                department=sc.next();
                System.out.println("Enter new phone_num");
                phone_num=sc.nextlong();
                std.setDepartment(department);
                std.setAddress(address);
                std.setEmail(email);
                std.setAge(age);
                std.setLName(last_name);
                std.setFName(First_name);
                std.setGender(gender);
                std.setPhone_num(sal);
                System.out.println("Updated Details of student are: ");
                System.out.println(std);
                found=true;
            }
        }
        if(!found) {
            System.out.println("student is not present");
        }
        else {
            System.out.println("student details updated successfully !!");
        }
    }
    public void deleteStd() {
        System.out.println("Enter id");
        id=sc.nextInt();
        boolean found=false;
        Student stddelete=null;
        for(Student std:stdset) {
            if(std.getId()==id) {
                stddelete=std;
                found=true;
            }
        }
        if(!found) {
            System.out.println("Student is not present");
        }
        else {
            stdset.remove(stddelete);
            System.out.println("student deleted successfully!!");
        }
    }
    public void addStd() {
        System.out.println("Enter id:");
        id=sc.nextInt();
        System.out.println("Enter First_name");
        First_name=sc.next();
        System.out.println("Enter last_name");
        last_name=sc.next();
        System.out.println("Enter age");
        age=sc.nextInt();
        System.out.println("Enter gender");
        gender=sc.next();
        System.out.println("Enter email");
        email=sc.next();
        System.out.println("enter Address");
        address=sc.next();
        System.out.println("Enter Department");
        department=sc.next();
        System.out.println("Enter phone_num");
        phone_num=sc.nextlong();
        Student std=new Student(id, First_name, last_name, age, gender, email, address, department, phone_num);
        
        stdset.add(std);
        System.out.println(std);
        System.out.println("Student addeed successsfully");
        
    }
    
    }


public class Main {

    StudentDetails obj=new StudentDetails();
    static boolean continue = true;
    public static void list() {
        System.out.println("Student System :  "
                + "\n1. Add Student "
                + "\n2.View Student"
                + "\n3.Update Student"
                + "\n4. Delete Student"
                + "\n5.View All Student "
                + "\n6. Exist ");
    }
     
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        StudentDetails obj=new StudentDetails();
        
        do {
            list();
            System.out.println("Enter your Choice");
            int ch=sc.nextInt();
            switch(ch) {
            
            case 1:
                System.out.println("Add Student");
                obj.addStd();
                break;
            case 2:
                System.out.println("View Student");
                obj.viewStd();
                break;
            case 3:
                System.out.println("Update Student");
                obj.updateStudent();
                break;
            case 4:
                System.out.println("Delete Student ");
                obj.deleteStd();
                break;
            case 5:
                System.out.println("view All Student");
                obj.viewAllStds();
                break;
            case 6:
                System.out.println("Thank you for using application!!");
                System.exit(0);
                
            default:
                System.out.println("Please enter valid choice");
                break;
            }
            
        }
        while(continue);
        
        }
        
    }

                System.out.println("Update Student");
                obj.updateStudent();
                break;
            case 4:
                System.out.println("Delete Student");
                obj.deleteStd();
                break;
            case 5:
                System.out.println("view All Student");
                obj.viewAllStds();
                break;
            case 6:
                System.out.println("Thank you for using application!!");
                System.exit(0);
                
            default:
                System.out.println("Please enter valid choice");
                break;
            }
            
        }
        while(continue);
        
        }
        
    }