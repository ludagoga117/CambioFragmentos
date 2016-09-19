package com.a4l.myapplication;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class X extends Fragment {

    Button cambiar;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_x, container, false);
        // FIXME Se infla el fragmento en un objeto tipo view (rootView) luego saco las caracteristicas que necesito para finalmente retornarlo

        cambiar = (Button) rootView.findViewById(R.id.button_fragX);

        cambiar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.contenedor_fragmentos, new Y()).commit();
            }
        });

        return rootView;
    }

}
