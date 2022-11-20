package com.guy.class23a_and_2;

import java.util.ArrayList;

public class Playlist {

    private String name = "";
    private ArrayList<Song> songs = new ArrayList<>();

    public Playlist() {}

    public String getName() {
        return name;
    }

    public Playlist setName(String name) {
        this.name = name;
        return this;
    }

    public ArrayList<Song> getSongs() {
        return songs;
    }

    public Playlist setSongs(ArrayList<Song> songs) {
        this.songs = songs;
        return this;
    }
}
