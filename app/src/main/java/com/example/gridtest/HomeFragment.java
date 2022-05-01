package com.example.gridtest;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridLayout;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;



public class HomeFragment extends Fragment  {
    View view;
    private GridLayout gridLayout;
    private CardView meCardView;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        gridLayout = view.findViewById(R.id.home_grid);
        setClickEvent(gridLayout);
        return view;

//        meCardView = view.findViewById(R.id.medicalStore);
//        meCardView.setOnClickListener(new );

    }

    /**
     * click listener for cardview in home fragment
     */
    private void setClickEvent(final GridLayout gridLayout) {
        for(int i = 0; i < gridLayout.getChildCount(); i++) {
            final CardView cardView = (CardView) gridLayout.getChildAt(i);
            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    switch (view.getId()){
                        case R.id.medicalStore:

                            break;
                    }
                }
            });
        }
    }

}

