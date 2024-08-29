package RatingBattleManagement;

import RatingBattleManagement.entities.Characters;
import RatingBattleManagement.entities.Teams;
import RatingBattleManagement.service.CharacterInput;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;
        ArrayList<Characters> skt = new ArrayList<>() ;
        ArrayList<Characters> g2 = new ArrayList<>() ;
        CharacterInput characterInput = new CharacterInput() ;
        System.out.println("Enter information of team SKT: ");
        for(int i = 0 ; i < 5 ; i++){
            System.out.println("Enter information of member " + (i+1) + ":");
            Characters characters = characterInput.inputCharacter(scanner) ;
            skt.add(characters) ;
        }
        System.out.println();
        System.out.println("Enter information of team G2: ");
        for(int i = 0 ; i < 5 ; i++){
            System.out.println("Enter information of member " + (i+1) + ":");
            Characters characters = characterInput.inputCharacter(scanner) ;
            g2.add(characters) ;
        }

        System.out.println("Information of team SKT: ");
        for(int i = 0 ; i < 5 ; i++){
            System.out.println("Member " + (i+1) + ":");
            System.out.println(skt.get(i));
            System.out.println();
        }
        System.out.println();
        System.out.println("Information of team G2: ");
        for(int i = 0 ; i < 5 ; i++){
            System.out.println("Member " + (i+1) + ":");
            System.out.println(g2.get(i));
            System.out.println();
        }
    }
}