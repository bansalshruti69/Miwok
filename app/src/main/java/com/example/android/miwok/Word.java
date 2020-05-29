package com.example.android.miwok;

public class Word {
    private String mMiwokWord;
    private String mEnglishWord;
    public final int NO_IMAGE_PROVIDED = -1;
    private int mimageResourceID = NO_IMAGE_PROVIDED;
    private int mAudioFileID;

    Word(String s1, String s2,int y){
        mMiwokWord = s2;
        mEnglishWord = s1;
        mAudioFileID = y;
    }

    Word(String s1, String s2, int i,int y){
        mMiwokWord = s2;
        mEnglishWord = s1;
        mimageResourceID = i;
        mAudioFileID = y;
    }

    public String getmMiwokWord() {
        return mMiwokWord;
    }

    public String getmEnglishWord() {
        return mEnglishWord;
    }

    public int getMimageResourceID(){
        return mimageResourceID;
    }

    public boolean has_image(){
        return mimageResourceID != NO_IMAGE_PROVIDED;
    }

    public int getmAudioFileID(){ return mAudioFileID; }
}
