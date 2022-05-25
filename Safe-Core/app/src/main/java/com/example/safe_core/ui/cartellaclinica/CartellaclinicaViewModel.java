package com.example.safe_core.ui.cartellaclinica;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class CartellaclinicaViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public CartellaclinicaViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Cartella Clinica");
    }

    public LiveData<String> getText() {
        return mText;
    }
}