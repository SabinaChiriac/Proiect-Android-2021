package com.example.bibliotecaonline.activities.fragments;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.bibliotecaonline.interfaces.OnFragmentActivityCommunication;

public class BooksFragment extends Fragment {

    public static final String TAG_FRAGMENT_BOOKS = "TAG_FRAGMENT_BOOKS";

    private OnFragmentActivityCommunication activityCommunication;

    public static BooksFragment newInstance() {
        Bundle args = new Bundle();

        BooksFragment fragment = new BooksFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);

        if(context instanceof OnFragmentActivityCommunication) {
            activityCommunication = (OnFragmentActivityCommunication) context;
        }
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return super.onCreateView(inflater, container, savedInstanceState);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }
}
