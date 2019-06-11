package com.rathana.menu_app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.PopupMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class PopupMenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_popup_menu);
    }

    public void onPopupClicked(View v){

        PopupMenu popupMenu =new PopupMenu(this,v);
        popupMenu.inflate(R.menu.popup_menu);
        popupMenu.show();

        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem menuItem) {
                switch (menuItem.getItemId()){
                    case R.id.edit:
                        startActivity(new Intent(
                                PopupMenuActivity.this,
                                MainActivity.class));
                        return true;
                    case R.id.remove:
                        Toast.makeText(PopupMenuActivity.this,
                                "This post have removed", Toast.LENGTH_SHORT).show();
                        return true;
                    case R.id.share:
                        return true;
                    case R.id.pinPost:
                        return true;
                    default: return true;
                }
            }
        });

    }
}
