package com.animeshjain.assignment82;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    ListView listView;

//    Declaring Arrays for names and phoneNumber
    String[] names=
            {"ABC","DEF","GHI","JKL","MNO","PQR","STU","VWX","YZ1"};
    String[] contactNumbers=
            {"123","234","345","456","567","678","789","890","012"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView)findViewById(R.id.listView);
//        Creating Object for customAdapter

        CustomAdapter customAdapter = new CustomAdapter();

//        Passing adapter to listView
        listView.setAdapter(customAdapter);
    }

    class CustomAdapter extends BaseAdapter {

        @Override
        public int getCount() {
//            counting the number of fields
            return names.length;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {

            view = getLayoutInflater().inflate(R.layout.row, null);
            TextView name= (TextView)view.findViewById(R.id.name);
            TextView contactNumber = (TextView)view.findViewById(R.id.contactNumber);

//            Assigning Data to textViews
            name.setText(names[i]);
            contactNumber.setText(contactNumbers[i]);

            return view;
        }
    }
}
