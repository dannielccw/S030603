package com.example.yvtc.s030603;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Spinner spinner, spinner2;
    String[] strs = {"AA", "BBB", "CCCC", "DD", "EEEEE"};
    TextView tv, tv2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv = (TextView) findViewById(R.id.textView);
        tv2 = (TextView) findViewById(R.id.textView2);
        spinner = (Spinner) findViewById(R.id.spinner);
        spinner2 = (Spinner) findViewById(R.id.spinner2);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String[] f = getResources().getStringArray(R.array.fruits);
                tv.setText(f[position]);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        ArrayAdapter<String> adapter =new ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, strs);
        spinner2.setAdapter(adapter);
    }

    public void click1(View v)
    {
        int poi = spinner.getSelectedItemPosition();
        String[] f= getResources().getStringArray(R.array.fruits);
        tv2.setText(f[poi]);

    }

}
