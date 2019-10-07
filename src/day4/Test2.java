package day4;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Please input the first time: ");
        String time1 = s.nextLine();

       System.out.println("Please input the second time: ");
        String time2 = s.nextLine();

        //time1 = "0900";
        String hour1Str = time1.substring(0, 2);
        String min1Str = time1.substring(2, 4);

        int hour1 = Integer.parseInt(hour1Str);
        int min1 = Integer.parseInt(min1Str);

        int time1totalminutes = hour1 * 60 + min1;

        String hour2Str = time2.substring(0,2);
        String min2Str = time2.substring(2, 4);

        int hour2 = Integer.parseInt(hour2Str);
        int min2 = Integer.parseInt(min2Str);

        int time2totalminutes = hour2 * 60 + min2;
        System.out.println(time2totalminutes + " ," + time1totalminutes);
        if (time2totalminutes >= time1totalminutes) {
            int totalIntervalMinutes = time2totalminutes - time1totalminutes;
            System.out.print("Total interval mins: " + totalIntervalMinutes);
            System.out.print("Total interval " + (totalIntervalMinutes/60) + " hours" + (totalIntervalMinutes % 60) + "mins ");


        }
        else {
            time2totalminutes = time2totalminutes + 24 * 60;
            System.out.println(time2totalminutes + " ," + time1totalminutes);
            int totalIntervalMinutes = time2totalminutes - time1totalminutes;
            System.out.print("Total interval mins: " + totalIntervalMinutes);
            System.out.print("Total interval " + (totalIntervalMinutes/60) + " hours" + (totalIntervalMinutes % 60) + "mins ");

        }

    }

}
