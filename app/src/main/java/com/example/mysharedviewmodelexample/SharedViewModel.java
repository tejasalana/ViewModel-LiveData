package com.example.mysharedviewmodelexample;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class SharedViewModel extends ViewModel {
    private MutableLiveData<Integer> counter;

    public LiveData<Integer> getCounter(){
        if (counter == null){
            counter = new MutableLiveData<>();
            counter.setValue(0);
        }
        return counter;
    }

    public void setCounter(Integer input){
        if (counter == null){
            counter = new MutableLiveData<>();
            counter.setValue(0);
        }
        counter.setValue(input);
    }

}
