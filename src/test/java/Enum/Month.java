/*
 * Copyright (c) 1994, 2022, My company and/or its affiliates. All rights reserved.
 * My company PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

package Enum;

import java.util.Scanner;
/**This class created for did homework
 */
public enum Month {
    JANUARY(25,"Winter"), FEBRUARY(29,"Winter"), MARCH(1,"Spring"),
    APRIL(4,"Spring"), MAY(16,"Spring"), JUNE(2,"Summer"), JULY(11,"Summer"),
    AUGUST(15,"Summer"), SEPTEMBER(1,"Autumn"), OCTOBER(1,"Autumn"),
    NOVEMBER(1,"Autumn"), DECEMBER(7,"Winter");


    int day;
    String season;


    //constructor
    Month(int day, String season) {
        this.day = day;
        this.season = season;

    }








   public boolean have(){

        return day!=0;
   }


    //method
    //created for used in method(class main)
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

