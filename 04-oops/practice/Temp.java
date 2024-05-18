
class A {
    public void print() {
        System.out.println("A");
    }
}

class B extends A {
    public void printx() {
        System.out.println("B");
    }
}

public class Temp {
    public static void main(String[] args) {
        try {
            int a = 1;
            try {
                if (a == 1) {
                    a = a / (a - a);
                }
            } finally {
                System.out.println("A");
            }
        } catch (Exception e) {
            System.out.println("B");
        } finally {
            System.out.println("Helo");
        }
    }
}