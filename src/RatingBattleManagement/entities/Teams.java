package RatingBattleManagement.entities;

import java.util.ArrayList;

public class Teams {
    private ArrayList<Characters> team ;

    public Teams(ArrayList<Characters> team) {
        this.team = team;
    }

    public ArrayList<Characters> getTeam() {
        return team;
    }

    public void setTeam(ArrayList<Characters> team) {
        this.team = team;
    }
}