package com.miss.loginscreen;

import android.app.Activity;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {



    Button b1, b2;

    EditText ed1, ed2;

    TextView tx1;



    int counter = 3;



    @Override

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);



        b1 = (Button) findViewById(R.id.btnLogin);

        b2 = (Button) findViewById(R.id.btnCancel);

        ed1 = (EditText) findViewById(R.id.editUser);

        ed2 = (EditText) findViewById(R.id.editPass);



        tx1 = (TextView) findViewById(R.id.textView2);

        tx1.setVisibility(View.GONE);



        b1.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {



                //set username dan password dengan "admin"

                if (ed1.getText().toString().equals("admin") &&

                        ed2.getText().toString().equals("admin"))



                    //kondisi jika login benar

                    Toast.makeText(getApplicationContext(), "Login Sukses", Toast.LENGTH_SHORT).show();

                else {

                    //jika login gagal



                    Toast.makeText(getApplicationContext(), "Username atau Password Anda Salah",

                            Toast.LENGTH_SHORT).show();



                    tx1.setVisibility(View.VISIBLE);

                    tx1.setBackgroundColor(Color.RED);

                    counter--;

                    tx1.setText(Integer.toString(counter));



                    if (counter == 0) {

                        b1.setEnabled(false);

                    }

                }



            }

        });



        b2.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {

                finish();

            }

        });

    }

}
