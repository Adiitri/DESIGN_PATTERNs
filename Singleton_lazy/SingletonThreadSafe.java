import java.util.*;

public class SingletonThreadSafe {
    static SingletonThreadSafe globalObject;

    private SingletonThreadSafe() {
    }

    public static SingletonThreadSafe getInstance() {
        if (globalObject == null) {

            synchronized (SingletonThreadSafe.class) { // only one thread can enter this block at a time
                if (globalObject == null) {
                    globalObject = new SingletonThreadSafe();
                }
            }

        }

        return globalObject;
    }

}
