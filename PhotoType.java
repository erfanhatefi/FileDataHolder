package com.company;

/**
 * Created by randkill on 5/21/17.
 */
public enum PhotoType
{
    JPG("jpg"),
    JPEG("jpeg"),
    EXIF("exif"),
    HEIF("heif"),
    TIFF("tiff"),
    GIF("gif"),
    PNG("png"),
    PPM("ppm"),
    WEBP("webp"),
    BAT("bat"),
    BPG("bpg"),
    XCF("xcf");
    private String Phototype;

    private PhotoType(String Phototype) {
        this.Phototype = Phototype;
    }
    public String getPhotoType(){
        return Phototype;
    }
}