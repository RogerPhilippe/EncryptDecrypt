package com.example.rpereira.encryptdecrypt;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.rpereira.encryptdecrypt.security.Security;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String value = Security.encrypt("{\"name\":\"teste123\",\"number\":2}");
        String result = Security.decrypt(value);
    }
}
