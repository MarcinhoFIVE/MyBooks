package br.com.etecia.mybooks;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    RecyclerView rvListaLivros;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Apresentadno o xml para o java
        rvListaLivros = findViewById(R.id.idRecyclerViewLivros);

        //implementando o layout que vai ser utilizado
        rvListaLivros.setLayoutManager(new GridLayoutManager(getApplicationContext(), 3));

        //otimizar a lista quando for chamada
        rvListaLivros.hasFixedSize();

        MyAdapter myAdapter = new MyAdapter();
        //carregar o adaptador ao RecyclerView
        rvListaLivros.setAdapter(myAdapter);

    }
}