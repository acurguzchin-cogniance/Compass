package com.example.acurguzchin.compass;

import android.app.Activity;
import android.os.Bundle;

/**
 * Created by acurguzchin on 31.03.15.
 */
public class CompassActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        CompassView compassView = (CompassView) findViewById(R.id.compassView);
        compassView.setBearing(45);
    }
}
