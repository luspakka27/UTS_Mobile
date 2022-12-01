package com.example.komic;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

public class MainActivity2 extends Activity {

    ListView dropListView2 ;
    String countryList[] = {"Komik Doraemon", "Komik Dragon", "Komik Angkot Tua", "Komik Si Juki",};
    int flags[] = {R.drawable.doraemon, R.drawable.dragon, R.drawable.angkottua, R.drawable.sijuki,};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        dropListView2 = (ListView) findViewById(R.id.dropListView2);
        CustomAdapter customAdapter = new CustomAdapter(getApplicationContext(), countryList, flags);
        dropListView2.setAdapter(customAdapter);
    }
}
