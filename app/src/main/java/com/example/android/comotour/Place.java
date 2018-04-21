package com.example.android.comotour;

/**
 * Created by Gian on 21/04/2018.
 */

public class Place {

    int mName;
    int mDescription;
    int mDrawableResourceId;

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

    public int getDrawableResourceId() {
        return mDrawableResourceId;
    }

    public int getName() {
        return mName;
    }

    public int getDescription() {
        return mDescription;
    }
}
