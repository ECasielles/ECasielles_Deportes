package com.mercacortex.enriquecasielles_deportes.utils;

import android.media.Image;

/**
 * Model class for Sports
 */

public class Sport {

    private String sportName;
    private int sportIcon;
    private boolean isChecked;

    public String getSportName() {
        return sportName;
    }

    public void setSportName(String sportName) {
        this.sportName = sportName;
    }

    public int getSportIcon() {
        return sportIcon;
    }

    public void setSportIcon(int sportIcon) {
        this.sportIcon = sportIcon;
    }

    public boolean isChecked() {
        return isChecked;
    }

    public void setChecked(boolean checked) {
        isChecked = checked;
    }
}
