package com.example.trivia;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class mainactivity2 extends AppCompatActivity {

    private RadioGroup radioGroup;
    private Button button;
    private TextView userNameTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        radioGroup = findViewById(R.id.radioGroup);
        button = findViewById(R.id.button4);
        userNameTextView = findViewById(R.id.userNameTextView);


        Intent intent = getIntent();
        String userName = intent.getStringExtra("USER_NAME");
        userNameTextView.setText("Bienvenido, " + userName);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int selectedId = radioGroup.getCheckedRadioButtonId();
                Intent nextIntent;


                if (selectedId == R.id.radioButton5) {
                    nextIntent = new Intent(mainactivity2.this, MainActivity3.class);
                } else {
                    nextIntent = new Intent(mainactivity2.this, MainActivity4.class);
                }


                startActivity(nextIntent);
            }
        });
    }
}
