package mrustad.campusbuddy;


import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.*;
import android.view.View.OnClickListener;

public class myTuition extends AppCompatActivity implements OnClickListener{

    private EditText tuition;
    private TextView infoView;
    private DatePicker datePicker;
    private Button loadButton;
    private Button saveInfo;
    private int month;
    private int day;
    private int theYear;

    SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_tuition);
        tuition = (EditText) findViewById(R.id.tuitionText);
        infoView = (TextView) findViewById(R.id.infoText);
        datePicker = (DatePicker) findViewById(R.id.datePicker);
        loadButton = (Button) findViewById(R.id.loadInfo);
        saveInfo = (Button)findViewById(R.id.saveButton);
        loadButton.setOnClickListener(this);
        saveInfo.setOnClickListener(this);
    }

    public String setDate(){
        month = datePicker.getMonth();
        day = datePicker.getDayOfMonth();
        theYear = datePicker.getYear();
        infoView.setText(new StringBuilder().append(month+1).append("/").append(day).append("/").append(theYear).append(" "));
        return null;
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.saveButton:
                setDate();
                sharedPreferences = getSharedPreferences("prefs", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString("tuitionText",tuition.getText().toString());
                editor.putString("dueDate", infoView.getText().toString());
                editor.apply();
                Toast.makeText(this, "Info Saved!", Toast.LENGTH_LONG).show();
                break;
            case R.id.loadInfo:
                sharedPreferences = getSharedPreferences("prefs", Context.MODE_PRIVATE);
                String tuitionText = sharedPreferences.getString("tuitionText", "");
                String date = sharedPreferences.getString("dueDate", "");
                tuition.setText(tuitionText);
                infoView.setText("Your Tuition Payment Is Due: " + date);
        }
    }

}
