package co.id.putra.test.laptop;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import co.id.putra.test.MainActivity;
import co.id.putra.test.R;
import co.id.putra.test.pembayaran.MainPembayaran;

public class VivoBookA409 extends AppCompatActivity {

    private Button lanjutkan,kembali ;
    AlertDialog.Builder alertbuilder ;
    String harga ="Rp. 5.969.000";
    String nama = "ASUS VivoBook A409";
    String ram = "4 GB";
    String storage ="8 GB DDR4";
    int databayar = 5969000 ;
    Intent pindah ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vivo_book_a409);


        lanjutkan =(Button)findViewById(R.id.bt_lanjutkan);
        kembali =(Button)findViewById(R.id.btkembali);



        lanjutkan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

               alertbuilder = new AlertDialog.Builder(VivoBookA409.this);
               alertbuilder
                       .setTitle("Lanjutkan")
                       .setMessage("Pembelian Laptop ASUS VivoBook A409 dengan harga : " + harga + "Apakah anda ingin melanjutkan ?")
                       .setPositiveButton("YA", new DialogInterface.OnClickListener() {
                           @Override
                           public void onClick(DialogInterface dialog, int which) {
                               Bundle paket = new Bundle();
                               paket.putString("NAMA", nama);
                               paket.putString("RAM", ram);
                               paket.putString("STORAGE", storage);
                               paket.putString("HARGA", harga);
                               paket.putInt("BAYAR",databayar);

                               pindah = new Intent(VivoBookA409.this, MainPembayaran.class);
                               pindah.putExtras(paket);
                               startActivity(pindah);

                           }
                       })

                       .setNegativeButton("Tidak", new DialogInterface.OnClickListener() {
                           @Override
                           public void onClick(DialogInterface dialog, int which) {

                           }
                       });


                AlertDialog alertDialog = alertbuilder.create();
                alertDialog.show();

            }
        });


        kembali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent abc = new Intent(VivoBookA409.this, MainActivity.class);
                startActivity(abc);
                finish();
            }
        });





    }
}
