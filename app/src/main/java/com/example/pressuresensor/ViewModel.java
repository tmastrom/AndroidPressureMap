package com.example.pressuresensor;

import android.app.Application;
import android.bluetooth.BluetoothDevice;
import android.graphics.Color;
import android.util.Log;

import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import java.util.HashMap;

public class ViewModel extends AndroidViewModel {

    // Insole data
    private final MutableLiveData<Integer[]> mInsole = new MutableLiveData<>();

    // Insole colors
    private final MutableLiveData<String[]> mInsoleColor = new MutableLiveData<>();

    public LiveData<Integer[]> getInsole() {return mInsole;}

    public LiveData<String[]> getInsoleColor() {return mInsoleColor;}

    public ViewModel(@NonNull Application application) {
        super(application);
        Integer[] value = new Integer[]{0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19};
        onInsoleValueReceived(value);
    }


    public void onInsoleValueReceived( Integer[] value) {
        Log.i("TOM", "onIMUValueReceived " + value);

        mInsole.postValue(value);

        getColors(value);

    }

    public void getColors(Integer[] value) {

        HashMap<Integer, String> colourMap = new HashMap<>();
        colourMap.put(1, "#0000FF");    // Blue
        colourMap.put(2, "#0080FF");    // Blue
        colourMap.put(3, "#00FFFF");    // Light blue
        colourMap.put(4, "#00FF80");    // Green
        colourMap.put(5, "#00FF00");    // Green
        colourMap.put(6, "#80FF00");    // Green
        colourMap.put(7, "#FFFF00");    // Yellow
        colourMap.put(8, "#FF8000");    // Orange
        colourMap.put(9, "#FF0000");    // Red
        colourMap.put(0, "#7F00FF"); 	// Purple

        String[] colors = new String[value.length];

        for (int i=0; i<value.length; i++){
            colors[i] = colourMap.get(value[i/2]);
        }
        mInsoleColor.postValue(colors);

    }
}
