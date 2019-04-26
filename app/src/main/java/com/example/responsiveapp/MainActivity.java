package com.example.responsiveapp;

import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import static android.content.res.Configuration.SCREENLAYOUT_SIZE_LARGE;
import static android.content.res.Configuration.SCREENLAYOUT_SIZE_NORMAL;
import static android.content.res.Configuration.SCREENLAYOUT_SIZE_SMALL;
import static android.content.res.Configuration.SCREENLAYOUT_SIZE_XLARGE;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Configuration config = getResources().getConfiguration();

        if ((config.screenLayout &  Configuration.SCREENLAYOUT_SIZE_MASK) == SCREENLAYOUT_SIZE_XLARGE)  //tablet
            setContentView(R.layout.activity_main_tablet);
        if ((config.screenLayout &  Configuration.SCREENLAYOUT_SIZE_MASK) == SCREENLAYOUT_SIZE_LARGE) //telefone, large screen
            setContentView(R.layout.activity_main_phone_large);
        if ((config.screenLayout &  Configuration.SCREENLAYOUT_SIZE_MASK) == SCREENLAYOUT_SIZE_NORMAL) //telefone, normal screen
            setContentView(R.layout.activity_main_phone_normal);
        if ((config.screenLayout &  Configuration.SCREENLAYOUT_SIZE_MASK) == SCREENLAYOUT_SIZE_SMALL)
            setContentView(R.layout.activity_main__phone_small);

        //para detectar paisagem

        if (config.orientation == Configuration.ORIENTATION_LANDSCAPE)
            setContentView(R.layout.activity_main_landscape);

    }
}



/*Phones - telas e tamanhos:
VALORES APROXIMADOS, O QUE CONTA REALMENTE É A RESOLUÇÃO/DENSIDADE DOS PIXELS

2,7" small;
3,4" small;
3,7" normal;
4,95" normal;
4,99" normal;
5,99" normal;
6,0" large;
6,3" large;
6,5" large;
6,9" large;

Tablets:
7,0" large;
7,5" xlarge;
8,86" xlarge;
9,94" xlarge;
10,1" xlarge;

	1.
xlarge screens are at least 960dp x 720dp.
	2.
large screens are at least 640dp x 480dp.
	3.
normal screens are at least 470dp x 320dp.
	4.
small screens are at least 426dp x 320dp.


*/