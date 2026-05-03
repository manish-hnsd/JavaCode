import java.io.FileInputStream;
import java.io.ObjectInputStream;

//public class DeSerial {
//    public static void main(String[] args) {
//        try{
//            FileInputStream fis = new FileInputStream("C:\\Users\\hansd\\Downloads\\test.ser");
//            ObjectInputStream ois = new ObjectInputStream(fis);
//            Serial serial = (Serial) ois.readObject();
//            System.out.println(serial.name);
//            System.out.println(serial.password);
//            ois.close();
//            fis.close();
//        } catch (Exception e) {
//            System.out.println(e);
//        }
//    }
//}

/*public class DeSerial {

    public static void main(String[] args) {

        try {
            B a1 = B.gf(); // original singleton

            FileInputStream fis = new FileInputStream("D:\\test.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);

            B a2 = (B) ois.readObject(); // NEW object created ❌

            System.out.println("a1: " + a1);
            System.out.println("a2: " + a2);

            System.out.println("Same object? " + (a1 == a2)); // ❌ false

            ois.close();
            fis.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}*/