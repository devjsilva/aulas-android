package br.com.etecia.menujoguinho;

import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class TesteToolBar_activity extends AppCompatActivity {

    FloatingActionButton fab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.teste_tool_bar_layout);

        fab = (FloatingActionButton)findViewById(R.id.fabCarrinho);

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Tu clicou no FAB rrapaz", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
