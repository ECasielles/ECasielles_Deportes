package com.mercacortex.enriquecasielles_deportes.utils;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

import com.mercacortex.enriquecasielles_deportes.R;

import java.util.ArrayList;

/**
 * Handles Sports data for the view to show
 */

public class SportAdapter extends ArrayAdapter<Sport> {

    private Context context;
    private ArrayList<Sport> arrayList;

    public SportAdapter(ViewGroup parent, int resParent) {
        super(parent.getContext(), resParent);
        this.context =  parent.getContext();
        this.arrayList = new Repository(context).getSports();
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View item = convertView;
        SportHolder sportHolder;

        if (item == null) {
            LayoutInflater layoutInflater = LayoutInflater.from(context);
            item = layoutInflater.inflate(R.layout.item, null);

            sportHolder = new SportHolder();

            sportHolder.txvSportName = (TextView) item.findViewById(R.id.txvItemSportName);
            sportHolder.ivwSportIcon = (ImageView) item.findViewById(R.id.ivwItemSport);
            sportHolder.ckbIsChecked = (CheckBox) item.findViewById(R.id.ckbItemChecked);

            item.setTag(sportHolder);
        } else {
            sportHolder = (SportHolder)item.getTag();
        }

        sportHolder.txvSportName.setText(arrayList.get(position).getSportName());
        sportHolder.ivwSportIcon.setImageResource(arrayList.get(position).getSportIcon());
        sportHolder.ckbIsChecked.setEnabled(arrayList.get(position).isChecked());

        return item;
    }

    class SportHolder  {

        TextView txvSportName;
        ImageView ivwSportIcon;
        CheckBox ckbIsChecked;

    }

}
