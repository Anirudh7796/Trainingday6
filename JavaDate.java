package com.wiprotrain5;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class JavaDate {
    public static void main(String[] args) {
        // Get the current date and time
        LocalDateTime now = LocalDateTime.now();

        // Create a DateTimeFormatter with the desired pattern
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        // Format the current date and time
        String formattedNow = now.format(formatter);
        System.out.println("Time and date now: " + formattedNow);

        // Get the time after 8 hours
        LocalDateTime after8Hours = now.plusHours(8);
        String timeAfter8Hr = after8Hours.format(formatter);
        System.out.println("After 8 hours: " + timeAfter8Hr);

        // Get the time after 2 week
        LocalDateTime after2Week = now.plusWeeks(2);
        String timeAfter2Week = after2Week.format(formatter);
        System.out.println("After 2 week: " + timeAfter2Week);

        // Get the time after 3 month
        LocalDateTime after3Month = now.plusMonths(3);
        String timeAfter3Month = after3Month.format(formatter);
        System.out.println("After 3 month: " + timeAfter3Month);
    }
}
