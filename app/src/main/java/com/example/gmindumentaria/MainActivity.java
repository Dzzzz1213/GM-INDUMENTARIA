package com.example.gmindumentaria;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.content.Intent;
import android.net.Uri;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);


        //valores precio dinamico

        TextView precio = findViewById(R.id.Text_Precio);
        int valor = 35000;
        String producto = "calzado";
        precio.setText(
                getString(R.string.Precio_producto,producto,valor)
        );

        //BOTONES INSTAGRAM/WHATSAPP

        ImageButton btnIG = findViewById(R.id.ContactoInstagram);
        btnIG.setOnClickListener(v-> {
            Intent intent = new Intent(
                    Intent.ACTION_VIEW,Uri.parse("https://www.instagram.com/direct/t/18100627663894566/")
            );
         startActivity(intent);
        });

        ImageButton btnW = findViewById(R.id.ContactoWhatsApp);
        btnW.setOnClickListener(v -> {
            Intent intent = new Intent(
                    Intent.ACTION_VIEW,Uri.parse("https://wa.link/55e3m4")
            );
            startActivity(intent);
        });









        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}