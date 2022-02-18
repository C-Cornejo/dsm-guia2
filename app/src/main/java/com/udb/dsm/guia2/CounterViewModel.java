package com.udb.dsm.guia2;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class CounterViewModel extends ViewModel {

    MutableLiveData<Integer> counter;

    public MutableLiveData<Integer> getCounter()
    {
        if(counter == null)
        {
            counter = new MutableLiveData<Integer>(0);
        }
        return counter;
    }


}

