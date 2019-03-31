package com.example.anandmaurya.butterknifeinjectview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

import static android.widget.Toast.LENGTH_SHORT;

public class ButterKnifeActivity extends AppCompatActivity {

    @BindView(R.id.textViewTopic) TextView textViewTopic;
    @BindView(R.id.editTextUserName) EditText editTextUserName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_butter_knife);
        ButterKnife.bind(this);
        textViewTopic.setText(R.string.topic_note);
    }
    @OnClick (R.id.buttonSubmit)
    public void buttonClick(){
        if(editTextUserName.getText().toString().equals("") || editTextUserName.getText().toString() == null){
            Toast.makeText(this, "Please enter your name", Toast.LENGTH_LONG).show();
        }
        else{
            Intent intent = new Intent(this, ButterKnifeSecondActivity.class);
            intent.putExtra("key", editTextUserName.getText().toString());
            startActivity(intent);
            Toast.makeText(this, "Save name and move to next page", Toast.LENGTH_LONG).show();
        }

    }
}
