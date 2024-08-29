package Tiktok.entities;

import java.util.List;

public class TikTok {
    private List<Idol> idols ;
    private List<Songs> songs ;

    public TikTok(List<Idol> idols, List<Songs> songs) {
        this.idols = idols;
        this.songs = songs;
    }

    public List<Idol> getIdols() {
        return idols;
    }

    public void setIdols(List<Idol> idols) {
        this.idols = idols;
    }

    public List<Songs> getSongs() {
        return songs;
    }

    public void setSongs(List<Songs> songs) {
        this.songs = songs;
    }
}