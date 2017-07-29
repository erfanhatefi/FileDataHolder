package com.company;

/**
 * Created by randkill on 5/21/17.
 */
public enum VideoType
{
    MP4("mp4"),
    AVI("avi"),
    WMV("wmv"),
    MOV("mov"),
    GIF("gif"),
    ASF("asf"),
    FLV("FLV");
    private String VideoType;
    private VideoType(String videoType)
    {
        this.VideoType = videoType;
    }
    public String getVideoType()
    {
        return VideoType;
    }
}