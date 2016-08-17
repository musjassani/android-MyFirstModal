package com.example.daffyduck.myfirstmodal;

import android.app.Dialog;

import android.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private FireMissilesDialogFragment fireMissilesDialogFragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FireMissilesDialogFragment.setContext(this);
        fireMissilesDialogFragment = new FireMissilesDialogFragment();
    }
    public void showDialog(View view) {
        FragmentManager fragmentManager = getFragmentManager();
        fireMissilesDialogFragment.show(fragmentManager, "tag");
    }
}
