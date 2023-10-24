package com.example.joao_rosero_prueba01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText editTextName;
    private EditText editTextLastName;
    private Button buttonNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Referencias
        editTextName = findViewById(R.id.editTextName);
        editTextLastName = findViewById(R.id.editTextLastName);
        buttonNext = findViewById(R.id.buttonNext);

        buttonNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //
                editTextName.setEnabled(true);
                editTextLastName.setEnabled(true);
            }
        });

    }
    public  void onClickView(View view){
        String TextName = editTextName.getText().toString();
        String TextLastName = editTextLastName.getText().toString();

        editTextName.setEnabled(true);
        editTextLastName.setEnabled(true);

    }
}