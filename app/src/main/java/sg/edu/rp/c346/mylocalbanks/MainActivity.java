package sg.edu.rp.c346.mylocalbanks;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvdbs  , tvocbc  , tvuob;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvdbs = (TextView) findViewById(R.id.tvDBS);
        tvocbc = (TextView) findViewById(R.id.tvOCBC);
        tvuob = (TextView) findViewById(R.id.tvUOB);
        tvdbs.setOnCreateContextMenuListener(new View.OnCreateContextMenuListener() {

            @Override
            public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
                menu.add(0, 0, 0, getString(R.string.website));
                menu.add(0, 1, 1, getString(R.string.contact));
            }

        });

        tvocbc.setOnCreateContextMenuListener(new View.OnCreateContextMenuListener() {

            @Override
            public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
                menu.add(0, 2, 0, getString(R.string.website));
                menu.add(0, 3, 1, getString(R.string.contact));
            }
        });

        tvuob.setOnCreateContextMenuListener(new View.OnCreateContextMenuListener() {

            @Override
            public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
                menu.add(0, 4, 0, getString(R.string.website));
                menu.add(0, 5, 1, getString(R.string.contact));
            }
        });


    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        if (item.getItemId() == 0 ) { //check whether the selected
            String url = "https://www.dbs.com.sg";
            Uri webpage = Uri.parse(url);
            Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
            startActivity(intent);

            return true;

        }
        else if (item.getItemId() == 1){

            String dbsnum = "18001111111";
            Intent intentCall = new Intent(Intent.ACTION_DIAL, Uri.parse("tel: "+ dbsnum));
            startActivity(intentCall);

            return true;

        }


        if (item.getItemId() == 2) {

            String url = "https://www.ocbc.com";
            Uri webpage = Uri.parse(url);
            Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
            startActivity(intent);

            return true;

        }

        else if (item.getItemId() == 3){

            String dbsnum = "18003633333";
            Intent intentCall = new Intent(Intent.ACTION_DIAL, Uri.parse("tel: "+ dbsnum));
            startActivity(intentCall);

            return true;

        }

        if (item.getItemId() == 4) {

            String url = "https://www.uob.com.sg";
            Uri webpage = Uri.parse(url);
            Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
            startActivity(intent);

            return true;

        }

        else if (item.getItemId() == 5){

            String dbsnum = "18002222121";
            Intent intentCall = new Intent(Intent.ACTION_DIAL, Uri.parse("tel: "+ dbsnum));
            startActivity(intentCall);

            return true;

        }
        return super.onContextItemSelected(item);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here.
        int id = item.getItemId();
        if (id == R.id.EnglishSelection) {
            tvdbs.setText(getString(R.string.bank1));
            tvocbc.setText(getString(R.string.bank2));
            tvuob.setText(getString(R.string.bank3));
            return true;
        }
        else if (id == R.id.ChineseSelection) {
            tvdbs.setText("星展银行");
            tvocbc.setText("华侨银行");
            tvuob.setText("大华银行");
            tvdbs.setOnCreateContextMenuListener(new View.OnCreateContextMenuListener() {

                @Override
                public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
                    menu.add(0, 0, 0, getString(R.string.web));
                    menu.add(0, 1, 1, getString(R.string.con));
                }

            });

            tvocbc.setOnCreateContextMenuListener(new View.OnCreateContextMenuListener() {

                @Override
                public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
                    menu.add(0, 2, 0, getString(R.string.web));
                    menu.add(0, 3, 1, getString(R.string.con));
                }
            });

            tvuob.setOnCreateContextMenuListener(new View.OnCreateContextMenuListener() {

                @Override
                public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
                    menu.add(0, 4, 0, getString(R.string.web));
                    menu.add(0, 5, 1, getString(R.string.con));
                }
            });
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
