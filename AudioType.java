package com.company;

/**
 * Created by randkill on 5/21/17.
 */
public enum AudioType
{
    M4A("m4a"),
    M4B("m4b"),
    M4P("m4p"),
    MP3("mp3"),
    MPC("mpc"),
    MSV("msv"),
    AAC("aac"),
    AAX("aax");

    private String AudioType;
    private AudioType(String Audiotype)
    {
        this.AudioType = Audiotype;
    }
    public String getAudioType()
    {
        return AudioType;
    }
}