package br.com.etecia.mybooks;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView rvListaLivros;
    List<Book> listBooks;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Apresentadno o xml para o java
        rvListaLivros = findViewById(R.id.idRecyclerViewLivros);

        //Lista dos Livros
        listBooks = new ArrayList<>();

        //implementando o layout que vai ser utilizado
        rvListaLivros.setLayoutManager(new GridLayoutManager(getApplicationContext(), 3));

        //otimizar a lista quando for chamada
        rvListaLivros.hasFixedSize();

        MyAdapter myAdapter = new MyAdapter(getApplicationContext(), listBooks);
        //carregar o adaptador ao RecyclerView
        rvListaLivros.setAdapter(myAdapter);

    }
}