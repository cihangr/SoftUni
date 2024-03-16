package ObjectsAndClasses.AdvertisementMessage;

import java.util.Random;
import java.util.Scanner;

/*
@CIHAN GUR

Write a program that generates random fake advertisement messages to extol some product.
The messages must consist of 4 parts: laudatory phrase + event + author + city.
Use the following predefined parts:

>>>Phrases

"Excellent product."
"Such a great product."
"I always use that product."
"Best product of its category."
"Exceptional product."
"I can’t live without this product."

>>>Events

"Now I feel good."
"I have succeeded with this product."
"Makes miracles. I am happy of the results!"
"I cannot believe but now I feel awesome."
"Try it yourself, I am very satisfied."
"I feel great!"

>>>Authors

"Diana"
"Petya"
"Stella"
"Elena"
"Katya"
"Iva"
"Annie"
"Eva"

>>>Cities

"Burgas"
"Sofia"
"Plovdiv"
"Varna"
"Ruse"
The format of the output message is: "{phrase} {event} {author} – {city}".
As an input, you take the number of messages to be generated. Print each random message on a separate line.
*/
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        Random rd = new Random();
        while (number>0){
            int phrase = rd.nextInt(6)+1;
            int event = rd.nextInt(6)+1;
            int author = rd.nextInt(8)+1;
            int city = rd.nextInt(5)+1;// Phrases (assuming you have an integer variable 'phrase')
            String phraseText;
            switch (phrase) {
                case 1:
                    phraseText = "Excellent product.";
                    break;
                case 2:
                    phraseText = "Such a great product.";
                    break;
                case 3:
                    phraseText = "I always use that product.";
                    break;
                case 4:
                    phraseText = "Best product of its category.";
                    break;
                case 5:
                    phraseText = "Exceptional product.";
                    break;
                case 6:
                    phraseText = "I can’t live without this product.";
                    break;
                default:
                    phraseText = "Invalid phrase";
            }

// Events (assuming you have an integer variable 'event')
            String eventText;
            switch (event) {
                case 1:
                    eventText = "Now I feel good.";
                    break;
                case 2:
                    eventText = "I have succeeded with this product.";
                    break;
                case 3:
                    eventText = "Makes miracles. I am happy of the results!";
                    break;
                case 4:
                    eventText = "I cannot believe but now I feel awesome.";
                    break;
                case 5:
                    eventText = "Try it yourself, I am very satisfied.";
                    break;
                case 6:
                    eventText = "I feel great!";
                    break;
                default:
                    eventText = "Invalid event";
            }

// Authors (assuming you have an integer variable 'author')
            String authorName;
            switch (author) {
                case 1:
                    authorName = "Diana";
                    break;
                case 2:
                    authorName = "Petya";
                    break;
                case 3:
                    authorName = "Stella";
                    break;
                case 4:
                    authorName = "Elena";
                    break;
                case 5:
                    authorName = "Katya";
                    break;
                case 6:
                    authorName = "Iva";
                    break;
                case 7:
                    authorName = "Annie";
                    break;
                case 8:
                    authorName = "Eva";
                    break;
                default:
                    authorName = "Invalid author";
            }

// Cities (assuming you have an integer variable 'city')
            String cityName;
            switch (city) {
                case 1:
                    cityName = "Burgas";
                    break;
                case 2:
                    cityName = "Sofia";
                    break;
                case 3:
                    cityName = "Plovdiv";
                    break;
                case 4:
                    cityName = "Varna";
                    break;
                case 5:
                    cityName = "Ruse";
                    break;
                default:
                    cityName = "Invalid city";
            }

            System.out.printf("%s %s %s %s\n",phraseText,eventText,authorName,cityName);
            number--;
        }
    }
}































