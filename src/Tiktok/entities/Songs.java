package Tiktok.entities;

public class Songs extends BaseEntity {
    private String singer ;

    public Songs(int id, String name, String singer) {
        super(id, name);
        this.singer = singer;
    }
}