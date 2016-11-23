package com.mercacortex.enriquecasielles_deportes.utils;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

/**
 * Holds all initialization values
 */

public class Repository {

    private List<Sport> sportList;

    public Repository (Context context){
        //String packageName = context.getResources().getResourcePackageName(R.drawable.icon_american_football);
        //Sport sport = new Sport();
        //String drawableName = context.getResources().getResourceTypeName(R.drawable.icon_american_football);
        //int sportCount = 0;

        //TODO: Read Drawable package

    }

    public ArrayList<Sport> getSports() {
        return (ArrayList<Sport>) sportList;
    }
}
