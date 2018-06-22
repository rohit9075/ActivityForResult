package com.rohit.activityforresult;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final int REQUEST_CODE = 100;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendData(View view) {

        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("name", "rohit kumar");

        //starting the activity with Result request
        startActivityForResult(intent, REQUEST_CODE);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        // getting the return data 
        if (requestCode == REQUEST_CODE && resultCode == RESULT_OK  ){
            String name = data.getStringExtra("return_name");
            Toast.makeText(this, name, Toast.LENGTH_SHORT).show();
        }

    }
}
