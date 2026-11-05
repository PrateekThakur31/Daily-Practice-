package com.demo.practice.DSA;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class CurrentDate {


        public static void main(String[] args) {

            // Get the current date
            LocalDate date = LocalDate.now();

            // Format the date
            DateTimeFormatter formatter =
                    DateTimeFormatter.ofPattern("dd MMM yyyy");

            System.out.println("Current Date: "
                    + date.format(formatter));
        }
    }

