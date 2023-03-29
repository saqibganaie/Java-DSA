public class SingletonClass {
    String name;

    private SingletonClass() {
    } // we made the constructor private because we dont want anyone to create objects
      // of this class using constructor. (i.e no multiple objects)

    public static SingletonClass instance;

    public static SingletonClass getInstance() {
        // check wheather 1 object is created or not
        if (instance == null) {
            instance = new SingletonClass();
        }
        return instance;
    }
}
