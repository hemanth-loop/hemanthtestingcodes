import net.bytebuddy.implementation.bytecode.collection.ArrayFactory;

import java.util.*;
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


//        String revers = "automated AI";
//
//        String[] Data =revers.split(" ");
//
//        List<String> splitvalue = new ArrayList<>(List.of(Data));
//        System.out.println(splitvalue.get(0));
//
//
//
//        StringBuilder reverse = new StringBuilder(revers).reverse();
//
//
//         String java = reverse.toString();
//         String[] date = java.split(" ");
//         List<String> date1 = new ArrayList<>(List.of(date));
//
//        System.out.println(splitvalue.get(1)+" "+date1.get(1));
//
//        int a=5;
//        int b=10;
//        System.out.println("a:"+a+"\n"+"b:"+b);
//
//        a=a+b;  //a=15
//        b=a-b;  //b=15-10=5
//        a=a-b;  //a=15-5=10
//        System.out.println("a:"+a+"\n"+"b:"+b);
//
//
//        String poo= "loot";
//        String loo= "don";
//        System.out.println("poo = "+poo+"\n"+"loo = "+loo);
//
//        String fot = loo;
//        loo=poo;
//        poo = fot;
//
//        System.out.println("poo : "+poo+"\n"+"loo : "+loo);
//
//
//          String pam = "madaml";
        //      Scanner scanner = new Scanner(System.in);
//        System.out.println("enter the number");
//        String indata = scanner.nextLine();


//        StringBuilder reverseee = new StringBuilder(pam).reverse();
//        String reversevalue = reverseee.toString();
//
//        String pom=(pam.equals(reversevalue)) ? "the given string is palandrome" : "the given string is not palandrome";
//        System.out.println(pom);
//        if (pam.equals(reversevalue))
//        {
//            System.out.println("the given string is palandrome");
//        }else {
//            System.out.println("the given string is not palandrome");
//        }

//        System.out.println(pam.equals(reversevalue));
//
//
//
//        int[] pot ={0,15,22,3};
//        Arrays.sort(pot);
//        System.out.println(Arrays.toString(pot));
//
//
//        int[] aey ={5,9,87,34};
//        int[] jom ={0,9,8,7};
//
//        int[] merged = IntStream.concat(Arrays.stream(aey),Arrays.stream(jom)).toArray();
//        System.out.println(Arrays.toString(merged));
//
//        int[] hoo = {90,98,9,78};
//        int arr= hoo[0];
//
//        for (int po:hoo) {
//            if (po>arr){
//                arr=po;
//            }
//        }
//        System.out.println(arr);
//
//        String tony = "i am the everwhere";
//
//        StringBuilder dokk = new StringBuilder(tony).reverse();
//
//        System.out.println(dokk);

//      int[] array = {9,1,2,6,7,6};
//        Arrays.sort(array);
//        int[] dta = Arrays.stream(array).distinct().toArray();
//
//        for (int i=0; i<dta.length; i++) {
//            System.out.println(array[array.length - 3]);
//            break;


//        for (int i = 0; i < 2; i++) {
//            for (int j = 0; j < 1 - i; j++) {
//                System.out.print(" ");
//            }
//            for (int k = 0; k < 4 + i; k++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

//        int[] arry= {2,3,4,5,6,7,6};
//
//        int[] data = Arrays.stream(arry).distinct().sorted().toArray();
//
//        //System.out.println(Arrays.toString(data));
//
//
//
//        System.out.println(arry[data.length-2]);

//****************************************************************** diamond ************************************************
// int i;
// int k;
// int n=6;
//
//
//
//
//for (int m=1; m<=2; m++ ){
//    for(k=1; k>=m; k--){
//        System.out.print("_");
//    }
//    for(int l=1; l<=m+4; l++){
//        System.out.print(" *");
//    }
//    System.out.println();
//}
//
// for(i=n; i>=1; i--)
// {
//
//     for(k=1; k<=n-i; k++){
//         System.out.print("_");
//
//     }
//     for (int j=1; j<=i; j++){
//         System.out.print(" *");
//     }
//     System.out.println();
// }
//****************************************************************** diamond ************************************************
// int n=9;
// for (int i=1; i<=n; i++){
//
//     for (int j=1; j<=n; j++)
//     {
//         if (j == i || j == (n-i+1)){
//             System.out.print("*");
//         }else {
//             System.out.print("_");
//         }
//     }
//     System.out.println();
// }
//        Scanner scanner = new Scanner(System.in);
//        String age = "100";
//        List<Map<String, String>> data = new ArrayList<>();
//
//        for (int i = 0; i <= 2; i++) {
//            Map<String, String> user1 = new HashMap<>();
//            System.out.println("the user data for user" + i);
//            String inputData = scanner.nextLine();
//            user1.put("user_name", "hemanth");
//            user1.put("password", "Root@123");
//            user1.put("dob", inputData);
//            Object og = ageCal(inputData);
//            System.out.println(og);
//            data.add(user1);
//            for (Map.Entry<String, String> lop : data.get(i).entrySet()) {
//                System.out.println(lop);
//            }
//        }
//    }
//        public static String ageCal(String inputData){
//            int birthYear = Integer.parseInt(inputData);
//            int currentYear = java.time.Year.now().getValue();
//            int age = currentYear - birthYear;
//            return String.valueOf(age);


//        String data = "My name is swathi";
//        String[] splitdata = data.split(" ");
//
//        for (String fog:splitdata) {
//            StringBuilder kol = new StringBuilder(fog);
//            kol.reverse();
//            System.out.print(kol+" ");
//        }


//        String hop= "hemanth";
//
//        for (int i=hop.length()-1; i>=0; i--)
//        {
//            System.out.print(hop.charAt(i));
//        }


//        List<Integer> dom = new ArrayList<Integer>();
//
//        int[] data = {4, 16, 3, 7, 0};
//
//        for (int i = 0; i < data.length; i++) {
//
//            Integer value = 0;
//            for (int j = i + 1; j < data.length; j++) {
//                if (data[i] > data[j]) {
//                    value= data[i];
//                }el{
//                    value = null;
//                    break;
//                }
//
//            }
//            if(value!=null) dom.add(value);
//        }
//        System.out.println(dom);


//        String good = "the my new joo is here";
//        String[] splitdata = good.split(" ");
//
//        for (String lop : splitdata) {
//            for (int i = lop.length() - 1; i >= 0; i--) {
//                char rom=lop.charAt(i);
//                System.out.print(rom);
//            }
//            System.out.print(" ");
//
//        }


//        int[] fog={9,0,4,5,6};
//
//        Arrays.sort(fog);
//
//        System.out.println(Arrays.toString(fog));
//
//        System.out.println(
//                fog[fog.length-2]);


//        String data = "the roq of the man in the world";
//        String good= data.replace(" ","");
//        Map<Character,Integer> ogdata = new HashMap<>();
//         char[] lop =good.toCharArray();
//
//        for (char da:lop) {
//
//            if(ogdata.containsKey(da)){
//                ogdata.put(da,ogdata.get(da)+1);
//            }
//            else {
//                ogdata.put(da,1);
//            }
//            }
//        for (Character gop:ogdata.keySet()) {
//            if (ogdata.get(gop)>1) {
//                System.out.println(gop + "" + ogdata.get(gop));
//            }
//        }

//**************************************************************************************************************************88
//        String data = "kanpuradam ranid knah";
//
//             String[] mdata=data.split(" ");
//
//             StringBuilder hoy = new StringBuilder(mdata[0]).reverse();
//             System.out.print(hoy+" ");
//             for (int i=1; i<mdata.length; i++) {
//                 String fof = mdata[i];
//                 System.out.print(fof+" ");
//             }
//**************************************************************************************************************************88
        //        for (String data:splitdata) {
//            StringBuilder lop= new StringBuilder(data);
//            lop.reverse();
//            System.out.print(lop.toString()+" ");
//        }
//**************************************************************************************************************************88

        //      int[] data= {9,4,6,7,8,23,14,6};

//      for(int i=0; i<data.length-1; i++)
//      {
//          for (int j=0; j<data.length-1; j++)
//          {
//              if (data[j]>data[j+1]) {
//                  int temp = data[j];
//                  data[j]=data[j+1];
//                  data[j+1]=temp;
//              }
//
//          }
//
//      }
//        System.out.println(Arrays.toString(data));

//**************************************************************************************************************************88


//        int[] data= {9,4,6,7,8,23,14,6};
//
//       // Arrays.sort(data);
//        int[] mdata = Arrays.stream(data).sorted().distinct().toArray();
//        System.out.println(Arrays.toString(mdata));
//        System.out.println(mdata[mdata.length-1]);
//
//
// **************************************************************************************************************************88


//        String data="the man in the form of the wrong";
//        String mdata = data.replace(" ", "");
//        Map<Character,Integer> ogdata= new HashMap<>();
//
//
//        char[] loop =mdata.toCharArray();
//        for (char ldata:loop) {
//            if(ogdata.containsKey(ldata)){
//                ogdata.put(ldata,ogdata.get(ldata)+1);
//            }else {
//                ogdata.put(ldata,1);
//            }
//
//
//        }
//        for (Character ogdom:ogdata.keySet()) {
//               if(ogdata.get(ogdom)>1)
//            System.out.println(ogdom+" "+ogdata.get(ogdom));
//        }


     //  String[] datas= {"cot","hoop","loop"};




        }


    }








    
