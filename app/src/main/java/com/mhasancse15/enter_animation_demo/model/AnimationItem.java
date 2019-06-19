package com.mhasancse15.enter_animation_demo.model;

public class AnimationItem {

    private final String mName;
    private final int mResourceId;

    public AnimationItem(String name, int resourceId) {
        mName = name;
        mResourceId = resourceId;
    }

    public String getName() {
        return mName;
    }

    public int getResourceId() {
        return mResourceId;
    }
}
