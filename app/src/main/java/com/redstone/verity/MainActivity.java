package com.redstone.verity;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView quoteRecyclerView = findViewById(R.id.quoteRecyclerView);
        quoteRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        // Create a list of quotes
        List<Quote> quotes = new ArrayList<>();
        quotes.add(new Quote("The only limit to our realization of tomorrow is our doubts of today.", "Franklin D. Roosevelt", R.drawable.fdr));
        quotes.add(new Quote("Be yourself; everyone else is already taken.", "Oscar Wilde", R.drawable.oscar_wilde));
        // Add more quotes as needed

        // Create an adapter and set it to the RecyclerView
        QuoteAdapter adapter = new QuoteAdapter(quotes, this);
        quoteRecyclerView.setAdapter(adapter);
    }
}
