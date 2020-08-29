package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
EditText etid;
Button btnsubmit;
TextView tvresults;
@Override
protected void onCreate(Bundle savedInstanceState)
{
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
etid=findViewById(R.id.etid);
btnsubmit=findViewById(R.id.btnsubmit);
tvresults=findViewById(R.id.tvresults);
btnsubmit.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view)
    {
        String idnumber= etid.getText().toString().trim();
        String dob=idnumber.substring(0,6);
        int gender=Integer.parseInt(Character.toString(idnumber.charAt(6)));
        String sgender;
        if(gender<5)
            sgender=getString(R.string.female);
        else
            sgender=getString(R.string.male);
        int nationality;
        nationality=Integer.parseInt(Character.toString(idnumber.charAt(10)));
        String snationality;
        if(nationality==0)
            snationality=getString(R.string.sacitizen);
        else
            snationality=getString(R.string.permanentcitizen);
        String text=getString(R.string.dob)+dob+getString(R.string.newline)+
                getString(R.string.gender) +sgender+getString(R.string.newline1)+
                getString(R.string.nationality)+getString(R.string.snationality);
        tvresults.setText(text);
    }
});

    }
}