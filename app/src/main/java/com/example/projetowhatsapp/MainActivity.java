package com.example.projetowhatsapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

public class MainActivity extends AppCompatActivity {

    private Button buttonSend;
    private TextInputEditText TextInputPhone;
    private TextInputEditText TextInputMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonSend = findViewById(R.id.button_send);
        TextInputPhone = findViewById(R.id.text_phone);
        TextInputMessage = findViewById(R.id.text_message);

        buttonSend.setOnClickListener(new View.OnClickListener() {
                                          @Override
                                          public void onClick(View v) {


                                              Uri webpage = Uri.parse("https://wa.me/" + TextInputPhone.getText().toString() + "?text=" + TextInputMessage.getText().toString());
                                              // https://wa.me/5541998877722?text=Eu%20tenho%20interesse%20no%20seu%20carro%20à%20venda


                                              Intent callIntent = new Intent(Intent.ACTION_VIEW, webpage);
                                              startActivity(callIntent);

                                          }
                                      }
            );

    }


}