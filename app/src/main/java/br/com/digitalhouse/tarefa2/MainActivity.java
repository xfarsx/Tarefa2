package br.com.digitalhouse.tarefa2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button btnCuriosidade;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btnCuriosidade = (Button) findViewById(R.id.btnCuriosidade);

        btnCuriosidade.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(MainActivity.this, "Apesar da cor azul ser a cor favorita por muitos, ela é  utilizada para diminuir o apetite em dietas.", Toast.LENGTH_SHORT).show();

            }

        });

    }
}