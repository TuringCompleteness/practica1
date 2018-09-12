package com.example.adrian.pdm2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button button;
    private TextView textView;
    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);
        textView = findViewById(R.id.textView);

        Log. w("onCreate:","Hola desde el método onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();

        textView.setOnClickListener(this);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Click en el botón", Toast.LENGTH_SHORT)
                        .show();
            }
        });
        Log. w("onStart:","Hola desde el método onStart");
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.textView:
                Toast.makeText(MainActivity.this, "Click en el text view", Toast.LENGTH_SHORT)
                        .show();
                break;
        }
    }

    public void click(View view) {
        Toast.makeText(MainActivity.this, "Click en la imagen", Toast.LENGTH_SHORT)
                .show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log. w("onResume:","Hola desde el método onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log. w("onPause:","Hola desde el método onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log. w("onStop:","Hola desde el método onStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log. w("onRestart:","Hola desde el método onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log. w("onDestroy:","Hola desde el método onDestroy");
    }
}
