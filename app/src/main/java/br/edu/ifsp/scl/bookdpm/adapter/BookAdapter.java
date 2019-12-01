package br.edu.ifsp.scl.bookdpm.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import br.edu.ifsp.scl.bookdpm.R;
import br.edu.ifsp.scl.bookdpm.model.Book;

public class BookAdapter extends RecyclerView.Adapter<BookAdapter.BookViewHolde> {

    private List<Book> books;
    private Context context;

    public BookAdapter(List<Book> books){
        this.books = books;
    }

    @NonNull
    @Override
    public BookViewHolde onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.books_cell, parent, false);
        this.context = parent.getContext();
        return new BookViewHolde(view);
    }

    @Override
    public void onBindViewHolder(@NonNull BookViewHolde holder, int position) {
        Book book = books.get(position);
        holder.name.setText(book.getName());
        holder.author.setText(book.getAuthor());
        holder.yearPublication.setText(book.getYearPublication().toString());
        holder.genre.setText(book.getGenre());
        holder.imgBook.setImageResource(context.getResources().getIdentifier(
                book.getImg(), "drawable", context.getPackageName()));
    }

    @Override
    public int getItemCount() {
        return this.books.size();
    }

    public class BookViewHolde extends RecyclerView.ViewHolder {
        final TextView name;
        final TextView author;
        final TextView yearPublication;
        final TextView genre;
        final ImageView imgBook;

        public BookViewHolde(@NonNull View itemView) {
            super(itemView);

            name = (TextView) itemView.findViewById(R.id.txtName);
            author = (TextView) itemView.findViewById(R.id.txtAuthor);
            yearPublication = (TextView) itemView.findViewById(R.id.txtDatePublication);
            genre = (TextView) itemView.findViewById(R.id.txtGenre);
            imgBook = (ImageView) itemView.findViewById(R.id.imageBook);
        }

    }
}
