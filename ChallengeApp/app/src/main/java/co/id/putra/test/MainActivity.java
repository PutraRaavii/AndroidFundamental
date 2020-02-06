package co.id.putra.test;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import co.id.putra.test.laptop.RogGL553VD;
import co.id.putra.test.laptop.RogStrixG531GD;
import co.id.putra.test.laptop.RogStrixHero2;
import co.id.putra.test.laptop.VivoBookA407MA;
import co.id.putra.test.laptop.VivoBookA409;
import co.id.putra.test.laptop.X200CA;
import co.id.putra.test.laptop.X455LA;

public class MainActivity extends AppCompatActivity {
    // DEKLARASI
    private Button data1, data2, data3, data4, data5, data6, data7 ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // PEMANGGILAN FUNGSI BUTTON SESUAI ID
        data1 =(Button)findViewById(R.id.bt_a407);
        data2 =(Button)findViewById(R.id.bt_g531gd);
        data3 =(Button)findViewById(R.id.bt_x200ca);
        data4 =(Button)findViewById(R.id.bt_x455la);
        data5 =(Button)findViewById(R.id.bt_gl553vd);
        data6 =(Button)findViewById(R.id.bt_gl504gm);
        data7 =(Button)findViewById(R.id.bt_a409);

        // PENGGUNAAN AKSI PADA BUTTON


        data1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent abc = new Intent(MainActivity.this, VivoBookA407MA.class);
                startActivity(abc);
                finish();

            }
        });


        data2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent abc = new Intent(MainActivity.this, RogStrixG531GD.class);
                startActivity(abc);
                finish();

            }
        });


        data3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent abc = new Intent(MainActivity.this, X200CA.class);
                startActivity(abc);
                finish();

            }
        });


        data4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent abc = new Intent(MainActivity.this, X455LA.class);
                startActivity(abc);
                finish();

            }
        });


        data5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent abc = new Intent(MainActivity.this, RogGL553VD.class);
                startActivity(abc);
                finish();

            }
        });


        data6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent abc = new Intent(MainActivity.this, RogStrixHero2.class);
                startActivity(abc);
                finish();

            }
        });


        data7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent abc = new Intent(MainActivity.this, VivoBookA409.class);
                startActivity(abc);
                finish();

            }
        });





    }
}
