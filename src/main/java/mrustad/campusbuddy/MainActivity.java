package mrustad.campusbuddy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.mainmenu, menu);
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        switch (id) {
            case R.id.classSchedule:
                startActivity(new Intent(getApplicationContext(), MyDormRoom.class));
                return true;
            case R.id.gpaCalculator:
                startActivity(new Intent(getApplicationContext(), gpaCalculator.class));
                return true;
            case R.id.tuitionPage:
                startActivity(new Intent(getApplicationContext(), myTuition.class));
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

}