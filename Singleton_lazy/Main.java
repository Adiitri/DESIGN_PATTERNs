public class Main {
    public static void main(String[] args) {
        Singleton ob1 = Singleton.getInstance();
        Singleton ob2 = Singleton.getInstance();

        if (ob1 == ob2)
            System.out.println(true); // singleton working
        else
            System.out.println(false);
    }

}
