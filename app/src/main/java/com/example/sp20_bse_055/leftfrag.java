package com.example.sp20_bse_055;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link leftfrag#newInstance} factory method to
 * create an instance of this fragment.
 */
public class leftfrag extends Fragment {

    Button btninput;
    Button btncalculate;
    TextView textView;
//    DataViewModel dataViewModel;
//    leftFragCommInter leftFragCommInter;

    public leftfrag() {
        // Required empty public constructor
    }


    // TODO: Rename and change types and number of parameters
    public static leftfrag newInstance() {
        leftfrag fragment = new leftfrag();

        return fragment;
    }
@Override
public void onAttach(@NonNull Context context){super.onAttach(context);

}


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
      View view= inflater.inflate(R.layout.fragment_leftfrag,container,false);
     btncalculate=view.findViewById(R.id.btncalculate);
     btninput=view.findViewById(R.id.btninput);
        return view;
    }
}