public class Main {
    public static void main(String[] args) {
        // __________ basic lazy singleton________________
        Singleton ob1 = Singleton.getInstance();
        Singleton ob2 = Singleton.getInstance();

        if (ob1 == ob2)
            System.out.println("working"); // singleton working
        else
            System.out.println("not working");

        // ____________ lazy thread safe singleton_____________
        Thread t1 = new Thread(() -> {
            SingletonThreadSafe ob3 = SingletonThreadSafe.getInstance();
            System.out.println(ob3);
        });

        Thread t2 = new Thread(() -> {
            SingletonThreadSafe ob4 = SingletonThreadSafe.getInstance();
            System.out.println(ob4);
        });
        t1.start();
        t2.start();
        // same address represent same obj

    }

}
