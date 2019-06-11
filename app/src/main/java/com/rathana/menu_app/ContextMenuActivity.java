package com.rathana.menu_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

public class ContextMenuActivity extends AppCompatActivity {

    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_context_menu);

        imageView=findViewById(R.id.imageView);
        registerForContextMenu(imageView);

    }
    //create floating context menu

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        getMenuInflater().inflate(R.menu.context_menu,menu);
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        if(item.getItemId()==R.id.download){

            return true;
        }else if(item.getItemId()==R.id.remove){

            return true;
        }else if(item.getItemId()==R.id.getLink){

            return true;
        }else return false;
    }
}
