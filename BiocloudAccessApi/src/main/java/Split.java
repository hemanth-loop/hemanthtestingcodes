import java.util.*;
import java.util.stream.Collectors;


public class Split {

    public static void main(String[] args) {

        //int[] data = new HashMap<>();


        String s1 = "I am hemanth,and i am from tumkur,with fogg";

        /// String s2 = s1 != null ? "Girish" : "Hemanth";

        //System.out.println(s2);

        String[] don = s1.split(",");


        //for (String item : don) {
        //   String[] Words = item.split(" ");
        // }
        //   for (int i = 0; i < Words.length; i++) {
        //     Words[i] = Words[i].toLowerCase();
        // }


        //  Stream<String> adv = Arrays.stream(Words);


        //  List<String> list1 = adv.distinct().collect(Collectors.toList());
        //  System.out.println(list1);
        //forEach(s -> System.out.println(s));

        ArrayList<Integer> list = new ArrayList<>();
        list.add(20);
        list.add(30);
        list.add(10);
        list.add(20);

        Collections.sort(list, Collections.reverseOrder());


        Comparator<Integer> com = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return 0;
            }
        };


        System.out.println("sorted is ->" + list);

        Set<Integer> set1 = new TreeSet<>();
        set1.addAll(list);

        //System.out.println( "Output is ->" + set1);

        Iterator<Integer> itr = list.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        // list.stream().distinct().forEach(s -> System.out.println(s));
        List<Integer> list2 = list.stream().distinct().collect(Collectors.toList());
        System.out.println(list2);
        //list.stream().filter(integer-> integer>10).forEach(s -> System.out.println(s));

        //list.stream().

//            for (String word : Words) {
//                String word1 = word.toLowerCase();


        // System.out.println(word);
//                  if (!data.containsKey(word)){
//                      data.put(word,1);
//                  }else{
//                      data.put(word,data.get(word)+1);
//                  }
        //data.put(word1,(data.getOrDefault(word1,0))+1);

        //  Integer str = !data.containsKey(word1) ? data.put(word, 1) : data.put(word, data.get(word) + 1);

//                data.computeIfAbsent(word1, s -> 0);
//                data.computeIfPresent(word1, (s, integer) -> data.get(s) + 1);
//

        //}
        //System.out.println(data);

        List<String> xpath = new LinkedList<>();
        xpath.add("english");
        xpath.add("tony");
        xpath.add("moon");

        for (String click : xpath) {

            System.out.println("the xpath" + click);

        }

        int[] arr = {0, 20, 40, 50, 20};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));


//             Set <Integer> nop= new LinkedHashSet<>();
//                int no = 0;
//                for (int top:arr) {
//                    if (top > no) {
//                        no = top;
//                    }
//                }
//                System.out.println("the secondlargestnumber" + no);


        int[] lom = {1, 98, 63, 45, 3, 2, 2, 1};
        Integer[] klll = Arrays.stream(lom).boxed().toArray(Integer[]::new);
        Arrays.sort(klll, Collections.reverseOrder());
        Set<Integer> dta = new LinkedHashSet<>(Arrays.asList(klll));
        System.out.println("the map data" + dta);
        List<Integer> listdata = new ArrayList<>(dta);
        System.out.println(listdata.get(1));


        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the first number");
        int thenum = scanner.nextInt();
        int divided = thenum / 2;
        System.out.println(divided);
        if (thenum % 2 == 0) {
            System.out.println("the number is even");
        } else {
            System.out.println("the number is odd");
        }


        Integer[] joo = {1, 3, 5,67,34,6, 7};
        List<Integer> fog = new ArrayList<>(Arrays.asList(joo));
        Collections.sort(fog);

        System.out.println("the sort data"+fog);
       // for (Integer dota:fog) {
           // System.out.println(dota);

       // }


//            Arrays.sort(aryy);
//            String pom =Arrays.toString(aryy);
//            System.out.println(pom);
//            for (int fog:aryy) {
//                   dta.add(fog);
//            }
        // System.out.println(dta);




    }
}
