interface shape{
    int ball=10;
    int tony=20;

    void Hoop();

    default void tony(){
        System.out.println("this is default method");
    }
    static void StaticTony(){
        System.out.println("the method is static");
    }
}

public class InterfaceDemo implements shape {
    public void Hoop(){
        System.out.println("this is hoop abstract");

    }



    public static void main(String[] args) {





    }
}
