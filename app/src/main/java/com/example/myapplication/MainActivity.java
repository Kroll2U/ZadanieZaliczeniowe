package com.example.myapplication;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;


public class MainActivity extends AppCompatActivity {

    EditText editTextFirstName, editTextLastName, editTextPasswordLength;
    Spinner spinnerPosition;
    CheckBox checkBoxLetters, checkBoxDigits, checkBoxSpecial;
    Button buttonGenerate, buttonSubmit;

    String generatedPassword = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        editTextFirstName = findViewById(R.id.editTextFirstName);
        editTextLastName = findViewById(R.id.editTextLastName);
        editTextPasswordLength = findViewById(R.id.editTextPasswordLength);

        spinnerPosition = findViewById(R.id.spinnerPosition);

        checkBoxLetters = findViewById(R.id.checkBoxLetters);
        checkBoxDigits = findViewById(R.id.checkBoxDigits);
        checkBoxSpecial = findViewById(R.id.checkBoxSpecial);

        buttonGenerate = findViewById(R.id.buttonGenerate);
        buttonSubmit = findViewById(R.id.buttonSubmit);

    }
}
