package SetAndMapsAdvanced.CitiesContinentAndCountry;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Scanner;

/*
@CIHAN GUR

Write a program to read continents, countries, and their cities put
them on a nested map, and print them in the order of their first appearance.

>>>>>INPUT
9
Europe Bulgaria Sofia
Asia China Beijing
Asia Japan Tokyo
Europe Poland Warsaw
Europe Germany Berlin
Europe Poland Poznan
Europe Bulgaria Plovdiv
Africa Nigeria Abuja
Asia China Shanghai
>>>>>OUTPUT
Europe:
  Bulgaria -> Sofia, Plovdiv
  Poland -> Warsaw, Poznan
  Germany -> Berlin
Asia:
  China -> Beijing, Shanghai
  Japan -> Tokyo
Africa:
  Nigeria -> Abuja

>>>>>INPUT
3
Europe Germany Berlin
Europe Bulgaria Varna
Africa Egypt Cairo
>>>>>OUTPUT
Europe:
  Germany -> Berlin
  Bulgaria -> Varna
Africa:
  Egypt -> Cairo

>>>>>INPUT
8
Africa Somalia Mogadishu
Asia India Mumbai
Asia India Delhi
Europe France Paris
Asia India Nagpur
Europe Germany Hamburg
Europe Poland Gdansk
Europe Germany Danzig
>>>>>OUTPUT
Africa:
  Somalia -> Mogadishu
Asia:
  India -> Mumbai, Delhi, Nagpur
Europe:
  France -> Paris
  Germany -> Hamburg, Danzig
  Poland -> Gdansk

*/
public class CitiesContinentAndCountry {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        LinkedHashMap<String, LinkedHashMap<String, ArrayList<String>>> continentsData = new LinkedHashMap<>();

        while (n-- > 0) {
            String[] tokens = scanner.nextLine().split("\\s+");

            String continent = tokens[0];
            String country = tokens[1];
            String city = tokens[2];

            continentsData.putIfAbsent(continent, new LinkedHashMap<>());
            LinkedHashMap<String, ArrayList<String>> countries = continentsData.get(continent);
            countries.putIfAbsent(country, new ArrayList<>());
            ArrayList<String> cities = countries.get(country);
            cities.add(city);
        }

        for(var entry : continentsData.entrySet()) {
            System.out.println(entry.getKey()+":");
            for(var inner : entry.getValue().entrySet()) {
                String country = inner.getKey();
                String city = String.join(", ", inner.getValue());
                System.out.printf("  %s -> %s%n", country,city);
            }
        }
    }
}
