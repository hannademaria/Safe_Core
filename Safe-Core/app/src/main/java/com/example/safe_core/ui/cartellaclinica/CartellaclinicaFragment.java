package com.example.safe_core.ui.cartellaclinica;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.safe_core.databinding.FragmentCartellaClinicaBinding;

public class CartellaclinicaFragment extends Fragment {

    private FragmentCartellaClinicaBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        CartellaclinicaViewModel cartellaclinicaViewModel =
                new ViewModelProvider(this).get(CartellaclinicaViewModel.class);

        binding = FragmentCartellaClinicaBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textCartellaclinica;
        cartellaclinicaViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}