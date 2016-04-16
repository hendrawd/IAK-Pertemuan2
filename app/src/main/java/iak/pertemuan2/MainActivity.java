package iak.pertemuan2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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

    public void showGreeting(View view) {
        String greeting =
                ((EditText) findViewById(R.id.et)).getText().toString();
        String nama =
                ((EditText) findViewById(R.id.et_nama)).getText().toString();
        ((TextView) findViewById(R.id.tv)).setText(greeting + " " + nama);
    }

    public void pindahHalaman(View view) {
        Intent intent = new Intent(this, Main2Activity.class);
        intent.putExtra("text",
                ((TextView) findViewById(R.id.tv)).getText().toString());
        startActivity(intent);
    }
}
