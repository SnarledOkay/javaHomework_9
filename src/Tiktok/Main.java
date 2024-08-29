package Tiktok;

import Tiktok.entities.Follower;
import Tiktok.entities.Idol;
import Tiktok.entities.Songs;
import Tiktok.entities.TikTok;
import Tiktok.service.FollowerInput;
import Tiktok.service.IdolInput;
import Tiktok.service.SongInput;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;
        ArrayList<Follower> followers = new ArrayList<>() ;
        System.out.println("Enter number of idols and songs: ");
        int idol = Integer.parseInt(scanner.nextLine()) ;
        int song = Integer.parseInt(scanner.nextLine()) ;
        ArrayList<Idol> idols = new ArrayList<>() ;
        ArrayList<Songs> songs = new ArrayList<>() ;
        FollowerInput followerInput = new FollowerInput() ;
        SongInput songInput = new SongInput() ;
        IdolInput idolInput = new IdolInput() ;
        for(int i = 0 ; i < song ; i++){
            System.out.println("Enter info of song " + (i+1) + ":");
            Songs track = songInput.songInput(scanner) ;
            songs.add(track) ;
        }
        for(int i = 0 ; i < idol ; i++){
            System.out.println("Enter info of idol " + (i+1) + ":");
            int id = Integer.parseInt(scanner.nextLine());
            String name = scanner.nextLine() ;
            String email = scanner.nextLine();
            String group = scanner.nextLine() ;
            ArrayList<Follower> listFollower = new ArrayList<>() ;
            int numberOfFollower = Integer.parseInt(scanner.nextLine()) ;
            for(int j = 0 ; j < numberOfFollower ; j++){
                Follower person = followerInput.inputFollower(scanner) ;
                listFollower.add(person) ;
            }
            idols.add(new Idol(id,name,email,listFollower,group)) ;
        }

        TikTok tikTok = new TikTok(idols,songs) ;
//        Đoạn này e k biết in ra ntn cho nhìn hợp lý :(
    }
}
