import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;


class Parent {
    void show() {}
}
class Child extends Parent {
    @Override
    void show() {
        System.out.println("Child show1()");
    }

//    @Deprecated

    @SuppressWarnings("Uncheked")
    void run() {
        System.out.println("Child show2()");
    }
}

public class Day18 {



    public static void main(String[] args) {

        Child c1=new Child();
        c1.show();


        c1.run();


//        System.out.println(dateTime);
//        System.out.println((((dateTime.getTime()/1000)/3600)/24)/365);
//        System.out.println(dateTime.getTime());
//        Date dateTime1=new Date();
//        long start=dateTime1.getTime();
//
////        System.out.println(start);
////        for (int i = 0; i <20000 ; i++) {
////            System.out.println(i);
////        }
//        int i=0;
//        while (i<20000){
//            System.out.println(i);
//            i++;
//        }
//
//        Date dateTime2=new Date();
//        long end=dateTime2.getTime();
//
//        System.out.println(start);
//        System.out.println(end);
//
//        System.out.println(end-start);

//        Date d1 = new Date(); // Current date and time
//        System.out.println("Current Date: " + d1);

//        Date d2= new Date(1000000000L);
//        System.out.println(d2);
//        System.out.println(d1.after(d2));
//        System.out.println(d1.before(d2));

//        Calendar c1=Calendar.getInstance();
//        System.out.println(c1);
//        System.out.println(c1.get(Calendar.YEAR));
//        System.out.println(c1.get(Calendar.MONTH)+1);
//        System.out.println(c1.get(Calendar.DAY_OF_MONTH));

//        System.out.println("Day: " + c1.get(Calendar.DAY_OF_MONTH));
//        System.out.println("Hour: " + c1.get(Calendar.HOUR));
//        System.out.println("Minute: " + c1.get(Calendar.MINUTE));
//        System.out.println("Second: " + c1.get(Calendar.SECOND));
//        System.out.println(c1.YEAR);

//        GregorianCalendar gcal = new GregorianCalendar();
//        System.out.println("Year: " + gcal.get(Calendar.YEAR));
//        System.out.println("Month: " + (gcal.get(Calendar.MONTH) + 1));
//        System.out.println("Day: " + gcal.get(Calendar.DAY_OF_MONTH));

//        LocalDate date=LocalDate.now();
//        System.out.println(date);
//        LocalTime time=LocalTime.now();
//        System.out.println(time);
//
//        LocalDateTime dateTime = LocalDateTime.now(); // Current date-time
//        ZonedDateTime zoned = ZonedDateTime.now(); // With time zone
//
//        System.out.println("DateTime: " + dateTime);
//        System.out.println("ZonedDateTime: " + zoned);

//        LocalDate today = LocalDate.now();
//        LocalDate tomorrow = today.plusDays(1); // Add 1 day
//        LocalDate nextMonth = today.plusMonths(1); // Add 1 month
//        LocalDate previousYear = today.minusYears(1); // Subtract 1 year
//        System.out.println("Tomorrow: " + tomorrow);
//        System.out.println("Next Month: " + nextMonth);
//        System.out.println("Previous Year: " + previousYear);

//        LocalDateTime now = LocalDateTime.now();
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d-M-yyyy");
//        System.out.println(now.format(formatter));

    }
}
