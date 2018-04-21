package com.example.android.comotour;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class LakeFragment extends Fragment {


    public LakeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list_view, container, false);

        // Create a list of place
        final ArrayList<Place> lakePlace = new ArrayList<Place>();
        lakePlace.add(new Place(R.drawable.bellagio, R.string.bellagio_name, R.string.bellagio_description));
        lakePlace.add(new Place(R.drawable.varenna, R.string.varenna_name, R.string.varenna_description));
        lakePlace.add(new Place(R.drawable.isola_comacina, R.string.isola_comacina_name, R.string.isola_comacina_description));
        lakePlace.add(new Place(R.drawable.villa_carlotta, R.string.villa_carlotta_name, R.string.villa_carlotta_description));
        lakePlace.add(new Place(R.drawable.villa_deste, R.string.villa_deste_name, R.string.villa_deste_description));
        lakePlace.add(new Place(R.drawable.villa_olmo, R.string.villa_olmo_name, R.string.villa_olmo_description));
        lakePlace.add(new Place(R.drawable.villa_geno, R.string.villa_geno_name, R.string.villa_geno_description));

        // Create an {@link PlaceAdapter}, whose data source is a list of {@link Place}s. The
        // adapter knows how to create list items for each item in the list.
        PlaceAdapter adapter = new PlaceAdapter(getActivity(), lakePlace);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // list_view.xml layout file.
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }
}
