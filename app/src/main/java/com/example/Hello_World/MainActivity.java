package com.example.Hello_World;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        Make a var that shortens time to call a view
        TextView textView = ((TextView) findViewById(R.id.text));
        EditText editText = ((EditText) findViewById(R.id.addCustomTextInput));
        /*
 User can tap on the background view to reset all views to default settings.
          1. Reset text to "Hello From Daeshaun!"
          2. Reset the color of the text to original color
              - Original text color is white, text id: @id/text
          3. Reset the background color
              - Original backgroundcolor is grass green, id: @id/parent
*/
        findViewById(R.id.parent).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText("Hello From Daeshaun");
                textView.setTextColor(getResources().getColor(R.color.white));
                findViewById(R.id.parent).setBackgroundColor(getResources().getColor(R.color.grass_green));
            }
        });
        // User can tap a button to change the text.
        findViewById(R.id.chgTextBtn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((TextView)findViewById(R.id.text)).setText("Android is so awesome!");
            }
        });
        // User can tap a button to change the background color.
        findViewById(R.id.chgBkgColorBtn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                findViewById(R.id.parent).setBackgroundColor(getResources().getColor(R.color.black));
            }
        });
        // User can tap a button to change the text color of the label.
        findViewById(R.id.chgColor).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((TextView) findViewById(R.id.text)).setTextColor(getResources().getColor(R.color.black));
            }
        });
//        User can update the label text with custom text entered into the text field.
        findViewById(R.id.addCustomTextBtn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//              Change text to what's in edit text view
                String userEnteredText = editText.getText().toString();

                if (userEnteredText.isEmpty()) {
                    textView.setText("Put your own custom text!");
                }
                else {
                    textView.setText(userEnteredText);
                }
            }
        });
    }
}