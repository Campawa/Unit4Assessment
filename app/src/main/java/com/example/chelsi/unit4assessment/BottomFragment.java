package com.example.chelsi.unit4assessment;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class BottomFragment extends Fragment {


    public BottomFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {



        JSONObject jsonObject = new JSONObject();
        try {
            jsonObject.put("Books", new JSONArray()

                    .put(new JSONObject().put("Title", "Northanger Abbey").put("Author", "Austen, Jane").put("Year", 1814))
                    .put(new JSONObject().put("Title", " War and Peace ").put("Author", "Tolstoy, Leo").put("Year", 1865))
                    .put(new JSONObject().put("Title", "Anna Karenina ").put("Author", "Tolstoy, Leo").put("Year", 1875))
                    .put(new JSONObject().put("Title", "Mrs. Dalloway").put("Author", "Woolf, Virginia").put("Year", 1925))
                    .put(new JSONObject().put("Title", "The Hours").put("Author", "Cunningham, Michael").put("Year", 1999))
                    .put(new JSONObject().put("Title", "Huckleberry Finn").put("Author", "Twain, Mark").put("Year", 1865))
                    .put(new JSONObject().put("Title", "Bleak House").put("Author", "Dickens, Charles").put("Year", 1870))
                    .put(new JSONObject().put("Title", "Tom Sawyer").put("Author", "Twain, Mark").put("Year", 1862)));
            Log.e("JSON", jsonObject.toString());

        } catch (JSONException e) {
            e.printStackTrace();
        }
        return inflater.inflate(R.layout.fragment_bottom, container, false);
    }

    public void JSONparse(String str){
        try {
            JSONObject jsonObject = new JSONObject(str);
            JSONArray jsonArray = jsonObject.getJSONArray("books");

            List<JSONModel> booksList = new ArrayList<>();

            for (int i = 0; i < jsonArray.length(); i++) {

                JSONObject jsonObject1 = (JSONObject) jsonArray.get(i);

                JSONModel books = new JSONModel();

                String objectTitle = jsonObject1.getString("Title");
                String objectAuthor = jsonObject.getString("Author");
                int objectYear = jsonObject1.getInt("Year");

                books.setTitle(objectTitle);
                books.setAuthor(objectAuthor);
                books.setYear(objectYear);
                booksList.add(books);
                Log.e("Final ArrayList", booksList.toString());


            }
        } catch (JSONException e) {
            e.printStackTrace();
        }

    }


}
