package Tiktok.entities;

import java.util.ArrayList;

public class Idol extends BaseEntity{
    private String email ;
    private ArrayList<Follower> followers ;
    private String group ;

    public Idol(int id, String name, String email, ArrayList<Follower> followers, String group) {
        super(id, name);
        this.email = email;
        this.followers = followers;
        this.group = group;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ArrayList<Follower> getFollowers() {
        return followers;
    }

    public void setFollowers(ArrayList<Follower> followers) {
        this.followers = followers;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }
}
