package com.example.pressuresensor;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.lifecycle.ViewModelProvider;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    private ViewModel mViewModel;

    @BindView(R.id.insole_region_1)	ImageView mInsoleRegion1;
    @BindView(R.id.insole_region_2) ImageView mInsoleRegion2;
    @BindView(R.id.insole_region_3) ImageView mInsoleRegion3;
    @BindView(R.id.insole_region_4) ImageView mInsoleRegion4;
    @BindView(R.id.insole_region_5) ImageView mInsoleRegion5;
    @BindView(R.id.insole_region_6) ImageView mInsoleRegion6;
    @BindView(R.id.insole_region_7) ImageView mInsoleRegion7;
    @BindView(R.id.insole_region_8) ImageView mInsoleRegion8;
    @BindView(R.id.insole_region_9) ImageView mInsoleRegion9;
    @BindView(R.id.insole_region_10) ImageView mInsoleRegion10;
    @BindView(R.id.insole_region_11) ImageView mInsoleRegion11;
    @BindView(R.id.insole_region_12) ImageView mInsoleRegion12;
    @BindView(R.id.insole_region_13) ImageView mInsoleRegion13;
    @BindView(R.id.insole_region_14) ImageView mInsoleRegion14;
    @BindView(R.id.insole_region_15) ImageView mInsoleRegion15;
    @BindView(R.id.insole_region_16) ImageView mInsoleRegion16;
    @BindView(R.id.insole_region_17) ImageView mInsoleRegion17;
    @BindView(R.id.insole_region_18) ImageView mInsoleRegion18;
    @BindView(R.id.insole_region_19) ImageView mInsoleRegion19;
    @BindView(R.id.insole_region_20) ImageView mInsoleRegion20;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.insole);
        ButterKnife.bind(this);

        mViewModel = new ViewModelProvider(this).get(ViewModel.class);

        mViewModel.getInsoleColor().observe(this, color -> {

            DrawableCompat.setTint(mInsoleRegion1.getDrawable(), Color.parseColor(color[0]));
            DrawableCompat.setTint(mInsoleRegion2.getDrawable(), Color.parseColor(color[1]));
            DrawableCompat.setTint(mInsoleRegion3.getDrawable(), Color.parseColor(color[2]));
            DrawableCompat.setTint(mInsoleRegion4.getDrawable(), Color.parseColor(color[3]));
            DrawableCompat.setTint(mInsoleRegion5.getDrawable(), Color.parseColor(color[4]));
            DrawableCompat.setTint(mInsoleRegion6.getDrawable(), Color.parseColor(color[5]));
            DrawableCompat.setTint(mInsoleRegion7.getDrawable(), Color.parseColor(color[6]));
            DrawableCompat.setTint(mInsoleRegion8.getDrawable(), Color.parseColor(color[7]));
            DrawableCompat.setTint(mInsoleRegion9.getDrawable(), Color.parseColor(color[8]));
            DrawableCompat.setTint(mInsoleRegion10.getDrawable(), Color.parseColor(color[9]));
            DrawableCompat.setTint(mInsoleRegion11.getDrawable(), Color.parseColor(color[10]));
            DrawableCompat.setTint(mInsoleRegion12.getDrawable(), Color.parseColor(color[11]));
            DrawableCompat.setTint(mInsoleRegion13.getDrawable(), Color.parseColor(color[12]));
            DrawableCompat.setTint(mInsoleRegion14.getDrawable(), Color.parseColor(color[13]));
            DrawableCompat.setTint(mInsoleRegion15.getDrawable(), Color.parseColor(color[14]));
            DrawableCompat.setTint(mInsoleRegion16.getDrawable(), Color.parseColor(color[15]));
            DrawableCompat.setTint(mInsoleRegion17.getDrawable(), Color.parseColor(color[16]));
            DrawableCompat.setTint(mInsoleRegion18.getDrawable(), Color.parseColor(color[17]));
            DrawableCompat.setTint(mInsoleRegion19.getDrawable(), Color.parseColor(color[18]));
            DrawableCompat.setTint(mInsoleRegion20.getDrawable(), Color.parseColor(color[19]));

        });

    }
}
