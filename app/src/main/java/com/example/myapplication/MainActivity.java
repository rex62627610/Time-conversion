package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void conversion(View view){
        EditText year = findViewById(R.id.year);
        EditText month = findViewById(R.id.month);
        EditText day = findViewById(R.id.day);
        EditText hour = findViewById(R.id.hour);
        EditText minute = findViewById(R.id.minute);
        EditText second = findViewById(R.id.second);
        TextView time = findViewById(R.id.textView6);
        TextView tv = findViewById(R.id.textView7);

        try {
            int y = Integer.parseInt(year.getText().toString());
            int m1 = Integer.parseInt(month.getText().toString());
            int d = Integer.parseInt(day.getText().toString());
            int h = Integer.parseInt(hour.getText().toString());
            int m2 = Integer.parseInt(minute.getText().toString());
            int s = Integer.parseInt(second.getText().toString());

            if(m1<13 && h<24 && m2<61 && s<61 && m1>0 && d>0 && h>-1 && m2>-1 && s>-1){
                switch (m1){
                    case 1:
                        if(d<32){
                            time.setText(y+"/"+m1+"/"+d+" "+h+":"+m2+":"+s);
                        }
                        else {
                            Toast.makeText(this, "請輸入正確格式", Toast.LENGTH_LONG).show();
                        }
                        break;
                    case 2:
                        if(y%4==0){

                            if(y%100==0 ){

                                if(y%400==0){
                                    if(d<30){
                                        time.setText(y+"/"+m1+"/"+d+" "+h+":"+m2+":"+s);
                                    }
                                    else {
                                        Toast.makeText(this, "請輸入正確格式", Toast.LENGTH_LONG).show();
                                    }
                                }else{
                                    if(d<29){
                                        time.setText(y+"/"+m1+"/"+d+" "+h+":"+m2+":"+s);
                                    }
                                    else {
                                        Toast.makeText(this, "請輸入正確格式", Toast.LENGTH_LONG).show();
                                    }
                                }
                            }else{
                                if(d<30){
                                    time.setText(y+"/"+m1+"/"+d+" "+h+":"+m2+":"+s);
                                }
                                else {
                                    Toast.makeText(this, "請輸入正確格式", Toast.LENGTH_LONG).show();
                                }
                            }
                        }else{
                            if(d<29){
                                time.setText(y+"/"+m1+"/"+d+" "+h+":"+m2+":"+s);
                            }
                            else {
                                Toast.makeText(this, "請輸入正確格式", Toast.LENGTH_LONG).show();
                            }
                        }
                        break;
                    case 3:
                        if(d<32){
                            time.setText(y+"/"+m1+"/"+d+" "+h+":"+m2+":"+s);
                        }
                        else {
                            Toast.makeText(this, "請輸入正確格式", Toast.LENGTH_LONG).show();
                        }
                        break;
                    case 4:
                        if(d<31){
                            time.setText(y+"/"+m1+"/"+d+" "+h+":"+m2+":"+s);
                        }
                        else {
                            Toast.makeText(this, "請輸入正確格式", Toast.LENGTH_LONG).show();
                        }
                        break;
                    case 5:
                        if(d<32){
                            time.setText(y+"/"+m1+"/"+d+" "+h+":"+m2+":"+s);
                        }
                        else {
                            Toast.makeText(this, "請輸入正確格式", Toast.LENGTH_LONG).show();
                        }
                        break;
                    case 6:
                        if(d<31){
                            time.setText(y+"/"+m1+"/"+d+" "+h+":"+m2+":"+s);
                        }
                        else {
                            Toast.makeText(this, "請輸入正確格式", Toast.LENGTH_LONG).show();
                        }
                        break;
                    case 7:
                        if(d<32){
                            time.setText(y+"/"+m1+"/"+d+" "+h+":"+m2+":"+s);
                        }
                        else {
                            Toast.makeText(this, "請輸入正確格式", Toast.LENGTH_LONG).show();
                        }
                        break;
                    case 8:
                        if(d<32){
                            time.setText(y+"/"+m1+"/"+d+" "+h+":"+m2+":"+s);
                        }
                        else {
                            Toast.makeText(this, "請輸入正確格式", Toast.LENGTH_LONG).show();
                        }
                        break;
                    case 9:
                        if(d<31){
                            time.setText(y+"/"+m1+"/"+d+" "+h+":"+m2+":"+s);
                        }
                        else {
                            Toast.makeText(this, "請輸入正確格式", Toast.LENGTH_LONG).show();
                        }
                        break;
                    case 10:
                        if(d<32){
                            time.setText(y+"/"+m1+"/"+d+" "+h+":"+m2+":"+s);
                        }
                        else {
                            Toast.makeText(this, "請輸入正確格式", Toast.LENGTH_LONG).show();
                        }
                        break;
                    case 11:
                        if(d<31){
                            time.setText(y+"/"+m1+"/"+d+" "+h+":"+m2+":"+s);
                        }
                        else {
                            Toast.makeText(this, "請輸入正確格式", Toast.LENGTH_LONG).show();
                        }
                        break;
                    case 12:
                        if(d<32){
                            time.setText(y+"/"+m1+"/"+d+" "+h+":"+m2+":"+s);
                        }
                        else {
                            Toast.makeText(this, "請輸入正確格式", Toast.LENGTH_LONG).show();
                        }
                        break;
                }
            }else {
                Toast.makeText(this, "請輸入正確格式", Toast.LENGTH_LONG).show();
            }
            if(y%4==0){

                if(y%100==0 ){

                    if(y%400==0){
                        tv.setText("閏年:是");
                    }else{
                        tv.setText("閏年:不是");
                    }
                }else{
                    tv.setText("閏年:是");
                }
            }else{
                tv.setText("閏年:不是");
            }
        }
        catch (Exception e){
            Toast.makeText(this, "請輸入正確格式", Toast.LENGTH_LONG).show();
        }
    }

}