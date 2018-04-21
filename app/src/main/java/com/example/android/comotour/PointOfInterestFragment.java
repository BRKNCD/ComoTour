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
public class PointOfInterestFragment extends Fragment {


    public PointOfInterestFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list_view, container, false);

        // Create a list of place
        final ArrayList<Place> pointOfInterestPlace = new ArrayList<Place>();
        pointOfInterestPlace.add(new Place(R.drawable.faro_voltiano, R.string.faro_voltiano_name, R.string.faro_voltiano_description));
        pointOfInterestPlace.add(new Place(R.drawable.chiesetta_sagnino, R.string.chiesetta_sagnino_name, R.string.chiesetta_sagnino_description));
        pointOfInterestPlace.add(new Place(R.drawable.castel_baradello, R.string.castel_baradello_name, R.string.castel_baradello_description));

        // Create an {@link PlaceAdapter}, whose data source is a list of {@link Place}s. The
        // adapter knows how to create list items for each item in the list.
        PlaceAdapter adapter = new PlaceAdapter(getActivity(), pointOfInterestPlace);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // list_view.xml layout file.
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link PlaceAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);


        return rootView;
    }

}
