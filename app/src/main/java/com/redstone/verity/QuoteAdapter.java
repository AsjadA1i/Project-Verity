package com.redstone.verity;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.redstone.verity.R;

import java.util.List;

public class QuoteAdapter extends RecyclerView.Adapter<QuoteAdapter.QuoteViewHolder> {

    private final List<Quote> quotes;
    private final Context context;

    public QuoteAdapter(List<Quote> quotes, Context context) {
        this.quotes = quotes;
        this.context = context;
    }

    @NonNull
    @Override
    public QuoteViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_quote, parent, false);
        return new QuoteViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull QuoteViewHolder holder, int position) {
        Quote quote = quotes.get(position);
        holder.quoteText.setText(quote.getText());
        holder.authorName.setText(quote.getAuthor());
        holder.authorImage.setImageResource(quote.getImageResource());
    }

    @Override
    public int getItemCount() {
        return quotes.size();
    }

    static class QuoteViewHolder extends RecyclerView.ViewHolder {
        TextView quoteText;
        TextView authorName;
        ImageView authorImage;

        QuoteViewHolder(@NonNull View itemView) {
            super(itemView);
            quoteText = itemView.findViewById(R.id.quoteText);
            authorName = itemView.findViewById(R.id.authorName);
            authorImage = itemView.findViewById(R.id.authorImage);
        }
    }
}
