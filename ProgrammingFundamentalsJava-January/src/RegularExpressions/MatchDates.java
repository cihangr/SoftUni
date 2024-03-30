package RegularExpressions;
/*
@CIHAN GUR

Write a program that matches a date in the format "dd{separator}MMM{separator}yyyy".
Use named capturing groups in your regular expression.
Compose the Regular Expression
Every valid date has the following characteristics:
Always starts with two digits, followed by a separator.
After that, it has one uppercase and two lowercase letters (e.g., Jan, Mar).
After that, it has a separator and exactly 4 digits (for the year).
The separator could be either of three things: a period ("."), a hyphen ("-") or a forward-slash ("/").
The separator needs to be the same for the whole date (e.g., 13.03.2016 is valid, 13.03/2016 is NOT).
Use a group back reference to check for this.
You can follow the table below to help with composing your RegEx:
Matching = 13/Jul/1928, 10-Nov-1934, 25.Dec.1937
Not Matching = 01/Jan-1951, 23/sept/1973, 1/Feb/2016
Use named capturing groups for the day, month, and year.
Since this problem requires more complex RegEx, which includes named capturing groups,
we'll take a look at how to construct it:
First off, we don't want anything at the start of our date, so we're going to use a word boundary "\b": 

INPUT
13/Jul/1928, 10-Nov-1934, , 01/Jan-1951,f 25.Dec.1937 23/09/1973, 1/Feb/2016
OUTPUT
Day: 13, Month: Jul, Year: 1928
Day: 10, Month: Nov, Year: 1934
Day: 25, Month: Dec, Year: 1937

INPUT
01/Jan-1951 29/Feb/2024 1/Jan-1951 27-Feb-2007 1/Jan-1951 1/Mar/2016 23/october/197
OUTPUT
Day: 29, Month: Feb, Year: 2024
Day: 27, Month: Feb, Year: 2007
*/
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchDates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String dates = scanner.nextLine();

        String regex ="\\b(?<day>\\d{2})([-./])(?<month>[A-Z][a-z]{2})\\2(?<year>\\d{4})";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(dates);

        while (matcher.find()){
            String day = matcher.group("day");
            String month = matcher.group("month");
            String year = matcher.group("year");
            System.out.printf("Day: %s, Month: %s, Year: %s\n",day,month,year);
        }

    }
}
