package com.oscarjesus.mascotas;

import android.content.Intent;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.oscarjesus.mascotas.adapter.MascotaAdaptador;
import com.oscarjesus.mascotas.adapter.pageAdapter;
import com.oscarjesus.mascotas.fragment.PerfilFragment;
import com.oscarjesus.mascotas.fragment.recyclerviewfragments;
import com.oscarjesus.mascotas.pojo.Mascota;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    private Toolbar toolbar;
    private TabLayout tabLayout;
    private ViewPager viewPager;
    private EditText cCorreo;
    private EditText cNombre;
    private EditText cMensaje;
    private Button cEnviar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        tabLayout = (TabLayout) findViewById(R.id.tabLayout);
        viewPager = (ViewPager) findViewById(R.id.viewPager);
        setUpViewPager();

        if(toolbar != null){
            setSupportActionBar(toolbar);
        }

        cCorreo = (EditText) findViewById(R.id.cCorreo);
        cNombre = (EditText) findViewById(R.id.cNombre);
        cMensaje = (EditText) findViewById(R.id.cMensaje);

        cEnviar = (Button) findViewById(R.id.cEnviar);

    }

    private ArrayList<Fragment> agregarFragments(){
        ArrayList<Fragment> fragments = new ArrayList<>();

        fragments.add(new recyclerviewfragments());
        fragments.add(new PerfilFragment());

        return fragments;
    }

    private void setUpViewPager(){
        viewPager.setAdapter(new pageAdapter(getSupportFragmentManager(), agregarFragments()));
        tabLayout.setupWithViewPager(viewPager);
        tabLayout.getTabAt(0).setIcon(R.drawable.ic_dog_house);
        tabLayout.getTabAt(1).setIcon(R.drawable.ic_dog_white);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_opciones, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()){
            case R.id.mContact:
                Intent intent2 = new Intent(this, ActivityContact.class);
                startActivity(intent2);
                break;


            case R.id.mAbout:
                Intent intent1 = new Intent(this, ActivityAbout.class);
                startActivity(intent1);
                break;


            case R.id.mFav:
                Intent intent = new Intent(this, MascotasFav.class);
                startActivity(intent);
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    private void EnviarEmail() {

        String email = cCorreo.getText().toString().trim();
        String subject = cNombre.getText().toString().trim();
        String message = cMensaje.getText().toString().trim();


        EnviarEmail sm = new EnviarEmail(this, email, subject, message);


        sm.execute();
    }

    @Override
    public void onClick(View v) {
        EnviarEmail();
    }
}
