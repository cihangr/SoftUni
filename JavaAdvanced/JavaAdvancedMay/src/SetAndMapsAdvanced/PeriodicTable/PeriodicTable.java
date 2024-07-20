package SetAndMapsAdvanced.PeriodicTable;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/*
@CIHAN GUR

ou are given an n number of chemical compounds. You need to keep track of all chemical elements used in
the compounds and at the end, print all unique ones in ascending order:

>>>>>INPUT
4
Ce O
Mo O Ce
Ee
Mo
>>>>>OUTPUT
Ce Ee Mo O

>>>>>INPUT
3
Ge Ch O Ne
Nb Mo Tc
O Ne
>>>>>OUTPUT
Ch Ge Mo Nb Ne O Tc
*/
public class PeriodicTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<String> elements = new TreeSet<>();
        int n = Integer.parseInt(scanner.nextLine());
        while (n-- >0){
            String compound = scanner.nextLine();
            String[] tokens = compound.split("\\s+");
            for (String el : tokens){
                elements.add(el);
            }
        }
        for (String element : elements){
            System.out.print(element+" ");
        }
    }
}
