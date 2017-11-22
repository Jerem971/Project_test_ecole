package com.example.jag.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText editText;
    Button button;
    Button buttonChangeText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button =   (Button) findViewById(R.id.switchActivity);
        buttonChangeText= (Button) findViewById(R.id.changeText);
        buttonChangeText.setOnClickListener(this);
        button.setOnClickListener(this);
        editText = (EditText) findViewById(R.id.iEdit);

    }

        public void onClick(View view) {
            switch (view.getId()) {
                case R.id.iEdit:
                    editText.setText("Lalala");
                    break;
                case R.id.switchActivity:
                    Intent intent = new Intent(this, SecondeActivity.class);
                    intent.putExtra("input", editText.getText().toString());
                    startActivity(intent);
                    break;
            }

        }

}
