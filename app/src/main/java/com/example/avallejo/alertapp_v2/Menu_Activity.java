package com.example.avallejo.alertapp_v2;

import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.Switch;
import android.widget.TextView;

public class Menu_Activity extends AppCompatActivity
        implements BottomNavigationView.OnNavigationItemSelectedListener {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_);

        BottomNavigationView navigation =  findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(this);

        cargarfragment(new Menu_fragment());
    }

    private boolean cargarfragment (android.support.v4.app.Fragment fragment){
            if (fragment !=null){

                getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.fragmentmain,fragment)
                        .commit();

                return false;
            }
        return false;

    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {

        android.support.v4.app.Fragment fragment = null;

        item.setCheckable(false);

        switch(item.getItemId()){

                case R.id.navigation_menu:
                    item.setCheckable(true);
                    item.setChecked(true);
                fragment = new Menu_fragment();
                break;
            case R.id.navigation_sonidos:

                item.setCheckable(true);
                item.setChecked(true);
                fragment = new Sonidos_fragment();
                break;

            case R.id.navigation_mapa:
                item.setCheckable(true);
                item.setChecked(true);
                fragment = new Mapa_fragment();
                break;
            case R.id.navigation_perfil:
                item.setCheckable(true);
                item.setChecked(true);
                fragment = new Perfil_fragment();
                break;
        }
        return cargarfragment(fragment);
    }
}
