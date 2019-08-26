package ozd.ouhssain.zak.com.database;

import android.Manifest;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.ActivityCompat;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;
import android.content.pm.PackageManager;
import android.support.annotation.NonNull;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener , OnMapReadyCallback {

    private GoogleMap mMap;
    public static final int REQUEST_LOCATION_PERMISSION = 99;

    private DrawerLayout drawer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
            this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        Button more = (Button)findViewById(R.id.more);
        more.getBackground().setAlpha(0);
        more.setVisibility(View.INVISIBLE);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

/*
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }*/


    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();
        Intent intent;
        Button more = (Button)findViewById(R.id.more);

        if (id == R.id.feselbali) {
            mMap.clear();
            LatLng sydney = new LatLng(34.062952, -4.976860);
            mMap.addMarker(new MarkerOptions().position(sydney).title("Fès El Bali"));
            mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(sydney,15),3000,null);
            more.getBackground().setAlpha(255);
            more.setVisibility(View.VISIBLE);
            more.setHint("feslbali");
        } else if (id == R.id.darlmakhzen) {
            mMap.clear();
            LatLng sydney = new LatLng(34.055683, -4.992766);
            mMap.addMarker(new MarkerOptions().position(sydney).title("Dar El Makhzen"));
            mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(sydney,15),3000,null);
            more.getBackground().setAlpha(255);
            more.setVisibility(View.VISIBLE);
            more.setHint("darlmakhzen");
        } else if (id == R.id.madrassa_bou3nania) {
            mMap.clear();
            LatLng sydney = new LatLng(34.062668, -4.982673);
            mMap.addMarker(new MarkerOptions().position(sydney).title("La médersa Bou Inania"));
            mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(sydney,15),3000,null);
            more.getBackground().setAlpha(255);
            more.setVisibility(View.VISIBLE);
            more.setHint("madrassabouanania");
        } else if (id == R.id.La_Mosquee_Karaouiyne) {
            mMap.clear();
            LatLng sydney = new LatLng(34.065199, -4.973347);
            mMap.addMarker(new MarkerOptions().position(sydney).title("La Mosquée Karaouiyne"));
            mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(sydney, 15), 3000, null);
            more.getBackground().setAlpha(255);
            more.setVisibility(View.VISIBLE);
            more.setHint("mosque");
        }else if (id == R.id.borj_nord_fes) {
            mMap.clear();
            LatLng sydney = new LatLng(34.067451, -4.984965);
            mMap.addMarker(new MarkerOptions().position(sydney).title("Borj Nord Fes"));
            mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(sydney,15),3000,null);
            more.getBackground().setAlpha(255);
            more.setVisibility(View.VISIBLE);
            more.setHint("borj");
        }else if (id == R.id.complexe_nejjarine) {
            mMap.clear();
            LatLng sydney = new LatLng(34.065701, -4.975833);
            mMap.addMarker(new MarkerOptions().position(sydney).title("Complexe Nejjarin"));
            mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(sydney,15),3000,null);
            more.getBackground().setAlpha(255);
            more.setVisibility(View.VISIBLE);
            more.setHint("nejjarin");
        }
        else if (id == R.id.jardin_jnane_sbil) {
            mMap.clear();
            LatLng sydney = new LatLng(34.059328, -4.987977);
            mMap.addMarker(new MarkerOptions().position(sydney).title("Jardin Jnane Sbil"));
            mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(sydney,15),3000,null);
            more.getBackground().setAlpha(255);
            more.setVisibility(View.VISIBLE);
            more.setHint("jnansbil");
        }
        else if (id == R.id.medersa_attarine) {
            mMap.clear();
            LatLng sydney = new LatLng(34.065292, -4.973766);
            mMap.addMarker(new MarkerOptions().position(sydney).title("Medrassa el Attarin"));
            mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(sydney,15),3000,null);
            more.getBackground().setAlpha(255);
            more.setVisibility(View.VISIBLE);
            more.setHint("attarin");
        }
        else if (id == R.id.mellah) {
            mMap.clear();
            LatLng sydney = new LatLng(34.052799, -4.991659);
            mMap.addMarker(new MarkerOptions().position(sydney).title("Mellah"));
            mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(sydney,15),3000,null);
            more.getBackground().setAlpha(255);
            more.setVisibility(View.VISIBLE);
            more.setHint("mellah");
        }
        else if (id == R.id.musee_du_batha) {
            mMap.clear();
            LatLng sydney = new LatLng(34.060342, -4.982586);
            mMap.addMarker(new MarkerOptions().position(sydney).title("Musée du Batha"));
            mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(sydney,15),3000,null);
            more.getBackground().setAlpha(255);
            more.setVisibility(View.VISIBLE);
            more.setHint("musee");
        }
        else if (id == R.id.tannerie_chouara) {
            mMap.clear();
            LatLng sydney = new LatLng(34.066241, -4.970975);
            mMap.addMarker(new MarkerOptions().position(sydney).title("Tannerie Chouara"));
            mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(sydney,15),3000,null);
            more.getBackground().setAlpha(255);
            more.setVisibility(View.VISIBLE);
            more.setHint("chouara");
        }else if (id == R.id.riad_fes_bab_rcif) {
            mMap.clear();
            LatLng sydney = new LatLng(34.062529, -4.972721);
            mMap.addMarker(new MarkerOptions().position(sydney).title("Riad Fes Bab Rcif"));
            mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(sydney,15),3000,null);
            more.getBackground().setAlpha(255);
            more.setVisibility(View.VISIBLE);
            more.setHint("riadfesbabrcif");
        }else if (id == R.id.zalagh_parc_place) {
            mMap.clear();
            LatLng sydney = new LatLng(34.052469, -5.032968);
            mMap.addMarker(new MarkerOptions().position(sydney).title("Zalagh Parc"));
            mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(sydney,15),3000,null);
            more.getBackground().setAlpha(255);
            more.setVisibility(View.VISIBLE);
            more.setHint("salagh");
        }


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        // Add a marker in Sydney and move the camera
        LatLng sydney = new LatLng(33.996751, -4.991633);
        mMap.addMarker(new MarkerOptions().position(sydney).title("Ecole Nationale des Sciences Appliquées"));
        //mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(sydney,15F));
        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(sydney,15),5000,null);

        enableMyLocation();
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.map_options, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Change the map type based on the user's selection.
        switch (item.getItemId()) {
            case R.id.normal_map:
                mMap.setMapType(GoogleMap.MAP_TYPE_NORMAL);
                return true;
            case R.id.hybrid_map:
                mMap.setMapType(GoogleMap.MAP_TYPE_HYBRID);
                return true;
            case R.id.satellite_map:
                mMap.setMapType(GoogleMap.MAP_TYPE_SATELLITE);
                return true;
            case R.id.terrain_map:
                mMap.setMapType(GoogleMap.MAP_TYPE_TERRAIN);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    private void setMapLongClick(final GoogleMap map) {
        map.setOnMapLongClickListener(new GoogleMap.OnMapLongClickListener() {
            @Override
            public void onMapLongClick(LatLng latLng) {
                map.addMarker(new MarkerOptions().position(latLng));
                setMapLongClick(mMap);
            }
        });
    }
    private void enableMyLocation() {
        if (ContextCompat.checkSelfPermission(this,
                Manifest.permission.ACCESS_FINE_LOCATION)
                == PackageManager.PERMISSION_GRANTED) {
            mMap.setMyLocationEnabled(true);
        } else {
            ActivityCompat.requestPermissions(this, new String[]
                            {Manifest.permission.ACCESS_FINE_LOCATION},
                    REQUEST_LOCATION_PERMISSION);
        }
    }

    @Override
    public void onRequestPermissionsResult(int requestCode,
                                           @NonNull String[] permissions,
                                           @NonNull int[] grantResults) {
        // Check if location permissions are granted and if so enable the
        // location data layer.
        switch (requestCode) {
            case REQUEST_LOCATION_PERMISSION:
                if (grantResults.length > 0
                        && grantResults[0]
                        == PackageManager.PERMISSION_GRANTED) {
                    enableMyLocation();
                    break;
                }
        }
    }

    public void onZoom(View view)
    {
        Button more = (Button)findViewById(R.id.more);
        if(view.getId() == R.id.zoommoins)
        {
            mMap.animateCamera(CameraUpdateFactory.zoomOut());
        }
        if(view.getId() == R.id.zoomplus)
        {
            mMap.animateCamera(CameraUpdateFactory.zoomIn());
        }
        if(view.getId() == R.id.more)
        {
            if(more.getHint().equals("feslbali"))
            {
                Intent intent = new Intent(this,Fes_El_Bali.class);
                startActivity(intent);
            }
            if(more.getHint().equals("darlmakhzen"))
            {
                Intent intent = new Intent(this,DarLmakhzen.class);
                startActivity(intent);
            }
            if(more.getHint().equals("madrassabouanania"))
            {
                Intent intent = new Intent(this,MadrassBouanania.class);
                startActivity(intent);
            }
            if(more.getHint().equals("mosque"))
            {
                Intent intent = new Intent(this,MosqueAlquarawiyin.class);
                startActivity(intent);
            }
            if(more.getHint().equals("borj"))
            {
                Intent intent = new Intent(this,BorjNordFes.class);
                startActivity(intent);
            }
            if(more.getHint().equals("nejjarin"))
            {
                Intent intent = new Intent(this,ComplexeNejjarine.class);
                startActivity(intent);
            }
            if(more.getHint().equals("jnansbil"))
            {
                Intent intent = new Intent(this,JnaneSbil.class);
                startActivity(intent);
            }
            if(more.getHint().equals("attarin"))
            {
                Intent intent = new Intent(this,MEdrassaAttarin.class);
                startActivity(intent);
            }
            if(more.getHint().equals("mellah"))
            {
                Intent intent = new Intent(this,Mellah.class);
                startActivity(intent);
            }
            if(more.getHint().equals("musee"))
            {
                Intent intent = new Intent(this,Musee.class);
                startActivity(intent);
            }
            if(more.getHint().equals("chouara"))
            {
                Intent intent = new Intent(this,Chouara.class);
                startActivity(intent);
            }
            if(more.getHint().equals("riadfesbabrcif"))
            {
                Intent intent = new Intent(this,RiadFesBabRcif.class);
                startActivity(intent);
            }
            if(more.getHint().equals("salagh"))
            {
                Intent intent = new Intent(this,Zalagh.class);
                startActivity(intent);
            }
        }
    }


}
