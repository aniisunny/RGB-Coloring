package com.example.rgbcoloring;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView redIncrease = (TextView) findViewById(R.id.redIncrease);
        final TextView redValue = (TextView) findViewById(R.id.redValue);
        TextView redDecrease = (TextView) findViewById(R.id.redDecrease);

        TextView greenIncrease = (TextView) findViewById(R.id.greenIncrease);
        final TextView greenValue = (TextView) findViewById(R.id.greenValue);
        TextView greenDecrease = (TextView) findViewById(R.id.greenDecrease);

        TextView blueIncrease = (TextView) findViewById(R.id.blueIncrease);
        final TextView blueValue = (TextView) findViewById(R.id.blueValue);
        TextView blueDecrease = (TextView) findViewById(R.id.blueDecrease);

        final TextView color = (TextView) findViewById(R.id.colour);
        final GradientDrawable colourDrawable = (GradientDrawable) color.getBackground();

        redIncrease.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int currentValue = Integer.parseInt(redValue.getText().toString());
                if(currentValue >= 0 && currentValue < 255) {
                    currentValue++;
                    redValue.setText(String.valueOf(currentValue));

                    int red = Integer.parseInt(redValue.getText().toString());
                    int green = Integer.parseInt(greenValue.getText().toString());
                    int blue = Integer.parseInt(blueValue.getText().toString());
                    String hexCode = String.format("#%02X%02X%02X", red, green, blue);
                    int colour = Color.parseColor(hexCode);
                    colourDrawable.setColor(colour);

                }
            }
        });

        redDecrease.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int currentValue = Integer.parseInt(redValue.getText().toString());
                if(currentValue > 0 && currentValue <= 255) {
                    currentValue--;
                    redValue.setText(String.valueOf(currentValue));

                    int red = Integer.parseInt(redValue.getText().toString());
                    int green = Integer.parseInt(greenValue.getText().toString());
                    int blue = Integer.parseInt(blueValue.getText().toString());
                    String hexCode = String.format("#%02X%02X%02X", red, green, blue);
                    int colour = Color.parseColor(hexCode);
                    colourDrawable.setColor(colour);
                }
            }
        });

        greenIncrease.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int currentValue = Integer.parseInt(greenValue.getText().toString());
                if(currentValue >= 0 && currentValue < 255) {
                    currentValue++;
                    greenValue.setText(String.valueOf(currentValue));

                    int red = Integer.parseInt(redValue.getText().toString());
                    int green = Integer.parseInt(greenValue.getText().toString());
                    int blue = Integer.parseInt(blueValue.getText().toString());
                    String hexCode = String.format("#%02X%02X%02X", red, green, blue);
                    int colour = Color.parseColor(hexCode);
                    colourDrawable.setColor(colour);
                }
            }
        });

        greenDecrease.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int currentValue = Integer.parseInt(greenValue.getText().toString());
                if(currentValue > 0 && currentValue <= 255) {
                    currentValue--;
                    greenValue.setText(String.valueOf(currentValue));

                    int red = Integer.parseInt(redValue.getText().toString());
                    int green = Integer.parseInt(greenValue.getText().toString());
                    int blue = Integer.parseInt(blueValue.getText().toString());
                    String hexCode = String.format("#%02X%02X%02X", red, green, blue);
                    int colour = Color.parseColor(hexCode);
                    colourDrawable.setColor(colour);
                }
            }
        });

        blueIncrease.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int currentValue = Integer.parseInt(blueValue.getText().toString());
                if(currentValue >= 0 && currentValue < 255) {
                    currentValue++;
                    blueValue.setText(String.valueOf(currentValue));

                    int red = Integer.parseInt(redValue.getText().toString());
                    int green = Integer.parseInt(greenValue.getText().toString());
                    int blue = Integer.parseInt(blueValue.getText().toString());
                    String hexCode = String.format("#%02X%02X%02X", red, green, blue);
                    int colour = Color.parseColor(hexCode);
                    colourDrawable.setColor(colour);
                }
            }
        });

        blueDecrease.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int currentValue = Integer.parseInt(blueValue.getText().toString());
                if(currentValue > 0 && currentValue <= 255) {
                    currentValue--;
                    blueValue.setText(String.valueOf(currentValue));

                    int red = Integer.parseInt(redValue.getText().toString());
                    int green = Integer.parseInt(greenValue.getText().toString());
                    int blue = Integer.parseInt(blueValue.getText().toString());
                    String hexCode = String.format("#%02X%02X%02X", red, green, blue);
                    int colour = Color.parseColor(hexCode);
                    colourDrawable.setColor(colour);
                }
            }
        });

    }
}
