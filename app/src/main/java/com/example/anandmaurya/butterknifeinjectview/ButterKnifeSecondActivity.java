package com.example.anandmaurya.butterknifeinjectview;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Anand Prakash Maurya on 26/03/2019.
 */
public class ButterKnifeSecondActivity extends AppCompatActivity {
    @BindView(R.id.name) TextView name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bk_second);
        ButterKnife.bind(this);
        Intent intent = getIntent();
        name.setText(intent.getStringExtra("key"));
    }
}
