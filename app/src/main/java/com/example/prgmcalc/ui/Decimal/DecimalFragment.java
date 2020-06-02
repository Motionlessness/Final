package com.example.prgmcalc.ui.Decimal;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import com.example.prgmcalc.R;

public class DecimalFragment extends Fragment {

    private DecimalViewModel decimalViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        decimalViewModel =
                ViewModelProviders.of(this).get(DecimalViewModel.class);
        View root = inflater.inflate(R.layout.fragment_decimal, container, false);
        final TextView textView = root.findViewById(R.id.lblDec);
//        decimalViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
//            @Override
//            public void onChanged(@Nullable String s) {
//                textView.setText(s);
//            }
//        });
        return root;
    }
}