package com.example.safe_core.ui.greenpass;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.safe_core.databinding.FragmentGreenPassBinding;

public class GreenpassFragment extends Fragment {

    private FragmentGreenPassBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        GreenpassViewModel greenpassViewModel =
                new ViewModelProvider(this).get(GreenpassViewModel.class);

        binding = FragmentGreenPassBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textGreenpass;
        greenpassViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}