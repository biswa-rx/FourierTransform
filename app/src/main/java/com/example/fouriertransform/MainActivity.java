package com.example.fouriertransform;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.fouriertransfrom.Complex;
import com.example.fouriertransfrom.FourierTransform;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Complex[] data = new Complex[8];
        data[0] = new Complex(1,0);
        data[1] = new Complex(2,0);
        data[2] = new Complex(3,0);
        data[3] = new Complex(4,0);
        data[4] = new Complex(5,0);
        data[5] = new Complex(6,0);
        data[6] = new Complex(7,0);
        data[7] = new Complex(8,0);
        FourierTransform.FFT(data,false);
        FourierTransform.FFT(data,true);
        for(int i = 0;i < data.length;i++){
            System.out.println(data[i].toString());
        }

    }
}