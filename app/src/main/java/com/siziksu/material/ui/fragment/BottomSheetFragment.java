package com.siziksu.material.ui.fragment;

import android.os.Bundle;
import android.support.design.widget.BottomSheetDialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.siziksu.material.R;

public class BottomSheetFragment extends BottomSheetDialogFragment {

    public static BottomSheetFragment get() {
        return new BottomSheetFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.bottom_sheet_dialog, container, false);
    }
}