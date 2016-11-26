package com.example.hr.projectcard;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.Toast;

public class SpinnerActivity extends GameModeActivity {
    public Spinner spinner1;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_mode);

        addListenerOnSpinnerItemSelection();
    }

    public void addListenerOnSpinnerItemSelection() {
        final String[] spin = new String[1];
        spinner1 = (Spinner) findViewById(R.id.Modes);
        spinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int pos, long l) {
                        // On selecting a spinner item
                        spin[0] = adapterView.getItemAtPosition(pos).toString();
                        // Showing selected spinner item
                        Toast.makeText(getApplicationContext(),
                                "Selected Country : " + spin[0], Toast.LENGTH_SHORT).show();
                    }
                    @Override
                    public void onNothingSelected(AdapterView<?> arg0) {
                        // TODO Auto-generated method stub
                    }
                });
            }
}

