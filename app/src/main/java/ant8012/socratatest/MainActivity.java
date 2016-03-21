package ant8012.socratatest;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

// @TODO: remove later
import com.socrata.android.client.Callback;
import com.socrata.android.client.Consumer;
import com.socrata.android.client.Response;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    // @TODO: remove later
    private Consumer consumer;
    final String domain = "data.austintexas.gov";
    final String dataset = "y4i9-kewd.json";
    final String app_token = "j6K2ZmCfAwyZ6ZmDyGBEA5p2o";
    final String log_label = "TEST";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        // @TODO: remove later
        Log.d(log_label, "in create");
        consumer = new Consumer(domain, app_token);
        // Get all art instances
        consumer.getObjects(dataset, Art.class, new Callback<List<Art>>() {
            @Override
            public void onResults(Response<List<Art>> response) {
                Log.d(log_label, "IN CALLBACK");
                List<Art> artList = response.getEntity();
                for(Art art : artList) {
                   // can now access any attribute
                   Log.d(log_label, art.getArt_title());
                }
            }
        });
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
