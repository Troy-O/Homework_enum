/*
 * Copyright (c) 1994, 2022, My company and/or its affiliates. All rights reserved.
 * My company PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package Enum;

import java.util.Scanner;
/**This class created for did homework
 */
public class Main {
    public static void main(String[] args) {
        Month month1 = Month.JANUARY;



        //course for homework
        //this course do Вивести всі місяці які мають таку саму кількість днів.
        //Вивести на екран всі місяці які мають меншу кількість днів.
        //Вивести на екран всі місяці які мають більшу кількість днів.
        // 3 4 5
//        for (Month month  : Month.values()) {
//          if (month.day==31){
//              System.out.println("Who are month have 31 day?:"+" "+month);
//          }else if(month.day==30){
//              System.out.println("Who are month have 30 day?"+" "+month);
//          }else if(month.day==29){
//              System.out.println("Who are month have 29 day?"+" "+month);
//          }else if (month.day==28){
//              System.out.println("Who are month have 28 day?"+" "+month);
//          }else{
//              System.out.println("!!!");
//          }
//
//
//        }
//

        //course for homework
        //this course do Вивести на екран всі місяці які мають парну кількість днів.
        //Вивести на екран всі місяці які мають непарну кількість днів.
        // 8 9
//        for (Month month : Month.values()) {
//            if (month.day%2==0){
//                System.out.println("Month have couple "+month);
//            }else {
//                System.out.println("Month arent have couple "+month);
//            }
//        }


        //6
//        Season season=Season.SUMMER;
//        System.out.println(season.ordinal());
        //7
//         Season season=Season.SPRING;
//        System.out.println(season.ordinal());
        //2 hom
//        for (Month month2 : Month.values()) {
//            if (month2.have2()){
//                System.out.println(month2);
//
//            }
//        }


        //i do here Перевірити чи є такий місяць (місяць вводимо з консолі, передбачити, щоб регістр
        //букв був не важливим ).
//        //1
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter the month: ");
//        String month_scan = scanner.next();
//
//        for (Month m : Month.values()) {
//            if (month_scan.equalsIgnoreCase(m.name())) {
//                System.out.println("YEA");
//                System.out.println(m.name());
//
//            }
//
//
//        }
        //this code do
        // Вивести на екран чи введений з консолі місяць має парну кількість днів.
        //
        //10
//        Scanner scanner=new Scanner(System.in);
//        System.out.println("Введіть місяць:");
//        String av= scanner.next();
//        for (Month month : Month.values()) {
//        if (av.equalsIgnoreCase(month.name())){
//            if (month.day%2==0){
//                System.out.println("парна кількість");
//            }else{
//                System.out.println("непарна кількість");
//            }
//        }else{
//            System.out.println("!!!");
//        }
//
//        }


    }
}


