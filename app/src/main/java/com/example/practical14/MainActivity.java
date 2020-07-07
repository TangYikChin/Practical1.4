package com.example.practical14;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

        private String message = "Toppings: ";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void toastMessage(View view) {
        selectToppings((CheckBox) findViewById(R.id.syrup_lable), getString(R.string.chocolate_syrup));
        selectToppings((CheckBox) findViewById(R.id.sprinkle_lable), getString(R.string.sprinkles));
        selectToppings((CheckBox) findViewById(R.id.crushed_nuts_lable), getString(R.string.crushed_nuts));
        selectToppings((CheckBox) findViewById(R.id.cherries_lable), getString(R.string.cherries));
        selectToppings((CheckBox) findViewById(R.id.orio_lable), getString(R.string.orio));
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }

    private void selectToppings(CheckBox checkBox, String topping) {
        if (checkBox.isChecked()){
            if (!message.contains(topping)){
                message = message + " " + topping;
            }
        }
        else{
            if (message.contains(topping)){
                message = message.replace(" " + topping, "");
            }
        }
    }
    }
