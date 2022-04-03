package com.lzh.javase.datetime;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class DateAndTimeDemo {
    public static void main(String[] args) {
        // 指定日期加上指定天数的日期
        LocalDate programmersDay = LocalDate.of(2022, 1, 1).plusDays(255);
        System.out.println(programmersDay);
        // 与指定日期之间的间隔
        long days = programmersDay.until(LocalDate.of(2022, 10, 20), ChronoUnit.DAYS);
        System.out.println(days);
        Period until = programmersDay.until(LocalDate.of(2022, 10, 20));
        System.out.println(until.getDays());
        // 计算指定日期当月的第一个星期五
        // 使用LocalDate
        int value = programmersDay.getDayOfWeek().getValue();
        LocalDate localDate = programmersDay.plusDays(5 - value);
        int tempDays = 0;
        while (localDate.minusDays(tempDays).getMonth() == programmersDay.getMonth()){
            tempDays += 7;
        }
        System.out.println(programmersDay.getYear() + "年" + programmersDay.getMonth().getValue() +
                "月的第一个星期五是" + localDate.minusDays(tempDays-7));
        // 使用日期调整类
        System.out.println(LocalDate.of(programmersDay.getYear(), programmersDay.getMonth(), 1).
                with(TemporalAdjusters.nextOrSame(DayOfWeek.FRIDAY)));
    }
}
