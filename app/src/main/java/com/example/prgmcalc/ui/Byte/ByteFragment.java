package com.example.prgmcalc.ui.Byte;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import com.example.prgmcalc.R;

public class ByteFragment extends Fragment {

    private ByteViewModel byteViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        byteViewModel =
                ViewModelProviders.of(this).get(ByteViewModel.class);
        View root = inflater.inflate(R.layout.fragment_byte, container, false);
        final TextView textView = root.findViewById(R.id.lblByte);
//        galleryViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
//            @Override
//            public void onChanged(@Nullable String s) {
//                textView.setText(s);
//            }
//        });
        return root;
    }
}