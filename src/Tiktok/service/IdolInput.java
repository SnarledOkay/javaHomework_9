package Tiktok.service;

import Tiktok.entities.Follower;
import Tiktok.entities.Idol;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class IdolInput {
    public Idol inputIdol(Scanner scanner){
        System.out.println("Enter information of idols (in order of id , name , email, followers, group): ");
        int id = Integer.parseInt(scanner.nextLine()) ;
        String name = scanner.nextLine() ;
        String email = scanner.nextLine() ;
        ArrayList<Follower> followers = new ArrayList<>() ;
        String group = scanner.nextLine() ;

        return new Idol(id,name,email,followers,group) ;
    }
}