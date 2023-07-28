public class ObjectClass {
    int num;
    private String st;

    public ObjectClass(int num) {
        this.num = num;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();

    }

    public static void main(String[] args) {
        ObjectClass obj1 = new ObjectClass(10);
        ObjectClass obj2 = new ObjectClass(29);
        if (obj1 == obj2) {
            System.out.println("Obj1 is less than obj2");
        }
        if (obj1.equals(obj2)) {
            System.out.println("Objec1 is equal to obj2");
        }

    }
}
