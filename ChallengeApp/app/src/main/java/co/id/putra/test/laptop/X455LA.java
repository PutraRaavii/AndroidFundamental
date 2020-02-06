package co.id.putra.test.laptop;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.sql.BatchUpdateException;

import co.id.putra.test.MainActivity;
import co.id.putra.test.R;
import co.id.putra.test.pembayaran.MainPembayaran;





public class X455LA extends AppCompatActivity {


    private Button lanjutkan, kembali ;
    AlertDialog.Builder alertBuilder;
    String harga = "Rp.5.049.000";
    String nama = "ASUS X455LA";
    String ram = "4 GB";
    String storage ="500GB HDD";
    Intent pindah ;

    int databayar = 5049000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_x455_l);


        lanjutkan =(Button)findViewById(R.id.bt_lanjutkan);
        kembali =(Button)findViewById(R.id.bt_kembali);



        lanjutkan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                alertBuilder = new AlertDialog.Builder(X455LA.this);
                alertBuilder
                        .setTitle("Lanjutkan")

                        .setMessage("Pembelian Laptop ASUS X455LA dengan Harga : " + harga + " Apakah Ingin Dilanjutkan ? ")

                        .setPositiveButton("Ya",new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog,int id) {
                               Bundle paket = new Bundle();
                               paket.putString("NAMA", nama);
                               paket.putString("RAM", ram);
                               paket.putString("STORAGE", storage);
                               paket.putString("HARGA", harga);
                               paket.putInt("BAYAR",databayar);

                               pindah = new Intent(X455LA.this, MainPembayaran.class);
                               pindah.putExtras(paket);

                               startActivity(pindah);

                            }
                        })
                        .setNegativeButton("Tidak",new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {

                            }
                        });


                AlertDialog alertDialog = alertBuilder.create();
                alertDialog.show();

            }
        });



        kembali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent abc = new Intent(X455LA.this, MainActivity.class);
                startActivity(abc);
                finish();
            }
        });





    }
}
