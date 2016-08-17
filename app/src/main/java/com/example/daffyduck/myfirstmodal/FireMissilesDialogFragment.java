package com.example.daffyduck.myfirstmodal;

import android.app.Dialog;
import android.app.DialogFragment;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.widget.Toast;

public class FireMissilesDialogFragment extends DialogFragment {
    private static Context context;

    public FireMissilesDialogFragment() {
    }

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        // Use the Builder class for convenient dialog construction
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle(R.string.title)
                .setMessage(R.string.dialog_fire_missiles)
                .setPositiveButton(R.string.fire, new DialogInterface.OnClickListener() {
                   public void onClick(DialogInterface dialog, int id) {
                       Toast.makeText(context, R.string.fire, Toast.LENGTH_LONG).show();
                   }
                })
                .setNegativeButton(R.string.cancel, new DialogInterface.OnClickListener() {
                   public void onClick(DialogInterface dialog, int id) {
                       Toast.makeText(context, R.string.fire, Toast.LENGTH_LONG).show();
                   }
               });
        // Create the AlertDialog object and return it
        return  builder.create();
    }

    public static void setContext(Context context) {
        FireMissilesDialogFragment.context = context;
    }
}