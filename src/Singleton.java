
public class Singleton { //Simple Serialization
    public static void main(String[] args) {
        Singleton2 obj = Singleton2.getInstance();
        Singleton2 obj2 = Singleton2.getInstance();
        System.out.print("Is Class Singleton ? ");
        System.out.println(obj==obj2);
    }
}
