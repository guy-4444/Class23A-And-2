package com.guy.class23a_and_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Activity_First extends AppCompatActivity {

    private static final String SP_KEY_NAME = "SP_KEY_NAME";
    private static final String SP_KEY_SCORE = "SP_KEY_SCORE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // V1
        MySPV1.putInt(Activity_First.this, SP_KEY_SCORE, 100);
        int score = MySPV1.getInt(Activity_First.this, SP_KEY_SCORE, 0);

        // V2
        MySPV2 mySPV2 = new MySPV2(this);
        mySPV2.putInt(SP_KEY_SCORE, 100);
        int score2 = mySPV2.getInt(SP_KEY_SCORE, 0);

        // V3
        int score3 = MySPV3.getInstance().getInt(SP_KEY_SCORE, 0);


        MySignal.getInstance().toast("Hello World");
        MySignal.getInstance().vibrate();
    }

}