package com.example.android.comotour;

/**
 * Created by Gian on 21/04/2018.
 */

public class Place {

    private int mName;
    private int mDescription;
    private int mDrawableResourceId;

    private double mLatitude;
    private double mLongitude;

    public Place(int drawableResourceId, int name, int description) {
        /**
         * This constructor is for every place
         * @param drawableResourceId is the place's image
         * @param name is the place's name
         * @param description contains information such as address, date of building or somthing else
         */
        mDrawableResourceId = drawableResourceId;
        mName = name;
        mDescription = description;
    }

    public Place(int drawableResourceId, int name, int description, double latitude, double longitude) {
        /**
         * This constructor is for every place
         * @param drawableResourceId is the place's image
         * @param name is the place's name
         * @param description contains information such as address, date of building or somthing else
         * @param latitude the place's latitude
         * @param longitude the place's longitude
         */
        mDrawableResourceId = drawableResourceId;
        mName = name;
        mDescription = description;
        mLatitude = latitude;
        mLongitude = longitude;
    }

    public int getDrawableResourceId() {
        return mDrawableResourceId;
    }

    public int getName() {
        return mName;
    }

    public int getDescription() {
        return mDescription;
    }

    public double getLatitude() {
        return mLatitude;
    }

    public double getLongitude() {
        return mLongitude;
    }
}
