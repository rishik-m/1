package com.example.program1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText name;
    ImageView imageView;
    Button change;
    int flag = 1;

    WebView webView;

    ListView myList;
    String travel[];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "ACTIVITY CREATED", Toast.LENGTH_SHORT).show();

        //webView = findViewById(R.id.web);
        //webView.loadUrl("https://www.google.com");

        name = findViewById(R.id.myname);

        imageView = findViewById(R.id.myimage);
        change = findViewById(R.id.change);

        myList = findViewById(R.id.myList);
        travel = getResources().getStringArray(R.array.TRAVEL_DESTINATIONS);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.textviewlayout, travel);
        myList.setAdapter(adapter);


        change.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(flag == 1)
                {
                    imageView.setImageResource(R.drawable.secondpic);
                    flag = 2;
                }
                else
                {
                    imageView.setImageResource(R.drawable.firstpic);
                    flag = 1;
                }
            }
        });

        myList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, "you have clicked : " + parent.getItemAtPosition(position), Toast.LENGTH_SHORT).show();

            }
        });
    }
    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "ACTIVITY STARTED", Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this, "ACTIVITY STOPPED", Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "ACTIVITY DESTROYED", Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "ACTIVITY PAUSED", Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "ACTIVITY RESUMED", Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(this, "ACTIVITY RESTARTED", Toast.LENGTH_SHORT).show();

    }
}