package com.londonappbrewery.destini;

public class Destinition {

    int mStoryID;
    int mAnswer1ID;
    int mAnswer2ID;

    public Destinition(int storyResourceID, int answer1ResourceID, int answer2ResourceID) {

        mStoryID = storyResourceID;
        mAnswer1ID = answer1ResourceID;
        mAnswer2ID = answer2ResourceID;
    }

    public int getStoryID() {
        return mStoryID;
    }

    public void setStoryID(int storyID) {
        mStoryID = storyID;
    }

    public int getAnswer1ID() {
        return mAnswer1ID;
    }

    public void setAnswer1ID(int answer1ID) {
        mAnswer1ID = answer1ID;
    }

    public int getAnswer2ID() {
        return mAnswer2ID;
    }

    public void setAnswer2ID(int answer2ID) {
        mAnswer2ID = answer2ID;
    }
}