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

public class VivoBookA407MA extends AppCompatActivity {

    private Button lanjutkan, kembali ;
    AlertDialog.Builder alertBuilder;
    String harga = "Rp. 3.690.000";
    String nama = "ASUS VivoBook A407MA";
    String ram = "4 GB";
    String storage ="500GB HDD";
    int databayar = 3690000 ;
    Intent pindah ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vivo_book_a407_m);

        lanjutkan =(Button)findViewById(R.id.bt_lanjutkan);
        kembali =(Button)findViewById(R.id.btkembali);


        lanjutkan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                alertBuilder = new AlertDialog.Builder(VivoBookA407MA.this);
                alertBuilder
                        .setTitle("Lanjutkan")

                        .setMessage("Pembelian Laptop ASUS VivoBook A407MA dengan Harga : " + harga + " Apakah Ingin Dilanjutkan ? ")

                        .setPositiveButton("Ya",new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog,int id) {
                                Bundle paket = new Bundle();
                                paket.putString("NAMA", nama);
                                paket.putString("RAM", ram);
                                paket.putString("STORAGE", storage);
                                paket.putString("HARGA", harga);
                                paket.putInt("BAYAR",databayar);

                                pindah = new Intent(VivoBookA407MA.this, MainPembayaran.class);
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
                Intent abc = new Intent(VivoBookA407MA.this, MainActivity.class);
                startActivity(abc);
                finish();
            }
        });


    }
}
