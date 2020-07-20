package com.json;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class MainClass {
    public static void main(String[] args) throws IOException, FileNotFoundException {

        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.registerTypeAdapter(LocalDate.class, new LocalDateDeserializer());
        Gson gson = gsonBuilder.setPrettyPrinting().create();


        List<Company> companyList = new ArrayList<>();
        companyList = gson.fromJson(new FileReader(new File("test (дз по Java 8).json")),
                new TypeToken<List<Company>>() {
                }.getType());

        companyList.stream().forEach(a -> System.out.println("Название компании - " + a.getName_short() + "," //  Выводит все имеющиеся компании в формате «Краткое название» – «Дата основания 17/01/98»;
                + " Дата основания - " + a.getEgrul_date().format(DateTimeFormatter.ofPattern("dd/MM/yy")))); // 1 пункт ДЗ

        System.out.println();
        System.out.println();

        companyList.forEach(a -> a.getSecurities().stream().filter(b -> b.getDate_to().isBefore(LocalDate.now())) //Выводит все ценные бумаги  - их код, дату истечения и полное название организации-владельца.
                .forEach(c -> System.out.println("Код - " + c.getCode() + "," + " Дата истечения - " + c.getDate_to() + "," + //которые просрочены на текущий день
                        " Название организации - " + a.getName_full() + "," + " Владелец - " + a.getFio_head()))); // 2 пункт ДЗ

        System.out.println("Всего бумаг: " + companyList.stream().flatMap(x -> x.getSecurities(). // Количетсво ценных бумаг
                stream().filter(a -> a.getDate_to().isBefore(LocalDate.now()))).count());


        System.out.println();
        System.out.println();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); // При вводе даты, выводит организации, которое были основанны после введенной даты
        String file = reader.readLine();                                                  // Выводит их название и дату создания // 3 пункт ДЗ
        DateTimeFormatter formatter = new DateTimeFormatterBuilder()
                .appendOptional(DateTimeFormatter.ofPattern("dd.MM.yy"))
                .appendOptional(DateTimeFormatter.ofPattern("dd/MM/yyyy"))
                .appendOptional(DateTimeFormatter.ofPattern("dd/MM/yy"))
                .toFormatter();
        LocalDate date = LocalDate.parse(file, formatter);
        companyList.stream().filter(a -> a.getEgrul_date().isAfter(date)).
                forEach(b -> System.out.println("Организация - " + b.getName_full() + "," + " Дата создания" + b.getEgrul_date()));

        System.out.println();
        System.out.println();

        String file1 = reader.readLine(); //При вводе кода валюты, выводит Id валюты и коды ценных бумаг, которые используют данную валюту
        System.out.println("Вы ввели  код валюты - " + file1);
        companyList.forEach(a -> a.getSecurities().stream().filter(b -> b.getCurrency().getCode().equals(file1))
                .forEach(c -> System.out.println("Id валюты - " + c.getId() + "," + " Код ценных бумаг - " + c.getCode())));

    }
}
