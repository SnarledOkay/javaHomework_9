package RatingBattleManagement.service;

import RatingBattleManagement.entities.Characters;

import java.util.Scanner;

public class CharacterInput {
    public Characters inputCharacter(Scanner scanner){
        String name = scanner.nextLine() ;
        String position = scanner.nextLine();

        return new Characters(name,position);
    }
}