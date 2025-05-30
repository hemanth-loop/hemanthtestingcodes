//import java.util.regex.Matcher;
//import java.util.regex.Pattern;
//
//public class EmailValidator {
//    public static void main(String[] args) {
//        String[] emails = {
//                "gagan@gmail.com",
//                "yoot@don.vom",
//                "dfnsdjf,-@.oop",
//                "kooooopppp.,.,;;'das"
//        };
//
//        String regex = "^[a-zA-Z0-9.+%-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
//        Pattern pattern = Pattern.compile(regex);
//        for (String email:emails) {
//
//            Matcher matcher = pattern.matcher(email);
//            if (matcher.matches()) {
//                System.out.println(email+": the email is valid email");
//            } else {
//                System.out.println(email+" the invalid email");
//            }
//        }
//    }
//}
