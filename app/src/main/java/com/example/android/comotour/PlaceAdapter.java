package com.example.android.comotour;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;

/**
 * Created by Gian on 21/04/2018.
 */

public class PlaceAdapter extends ArrayAdapter<Place> {

    public PlaceAdapter(Context context, ArrayList<Place> words) {
        super(context, 0, words);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.item_layout, parent, false);
        }

        // Get the {@link Place} object located at this position in the list
        Place currentPlace = getItem(position);


        // Find the ImageView in the list_item.xml layout with the ID image.
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.place_image);
        // display the provided image based on the resource ID
        imageView.setImageResource(currentPlace.getDrawableResourceId());
        // Make sure the view is visible
        imageView.setVisibility(View.VISIBLE);

        // Find the TextView in the list_item.xml layout with the ID miwok_text_view.
        TextView nameTextView = (TextView) listItemView.findViewById(R.id.place_name);
        // Get the Miwok translation from the currentWord object and set this text on
        // the Miwok TextView.
        nameTextView.setText(currentPlace.getName());

        // Find the TextView in the list_item.xml layout with the ID miwok_text_view.
        TextView descriptionTextView = (TextView) listItemView.findViewById(R.id.place_description);
        // Get the Miwok translation from the currentWord object and set this text on
        // the Miwok TextView.
        descriptionTextView.setText(currentPlace.getDescription());

        // Return the whole list item layout (containing 2 TextViews) so that it can be shown in
        // the ListView.
        return listItemView;
    }
}
