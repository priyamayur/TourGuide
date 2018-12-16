package com.example.user.tourguide;

public class tourListClass {


    private int mImageID;

    private int mDescID;


    public tourListClass(int imageID, int descID) {

        mImageID = imageID;
        mDescID = descID;

    }


    public int getImageID() {
        return mImageID;
    }


    public int getDescID() {
        return mDescID;
    }


}

