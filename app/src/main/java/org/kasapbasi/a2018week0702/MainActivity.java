package org.kasapbasi.a2018week0702;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater mi= getMenuInflater();
        mi.inflate(R.menu.mymenu, menu);
        return true;

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id=item.getItemId();

        switch (id){

            case R.id.settings:
                Toast.makeText(this, "PUSULAYA  TIKLADIN",Toast.LENGTH_LONG).show();
                break;
            case R.id.refresh:
                Toast.makeText(this, "YILDIZA TIKLADIN",Toast.LENGTH_LONG).show();

                break;
            case R.id.hersettings:
                Toast.makeText(this, "CAN  TIKLADIN",Toast.LENGTH_LONG).show();

                break;
            default:



        }


        return super.onOptionsItemSelected(item);
    }
}
