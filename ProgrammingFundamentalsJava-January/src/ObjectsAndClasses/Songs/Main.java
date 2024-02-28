package ObjectsAndClasses.Songs;
/*
@CIHAN GUR

Define a class Song, which holds the following information about songs:
Type List, Name, and Time.
On the first line, you will receive the number of songs - N.
On the next N-lines, you will be receiving data in the following format:
"{typeList}_{name}_{time}".
On the last line, you will receive "Type List" / "all".
Print only the names of the songs which are from that Type List / All songs.
INPUT
3
favourite_DownTown_3:14
favourite_Kiss_4:16
favourite_Smooth Criminal_4:01
favourite
OUTPUT
DownTown
Kiss
Smooth Criminal

INPUT
4
favourite_DownTown_3:14
listenLater_Andalouse_3:24
favourite_In To The Night_3:58
favourite_Live It Up_3:48
listenLater
OUTPUT
Andalouse

INPUT
2
like_Replay_3:15
ban_Photoshop_3:48
all
OUTPUT
Replay
Photoshop
*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfSongs = Integer.parseInt(scanner.nextLine());
        List<Songs> songsList = new ArrayList<>();
        while (numberOfSongs>0){
            String data = scanner.nextLine();
            String[] entry = data.split("_");
            Songs newSongs = new Songs(entry[0],entry[1],entry[2]);
            songsList.add(newSongs);
            numberOfSongs--;
        }
        String demandedList = scanner.nextLine();
        if (demandedList.equals("all")){
            for (Songs songList : songsList){
                System.out.println(songList.getName());
            }
        } else {
            for (Songs songList : songsList){
                if (songList.getType().equals(demandedList)){
                    System.out.println(songList.getName());
                }
            }
        }
    }
}
