
public class practice1 {
    public static void main(String[] args) {
        Student saqib;
        saqib = new Student(02, "Saqib", 100);
        // System.out.println(saqib.rollNo + saqib.name + saqib.marks);
        saqib.printInfo();
        Student adnan = new Student();
        adnan.name = "Adnan";
        // System.out.println(adnan.rollNo + adnan.name + adnan.marks);
        adnan.printInfo();
        // saqib.greeting();
        // adnan.greeting();
        Student random = new Student(saqib);
        random.printInfo();

        // objects refrencing to same memory
        Student stu1 = new Student(10, "Kabir", 90);
        Student stu2 = stu1;
        stu2.name = "jameel";
        stu1.printInfo();
    }

}

class Student {
    int rollNo;
    String name;
    float marks;

    void printInfo() {
        System.out.println(this.rollNo + " " + this.name + " " + this.marks);
    }

    void greeting() {
        System.out.println("Salamalaykum! " + this.name); // this.name means 'obj.property'
    }

    // creating constructors and overloading them

    Student() { // it is a constructor // here Student is the return type // A constructor does
                // not have a name
        // this.rollNo = -1;
        // this.name = "No name";
        // this.marks = -1f;

        // we can call a constructor from another constructor
        this(-1, "No name", -1f);
    }

    Student(int roll, String naam, float marks) {
        // 'this' keyword specifies which var's are properties of class and which var's
        // are regular var's
        // it is a good convention to use 'this' keyword even if it is not needed
        this.rollNo = roll;
        this.name = naam;
        this.marks = marks;
    }

    // constructor to duplicate an object
    Student(Student other) {
        this.rollNo = other.rollNo;
        this.name = other.name;
        this.marks = other.marks;
    }
}
