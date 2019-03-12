package com.example.myapplication;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private String someText="something different";

    //private TextView textView;
    //private EditText editText;

    public static final String UNIQUE_KEY = "SomeKey";

    private Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    //    textView = findViewById(R.id.textView);
      //  textView.setText(someText);

        //editText = findViewById(R.id.editText);
        Button button = findViewById(R.id.button);

        context = this;
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //on button click, have notification
                //textView.setText(editText.getText());
                //Toast.makeText(context, "Text Updated", Toast.LENGTH_LONG).show();

                //explicit intent. use Intent. on button click, go to 2nd activity
                Intent intent = new Intent(context, SecondActivity.class);
                intent.putExtra(UNIQUE_KEY, "this is some text");
                startActivity(intent);
            }
        });
    }
}
