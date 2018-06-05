package manipal2016.utsav.com.utsav2016;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.location.Criteria;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Toast;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
/*
 *********Created by Akshath K, Punith B, Ajay J [March 2016]*********
*/
public class Maps_Activity extends FragmentActivity implements OnMapReadyCallback {
    Location loc;
    private GoogleMap mMap;
    private Toolbar toolbar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        try
        {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.maps_intent);
            toolbar = (Toolbar) findViewById(R.id.toolbar);
            toolbar.setTitle("Maps");
            toolbar.setNavigationIcon(R.drawable.abc_ic_ab_back_mtrl_am_alpha);
            toolbar.setNavigationOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    onBackPressed();
                }
            });
            LocationManager locationManager = (LocationManager) getSystemService(LOCATION_SERVICE);
            if (locationManager.isProviderEnabled(LocationManager.GPS_PROVIDER))
            {
                fungetloc();
            }
            else
            {
                showGPSDisabledAlertToUser();
            }
            FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
            fab.setOnClickListener(new View.OnClickListener()
            {
                @Override
                public void onClick(View view)
                {
                    LocationManager locationManager = (LocationManager) getSystemService(LOCATION_SERVICE);
                    if (locationManager.isProviderEnabled(LocationManager.GPS_PROVIDER))
                    {
                        Toast.makeText(getApplicationContext(), "Searching Location", Toast.LENGTH_SHORT).show();
                        fungetloc();
                    }
                    else
                    {
                        showGPSDisabledAlertToUser();
                    }
                }
            });

            // Obtain the SupportMapFragment and get notified when the map is ready to be used.
            SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map);
            mapFragment.getMapAsync(this);

        }
        catch (Exception e)
        {
            Toast.makeText(getApplicationContext(), "Error", Toast.LENGTH_LONG).show();
        }
    }


    public void onBackPressed()
    {
        finish();
    }
    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    private void showGPSDisabledAlertToUser()
    {
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
        alertDialogBuilder.setMessage("GPS is disabled on your device. Would you like to enable it?")
                .setCancelable(false)
                .setPositiveButton("Enable GPS",
                        new DialogInterface.OnClickListener()
                        {
                            public void onClick(DialogInterface dialog, int id)
                            {
                                Intent callGPSSettingIntent = new Intent(android.provider.Settings.ACTION_LOCATION_SOURCE_SETTINGS);
                                startActivity(callGPSSettingIntent);
                            }
                        });
        alertDialogBuilder.setNegativeButton("Cancel",
                new DialogInterface.OnClickListener()
                {
                    public void onClick(DialogInterface dialog, int id)
                    {
                        dialog.cancel();
                    }
                });
        AlertDialog alert = alertDialogBuilder.create();
        alert.show();
    }

    @Override
    public void onMapReady(GoogleMap googleMap)
    {
        mMap = googleMap;
        setUpMap();

        LatLng cur_Latlng = new LatLng(13.347, 74.788); // giving your marker to zoom to your location area.
        mMap.moveCamera(CameraUpdateFactory.newLatLng(cur_Latlng));
        mMap.animateCamera(CameraUpdateFactory.zoomTo(13));



        // Add a marker and move the camera
        LatLng soahs = new LatLng(13.352877, 74.786250);
        mMap.addMarker(new MarkerOptions().position(soahs).title("SOAHS").icon(BitmapDescriptorFactory
                .defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)));

        LatLng kmcgreens = new LatLng(13.353574, 74.786784);
        mMap.addMarker(new MarkerOptions().position(kmcgreens).title("KMC Greens").icon(BitmapDescriptorFactory
                .defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));

        LatLng tigercircle = new LatLng(13.352482, 74.787203);
        mMap.addMarker(new MarkerOptions().position(tigercircle).title("Tiger Circle (TC)").icon(BitmapDescriptorFactory
                .defaultMarker(BitmapDescriptorFactory.HUE_RED)));

        LatLng manipaledu = new LatLng(13.353266, 74.784909);
        mMap.addMarker(new MarkerOptions().position(manipaledu).title("Manipal.edu").icon(BitmapDescriptorFactory
                .defaultMarker(BitmapDescriptorFactory.HUE_MAGENTA)));

        LatLng tmapaihall = new LatLng(13.353325, 74.787851);
        mMap.addMarker(new MarkerOptions().position(tmapaihall).title("Dr. T.M.A.Pai Hall").icon(BitmapDescriptorFactory
                .defaultMarker(BitmapDescriptorFactory.HUE_BLUE)));

        LatLng kmcfoodcourt = new LatLng(13.353113, 74.785708);
        mMap.addMarker(new MarkerOptions().position(kmcfoodcourt).title("KMC Food Court").icon(BitmapDescriptorFactory
                .defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));

        LatLng mmmc = new LatLng(13.356003, 74.785227);
        mMap.addMarker(new MarkerOptions().position(mmmc).title("MMMC").icon(BitmapDescriptorFactory
                .defaultMarker(BitmapDescriptorFactory.HUE_VIOLET)));

        LatLng kmc = new LatLng(13.353982, 74.790009);
        mMap.addMarker(new MarkerOptions().position(kmc).title("KMC Hospital").icon(BitmapDescriptorFactory
                .defaultMarker(BitmapDescriptorFactory.HUE_CYAN)));


    }

    private void showCurrentLocation(Location location)
    {
    try
    {
    loc = location;
    mMap.clear();
    LatLng currentPosition = new LatLng(location.getLatitude(), location.getLongitude());
        // Add a marker and move the camera
        LatLng soahs = new LatLng(13.352877, 74.786250);
        mMap.addMarker(new MarkerOptions().position(soahs).title("SOAHS").icon(BitmapDescriptorFactory
                .defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)));

        LatLng kmcgreens = new LatLng(13.353574, 74.786784);
        mMap.addMarker(new MarkerOptions().position(kmcgreens).title("KMC Greens").icon(BitmapDescriptorFactory
                .defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));

        LatLng tigercircle = new LatLng(13.352482, 74.787203);
        mMap.addMarker(new MarkerOptions().position(tigercircle).title("Tiger Circle (TC)").icon(BitmapDescriptorFactory
                .defaultMarker(BitmapDescriptorFactory.HUE_RED)));

        LatLng manipaledu = new LatLng(13.353266, 74.784909);
        mMap.addMarker(new MarkerOptions().position(manipaledu).title("Manipal.edu").icon(BitmapDescriptorFactory
                .defaultMarker(BitmapDescriptorFactory.HUE_MAGENTA)));

        LatLng tmapaihall = new LatLng(13.353325, 74.787851);
        mMap.addMarker(new MarkerOptions().position(tmapaihall).title("Dr. T.M.A.Pai Hall").icon(BitmapDescriptorFactory
                .defaultMarker(BitmapDescriptorFactory.HUE_BLUE)));

        LatLng kmcfoodcourt = new LatLng(13.353113, 74.785708);
        mMap.addMarker(new MarkerOptions().position(kmcfoodcourt).title("KMC Food Court").icon(BitmapDescriptorFactory
                .defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));

        LatLng mmmc = new LatLng(13.356003, 74.785227);
        mMap.addMarker(new MarkerOptions().position(mmmc).title("MMMC").icon(BitmapDescriptorFactory
                .defaultMarker(BitmapDescriptorFactory.HUE_VIOLET)));

        LatLng kmc = new LatLng(13.353982, 74.790009);
        mMap.addMarker(new MarkerOptions().position(kmc).title("KMC Hospital").icon(BitmapDescriptorFactory
                .defaultMarker(BitmapDescriptorFactory.HUE_CYAN)));


    mMap.addMarker(new MarkerOptions()
            .position(currentPosition)
            .snippet("Lat: " + location.getLatitude() + ", Lng: " + location.getLongitude())
            .icon(BitmapDescriptorFactory.fromResource(R.drawable.cur_position))
            .flat(true)
            .title("Me"));
    }
    catch (Exception e)
     {
      Toast.makeText(getApplicationContext(), "Exception in showcurrent loctat", Toast.LENGTH_LONG).show();
     }
    }


    private void fungetloc()
    {
        try
        {
            LocationManager locationManager = (LocationManager) getSystemService(LOCATION_SERVICE);
            Criteria criteria = new Criteria();
            criteria.setAccuracy(Criteria.ACCURACY_LOW);
            String bestProvider = locationManager.getBestProvider(criteria, true);
            Location location = locationManager.getLastKnownLocation(bestProvider);
            if(location!=null)
            {
                double latitude = location.getLatitude();
                double longitude = location.getLongitude();
                LatLng currentPosition = new LatLng(latitude,longitude);
                mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(currentPosition, 18));
            }
        }
        catch (Exception e)
        {
            //Toast.makeText(getApplicationContext(), e.toString(), Toast.LENGTH_LONG).show();
        }
    }

    private void setUpMap()
    {
        try {
            // Add a marker and move the camera
            LatLng soahs = new LatLng(13.352877, 74.786250);
            mMap.addMarker(new MarkerOptions().position(soahs).title("SOAHS").icon(BitmapDescriptorFactory
                    .defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)));

            LatLng kmcgreens = new LatLng(13.353574, 74.786784);
            mMap.addMarker(new MarkerOptions().position(kmcgreens).title("KMC Greens").icon(BitmapDescriptorFactory
                    .defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));

            LatLng tigercircle = new LatLng(13.352482, 74.787203);
            mMap.addMarker(new MarkerOptions().position(tigercircle).title("Tiger Circle (TC)").icon(BitmapDescriptorFactory
                    .defaultMarker(BitmapDescriptorFactory.HUE_RED)));

            LatLng manipaledu = new LatLng(13.353266, 74.784909);
            mMap.addMarker(new MarkerOptions().position(manipaledu).title("Manipal.edu").icon(BitmapDescriptorFactory
                    .defaultMarker(BitmapDescriptorFactory.HUE_MAGENTA)));

            LatLng tmapaihall = new LatLng(13.353325, 74.787851);
            mMap.addMarker(new MarkerOptions().position(tmapaihall).title("Dr. T.M.A.Pai Hall").icon(BitmapDescriptorFactory
                    .defaultMarker(BitmapDescriptorFactory.HUE_BLUE)));

            LatLng kmcfoodcourt = new LatLng(13.353113, 74.785708);
            mMap.addMarker(new MarkerOptions().position(kmcfoodcourt).title("KMC Food Court").icon(BitmapDescriptorFactory
                    .defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));

            LatLng mmmc = new LatLng(13.356003, 74.785227);
            mMap.addMarker(new MarkerOptions().position(mmmc).title("MMMC").icon(BitmapDescriptorFactory
                    .defaultMarker(BitmapDescriptorFactory.HUE_VIOLET)));

            LatLng kmc = new LatLng(13.353982, 74.790009);
            mMap.addMarker(new MarkerOptions().position(kmc).title("KMC Hospital").icon(BitmapDescriptorFactory
                    .defaultMarker(BitmapDescriptorFactory.HUE_CYAN)));


            LocationManager locationManager = (LocationManager) getSystemService(LOCATION_SERVICE);
            mMap.setMapType(GoogleMap.MAP_TYPE_HYBRID);
            Criteria criteria = new Criteria();
            criteria.setAccuracy(Criteria.ACCURACY_FINE);

            String provider = locationManager.getBestProvider(criteria, true);

            LocationListener locationListener = new LocationListener()
            {

                @Override
                public void onLocationChanged(Location location)
                {
                    showCurrentLocation(location);
                }

                @Override
                public void onStatusChanged(String s, int i, Bundle bundle)
                {
                }

                @Override
                public void onProviderEnabled(String s)
                {
                }

                @Override
                public void onProviderDisabled(String s)
                {
                }
            };

            if (ActivityCompat.checkSelfPermission(this, android.Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this, android.Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
                // TODO: Consider calling
                //    ActivityCompat#requestPermissions
                // here to request the missing permissions, and then overriding
                //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
                //                                          int[] grantResults)
                // to handle the case where the user grants the permission. See the documentation
                // for ActivityCompat#requestPermissions for more details.
                return;
            }
            locationManager.requestLocationUpdates(provider, 2000, 0, locationListener);

            // Getting initial Location
            Location location = locationManager.getLastKnownLocation(provider);
            // Show the initial location
            if (location != null) {
                showCurrentLocation(location);
            }
            else
            {
                //Toast.makeText(getApplicationContext(), "Searching GPS", Toast.LENGTH_LONG).show();
            }

            // Add a marker and move the camera
            LatLng msoahs = new LatLng(13.352877, 74.786250);
            mMap.addMarker(new MarkerOptions().position(msoahs).title("SOAHS").icon(BitmapDescriptorFactory
                    .defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)));

            LatLng mkmcgreens = new LatLng(13.353574, 74.786784);
            mMap.addMarker(new MarkerOptions().position(mkmcgreens).title("KMC Greens").icon(BitmapDescriptorFactory
                    .defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));

            LatLng mtigercircle = new LatLng(13.352482, 74.787203);
            mMap.addMarker(new MarkerOptions().position(mtigercircle).title("Tiger Circle (TC)").icon(BitmapDescriptorFactory
                    .defaultMarker(BitmapDescriptorFactory.HUE_RED)));

            LatLng mmanipaledu = new LatLng(13.353266, 74.784909);
            mMap.addMarker(new MarkerOptions().position(mmanipaledu).title("Manipal.edu").icon(BitmapDescriptorFactory
                    .defaultMarker(BitmapDescriptorFactory.HUE_MAGENTA)));

            LatLng mtmapaihall = new LatLng(13.353325, 74.787851);
            mMap.addMarker(new MarkerOptions().position(mtmapaihall).title("Dr. T.M.A.Pai Hall").icon(BitmapDescriptorFactory
                    .defaultMarker(BitmapDescriptorFactory.HUE_BLUE)));

            LatLng mkmcfoodcourt = new LatLng(13.353113, 74.785708);
            mMap.addMarker(new MarkerOptions().position(mkmcfoodcourt).title("KMC Food Court").icon(BitmapDescriptorFactory
                    .defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));

            LatLng mmmmc = new LatLng(13.356003, 74.785227);
            mMap.addMarker(new MarkerOptions().position(mmmmc).title("MMMC").icon(BitmapDescriptorFactory
                    .defaultMarker(BitmapDescriptorFactory.HUE_VIOLET)));

            LatLng mkmc = new LatLng(13.353982, 74.790009);
            mMap.addMarker(new MarkerOptions().position(mkmc).title("KMC Hospital").icon(BitmapDescriptorFactory
                    .defaultMarker(BitmapDescriptorFactory.HUE_CYAN)));

        }
        catch (Exception e)
        {
            Toast.makeText(getApplicationContext(), "Error", Toast.LENGTH_LONG).show();
        }
    }
}
