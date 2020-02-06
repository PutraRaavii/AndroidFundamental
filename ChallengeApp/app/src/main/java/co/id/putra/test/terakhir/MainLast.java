package co.id.putra.test.terakhir;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import co.id.putra.test.MainActivity;
import co.id.putra.test.R;

public class MainLast extends AppCompatActivity {
    Button recall, total123 ;
    String data5,data3, data6, data7 ;
    TextView tiLaptop, tibanyak, tijasa, tihargakirim, tihargalaptop, tinamapembeli;
    int total;
    int data1, data2, data4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_last);
        total123 =(Button)findViewById(R.id.bttotal);
        recall =(Button)findViewById(R.id.bt_recall);
        tiLaptop =(TextView)findViewById(R.id.tv_laptop);
        tibanyak =(TextView)findViewById(R.id.tv_banyak);
        tijasa =(TextView)findViewById(R.id.tv_jasa);
        tihargakirim =(TextView)findViewById(R.id.tv_hargakirim);
        tihargalaptop =(TextView)findViewById(R.id.tv_hargalaptop);
        tinamapembeli =(TextView)findViewById(R.id.tv_namapembeli);


        Intent getABC = getIntent();
        data7 = getABC.getStringExtra("HARGA2");
        data6 = getABC.getStringExtra("BUYER1");
        data5 = getABC.getStringExtra("NAMALAPTOP3");//nama laptop
        data3 = getABC.getStringExtra("SARANA");//nama kurir
        data1 = getABC.getIntExtra("HARGALAPTOP", 0);//harga laptop
        data2 = getABC.getIntExtra("BANYAKLAPTOP2", 0);//banyak pembelian laptop
        data4 = getABC.getIntExtra("KURIR", 0);//harga jasa kurir



        total = data1 * data2 + data4 ;


        Log.d("Log", "Data " + data1 + data2 + data3 + data4 + data5 + data6 + data7);

        tinamapembeli.setText(String.valueOf(data6));
        tiLaptop.setText(String.valueOf(data5));
        tijasa.setText(String.valueOf(data3));
        tibanyak.setText(String.valueOf(data2));
        tihargalaptop.setText(String.valueOf(data7));
        tihargakirim.setText(String.valueOf(data4));
        total123.setText(String.valueOf(total));



        recall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast=Toast.makeText(getApplicationContext(),"Anda Telah Reset Data Pembelian",Toast.LENGTH_SHORT);
                toast.show();
                Intent abc = new Intent(MainLast.this, MainActivity.class);
                startActivity(abc);
                finish();

            }
        });


    }
}
