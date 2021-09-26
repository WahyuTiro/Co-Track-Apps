package com.kelompok7.kpl.co_track.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.provider.Settings.Secure;
import android.util.Log;
import android.widget.EditText;

import com.kelompok7.kpl.co_track.R;

public class RegisterActivity extends AppCompatActivity {
    private String android_id;
    private EditText EditTextDeviceId;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        EditTextDeviceId=(EditText) findViewById(R.id.et_device_id);
        android_id = Secure.getString(this.getContentResolver(), Secure.ANDROID_ID);
        Log.d("android_id",android_id);

        EditTextDeviceId.setText(android_id);
    }
}
