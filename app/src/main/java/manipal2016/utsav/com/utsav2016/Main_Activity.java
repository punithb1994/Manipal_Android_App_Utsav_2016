package manipal2016.utsav.com.utsav2016;

import android.Manifest;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

import com.pushbots.push.Pushbots;

/*
 *********Created by Akshath K, Punith B, Ajay J [March 2016]*********
*/
public class Main_Activity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener,ActivityCompat.OnRequestPermissionsResultCallback {
    int ishomeopen = 1;
    int fragmentopened=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        isStoragePermissionGranted();
        isLocationPermissionGranted();
        isCallPermissionGranted();

        Pushbots.sharedInstance().init(this);


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();
        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
        openhome();
    }
    public boolean isLocationPermissionGranted()
    {
        if (Build.VERSION.SDK_INT >= 23)
        {
            if (checkSelfPermission(android.Manifest.permission.ACCESS_FINE_LOCATION) == PackageManager.PERMISSION_GRANTED)
            {
                return true;
            }
            else
            {
                ActivityCompat.requestPermissions(this, new String[]{android.Manifest.permission.ACCESS_FINE_LOCATION}, 1);
                return false;
            }
        }
        else
        {
            return true;
        }
    }
    public boolean isStoragePermissionGranted()
    {
        if (Build.VERSION.SDK_INT >= 23)
        {
            if (checkSelfPermission(android.Manifest.permission.WRITE_EXTERNAL_STORAGE) == PackageManager.PERMISSION_GRANTED)
            {
                return true;
            }
            else
            {
                ActivityCompat.requestPermissions(this, new String[]{android.Manifest.permission.WRITE_EXTERNAL_STORAGE}, 1);
                return false;
            }
        }
        else
        {
            return true;
        }
    }
    public boolean isCallPermissionGranted()
    {
        if (Build.VERSION.SDK_INT >= 23)
        {
            if (checkSelfPermission(Manifest.permission.CALL_PHONE) == PackageManager.PERMISSION_GRANTED)
            {
                return true;
            }
            else
            {
                ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.CALL_PHONE}, 1);
                return false;
            }
        }
        else
        {
            return true;
        }
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        int id = item.getItemId();
            return super.onOptionsItemSelected(item);
    }
    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();
        Fragment fragment = null;
        if (id == R.id.nav_1)
        {
            openhome();
        }
        else if (id == R.id.nav_2)
        {
        ishomeopen = 0;
            Intent add_mem = new Intent(this, Listing_Events.class);
            startActivity(add_mem);

            if(fragmentopened==1)
            {
            try {
                // code runs in a thread
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {

                        openhome();

                    }
                });
            } catch (final Exception ex) {
                Log.i("---", "Exception in thread");
            }

                }
                else
                {}
        }
        else if (id == R.id.nav_3)
        {
            ishomeopen = 0;
            Intent add_mem = new Intent(this, Maps_Activity.class);
            startActivity(add_mem);
if(fragmentopened==1) {
    try {
        // code runs in a thread
        runOnUiThread(new Runnable() {
            @Override
            public void run() {

                openhome();

            }
        });
    } catch (final Exception ex) {
        Log.i("---", "Exception in thread");
    }
}
            else
{}

        }
        else if (id == R.id.nav_4)
        {
            fragmentopened=1;
            ishomeopen = 0;
            fragment = new Contacts_Fragment();
            FragmentManager fragmentManager = getSupportFragmentManager();
            fragmentManager.beginTransaction().replace(R.id.content_frame, fragment).commit();
            setTitle("Contacts");
        }
        else if (id == R.id.nav_5)
        {
            fragmentopened=1;
            ishomeopen = 0;
            fragment = new Rules_Fragment();
            FragmentManager fragmentManager = getSupportFragmentManager();
            fragmentManager.beginTransaction().replace(R.id.content_frame, fragment).commit();
            setTitle("General Rules");
        }

        else if (id == R.id.nav_6)
        {
            fragmentopened=1;
            ishomeopen = 0;
            fragment = new Feedback();
            FragmentManager fragmentManager = getSupportFragmentManager();
            fragmentManager.beginTransaction().replace(R.id.content_frame, fragment).commit();
            setTitle("Feedback");
        }
        else if (id == R.id.nav_7)
        {
            fragmentopened=1;
            ishomeopen = 0;
            fragment = new Developers_Fragment();
            FragmentManager fragmentManager = getSupportFragmentManager();
            fragmentManager.beginTransaction().replace(R.id.content_frame, fragment).commit();
            setTitle("The Team");
        }
        else if (id == R.id.nav_8)
        {
            closeExit();
      }
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
    public void onBackPressed()
    {

        if (ishomeopen != 1)
        {
            openhome();
        }
        else
        {
            DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
            drawer.closeDrawer(GravityCompat.START);
            closeExit();
        }
    }

    public void closeExit()
    {
        openhome();
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
        alertDialogBuilder.setTitle("Exit Application");
        alertDialogBuilder.setCancelable(false).setNegativeButton("No", new DialogInterface.OnClickListener()
        {
            public void onClick(DialogInterface dialog, int id) {
                dialog.cancel();
            }
        }).setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id)
            {
                AppExit();
            }
        });
        AlertDialog alertDialog = alertDialogBuilder.create();
        alertDialog.show();
    }
    public void AppExit()
    {
        this.finish();
        Intent intent = new Intent(Intent.ACTION_MAIN);
        intent.addCategory(Intent.CATEGORY_HOME);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }
    public void openhome()
    {
             fragmentopened=0;
            ishomeopen = 1;
            Fragment ho = null;
            ho = new Home_Fragment();
            FragmentManager fragmentManager = getSupportFragmentManager();
            fragmentManager.beginTransaction().replace(R.id.content_frame, ho).commit();
            setTitle("Utsav 2016");

        }


}