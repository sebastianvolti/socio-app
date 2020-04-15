package com.example.app2;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class ActivityList extends AppCompatActivity {

    ListView listView;
    String mTitle[] = {"Aguada", "Atenas", "Bigua", "Bohemios", "Defensor", "Goes", "Hebraica", "Larreborges", "Malvin", "Trouville", "Olimpia", "Sayago", "Tabaré", "Unión Atlética", "Urunday Universitario", "Welcome"};
    String mDescription[] = {"Institución de Basketball", "Institución de Basketball", "Institución de Basketball", "Institución de Basketball", "Institución de Basketball", "Institución de Basketball", "Institución de Basketball", "Institución de Basketball", "Institución de Basketball", "Institución de Basketball","Institución de Basketball", "Institución de Basketball", "Institución de Basketball", "Institución de Basketball",  "Institución de Basketball", "Institución de Basketball"};
    int images[] = {R.drawable.pelota, R.drawable.pelota, R.drawable.pelota, R.drawable.pelota, R.drawable.pelota, R.drawable.pelota, R.drawable.pelota, R.drawable.pelota, R.drawable.pelota, R.drawable.pelota, R.drawable.pelota,  R.drawable.pelota, R.drawable.pelota, R.drawable.pelota, R.drawable.pelota, R.drawable.pelota};
    // so our images and other things are set in array

    // now paste some images in drawable

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        listView = findViewById(R.id.listView);
        // now create an adapter class

        MyAdapter adapter = new MyAdapter(this, mTitle, mDescription, images);
        listView.setAdapter(adapter);
        // there is my mistake...
        // now again check this..

        // now set item click on list view
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {



                if ((position >=  0) || ( position <= 15)) {
                    Intent intent = new Intent(ActivityList.this,Profile.class);
                    startActivity(intent);
                }

                /*


                if (position ==  0) {
                    Toast.makeText(ActivityList.this, "Putos de la aguada", Toast.LENGTH_SHORT).show();
                }

                if (position ==  2) {

                }
                if (position ==  3) {

                }
                if (position ==  4) {

                }
                if (position ==  5) {

                }
                if (position ==  6) {

                }
                if (position ==  7) {

                }
                if (position ==  8) {

                }
                if (position ==  9) {

                }
                if (position ==  10) {

                }
                if (position ==  11) {

                }
                if (position ==  12) {

                }
                if (position ==  13) {
                    Intent intent = new Intent(ActivityList.this,Profile.class);
                    startActivity(intent);
                }
                if (position ==  14) {
                    Toast.makeText(ActivityList.this, "Chetos del prado", Toast.LENGTH_SHORT).show();
                }
                if (position ==  15) {
                    Toast.makeText(ActivityList.this, "Unos enfermos y mujer de atenas", Toast.LENGTH_SHORT).show();
                }

                    */


            }
        });
        // so item click is done now check list view
    }

    public void sportsView(View vista){
        Intent intent = new Intent(this,Profile.class);
        startActivity(intent);
    }

    class MyAdapter extends ArrayAdapter<String> {

        Context context;
        String rTitle[];
        String rDescription[];
        int rImgs[];

        MyAdapter (Context c, String title[], String description[], int imgs[]) {
            super(c, R.layout.row, R.id.textView1, title);
            this.context = c;
            this.rTitle = title;
            this.rDescription = description;
            this.rImgs = imgs;

        }

        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            LayoutInflater layoutInflater = (LayoutInflater)getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View row = layoutInflater.inflate(R.layout.row, parent, false);
            ImageView images = row.findViewById(R.id.image);
            TextView myTitle = row.findViewById(R.id.textView1);
            TextView myDescription = row.findViewById(R.id.textView2);

            // now set our resources on views
            images.setImageResource(rImgs[position]);
            myTitle.setText(rTitle[position]);
            myDescription.setText(rDescription[position]);




            return row;
        }
    }
}
