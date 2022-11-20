package com.guy.class23a_and_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.gson.Gson;

public class Activity_Second extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);



        Playlist playlist = new Playlist();
        playlist.setName("Morning Chill");

        playlist.getSongs().add(new Song()
                        .setSinger("שלומי שבן וחוה אלברשטיין")
                        .setName("תרגיל בהתעוררות")
                        .setDate(System.currentTimeMillis() / 1000)
                        .setDuration(244)
                        .setLiked(true)
                        .setViews(2_700_000)
                .addTag("הלם קרב")
                .addTag("ישראלי")
                .addTag("דואט")
        );

        playlist.getSongs().add(new Song()
                        .setSinger("Animal Songs")
                        .setName("Baby Shark")
                        .setDuration(320)
                        .setLiked(false)
                        .setViews(12_600_000)
                .addTag("baby")
                .addTag("children")
                .addTag("animation")
        );


        //String json = new Gson().toJson(playlist);


        String json2 = "{\"name\":\"Morning Chill\",\"songs\":[{\"date\":1668969729,\"duration\":244,\"liked\":true,\"disliked\":1000,\"ratio\":2.5,\"name\":\"תרגיל בהתעוררות\",\"rating\":0,\"singer\":\"שלומי שבן וחוה אלברשטיין\",\"tags\":[\"הלם קרב\",\"ישראלי\",\"דואט\"],\"views\":2700000},{\"date\":0,\"duration\":320,\"liked\":false,\"name\":\"Baby Shark\",\"rating\":0,\"singer\":\"Animal Songs\",\"tags\":[\"baby\",\"children\",\"animation\"],\"views\":12600000}]}";
        Playlist playlist2 = new Gson().fromJson(json2, Playlist.class);
        int x = 0;

    }
}