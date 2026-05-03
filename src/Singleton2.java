import java.io.Serializable;

/*public class Singleton2 {
    static Singleton2 instance = new Singleton2();// Make instance of the class static
    private Singleton2(){} //Private Constructor
    public static Singleton2 getInstance(){  //static method that has a return type object of this singleton class.
        return instance;
    }
}*/

//Break SingleTon using Serialization
public class Singleton2 implements Serializable{
    private static final Singleton2 instance = new Singleton2();
    private Singleton2(){}
    public static Singleton2 getInstance(){
        return instance;
    }
}