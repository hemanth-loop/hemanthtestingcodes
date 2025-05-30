import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class SplitNew {

    public static void main(String[] args) {

//        ArrayList<Integer> list = new ArrayList<>();
//        list.add(20);
//        list.add(30);
//        list.add(10);
//        list.add(20);
//
//
//        Set<Integer> Value = new HashSet<>(list);
//        System.out.println(Value);


        String revers = "automated AI";

        String[] Data =revers.split(" ");

        List<String> splitvalue = new ArrayList<>(List.of(Data));
        System.out.println(splitvalue.get(0));



        StringBuilder reverse = new StringBuilder(revers).reverse();


         String java = reverse.toString();
         String[] date = java.split(" ");
         List<String> date1 = new ArrayList<>(List.of(date));

        System.out.println(splitvalue.get(1)+" "+date1.get(1));

        int a=5;
        int b=10;
        System.out.println("a:"+a+"\n"+"b:"+b);

        a=a+b;  //a=15
        b=a-b;  //b=15-10=5
        a=a-b;  //a=15-5=10
        System.out.println("a:"+a+"\n"+"b:"+b);


        String poo= "loot";
        String loo= "don";
        System.out.println("poo = "+poo+"\n"+"loo = "+loo);

        String fot = loo;
        loo=poo;
        poo = fot;

        System.out.println("poo : "+poo+"\n"+"loo : "+loo);


          String pam = "madaml";
  //      Scanner scanner = new Scanner(System.in);
//        System.out.println("enter the number");
//        String indata = scanner.nextLine();


        StringBuilder reverseee = new StringBuilder(pam).reverse();
        String reversevalue = reverseee.toString();

        String pom=(pam.equals(reversevalue)) ? "the given string is palandrome" : "the given string is not palandrome";
        System.out.println(pom);
//        if (pam.equals(reversevalue))
//        {
//            System.out.println("the given string is palandrome");
//        }else {
//            System.out.println("the given string is not palandrome");
//        }

        System.out.println(pam.equals(reversevalue));



        int[] pot ={0,15,22,3};
        Arrays.sort(pot);
        System.out.println(Arrays.toString(pot));


        int[] aey ={5,9,87,34};
        int[] jom ={0,9,8,7};

        int[] merged = IntStream.concat(Arrays.stream(aey),Arrays.stream(jom)).toArray();
        System.out.println(Arrays.toString(merged));

        int[] hoo = {90,98,9,78};
        int arr= hoo[0];

        for (int po:hoo) {
            if (po>arr){
                arr=po;
            }
        }
        System.out.println(arr);

        String tony = "i am the everwhere";

        StringBuilder dokk = new StringBuilder(tony).reverse();

        System.out.println(dokk);
    }

}