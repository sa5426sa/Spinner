    package com.example.spinner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

    public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
        TextView tv;
        Spinner spin;
        String [] town={"Tel-Aviv","Haifa","Jerusalem","Beer-Sheva"};
        @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv=findViewById(R.id.tv);
        spin=findViewById(R.id.spin);
        spin.setOnItemSelectedListener(this);
        ArrayAdapter<String> adp=new ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,town);
        spin.setAdapter(adp);
    }

        @Override
        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
            tv.setText("position: "+position+" row id: "+id+"\n- "+town[position]);
        }

        @Override
        public void onNothingSelected(AdapterView<?> parent) {

        }
    }