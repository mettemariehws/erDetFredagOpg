package com.example.demo.services;

import java.time.LocalDate;

public class ErDetFredafUdregner {

    LocalDate dateToday = LocalDate.now();

    private int dayOfTheMonth = dateToday.getDayOfMonth();
    private int month = getMonth();
    private int year = dateToday.getYear()%100;
    private int century = dateToday.getYear()/100;


    public String erDetFredag() {

        int h = ((dayOfTheMonth + 13 * (month + 1)) / (5 + year + (year / 4) + (century / 4) - 2 * century)) % 7;
        int dayoftheweek = ((h + 5) % 7) + 1;

        if(dayoftheweek == 5){
            return "Ja, det er fredag!";
        }else{
            return "Nej, det er ikke fredag :-(";
        }
    }

    public int getMonth() {
        int calculatedMonth = dateToday.getMonthValue();

        if(calculatedMonth == 1){
            return 13;
        }else if (calculatedMonth == 2){
            return 14;
        }else
            return calculatedMonth;
    }
}