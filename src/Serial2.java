import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/*public class Serial2 {
    public static void main(String[] args) {
        try{
            FileOutputStream fos = new FileOutputStream("C:\\Users\\hansd\\Downloads\\test.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            Serial serial = new Serial();
            oos.writeObject(serial);
            oos.close();
            fos.close();
            System.out.println("Executed successfully");
        }catch(Exception e){
            System.out.println(e);
        }
    }
}*/

//Break Singleton Using Serialization
public class Serial2 {
    public static void main(String[] args) {
        try {
            Singleton2 instance = Singleton2.getInstance();
            FileOutputStream fos = new FileOutputStream("C:\\Users\\hansd\\Downloads\\test.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(instance);
            oos.close();
            fos.close();
            System.out.println("Object Serialized Successfully");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
