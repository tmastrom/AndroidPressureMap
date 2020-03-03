package com.example.pressuresensor;

import android.app.Application;
import android.bluetooth.BluetoothDevice;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

public class ViewModel extends AndroidViewModel {

    // Insole data
    private final MutableLiveData<Integer[]> mInsole = new MutableLiveData<>();

    // Insole colors
    //private final MutableLiveData<Integer[]> mInsoleColor = new MutableLiveData<>();
    private final MutableLiveData<Integer> mInsoleColor = new MutableLiveData<>();

    public LiveData<Integer[]> getInsole() {return mInsole;}

    //public LiveData<Integer[]> getInsoleColor() {return mInsoleColor;}
    public LiveData<Integer> getInsoleColor() {return mInsoleColor;}

    public ViewModel(@NonNull Application application) {
        super(application);
        Integer[] value = new Integer[]{0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19};
        onInsoleValueReceived(value);
    }


    public void onInsoleValueReceived( Integer[] value) {
        Log.i("TOM", "onIMUValueReceived " + value);

        Integer[] colors;
        //colors = getColors(value);
        Integer color = 0xFF0000;
        mInsoleColor.postValue(color);
        mInsole.postValue(value);

    }
}
