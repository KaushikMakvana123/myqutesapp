package com.demo.myquotes;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class QuotesAdapter  extends RecyclerView.Adapter<QuotesAdapter.MyViewHolder> {
    QuotesActivitty quotesActivity;
    ArrayList<QuotesModelclass> quotelist;

    ImageView ImgShare;
    public QuotesAdapter(QuotesActivitty quotesActivity, ArrayList<QuotesModelclass> quotelist) {
        this.quotesActivity=quotesActivity;
        this.quotelist=quotelist;
        this.ImgShare=ImgShare;

    }

    @NonNull
    @Override
    public QuotesAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(quotesActivity).inflate(R.layout.quotes_item_file,parent,false);
        MyViewHolder m = new MyViewHolder(view);
        return m;
    }

    @Override
    public void onBindViewHolder(@NonNull QuotesAdapter.MyViewHolder holder, int position) {
        holder.txtquote.setText( quotelist.get(position).getQuotes());

        holder.ImgShare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent p = new Intent(Intent.ACTION_SEND);
                p.setType("text/plain");
//
                String shyari_item = quotelist.get( position ).quotes;
                p.putExtra(Intent.EXTRA_TEXT, shyari_item);
                Intent chooser = Intent.createChooser(p, "Share");
                chooser.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                quotesActivity.startActivity(chooser);
            }
        });

        holder.ImgCopy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ClipboardManager clipboard = (ClipboardManager) quotesActivity.getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText("simple text",  holder.txtquote.getText().toString());
                clipboard.setPrimaryClip(clip);
                Toast.makeText(quotesActivity, "Copy Success", Toast.LENGTH_SHORT).show();

            }
        });




    }



    @Override
    public int getItemCount() {
        return quotelist.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView txtquote;
        ImageView ImgShare,ImgCopy;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            txtquote=itemView.findViewById(R.id.txtquote);

            ImgShare=itemView.findViewById(R.id.ImgShare);


            ImgCopy=itemView.findViewById(R.id.ImgCopy);

        }
    }
}
