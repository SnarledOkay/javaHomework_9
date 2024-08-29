package Tiktok.entities;

public class Follower extends BaseEntity{
    private String email ;
    private int numberOfLike ;

    public Follower(int id, String name, String email, int numberOfLike) {
        super(id, name);
        this.email = email;
        this.numberOfLike = numberOfLike;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getNumberOfLike() {
        return numberOfLike;
    }

    public void setNumberOfLike(int numberOfLike) {
        this.numberOfLike = numberOfLike;
    }
}
