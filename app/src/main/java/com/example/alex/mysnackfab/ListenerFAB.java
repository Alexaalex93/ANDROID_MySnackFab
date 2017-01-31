package com.example.alex.mysnackfab;

import android.graphics.Color;
import android.support.design.widget.Snackbar;
import android.util.Log;
import android.view.View;

/**
 * Created by Alex on 31/01/2017.
 */

public class ListenerFAB implements View.OnClickListener{
    @Override
    public void onClick(View v) {
        Log.e("TAG", "Boton fab tocado");

        Snackbar snackbar = Snackbar.make(v, "Se toco el FAB", Snackbar.LENGTH_LONG); //Para hacer el snackbar
        snackbar.setAction("DeHACER", this); //PARA IMPLEMENTAR LA OPCION DE DESAHCER
        snackbar.setActionTextColor(Color.RED);
        snackbar.setCallback(new Snackbar.Callback() {
            @Override
            public void onDismissed(Snackbar snackbar, int event) {
                Log.e("TAG", "Snackbar fuera");
                super.onDismissed(snackbar, event);
            }

            @Override
            public void onShown(Snackbar snackbar) {
                Log.e("TAG", "Snackbar dentro");

                super.onShown(snackbar);
            }
        });
        snackbar.show();
    }
}

