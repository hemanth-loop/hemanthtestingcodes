public class Down extends Up{

    String fog = "moon";
    void dog(){
        System.out.println("the downtop");
    }


    public static void main(String[] args) {

        Up poo = new Down();
        System.out.println(poo.data);
        poo.upward();
    }
}
