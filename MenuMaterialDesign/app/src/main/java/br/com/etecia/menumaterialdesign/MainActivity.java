package br.com.etecia.menumaterialdesign;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar)findViewById(R.id.idToolBar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setTitle("Criando Menu");

        getSupportActionBar().setIcon(R.drawable.ic_arrow_dp);
    }
}
