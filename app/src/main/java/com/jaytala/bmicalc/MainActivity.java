package com.jaytala.bmicalc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    float weight,height,ans,m;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText edweight,edheight;
        TextView ans;
        Button btn;

        btn = findViewById(R.id.btn);
        edweight = findViewById(R.id.edweight);
        edheight = findViewById(R.id.edheight);
        ans = findViewById(R.id.ans);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                height = Float.parseFloat(edheight.getText().toString());
                weight = Float.parseFloat(edweight.getText().toString());

                m = height/100;
x
                ans.setText(""+weight/(m*m));
            }
        });

    }
}