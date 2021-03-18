package com.example.bookfood_sms;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class CustomListItemAdapter extends ArrayAdapter<ItemsList> {
    Context context;
    ItemsList[] items;
    public CustomListItemAdapter(Context context, int layoutTobeInflated, ItemsList[] items)
    {
        super(context, R.layout.list_item_lnk_img, items);
        this.context = context;
        this.items = items;
    }
    private View.OnClickListener itemClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
        switch (v.getId()) {
            case R.id.txtFoodName:
                             TextView fn = (TextView)v;
                           String fl = (String) v.getTag();
                           Toast.makeText(context, fl.toString(), Toast.LENGTH_SHORT).show();
                           showView(fl.toString());
                           return;
            case R.id.imgFoodImage:
                ImageView fi = (ImageView) v;
                         String floc = (String) fi.getTag();
                         Toast.makeText(context, floc.toString(), Toast.LENGTH_SHORT).show();
                         showView(floc.toString());
                         return;        }
    }
};
    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {
        LayoutInflater inflater = ((Activity) context).getLayoutInflater();
        View row = inflater.inflate(R.layout.list_item_lnk_img, null);
        TextView foodName = (TextView) row.findViewById(R.id.txtFoodName);
        ImageView foodImage = (ImageView) row.findViewById(R.id.imgFoodImage);
        TextView foodLink = (TextView)row.findViewById(R.id.txtFoodLink);
        TextView foodLocation = (TextView)row.findViewById(R.id.txtFoodLocation);
        foodName.setText(items[position].getFoodName().toString());
        foodLink.setText(items[position].getFoodLink().toString());
        foodName.setTag(foodLink.getText().toString());
        foodImage.setImageResource(items[position].getFoodImage());
        foodLocation.setText(items[position].getFoodLocation().toString());
        foodImage.setTag(foodLocation.getText().toString());
        foodName.setOnClickListener(itemClickListener);
        foodImage.setOnClickListener(itemClickListener);
        return row;
    }
    private void showView(String v) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(v));
        if (intent.resolveActivity(context.getPackageManager())!=null)
        context.startActivity(intent);}


}
