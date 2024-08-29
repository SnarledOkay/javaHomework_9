package Tiktok.service;

import Tiktok.entities.Follower;

import java.util.Scanner;

public class FollowerInput {
    public Follower inputFollower(Scanner scanner){
        System.out.println("Enter follower's info (in order of id,name,email,number of likes): ");
        int id = Integer.parseInt(scanner.nextLine()) ;
        String name = scanner.nextLine() ;
        String email = scanner.nextLine() ;
        int numberOfLike = Integer.parseInt(scanner.nextLine()) ;

        return new Follower(id,name,email,numberOfLike) ;
    }
}