package com.example.yoga.aarogya;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.content.Intent;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ImageButton btn;
    ImageButton btn1;
    ImageButton btn2;
    ImageButton btn3;
   private static String weburl = "m.me/166553090538900/";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        btn =(ImageButton) findViewById(R.id.imageButton);
        btn1 =(ImageButton) findViewById(R.id.imageButton4);
        btn2=(ImageButton) findViewById(R.id.imageButton6);
        btn3 =(ImageButton) findViewById(R.id.imageButton7);

        }

        public void btnClick(View v){

            Intent i= new Intent(this,Drugs.class);
            startActivity(i);
        }
    public void btnClick1(View v) {
       Intent sendIntent = new Intent();
        sendIntent.setAction(Intent.ACTION_SEND);
        sendIntent.putExtra(Intent.EXTRA_TEXT,"Hospital bot");
        sendIntent.setType("text/plain");
        sendIntent.setPackage("com.facebook.orca");
        try{
            startActivity(sendIntent);
        }
        catch(android.content.ActivityNotFoundException ex){
            //Toast.makeText(context,"Please install fb messenger",Toast.LENGTH_LONG).show();
        }
    }
    public void btnClick2(View v){
        Intent i= new Intent(this,contacts.class);
        startActivity(i);
    }
    public void btnClick3(View v){
        Intent i= new Intent(this,aboutus.class);
        startActivity(i);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
    }
}
