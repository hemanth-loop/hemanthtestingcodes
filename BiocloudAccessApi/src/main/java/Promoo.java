


import java.util.*;

public class Promoo {

    public static void main(String[] args) {

        //============================================================ prime number ======================================
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("enter the number");
//        int data = scanner.nextInt();
//
//        if (isPrime(data)) {
//            System.out.println("the number is prime");
//        } else {
//            System.out.println("the number is not");
//        }
//    }
//    public static boolean isPrime(int n) {
//        if (n <= 1) return false;
//        if (n == 2) return true;
//        for (int i = 2; i <= Math.sqrt(n); i++) {
//            if (n % 2 == 0) return false;
//        }
//        return true;
//======================================== prime number ======================================


//======================================== fibonacci number ======================================
//        List<Integer> fob = new ArrayList<>();
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("enter the number");
//        int data = scanner.nextInt();
//
//        int a=0 ,b=1;
//        for(int i=0; i<=data; i++)
//        {
//            fob.add(a);
//            int add = a+b;
//            a=b;
//            b=add;
//
//        }
//        System.out.println(fob);

//======================================== fibonacci number ======================================

//==========================================swap number=============================================
        //       int a = 10, b = 15;
//    int w=a+b;
//      a=a+b;//25
//      b=a-b;//25-15
//      a=a-b;//25-10

//        int c =a;
//        a=b;
//        b=c;
//
//        System.out.println("the value of a :"+a+"\n the value od b :"+b);


        //  b=w-a;

        // System.out.println("the value of A : "+a+"\n the value of B : "+b);
//


//        for (int i=0;i<5;i++){
//            for (int j=0;j<=i;j++){
//                System.out.print("*");
//            }
//            System.out.println(" ");
//        }
        // 5     1*2*3*4*5=

//=================================factorial=======================================================================

//          Scanner scanner =new Scanner(System.in);
//          System.out.println("enter the number");
//          int number= scanner.nextInt();
//          int fact=1;
//          for (int i=1; i<=number; i++){
//              int got=fact*i;
//              fact=got;
//          }
//        System.out.println(fact);
//=================================factorial=======================================================================
//       Scanner scanner= new Scanner(System.in);
//        System.out.println("enter the string");
//       String DATA =scanner.nextLine();
//       String hop = new StringBuilder(DATA).reverse().toString();
//       System.out.println(hop);
//========================================reverse a number=========================================================

//        Scanner scanner= new Scanner(System.in);
//        System.out.println("enter the number");
//        int number = scanner.nextInt();
//
//            int reversed = 0;
//
//            while (number != 0) {
//                int digit = number % 10;         // get last digit       20%10=2
//                reversed = reversed * 10 + digit; // add it to reversed
//                number /= 10;                    // remove last digit
//            }
//
//            System.out.println("Reversed number: " + reversed);
//        }

//========================================reverse a number=========================================================

//==========================================armstrong==============================================================

//        Scanner scanner= new Scanner(System.in);
//        System.out.println("enter the number");
//        int number = scanner.nextInt();
//
//        int originalinputnumber = number;
//
//        //153  = 1^3+5^3+3^3 = 1+125+27 = 153
//        int sum=0;
//        while (number>0)
//        {
//            int data=number%10;  //3
//              // sum += data*data*data;
//            sum=sum+(data*data*data);
//               number=number/10;  //15
//        }
//      if (originalinputnumber==sum){
//          System.out.println("its a armstrong number");
//      }else {
//          System.out.println("its not amstrong");
//      }
//==============================================================armstrong===========================================================


//==============================================================sumofdigits==========================================================
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("enter the number you want to sum");
//        int number = scanner.nextInt();
//
//        //  54 = 5+4=9
//
//
//        int sum=0;//4
//        while (number>0)
//        {
//            int num=number%10; //4
//            sum = sum+num;
//            number =number/10;//5
//
//        }
//        System.out.println("the sum of numbers are"+sum);
//==============================================================sumofdigits==========================================================

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("enter the digits");
//        int no = scanner.nextInt();
//        int digitalCount = String.valueOf(Math.abs(no)).length();
//        System.out.println(digitalCount);

        //250
//        if(no==0)
//        {
//            System.out.println("the number you entred is zero");
//        }else {
//            int count=0;
//            while (no>0){
//                no=no/10;
//                count++;
//            }
//            System.out.println("the no of digits in the given input is :"+count);
//        }

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("enter the number to check");
//        int no=scanner.nextInt();
        //no of digits
//        int count= 0;   //54
//        while (no>0)
//        {
//            no=no/10;
//            count++;
//
//        }
//        System.out.println("the number of digits : "+count);

//++++++++++++++++++++++++++++++++++++++++++++reverse number+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
//      Scanner scanner = new Scanner(System.in);
//        System.out.println("enter the number which you want");
//        int data=scanner.nextInt();
//        int originalData = data;
//        int reverse=0;
//        while (data>0){
//            int dat = data%10;
//            reverse=reverse*10+dat;
//            data=data/10;
//        }
//        System.out.println("the reversed dATE : "+reverse);
//
//        if(originalData==reverse){
//            System.out.println("the number is p");
//        }else
//        {
//            System.out.println("the number is not p");
//        }
//++++++++++++++++++++++++++++++++++++++++++++reverse number+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

//+++++++++++++++++++++++++++++++++++++++++++++++++sum of the numbers++++++++++++++++++++++++++++++++++++++++++++++++++

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("enter the number do you want to sum");
//        int number = scanner.nextInt();
////54
//        int sum =0 ;
//        while (number>0)
//        {
//            int dinu=number%10; //4
//            sum= dinu+sum;
//            number=number/10;
//
//        }
//        System.out.println("the sum of digits : "+sum);
//++++++++++++++++++++++++++++++++++++++++++++++++sum of numbers++++++++++++++++++++++++++++++++++++++++++++++++++++++
//++++++++++++++++++++++++++++++++++++++++++++++++2ND largest number+++++++++++++++++++++++++++++++++++++++++++++++=++
//        Integer[] arry = { 0,4, 56, 65, 68, 1, 5};
//
//        List<Integer> DATA = new ArrayList<>(Arrays.asList(arry));
//
//        Collections.sort(DATA);
//        int NO= arry.length-4;
//        System.out.println(DATA.get(NO));

//++++++++++++++++++++++++++++++++++++++++++++++++2ND largest number+++++++++++++++++++++++++++++++++++++++++++++++=++

//        String hoop = "the data for the data";
//        StringBuilder DON = new StringBuilder(hoop).reverse();
//        System.out.println(DON);

//==============================================reverse a string =====================================================
//        Scanner scanner= new Scanner(System.in);
//        System.out.println("enter the number");
//        String DON= scanner.nextLine();
//
//        char sh;
//        String REVERSE="";
//        for (int i=0; i<DON.length(); i++)
//        {
//            sh=DON.charAt(i);
//            REVERSE = sh+REVERSE;
//        }
//        System.out.println(REVERSE);
//=================================================reverse a string+++++++++++++++++++++++++++++++++++++++++++++++++++++
//      String data = "the value is string";
//
//        String[] dataa = data.split(" ");
//
//        String reversed ="";
//
//
//            for(int i=0; i<dataa.length; i++)
//            {
//                String WORD= dataa[i];
//
//                char st;
//                String reverse ="";
//                for(int a=0; a<WORD.length(); a++){
//
//                    st=WORD.charAt(a);
//                    reverse=st+reverse;
//                }
//               // System.out.println(reverse);
//                reversed=reversed + reverse+" ";
//            }
//        System.out.println(reversed);

//        String data = "the value is string";
//        String[] dataa = data.split(" ");
//        String reversed =" ";
//
//
//            for(int i=0; i<dataa.length; i++)
//            {
//                StringBuilder main = new StringBuilder(dataa[i]).reverse();
//                reversed = reversed+" "+main;
//            }
//        System.out.println(reversed);
// +++++++++++++++++++++++++++++++++++++++++++++++duplicate char++++++++++++++++++++++++++++++++++++++++++++++++++++++

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("enter the string character");
//        String data = scanner.nextLine();
//
//        String st = data.replaceAll(" ", "");
//        char[] c = st.toCharArray();
//        Map<Character,Integer> Char= new LinkedHashMap<>();
//
//
//        for (Character ct:c) {
//            if (Char.containsKey(ct))
//            {
//                Char.put(ct,Char.get(ct)+1);
//            }else {
//                Char.put(ct,1);
//            }
//        }
//
//        for (Character K:Char.keySet()
//             ) {
//            if(Char.get(K)>1)
//            {
//                System.out.println("the alphabet "+K+":"+Char.get(K));
//            }
//
//
//        }


//        for (Map.Entry<Character,Integer> NOP: Char.entrySet()) {
//            System.out.println(NOP);
        // }
//
//     Scanner scanner = new Scanner(System.in);
//     System.out.println("enter the character of digits");
//     String data=scanner.nextLine();
//
//        String[] da = data.split(" ");
//        Map<String,Integer> DATA= new HashMap<>();
//
//        for (String fo:da) {
//            if(DATA.containsKey(fo)){
//                DATA.put(fo,DATA.get(fo)+1);
//            }else {
//                DATA.put(fo,1);
//            }
//
//
//        }
//        for (Map.Entry<String,Integer> goo: DATA.entrySet()) {
//
//            System.out.println(goo);
//        }
//        for (String DAT: DATA.keySet()) {
//            if (DATA.get(DAT)>1)
//            {
//                System.out.println("the string :"+DAT+" : is repeted "+DATA.get(DAT));
//            }
//
//        }
//???????????????????????????????????????????????string count??????????????????????????????????????????

//       Scanner scanner= new Scanner(System.in);
//        System.out.println("enter the character");
//        String data = scanner.nextLine();
//        String crdata = data.replaceAll(" ", "");
//        char[] Mdata = crdata.toCharArray();
//        Map<Character,Integer> CDATA = new LinkedHashMap<>();
//
//        for (Character FO:Mdata) {
//            if(CDATA.containsKey(FO))
//            {
//                CDATA.put(FO,CDATA.get(FO)+1);
//            }
//            else {
//                CDATA.put(FO,1);
//            }
//        }
//
//        for (Character DATA: CDATA.keySet()) {
//            if (CDATA.get(DATA)>1)
//            {
//                System.out.println("the "+ DATA +" : is repeted "+CDATA.get(DATA));
//            }
//        }

//        for ( Map.Entry<Character,Integer> nap: CDATA.entrySet()) {
//            System.out.println(nap);
//        }


//???????????????????????????????????????????????????????/number of words in the string????????????????????????????????

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("enter the string character");
//        String data=scanner.nextLine();
//         int count=0;
//        String[] splitdata =data.split(" ");
//        for (String SP:splitdata) {
//             count++;
//        }
//        System.out.println("the number of words in the given string is :"+count);


        ///??????? output=a2b2c3d2 for the input given string str= "aabbcccdd"????????????????????
//        Map<Character, Integer> map = new LinkedHashMap<>();
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("enter the input");
//        String data = scanner.nextLine();
//        char[] arr = data.toCharArray();
//
//        for (int i = 0; i < arr.length; i++) {
//            Integer value = map.getOrDefault(arr[i], 0);
//            map.put(arr[i], value + 1);
//        }
//        for (Map.Entry<Character, Integer> nop : map.entrySet()) {
//            System.out.print(nop.toString().replace("=", ""));
//            // System.out.print(nop.getKey() +""+nop.getValue());
//        }
//        data.chars().forEach(x -> map.put((char) x, map.getOrDefault((char) x, 0) + 1));
//
//        map.forEach((ch, count) -> System.out.print(ch + "" + count));

//        Map<Character, Integer> map = new LinkedHashMap<>();
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter the input:");
//        String data = scanner.nextLine();
//
//        // Count character frequencies
//        for (char ch : data.toCharArray()) {
//            map.put(ch, map.getOrDefault(ch, 0) + 1);
//        }
//
//        // Print using forEach with lambda
//        System.out.println("Character Frequencies:");
//        map.forEach((lh, count) -> System.out.print(lh + "" + count));
//
//??????? output=a2b2c3d2 for the input given string str= "aabbcccdd"????????????????????

//********************************=print each leter from twice ********************************************8

//
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("enter the char need to double");
//        String data = scanner.nextLine();
//        List<Character> job = new ArrayList<>();
//
//        StringBuilder rop = new StringBuilder();
//        rop.append()
//
//        //abvr
//        char[] chstring = data.toCharArray();
//        for (char a:chstring) {
//            job.add(a);
//            job.add(a);
//        }
//        for (char G:job) {
//            System.out.print(G);
//        }
//********************************=print each leter from twice ********************************************8


//        PriorityQueue<String> queue= new PriorityQueue<>();
//
//        queue.add("a");
//        queue.add("b");
//        queue.add("c");
//
//        System.out.println(queue);
//
//        LinkedList<Object> list= new LinkedList();
//
//        list.add("s");
//        list.add(56);
//        list.offer(57);
//
//        System.out.println(list);
//
//        Map<Object,Object> map = new LinkedHashMap<>();
//        map.put("UOO",54);
//        map.put(89,"string");
//        map.forEach((lh, count) -> System.out.print(lh + "" + count));

//********************swap 2 strings without useing 3 rd variable ************************************************


//        Scanner scanner = new Scanner(System.in);
//        System.out.println("enter the first string");
//        String firstdata = scanner.nextLine();
//        System.out.println("enter the second data");
//        String seconddata = scanner.nextLine();
//        System.out.println("the first data : "+firstdata);
//        System.out.println("the second data : "+seconddata);
//
//        firstdata = firstdata + seconddata;
//        seconddata=firstdata.substring(0,firstdata.length()-seconddata.length());
//        firstdata=firstdata.substring(seconddata.length());
//        System.out.println("the swaped first data : "+firstdata);
//        System.out.println("the swaped second data : "+seconddata);

//********************swap 2 strings without useing 3 rd variable ************************************************

//********************output separate lowercase and upercase ************************************************

//    Scanner scanner = new Scanner(System.in);
//    System.out.println("enter the combination of big and small char");
//    String mixeddata =scanner.nextLine();
//    List<Character> cap = new ArrayList<>();
//    List<Character> small = new ArrayList<>();
//
//
//        char[] data = mixeddata.toCharArray();
//
//        for (Character a:data) {
//
//            if(Character.isUpperCase(a))
//            {
//                cap.add(a);
//            }else {
//                small.add(a);
//            }
//
//        }
//        StringBuilder fog =new StringBuilder();
//        for (Character gop:cap) {
//            fog.append(gop);
//        }
//
//        String updateddata = fog.toString();
//        System.out.println(updateddata);
//
//
////        System.out.println(kop);
////        small.listIterator().next();
//
//        System.out.println(small);

        //  String smallDate= small.stream().map(String::valueOf).collect(Collectors.joining());
//************************************************ separate the interger and alphabets********************************

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("enter the char with combination of alpha and numaric ");
//        String data = scanner.nextLine();
//
//        char[] chardata = data.toCharArray();
//
//        StringBuilder alpha = new StringBuilder();
//         StringBuilder num = new StringBuilder();
//        for(char d:chardata) {
//          if(Character.isAlphabetic(d)){
//              alpha.append(d);
//          }else if (Character.isDigit(d)){
//              num.append(d);
//          }
//        }
//        System.out.println(alpha);
//        System.out.println(num);
//&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&& input 2300546400 output 2354640000&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&***

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("enter the digit");
//        String data = scanner.nextLine();
//        char[] ch = data.toCharArray();

//        int zeroCount = 0;
//        StringBuilder l = new StringBuilder();
//
//
//        for (Character g : ch) {
//            if (g == '0') {
//                zeroCount++;
//            } else {
//                l.append(g);
//            }
//        }
//        l.append("0".repeat(zeroCount));
//        System.out.println(l);


//        List<Character> finalData = new LinkedList<>();
//        List<Character> zerovalue = new LinkedList<>();
//
//
//
//            for (char s:ch) {
//
//            if(s=='0'){
//                zerovalue.add(s);
//            } else {
//                finalData.add(s);
//
//            }
//        }
//        finalData.addAll(zerovalue);
//
//        StringBuilder ta = new StringBuilder();
//
//        for (char g:finalData) {
//            ta.append(g);
//        }
//        System.out.println(ta);
//**************************************************arrays**************************************************************

//       Integer[] arry ={0,9,2,9,8,7,5,8,5,8};
//
//           Arrays.sort(arry);
//        System.out.println(Arrays.toString(arry));
//        Set<Integer> go = new LinkedHashSet<>(Arrays.asList(arry));
//        int count=0;
//        for (Integer D:go) {
//            System.out.println(D);
//            count++;
//        }
//        System.out.println(count);
//        List<Integer> k = new LinkedList<>(go);
//        System.out.println("the largest element in the arry list :"+k.get(count-2));

//****************************************************************enter the digits*************************************
//         Scanner scanner = new Scanner(System.in);
//        System.out.println("enter the digits");
//        String data = scanner.nextLine();
//        char[] mdata = data.toCharArray();
//
//        StringBuilder al = new StringBuilder();
//        StringBuilder zo = new StringBuilder();
//
//        for (Character d:mdata) {
//
//            if(d=='0')
//            {
//                al.append(d);
//            }else {
//                zo.append(d);
//            }
//        }
//        System.out.println(zo.toString()+al.toString());

//?????????????????????????????????//char count //???????????????????????????????????????????????????????????/
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("ethe");
//        String data = scanner.nextLine();
//
//        char[] p = data.toCharArray();
//
//        for (Character set:p) {
//
//            char tom = Character.toUpperCase(set);
//                   int fog =tom-'A';
//            System.out.print(tom+""+fog);
//        }

//        List hop = new ArrayList();
//        hop.add(5);
//        hop.add("gop");
//        hop.add(1,"don");
//
//        System.out.println(hop);
//
//
//        Iterator it = hop.iterator();
//
//        while (it.hasNext())
//        {
//            System.out.println(it.next());
//        }
//
//        Map<Integer,String> data= new HashMap<>();
//
//        data.put(1,"suu");
//        data.put(23,"last");
//        data.put(4,"huu");
//        data.put(0,"kopp");
//        data.put(9,"noo");
//
//        System.out.println(data.keySet());
//        System.out.println(data.values());
//        System.out.println(data.entrySet());
//
//        for (Map.Entry<Integer,String> fog: data.entrySet()) {
//            System.out.println(fog);
//        }
//
//        for (int d:data.keySet()) {
//            System.out.println(d+" "+data.get(d));
//        }

        //    ??????????????????????????????????????? anagrams???????????????????????????????????????????????????/???

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("enter the first string");
//        String fdata = scanner.nextLine();
//        String lname = scanner.nextLine();
//
//        char[] dataf = fdata.toCharArray();
//        char[] datal = lname.toCharArray();
//
//        Arrays.sort(dataf);
//        Arrays.sort(datal);
//
//        if (Arrays.equals(dataf, datal))
//        {
//            System.out.println("the numbers are anagrams");
//        }else {
//            System.out.println("the numbers are not");
//        }
//////////////////////////////////////////**************8add to array/////////////////////////////////////////////

        //add 5 after 4 and print
//        int[] arry = {2,3,4,5,7,8,9};
//        int data=6;
//        int index=4;
//
//        int[] arry1 = new int[arry.length+1];
//
//        for (int i=0; i<index; i++)
//        {
//            arry1[i]=arry[i];
//        }
//        arry1[index]=data;
//        for (int j=index; j<arry.length; j++)
//        {
//            arry1[j+1]=arry[j];
//        }
//
//        System.out.println(Arrays.toString(arry1));
//        int[] arr = {4,6};
//        int[] arr1 = {5,7};
//
//        int[] arry=new int[arr.length+arr1.length];
//
//        for (int i=0; i<arr.length; i++)
//        {
//            arry[i]=arr[i];
//        }
//        for (int j=0; j<arr1.length; j++)
//        {
//            arry[arr.length+j]=arr1[j];
//        }
//
//        System.out.println(Arrays.toString(arry));


//     Scanner scanner = new Scanner(System.in);
//     int n =scanner.nextInt();
//
//     for (int i=1; i<=n; i++){
//         for (int j=1; j<=n; j++)
//         {
//             System.out.print("*");
//         }
//         System.out.print("\n");
//     }

//       Scanner scanner= new Scanner(System.in);
//        System.out.println("enter the data you want");
//        String data=scanner.nextLine();
//        String mdata = data.replace(" ", "");
//        char[] cdata = mdata.toCharArray();
//        Map<Character,Integer> OGdata = new HashMap<>();
//
//        for (Character rdata:cdata) {
//            if(OGdata.containsKey(rdata)){
//                OGdata.put(rdata, OGdata.get(rdata)+1);
//            }
//            else {
//                OGdata.put(rdata,1);
//            }
//        }
//        for (Character Fdata:OGdata.keySet()) {
//            if (OGdata.get(Fdata)>1) {
//                System.out.println(Fdata + "=" + OGdata.get(Fdata));
//            }
//            }


        String job = "iam";
        String done = "every where";
        System.out.println(job+"\n"+done);
        job=job+done;
        done=job.substring(0,job.length()-done.length());
        job=job.substring(done.length());
        System.out.println(job+"\n"+done);





        int[] arry = {2,3,4,5,7,8,9};
        int data=6;
        int index=4;

        int[] arry1 = new int[arry.length+1];

        for (int i=0; i<index; i++){
            arry1[i]=arry[i];
        }
        arry1[index]=data;
        for (int j=index; j<arry.length; j++)
        {
         arry1[j+1]=arry[j];
        }
        for (int fog:arry1) {
            System.out.print(fog+" ");
        }

        int nu=10;
        int ja=15;
        System.out.println(nu+"\n"+ja);

//        int go=nu;
//        nu=ja;
//        ja=go;
        nu=nu+ja;
        ja=nu-ja;
        nu=nu-ja;

        System.out.println(nu+"\n"+ja);

        int[] arr = {2, 8, 1, 5, 9, 3};

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

         int largest = arr[arr.length-1];
        System.out.println(arr.length);
        System.out.println(largest);


        for(int i=0; i<5; i++)
        {
            for (int j=0; j<i; j++)
            {
                System.out.print("*");
            }
            System.out.println("*");
        }
        int[] arra= {1,2,3,4,5,6};
        int dap=34;
        int n =arra.length;
        int in=arra.length-dap;
        int[] ogarra1 = new int[arra.length];
        int[] ogarraf = new int[arra.length];
        for (int i=in; i<arra.length; i++)
        {
            ogarra1[i]=arra[i];
        }
        for (int kopp:ogarra1) {
            System.out.println("last"+kopp);  //aray with 456
        }
        for (int i=0; i<ogarra1.length-in; i++)
        {
            ogarraf[i]=ogarra1[ogarra1.length-in+i];
        }
        for (int kop:ogarraf) {
            System.out.println("the new array"+kop);
        }
        for (int i=0; i<arra.length-in; i++)
        {
            ogarraf[ogarra1.length-in+i]=arra[i];
        }
        for (int i=0; i<=ogarraf.length; i++)
        {
            System.out.println(ogarraf[i]);
        }
    }
}


