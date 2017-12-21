package com.example.chelsi.unit4assessment;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by Chelsi on 12/20/2017.
 */

public class BooksViewHolder extends RecyclerView.ViewHolder {

    private TextView bTitle;
    private TextView bAuthor;
    private TextView bYear;

    public BooksViewHolder(View itemView) {
        super(itemView);

        bTitle = (TextView) itemView.findViewById(R.id.titleText);
        bAuthor = (TextView) itemView.findViewById(R.id.authorText);
        bYear = (TextView) itemView.findViewById(R.id.yearText);
    }

    public void onBind(BookModel books){
        bTitle.setText("Title" + books.getBookTitle());
        bAuthor.setText("Author" + books.getBookAuthor());
        bYear.setText("Year" + books.getBookYear());
    }


}

