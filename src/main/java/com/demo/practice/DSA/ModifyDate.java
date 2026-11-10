package com.demo.practice.DSA;

import java.time.LocalDate;

public class ModifyDate {


        public static void main(String[] args) {

            LocalDate date = LocalDate.parse("2026-07-09");

            LocalDate updatedDate = date.withDayOfYear(155);

            System.out.println(updatedDate);
        }
    }

