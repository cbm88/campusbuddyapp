package mrustad.campusbuddy;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.view.ContextThemeWrapper;
import android.widget.*;
import android.view.View.*;


public class MyDormRoom extends AppCompatActivity {

    private CheckBox bedCheck;
    private CheckBox bookCheck;
    private CheckBox lightCheck;
    private CheckBox kitchenCheck;
    private CheckBox writingCheck;
    private CheckBox storageCheck;
    private CheckBox laptopCheck;
    private CheckBox printerCheck;
    private CheckBox entertainCheck;

    SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_dorm_room);
        final CheckBox bedCheck = (CheckBox)findViewById(R.id.bedding);
        final CheckBox bookCheck = (CheckBox)findViewById(R.id.textbooks);
        final CheckBox lightCheck = (CheckBox)findViewById(R.id.lighting);
        final CheckBox kitchenCheck = (CheckBox)findViewById(R.id.kitchenware);
        final CheckBox writingCheck = (CheckBox)findViewById(R.id.writing);
        final CheckBox storageCheck = (CheckBox)findViewById(R.id.storage);
        final CheckBox laptopCheck = (CheckBox)findViewById(R.id.laptop);
        final CheckBox printerCheck = (CheckBox)findViewById(R.id.printer);
        final CheckBox entertainCheck = (CheckBox)findViewById(R.id.entertainment);

        sharedPreferences = PreferenceManager.getDefaultSharedPreferences(this);
        final SharedPreferences.Editor editor = sharedPreferences.edit();

        if (sharedPreferences.getBoolean("checked", true)){
            bedCheck.setChecked(true);
        }
        else if (sharedPreferences.getBoolean("checked", false)){
            bedCheck.setChecked(false);
        }

        if (sharedPreferences.getBoolean("checkedOne", true)){
            bookCheck.setChecked(true);
        }
        else if (sharedPreferences.getBoolean("checkedOne", false)){
            bookCheck.setChecked(false);
        }

        if (sharedPreferences.getBoolean("checkedTwo", true)){
            lightCheck.setChecked(true);
        }
        else if (sharedPreferences.getBoolean("checkedTwo", false)){
            lightCheck.setChecked(false);
        }

        if (sharedPreferences.getBoolean("checkedThree", true)){
            kitchenCheck.setChecked(true);
        }
        else if (sharedPreferences.getBoolean("checkedThree", false)){
            kitchenCheck.setChecked(false);
        }

        if (sharedPreferences.getBoolean("checkedFour", true)){
            writingCheck.setChecked(true);
        }
        else if (sharedPreferences.getBoolean("checkedFour", false)){
            writingCheck.setChecked(false);
        }

        if (sharedPreferences.getBoolean("checkedFive", true)){
            storageCheck.setChecked(true);
        }
        else if (sharedPreferences.getBoolean("checkedFive", false)){
            storageCheck.setChecked(false);
        }

        if (sharedPreferences.getBoolean("checkedSix", true)){
            laptopCheck.setChecked(true);
        }
        else if (sharedPreferences.getBoolean("checkedSix", false)){
            laptopCheck.setChecked(false);
        }

        if (sharedPreferences.getBoolean("checkedSeven", true)){
            printerCheck.setChecked(true);
        }
        else if (sharedPreferences.getBoolean("checkedSeven", false)){
            printerCheck.setChecked(false);
        }

        if (sharedPreferences.getBoolean("checkedEight", true)){
            entertainCheck.setChecked(true);
        }
        else if (sharedPreferences.getBoolean("checkedEight", false)){
            entertainCheck.setChecked(false);
        }

        bedCheck.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (bedCheck.isChecked()){
                    editor.putBoolean("checked", true);
                    editor.apply();
                }
                else{
                    editor.putBoolean("checked", false);
                    editor.apply();
                }
            }
        });

        bookCheck.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (bookCheck.isChecked()){
                    editor.putBoolean("checkedOne", true);
                    editor.apply();
                }
                else{
                    editor.putBoolean("checkedOne", false);
                    editor.apply();
                }
            }
        });

        lightCheck.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (lightCheck.isChecked()){
                    editor.putBoolean("checkedTwo", true);
                    editor.apply();
                }
                else{
                    editor.putBoolean("checkedTwo", false);
                    editor.apply();
                }
            }
        });

        kitchenCheck.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (kitchenCheck.isChecked()){
                    editor.putBoolean("checkedThree", true);
                    editor.apply();
                }
                else{
                    editor.putBoolean("checkedThree", false);
                    editor.apply();
                }
            }
        });

        writingCheck.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (writingCheck.isChecked()){
                    editor.putBoolean("checkedFour", true);
                    editor.apply();
                }
                else{
                    editor.putBoolean("checkedFour", false);
                    editor.apply();
                }
            }
        });

        storageCheck.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (storageCheck.isChecked()){
                    editor.putBoolean("checkedFive", true);
                    editor.apply();
                }
                else {
                    editor.putBoolean("checkedFive", false);
                    editor.apply();
                }
            }
        });

        laptopCheck.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (laptopCheck.isChecked()){
                    editor.putBoolean("checkedSix", true);
                    editor.apply();
                }
                else{
                    editor.putBoolean("checkedSix", false);
                    editor.apply();
                }
            }
        });

        printerCheck.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (printerCheck.isChecked()){
                    editor.putBoolean("checkedSeven", true);
                    editor.apply();
                }
                else{
                    editor.putBoolean("checkedSeven", false);
                    editor.apply();
                }
            }
        });

        entertainCheck.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (entertainCheck.isChecked()){
                    editor.putBoolean("checkedEight", true);
                    editor.apply();
                }
                else{
                    editor.putBoolean("checkedEight", false);
                    editor.apply();
                }
            }
        });
    }
}
