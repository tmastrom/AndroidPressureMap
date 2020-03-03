package com.example.pressuresensor;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModelProvider;
import androidx.vectordrawable.graphics.drawable.VectorDrawableCompat;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    private ViewModel mViewModel;

    @BindView(R.id.insole_1) TextView mInsole_1;
    @BindView(R.id.insole_2) TextView mInsole_2;
    @BindView(R.id.insole_3) TextView mInsole_3;
    @BindView(R.id.insole_4) TextView mInsole_4;
    @BindView(R.id.insole_5) TextView mInsole_5;
    @BindView(R.id.insole_6) TextView mInsole_6;
    @BindView(R.id.insole_7) TextView mInsole_7;
    @BindView(R.id.insole_8) TextView mInsole_8;
    @BindView(R.id.insole_9) TextView mInsole_9;
    @BindView(R.id.insole_10) TextView mInsole_10;
    @BindView(R.id.insole_11) TextView mInsole_11;
    @BindView(R.id.insole_12) TextView mInsole_12;
    @BindView(R.id.insole_13) TextView mInsole_13;
    @BindView(R.id.insole_14) TextView mInsole_14;
    @BindView(R.id.insole_15) TextView mInsole_15;
    @BindView(R.id.insole_16) TextView mInsole_16;
    @BindView(R.id.insole_17) TextView mInsole_17;
    @BindView(R.id.insole_18) TextView mInsole_18;
    @BindView(R.id.insole_19) TextView mInsole_19;
    @BindView(R.id.insole_20) TextView mInsole_20;

    @BindView(R.id.insole_region_1) ImageView mInsoleRegion1;
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






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.insole);
        ButterKnife.bind(this);
/*
        VectorChildFinder vector = new VectorChildFinder(this, R.drawable.my_vector, imageView);

        VectorDrawableCompat.VFullPath path1 = vector.findPathByName("path1");
        path1.setFillColor(Color.RED);*/

        ImageView img = findViewById(R.id.right_insole);

        mViewModel = new ViewModelProvider(this).get(ViewModel.class);

        mViewModel.getInsole().observe(this, insole_array -> {
            mInsole_1.setText(insole_array[0].toString());
            mInsole_2.setText(insole_array[1].toString());
            mInsole_3.setText(insole_array[2].toString());
            mInsole_4.setText(insole_array[3].toString());
            mInsole_5.setText(insole_array[4].toString());
            mInsole_6.setText(insole_array[5].toString());
            mInsole_7.setText(insole_array[6].toString());
            mInsole_8.setText(insole_array[7].toString());
            mInsole_9.setText(insole_array[8].toString());
            mInsole_10.setText(insole_array[9].toString());
            mInsole_11.setText(insole_array[10].toString());
            mInsole_12.setText(insole_array[11].toString());
            mInsole_13.setText(insole_array[12].toString());
            mInsole_14.setText(insole_array[13].toString());
            mInsole_15.setText(insole_array[14].toString());
            mInsole_16.setText(insole_array[15].toString());
            mInsole_17.setText(insole_array[16].toString());
            mInsole_18.setText(insole_array[17].toString());
            mInsole_19.setText(insole_array[18].toString());
            mInsole_20.setText(insole_array[19].toString());
        });

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
            //mInsoleRegion1.setTint(Color.parseColor(color[0]));
/*            mInsole_1.setBackgroundColor(Color.parseColor(color[0]));
            mInsole_2.setBackgroundColor(Color.parseColor(color[1]));
            mInsole_3.setBackgroundColor(Color.parseColor(color[2]));
            mInsole_4.setBackgroundColor(Color.parseColor(color[3]));
            mInsole_5.setBackgroundColor(Color.parseColor(color[4]));
            mInsole_6.setBackgroundColor(Color.parseColor(color[5]));
            mInsole_7.setBackgroundColor(Color.parseColor(color[6]));
            mInsole_8.setBackgroundColor(Color.parseColor(color[7]));
            mInsole_9.setBackgroundColor(Color.parseColor(color[8]));
            mInsole_10.setBackgroundColor(Color.parseColor(color[9]));
            mInsole_11.setBackgroundColor(Color.parseColor(color[10]));
            mInsole_12.setBackgroundColor(Color.parseColor(color[11]));
            mInsole_13.setBackgroundColor(Color.parseColor(color[12]));
            mInsole_14.setBackgroundColor(Color.parseColor(color[13]));
            mInsole_15.setBackgroundColor(Color.parseColor(color[14]));
            mInsole_16.setBackgroundColor(Color.parseColor(color[15]));
            mInsole_17.setBackgroundColor(Color.parseColor(color[16]));
            mInsole_18.setBackgroundColor(Color.parseColor(color[17]));
            mInsole_19.setBackgroundColor(Color.parseColor(color[18]));
            mInsole_20.setBackgroundColor(Color.parseColor(color[19]));*/
        });

    }
}
