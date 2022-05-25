package com.example.safe_core.ui.greenpass;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class GreenpassViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public GreenpassViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("QR code");
    }

    public LiveData<String> getText() {
        return mText;
    }
}