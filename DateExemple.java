package ro.sda.java42.datetime.exemple;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class DateExemple {
    public static void main(String[] args) {
        LocalTime time= LocalTime.now();
        System.out.println(time);
        System.out.println(time.plusHours(2));
        System.out.println(time.plusMinutes(10));
        System.out.println(time.plusSeconds(-10));
        LocalTime timeHour=time.withMinute(0).withSecond(0);
        System.out.println("Before: " + time + " / After " + timeHour );

        LocalTime now = LocalTime.now();
        String formattedTime = now.getHour() + ":" + now.getMinute() + ":" + now.getSecond();
        System.out.println(formattedTime);

        System.out.println("====================LocalDate=======================");
        LocalDate localDate = LocalDate.now();
        LocalDate createdDate = LocalDate.of(2022,1,1);
        System.out.println(localDate);
        System.out.println(createdDate);
        System.out.println("Ziua saptamanii: " + localDate.getDayOfWeek());
        System.out.println("Ziua saptamanii: " + createdDate.getDayOfWeek());
        System.out.println("Ziua lunii: " + localDate.getDayOfMonth());
        System.out.println("Ziua anului: " + localDate.getDayOfYear());
        System.out.println("Saptamana anului: " + localDate.getDayOfYear()%7);
        System.out.println(localDate.withDayOfYear(365/2));

        System.out.println("====================LocalDateTime=======================");
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);
        String formatedDate=localDateTime.getYear() + "/" + localDateTime.getMonth() + "/" + localDateTime.getDayOfMonth() +
                " " + localDateTime.getHour() + ":" + localDateTime.getMinute() + ":" + localDateTime.getSecond();
        System.out.println("Data este: " + formatedDate);
        LocalDateTime createdLocalDateTime= LocalDateTime.of(2020, 11,29,20,59,59);
        System.out.println("Created date:" + createdLocalDateTime);

        System.out.println("=================Instant =================");
        Instant instant= Instant.now();
        System.out.println(instant);
        LocalTime localTime = LocalDateTime.ofInstant(instant,ZoneId.of("CET")).toLocalTime();
        System.out.println("CET Time: " + localTime);
        LocalTime localTime2 = LocalDateTime.ofInstant(instant,ZoneId.of("GMT+9")).toLocalTime();
        System.out.println("Tokio Time: " + localTime2);
        LocalTime localTime3 = LocalDateTime.ofInstant(instant,ZoneId.of("GMT-5")).toLocalTime();
        System.out.println("New York Time: " + localTime3);

        System.out.println("===== DURATION and PERIOD");
        LocalDateTime epochTime= LocalDateTime.ofEpochSecond(0,0,ZoneOffset.UTC);
        LocalDateTime nowDuration = LocalDateTime.now();
        System.out.println("Duration:" + Duration.between(epochTime,nowDuration).toMinutes());
        System.out.println("Perioada:" + Period.between(epochTime.toLocalDate(),nowDuration.toLocalDate()).toTotalMonths());

        System.out.println("========== Date display Format");
        LocalDateTime localDateTimeDisplay= LocalDateTime.now();
        System.out.println(localDateTimeDisplay.format(DateTimeFormatter.ISO_WEEK_DATE));
        System.out.println(localDateTimeDisplay.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yy/MMM/D HH:mm:ss");
        System.out.println(localDateTimeDisplay.format(formatter));

    }
}
