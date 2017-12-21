package com.example.chelsi.unit4assessment;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by Chelsi on 12/20/2017.
 */

public abstract class BookAdapter extends RecyclerView.Adapter<BooksViewHolder> {

    private List<BookModel> bookList;

    public BookAdapter(List<BookModel> bookList) {
        this.bookList = bookList;
    }

    @Override
    public BooksViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View childView = LayoutInflater.from(parent.getContext()).inflate(R.layout.book_view, parent, false);
        return new BooksViewHolder(childView);
    }

    @Override
    public void onBindViewHolder(BooksViewHolder holder, int position) {
        BookModel bookModel = bookList.get(position);
        holder.onBind(bookModel);
    }

    @Override
    public int getItemCount() {
        return bookList.size();
    }
}
