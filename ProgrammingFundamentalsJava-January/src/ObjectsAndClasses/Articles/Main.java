package ObjectsAndClasses.Articles;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
@CIHAN GUR

Create an article class with the following properties:
Title – a string
Content – a string
Author – a string

The class should have a constructor and the following methods:
Edit (new content) – change the old content with the new one
ChangeAuthor (new author) – change the author
Rename (new title) – change the title of the article
override ToString – print the article in the following format:
"{title} - {content}: {author}"

Write a program that reads an article in the following format "{title}, {content}, {author}".
On the next line, you will get the number n. On the next n lines, you will get one of the following commands:
"Edit: {new content}"
"ChangeAuthor: {new author}"
"Rename: {new title}".
At the end, print the final article.

INPUT
some title, some content, some author
3
Edit: better content
ChangeAuthor: better author
Rename: better title
OUTPUT
better title - better content: better author

INPUT
Holy Ghost, content, John Sandford
3
ChangeAuthor: Mitch Albom
ChangeAuthor: better author
ChangeAuthor: Kim Heacox
OUTPUT
Holy Ghost - content: Kim Heacox

*/
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String title = input.split(", ")[0];
        String content = input.split(", ")[1];
        String author = input.split(", ")[2];
        Books book = new Books(title,content,author);
        int n = Integer.parseInt(scanner.nextLine());
        while (n>0){
            String command = scanner.nextLine();
            String manipulate = command.split(": ")[0];
            String order = command.split(": ")[1];
            switch (manipulate){
                case "Edit" : book.setContent(order); break;
                case "ChangeAuthor" : book.setAuthor(order); break;
                case "Rename" : book.setTitle(order); break;
            }
            n--;
        }
        System.out.printf("%s - %s: %s",book.getTitle(),book.getContent(),book.getAuthor());

    }
}
