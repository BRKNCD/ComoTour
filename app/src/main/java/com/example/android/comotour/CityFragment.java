package com.example.android.comotour;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class CityFragment extends Fragment {

    public CityFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list_view, container, false);

        // Create a list of place
        final ArrayList<Place> cityPlace = new ArrayList<Place>();
        cityPlace.add(new Place(R.drawable.duomo, R.string.duomo_name, R.string.duomo_description,45.811794,9.083928));
        cityPlace.add(new Place(R.drawable.lungolago, R.string.lungolago_name, R.string.lungolago_description,45.8149643,9.0688734));
        cityPlace.add(new Place(R.drawable.life_electric, R.string.electric_name, R.string.electric_description,45.8153751,9.0802579));
        cityPlace.add(new Place(R.drawable.monumento_ai_caduti, R.string.monumento_name, R.string.monumento_description));
        cityPlace.add(new Place(R.drawable.palazzo_terragni, R.string.palazzo_name, R.string.palazzo_description));
        cityPlace.add(new Place(R.drawable.piazza_camerlata, R.string.piazza_camerlata_name, R.string.piazza_camerlata_description));
        cityPlace.add(new Place(R.drawable.porta_torre, R.string.porta_torre_name, R.string.porta_torre_description));
        cityPlace.add(new Place(R.drawable.tempio_voltiano, R.string.tempio_voltiano_name, R.string.tempio_voltiano_description));

        // Create an {@link PlaceAdapter}, whose data source is a list of {@link Place}s. The
        // adapter knows how to create list items for each item in the list.
        PlaceAdapter adapter = new PlaceAdapter(getActivity(), cityPlace);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // list_view.xml layout file.
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link PlaceAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new ListView.OnItemClickListener() {

            public void onItemClick(AdapterView adapterView, View view, int position, long id) {
                Place currentPlace = cityPlace.get(position);
                String currentName = getString(currentPlace.getName());
                double currentLatitude = currentPlace.getLatitude();
                double currentLongitude = currentPlace.getLongitude();

                Bundle bundle = new Bundle();
                bundle.putString("NAME",currentName);
                bundle.putDouble("LATITUDE",currentLatitude);
                bundle.putDouble("LONGITUDE",currentLongitude);

                MapFragment mapFragment = new MapFragment();
                mapFragment.setArguments(bundle);


                getFragmentManager()
                        .beginTransaction()
                        .addToBackStack(null)
                        .replace(R.id.content, mapFragment)
                        .commit();
            }
        });

        return rootView;
    }
}