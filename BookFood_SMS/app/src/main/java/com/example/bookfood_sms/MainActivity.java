package com.example.bookfood_sms;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    ItemsList[] items;
    CustomListItemAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        prepareData();
        listView =(ListView) findViewById(R.id.lvMain);
        adapter = new CustomListItemAdapter(this,R.layout.list_item_lnk_img,items);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position ==0){
                    Intent intent1 = new Intent(view.getContext(), ActivityMon1.class);
                    startActivity(intent1);
                }
                if(position ==1){
                    Intent intent2 = new Intent(view.getContext(),ActivityMon2.class);
                    startActivity(intent2);
                } if(position ==2 ){
                    Intent intent3 = new Intent(view.getContext(), ActivityMon3.class);
                    startActivity(intent3);
                }if( position ==3){
                    Intent intent4 = new Intent(view.getContext(), ActivityMon4.class);
                    startActivity(intent4);
                }
            }
        });
    }
    private void prepareData()
    {
        items = new ItemsList[4];
        items[0] = new ItemsList(R.drawable.food, "http://www.google.com", "Quán ăn ngon Sài Gòn"	, "geo:0,0?q=14+Đồng+Đen+phường+14+Hồ+Chí+Minh+Bến+Nghé");
        items[1] = new ItemsList(R.drawable.food2, "http://123-zo.vn", "Quán Nướng Việt",	 "geo:10.7588455,106.6850891");
        items[2] = new ItemsList(	R.drawable.food2,"http://123-zo.vn","Nhà hàng Chang Kang Kung",   "geo:0,0?q=The+Garlik,+216+Đề+Thám,+Phường+Phạm+Ngũ+Lão,+Quận+1,+Thành+phố+Hồ+Chí+Minh+700000,+Vietnam");
        items[3] = new ItemsList(R.drawable.food2,"http://123-zo.vn",  "Quán Chien Việt", 	"geo:0,0?q=The+Garlik,+216+Đề+Thám,+Phường+Phạm+Ngũ+Lão,+Quận+1,+Thành+phố+Hồ+Chí+Minh+700000,+Vietnam");
    }
}