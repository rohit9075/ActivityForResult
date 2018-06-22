package com.rohit.activityforresult;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        Toast.makeText(this, name, Toast.LENGTH_SHORT).show();
    }

    public void returnData(View view) {

        Intent intent = new Intent();
        intent.putExtra("return_name", "vivek kumar");
        //Returning the data to calling activity
        setResult(RESULT_OK, intent);
        finish();
    }
}
