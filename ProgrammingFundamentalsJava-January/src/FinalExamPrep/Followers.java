package FinalExamPrep;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

/*
@CIHAN GUR

Create a program that keeps the information about Jane's Facebook followers, their likes, and comments.
Keep a record of the followers, each with the count of likes and comments Jane has received from them.
You will be receiving lines with commands until you receive the "Log out" command.  There are four
possible commands:
"New follower: {username}":
Add the username to your records (with 0 likes and 0 comments).
If a person with the given username already exists, ignore the line.
"Like: {username}: {count}":
If the username doesn't exist, add it to your records with the given count of likes.
If the username exists, increase the count of likes with the given count.
"Comment: {username}":
If the username doesn't exist, add it to your records with 1 comment.
If the username exists, increase the count of comments with 1.
"Blocked: {username}":
Delete all records of the given username.
If it doesn't exist, print: "{Username} doesn't exist."
In the end, you have to print the count of followers, each follower with their likes and comments
(the sum of likes and comments):
"{count} followers"
{username}: {likes+comments}
{username}: {likes+comments}
…
{username}: {likes+comments}"
Input
You will be receiving lines until you receive the "Log out" command.
The input will always be valid.
Output
Print the users with their likes in the format described above.

INPUT
New follower: George
Like: George: 5
New follower: George
Log out
OUTPUT
1 followers
George: 5

INPUT
Like: Katy: 3
Comment: Katy
New follower: Bob
Blocked: Bob
New follower: Amy
Like: Amy: 4
Log out
OUTPUT
2 followers
Katy: 4
Amy: 4

INPUT
Blocked: Amy
Comment: Amy
New follower: Amy
Like: Tom: 5
Like: Ellie: 5
Log out
OUTPUT
Amy doesn't exist.
3 followers
Amy: 1
Tom: 5
Ellie: 5

*/
public class Followers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String command = scanner.nextLine();
        Map<String, Integer> likesMap = new LinkedHashMap<>();
        Map<String, Integer> commentsMap = new LinkedHashMap<>();
        while(!command.equals("Log out")){
            String type = command.split(": ")[0];
            String username = command.split(": ")[1];
            switch(type){
                case "New follower" : //"New follower: {username}":
                    if (!likesMap.containsKey(username)){
                        likesMap.put(username,0);
                        commentsMap.put(username,0);
                    }
                break;
                case "Like" : //"Like: {username}: {LikeCounts}":
                    int LikeCounts = Integer.parseInt(command.split(" ")[2]);
                    if (!likesMap.containsKey(username)){
                        likesMap.put(username,LikeCounts);
                        commentsMap.put(username,0);
                    } else {
                        int currentLikes = likesMap.get(username);
                        likesMap.put(username,currentLikes+LikeCounts);
                    }
                break;
                case "Comment" : //"Comment: {username}":
                    if (!commentsMap.containsKey(username)){
                        commentsMap.put(username,1);
                        likesMap.put(username,0);
                    } else {
                        int currentComments = commentsMap.get(username);
                        commentsMap.put(username,currentComments+1);
                    }
                break;
                case "Blocked" : //"Blocked: {username}":
                    if (likesMap.containsKey(username)){
                        likesMap.remove(username);
                        commentsMap.remove(username);
                    } else {
                        System.out.println(username + " doesn't exist.");
                    }
                    break;
            }
            command = scanner.nextLine();
        }
        /*
        "{count} followers"
        {username}: {likes+comments}
        {username}: {likes+comments}
        …
        {username}: {likes+comments}"
         */
        System.out.println(likesMap.size()+" followers");
        likesMap.entrySet().forEach(entry ->
                        System.out.println(entry.getKey()+": "+(entry.getValue()+commentsMap.get(entry.getKey())))
                );
    }
}
