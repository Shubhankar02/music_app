package com.londonappbrewery.xylophonepm;

import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    // Helpful Constants
    private final int NR_OF_SIMULTANEOUS_SOUNDS = 7;
    private final float LEFT_VOLUME = 1.0f;
    private final float RIGHT_VOLUME = 1.0f;
    private final int NO_LOOP = 0;
    private final int PRIORITY = 0;
    private final float NORMAL_PLAY_RATE = 1.0f;

    // TODO: Add member variables here
    private SoundPool mSoundpool;
    private int mCSoundId;
    private int mDSoundId;
    private int mESoundId;
    private int mFSoundId;
    private int mGSoundId;
    private int mASoundId;
    private int mBSoundId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // TODO: Create a new SoundPool
        mSoundpool = new SoundPool(NR_OF_SIMULTANEOUS_SOUNDS, AudioManager.STREAM_MUSIC, 0);


        // TODO: Load and get the IDs to identify the sounds
        mCSoundId = mSoundpool.load(getApplicationContext(), R.raw.note1_c, 1);
        mDSoundId = mSoundpool.load(getApplicationContext(), R.raw.note2_d, 1);
        mESoundId = mSoundpool.load(getApplicationContext(), R.raw.note3_e, 1);
        mFSoundId = mSoundpool.load(getApplicationContext(), R.raw.note4_f, 1);
        mGSoundId = mSoundpool.load(getApplicationContext(), R.raw.note5_g, 1);
        mASoundId = mSoundpool.load(getApplicationContext(), R.raw.note6_a, 1);
        mBSoundId = mSoundpool.load(getApplicationContext(), R.raw.note7_b, 1);

    }

    // TODO: Add the play methods triggered by the buttons
    public void playC(View view){
        Log.d("Xylophone", "Red button is clicked");
        mSoundpool.play(mCSoundId, LEFT_VOLUME, RIGHT_VOLUME, PRIORITY,NO_LOOP, NORMAL_PLAY_RATE);
    }

    public void playD(View view){
        Log.d("Xylophone", "orange button is clicked");
        mSoundpool.play(mDSoundId, LEFT_VOLUME, RIGHT_VOLUME, PRIORITY,NO_LOOP, NORMAL_PLAY_RATE);
    }

    public void playE(View view){
        Log.d("Xylophone", "Yellow button is clicked");
        mSoundpool.play(mESoundId, LEFT_VOLUME, RIGHT_VOLUME, PRIORITY,NO_LOOP, NORMAL_PLAY_RATE);
    }

    public void playF(View view){
        Log.d("Xylophone", "Green button is clicked");
        mSoundpool.play(mFSoundId, LEFT_VOLUME, RIGHT_VOLUME, PRIORITY,NO_LOOP, NORMAL_PLAY_RATE);
    }

    public void playG(View view){
        Log.d("Xylophone", "LightGreen button is clicked");
        mSoundpool.play(mGSoundId, LEFT_VOLUME, RIGHT_VOLUME, PRIORITY,NO_LOOP, NORMAL_PLAY_RATE);
    }

    public void playA(View view){
        Log.d("Xylophone", "Blue button is clicked");
        mSoundpool.play(mASoundId, LEFT_VOLUME, RIGHT_VOLUME, PRIORITY,NO_LOOP, NORMAL_PLAY_RATE);
    }

    public void playB(View view){
        Log.d("Xylophone", "Purple button is clicked");
        mSoundpool.play(mBSoundId, LEFT_VOLUME, RIGHT_VOLUME, PRIORITY,NO_LOOP, NORMAL_PLAY_RATE);
    }

}
