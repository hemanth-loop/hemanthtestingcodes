package utilities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class ReUseable {


    public String getCurrentDate(){
//        LocalDate today = LocalDate.now();
//        String month= today.format(DateTimeFormatter.ofPattern("MMM-d", Locale.ENGLISH));
//        String data = month.substring(0, 1).toUpperCase() + month.substring(1).toLowerCase();
//        //int day = today.getDayOfMonth();
//        //data+"-"+
//        return month;
        return LocalDate.now().format(DateTimeFormatter.ofPattern("MMM-d", Locale.ENGLISH));
    }
    public String getCurrentMonth(){
        return LocalDate.now().format(DateTimeFormatter.ofPattern("MMM", Locale.ENGLISH));
    }

    public static List<String> getLastThreeMonths() {
        List<String> monthList = new ArrayList<>();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMM", Locale.ENGLISH);

        for (int i = 0; i < 3; i++) {
            LocalDate date = LocalDate.now().minusMonths(i);
            String formattedMonth = date.format(formatter);
            monthList.add(formattedMonth);
        }

        return monthList;
    }
}

