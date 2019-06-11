package com.rathana.menu_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.SearchView;
import android.util.Log;
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

    //create option menu
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater= getMenuInflater();
                inflater.inflate(R.menu.option_menu,menu);

        MenuItem searchItem = menu.findItem(R.id.search);
        SearchView searchView= (SearchView) searchItem.getActionView();

        searchView.setQueryHint("example@gmail.com");
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String s) {
                Log.e("search",s);
                return false;
            }

            @Override
            public boolean onQueryTextChange(String s) {
                Log.e("search",s);
                return false;
            }
        });

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.favorite:
                showMessage("favorite clicked!");
                return true;
            case R.id.download :
                showMessage("downloading ...");
                return true;

            case R.id.share:

                return true;
            case R.id.theme:

                return true;
            default: return false;
        }
    }

    private void showMessage(String smg){
        Toast.makeText(this, smg, Toast.LENGTH_SHORT).show();
    }
}
