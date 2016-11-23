package com.mercacortex.enriquecasielles_deportes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import com.mercacortex.enriquecasielles_deportes.utils.SportAdapter;

/**
 * Actividad principal y de inicio.
 * Inicializa y muestra la lista de deportes.
 */

public class MainActivity extends AppCompatActivity {

    SportAdapter adapter;
    private ListView listView;
    private Button btnOk;
    private TextView txvTitle;
    private ViewGroup layoutParent;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txvTitle = (TextView) findViewById(R.id.txvMainTitle);
        btnOk = (Button) findViewById(R.id.btnMainOk);
        listView = (ListView) findViewById(R.id.lvwMainSports);
        layoutParent = (ViewGroup) findViewById(R.id.activity_main);

        adapter = new SportAdapter(layoutParent, android.R.layout.simple_list_item_1);
        listView.setAdapter(adapter);

        btnOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //TODO: Saves preferences
            }
        });

    }

    //TODO: Menu. A dialog screen will show to allow sports filtering by leading character.

    //App state is saved when screen is flipped
    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putAll(outState);
    }

}
