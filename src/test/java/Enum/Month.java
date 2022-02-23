package Enum;

import java.util.Scanner;

public enum Month {
    JANUARY(25,"Winter"), FEBRUARY(29,"Winter"), MARCH(1,"Spring"),
    APRIL(4,"Spring"), MAY(16,"Spring"), JUNE(2,"Summer"), JULY(11,"Summer"),
    AUGUST(15,"Summer"), SEPTEMBER(1,"Autumn"), OCTOBER(1,"Autumn"),
    NOVEMBER(1,"Autumn"), DECEMBER(7,"Winter");

    int day;
    String season;

    Month(int day, String season) {
        this.day = day;
        this.season = season;

    }

//    public  void nomer1() {
//        String month1;
//        String month_general=Month.JANUARY.toString();
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введіть місяць:");
//        month1 = scanner.next();
//            if (month1==month_general) {
//                System.out.println("January");
//
//            } else if (month1 == "JULY" || month1 == "july") {
//                System.out.println("July");
//            } else {
//            System.out.println("itsn't have");
//            }
//    }






   public boolean have(){

        return day!=0;
   }



    public boolean have2(){

        return season=="Winter";
    }










    public int getDay() {
        return day;
    }

    public String getSeason() {
        return season;
    }
}

