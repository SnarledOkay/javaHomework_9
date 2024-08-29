package Tiktok.service;

import Tiktok.entities.Songs;

import java.util.Scanner;

public class SongInput {
    public Songs songInput(Scanner scanner){
        System.out.println("Input song's information (in order of id, name, singer): ");
        int id = Integer.parseInt(scanner.nextLine()) ;
        String name = scanner.nextLine() ;
        String singer = scanner.nextLine() ;

        return new Songs(id,name,singer) ;
    }
}