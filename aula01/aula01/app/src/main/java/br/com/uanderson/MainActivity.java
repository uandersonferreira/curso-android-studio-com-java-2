package br.com.uanderson;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = findViewById(R.id.button);
        TextView textViewNome = (TextView) findViewById(R.id.tv_nome);
        EditText editTextNome = (EditText) findViewById(R.id.et_nome);

        //PEGANDO O CONTÉUDO DO EDITTEXT E COLOCAR/SETANDO NO TEXTVIEW
        // QUANDO CLICAR NO BOTÃO
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textViewNome.setText(editTextNome.getText().toString());
            }
        });
    }

}//class
/*
TUDO está declarado/possui uma instância na class R

R. layout     .activity_main
R  categoria  item que deseja acesso





 */