package MidExamPrep;

import java.util.Scanner;

/*
@CIHAN GUR

he Burger Bus travels around the country and serves delicious burgers.
You need to help the owner keep track of his
income and expenses along the way.
First, you will receive the number of cities the bus has visited.
Then for every city, you will receive:
the name of the city
how much money the owner earned
owner's expenses
Every 3rd (third) city the bus visits, the owner organizes a special event
to ensure a true "Burger Bus" experience, spending an additional 50% over costs.
In every 5th (fifth) city, it is raining, and the owner losses 10% of the money
he earned. In a rainy city, there is no possibility to organize a special event.
You have to calculate the owner's profit for each city and his total profit from
the tour. Profit is calculated by deducting the expenses from the income.
Input
The input will consist of:
Number of cities – integer in the range [1…15]
For each city, you will receive the following information:
name of the city - string
owner's income - a real number in the range [0.0…10 000.0]
owner's expenses - a real number in the range [0.0…10 000.0]
The input will always be in the correct format.
Output
For every city, you need to print the following message:
"In {cityName} Burger Bus earned {profit} leva."
At the end of the tour, print:
"Burger Bus total profit: {totalProfit} leva."
NOTE: The profit and the total profit should be formatted to the 2nd decimal place.
INPUT
3
Sofia
895.67
213.50
Plovdiv
2563.20
890.26
Burgas
2360.55
600.00
OUTPUT
In Sofia Burger Bus earned 682.17 leva.
In Plovdiv Burger Bus earned 1672.94 leva.
In Burgas Burger Bus earned 1460.55 leva.
Burger Bus total profit: 3815.66 leva.

INPUT
5
Lille
2226.00
1200.60
Rennes
6320.60
5460.20
Reims
600.20
452.32
Bordeaux
6925.30
2650.40
Montpellier
680.50
290.20
OUTPUT
In Lille Burger Bus earned 1025.40 leva.
In Rennes Burger Bus earned 860.40 leva.
In Reims Burger Bus earned -78.28 leva.
In Bordeaux Burger Bus earned 4274.90 leva.
In Montpellier Burger Bus earned 322.25 leva.
Burger Bus total profit: 6404.67 leva.
*/
public class BurgerBus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfCities = Integer.parseInt(scanner.nextLine());
        double totalEarnings=0, totalExpenses=0;
        int travel=1;
        while (travel<=numberOfCities){
            String city = scanner.nextLine();
            double earning = Double.parseDouble(scanner.nextLine());
            //raining and %10 extra loss from earning
            if (travel%5==0){
                earning=0.9*earning;
            }
            double expenses = Double.parseDouble(scanner.nextLine());
            //extra expenses %50
            if (travel%3==0 && travel%5!=0){
                expenses=1.5*expenses;
            }
            totalExpenses+=expenses;
            totalEarnings+=earning;

            System.out.printf("In %s Burger Bus earned %.2f leva.\n",city,(earning-expenses));
            travel++;
        }
        System.out.printf("Burger Bus total profit: %.2f leva.\n",(totalEarnings-totalExpenses));
    }
}
