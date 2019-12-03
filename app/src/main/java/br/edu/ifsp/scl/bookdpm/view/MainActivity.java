package br.edu.ifsp.scl.bookdpm.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import br.edu.ifsp.scl.bookdpm.R;
import br.edu.ifsp.scl.bookdpm.adapter.BookAdapter;
import br.edu.ifsp.scl.bookdpm.model.Book;

public class MainActivity extends AppCompatActivity {

    private BookAdapter adapter;
    private List<Book> booksList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setTitle("TOP 10 literário");

        booksList = fillListBooks();


        RecyclerView recyclerView = findViewById(R.id.books);

        LinearLayoutManager layout = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layout);

        adapter = new BookAdapter(booksList);

        recyclerView.setAdapter(adapter);
    }

    private List<Book> fillListBooks(){
        List<Book> books = new ArrayList<>();

        books.add(new Book("1984", "George Orwell", 1949,
                        "Ficção científica, Ficção distópica","ic_1984"));

        books.add(new Book("A Divina Comédia", "Dante Alighieri", 1321,
                "Poesia épica","ic_a_divina_comedia"));

        books.add(new Book("Senhor do Anéis", "J. R. R. Tolkien", 1954,
                "Alta fantasia","ic_o_senhor_dos_aneis"));

        books.add(new Book("Hamlet", "William Shakespeare", 1603,
                "Tragédia, Drama","ic_hamlet"));

        books.add(new Book("Admirável Mundo Novo", "Aldous Huxley", 1932,
                "Romance, Ficção científica, Ficção distópica","ic_admiravel_mundo_novo"));

        books.add(new Book("O Coração das Trevas", "Joseph Conrad", 1902,
                "Novela, Roman à clef","ic_o_coracao_das_trevas"));

        books.add(new Book("Dom Casmurro", "Machado de Assis", 1899,
                "Romance,Realismo psicológico","ic_dom_casmurro"));

        books.add(new Book("O Príncipe", "Nicolau Maquiavel", 1532,
                "Não ficção, Ficção Política","ic_o_principe"));

        books.add(new Book("Um Estudo em Vermelho", "Arthur Conan Doyle", 1887,
                "Mistério, Ficção policial","ic_um_estudo_em_vermelho"));

        books.add(new Book("Os Sofrimentos do Jovem Werther", "Johann Wolfgang von Goethe", 1986,
                "Romance epistolar, Ficção, Livro didático","ic_os_sofrimentos_do_jovem_werther"));

        return books;

    }
}
