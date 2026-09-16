import java.util.*;

public class Singleton {
    static Singleton globalObject;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (globalObject == null) { // object not created
            globalObject = new Singleton();
        }
        return globalObject;
    }
}
