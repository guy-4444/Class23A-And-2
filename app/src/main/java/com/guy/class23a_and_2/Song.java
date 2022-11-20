package com.guy.class23a_and_2;

import java.util.ArrayList;

public class Song {

    private String singer = "";
    private String name = "";
    private long date = 0;
    private boolean liked = false;
    private int duration = 0;
    private long views = 0;
    private float rating = 0.0f;
    private int ratio = 0;
    private ArrayList<String> tags = new ArrayList<>();

    public Song() {}

    public String getSinger() {
        return singer;
    }

    public Song setSinger(String singer) {
        this.singer = singer;
        return this;
    }

    public String getName() {
        return name;
    }

    public Song setName(String name) {
        this.name = name;
        return this;
    }

    public long getDate() {
        return date;
    }

    public Song setDate(long date) {
        this.date = date;
        return this;
    }

    public boolean isLiked() {
        return liked;
    }

    public Song setLiked(boolean liked) {
        this.liked = liked;
        return this;
    }

    public int getDuration() {
        return duration;
    }

    public Song setDuration(int duration) {
        this.duration = duration;
        return this;
    }

    public long getViews() {
        return views;
    }

    public Song setViews(long views) {
        this.views = views;
        return this;
    }

    public float getRating() {
        return rating;
    }

    public Song setRating(float rating) {
        this.rating = rating;
        return this;
    }

    public int getRatio() {
        return ratio;
    }

    public Song setRatio(int ratio) {
        this.ratio = ratio;
        return this;
    }

    public Song addTag(String tag) {
        tags.add(tag);
        return this;
    }

    public ArrayList<String> getTags() {
        return tags;
    }

    public Song setTags(ArrayList<String> tags) {
        this.tags = tags;
        return this;
    }
}
