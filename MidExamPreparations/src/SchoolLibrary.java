import java.util.*;
import java.util.stream.Collectors;

/*
@CIHAN GUR

Your task is to do an online book library.
On the first line, you will receive a string representing a shelf with booksin the library.
Every book is separated with "&".
 On the next lines until the "Done" command, you will be receiving the commands separated with " | ":
"Add Book | {book name}":
Add the book in the first place on the shelf.
If the book is already present on the shelf, ignore the command.
"Take Book | {book name}":
Remove the book with the given name only if the book is on the shelf.
Otherwise, ignore this command.
"Swap Books | {book1} | {book2}":
If both books are on the shelf, swap their places.
If at least one is missing, ignore the command.
"Insert Book | {book name}":
Add the given book at the end of the shelf.
If the book is already present on the shelf, ignore the command.
"Check Book | {index}":
Print the name of the book, which is at the given index.
If the index is invalid, ignore the command.
Input
On the 1st line, you will receive a string representing a shelf with books in the library, separated by "&".
On the following lines, until you receive "Done", you will be receiving commands in the format described above.
Output
Print the collection of books joined by ", ":
"{firstBook}, {secondBook}, … {lastBook}"
Constraints
You won't receive duplicate book names in the initial list of books.
INPUT
Don Quixote&The Great Gatsby&Moby Dick
Add Book | Ulysses
Take Book | Don Quixote
Insert Book | Alice's Adventures in Wonderland
Done
OUTPUT
Ulysses, The Great Gatsby, Moby Dick, Alice's Adventures in Wonderland
INPUT
Anna Karenina&Heart of Darkness&Catch-22&The Stranger
Add Book | Catch-22
Swap Books | Anna Karenina | Catch-22
Take Book | David Copperfield
Done
OUTPUT
Catch-22, Heart of Darkness, Anna Karenina, The Stranger
INPUT
War and Peace&Hamlet&Ulysses&Madame Bovary
Check Book | 2
Swap Books | Don Quixote | Ulysses
Done
OUTPUT
Ulysses
War and Peace, Hamlet, Ulysses, Madame Bovary
*/
public class SchoolLibrary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> lists = Arrays.stream(scanner.nextLine().split("&")).collect(Collectors.toList());
        List<String> books = new ArrayList<>();
        for (String list : lists){
            list = list.trim();
            books.add(list);
        }
        String command = scanner.nextLine();
        while(!command.equals("Done")){
            if(command.contains("Add Book")){
                String bookName = command.split("\\|")[1].trim();
                if (!books.contains(bookName)) {
                    books.add(0, bookName);
                }
            } else if (command.contains("Take Book")){
                String bookName = command.split("\\|")[1].trim();
                books.remove(bookName);

            } else if (command.contains("Swap Book")) {
                String book1 = command.split("\\|")[1].trim();
                String book2 = command.split("\\|")[2].trim();
                if (books.contains(book1) && books.contains(book2)){
                    int book1Index = books.indexOf(book1);
                    int book2Index = books.indexOf(book2);
                    if (book1Index>book2Index) {
                        books.remove(book1);
                        books.remove(book2);
                        books.add(book2Index, book1);
                        books.add(book1Index, book2);
                    }
                    if (book1Index<book2Index) {
                        books.remove(book2);
                        books.remove(book1);
                        books.add(book1Index, book2);
                        books.add(book2Index, book1);
                    }
                }
            } else if (command.contains("Insert Book")){
                String bookName = command.split("\\|")[1].trim();
                if (!books.contains(bookName)){
                    books.add(bookName);
                }
            } else if (command.contains("Check Book")){
                int index = Integer.parseInt(command.split("\\|")[1].trim());
                if (index>=0 && index<=books.size()-1){
                    System.out.println(books.get(index));
                }
            }


            command = scanner.nextLine();
        }
        System.out.println(books.toString()
                .replace("[","")
                .replace("]","")
                .trim());
    }
}
