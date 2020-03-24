package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        Button OKButton = (Button) findViewById(R.id.button);

        final EditText num01 = (EditText) findViewById(R.id.num1);
        final EditText num02 = (EditText) findViewById(R.id.num2);

        OKButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent OKintent = new Intent(FirstActivity.this,SecondActivity.class);

                String n1 = num01.getText().toString();
                String n2 = num02.getText().toString();

                OKintent.putExtra("EXTRA1", n1);
                OKintent.putExtra("EXTRA2", n2);

                Context context = getApplicationContext();
                CharSequence message = "You just clicked the OK button";
                int duration = Toast.LENGTH_SHORT;
                Toast toast = Toast.makeText(context, message, duration);
                toast.show();

                startActivity(OKintent);
            }
        });

        LayoutInflater li = getLayoutInflater();
        View layout = li.inflate(R.layout.activity_custom_toast, (ViewGroup) findViewById(R.id.custom_toast_layout));

        Toast toast = new Toast(getApplicationContext());
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.BOTTOM, 0, 0);
        toast.setView(layout);//setting the view of custom toast layout
        toast.show();
    }
}
