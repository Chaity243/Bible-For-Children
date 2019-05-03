package com.chaitanyagoldmine.bibleforchildren;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class StoryAdapter extends RecyclerView.Adapter<StoryAdapter.MyViewHolder> {

        String[] Chapters;
        Context context;


public class MyViewHolder extends RecyclerView.ViewHolder {
    private TextView tvSno;
    private TextView tvTitle;
    private RelativeLayout index_rl;
    public MyViewHolder(View view) {
        super(view);
        this.tvTitle = (TextView) view.findViewById(R.id.tvTitle);
        this.tvSno = (TextView) view.findViewById(R.id.tvSno);
        index_rl=view.findViewById(R.id.index_rl);
    }
}


    public StoryAdapter(Context context) {
        this.context = context;
        this.Chapters = context.getResources().getStringArray(R.array.bibleIndex);
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.card_row, parent, false);

        return new MyViewHolder(itemView);
    }



    @Override
    public void onBindViewHolder(MyViewHolder holder, final int position) {
        holder.tvSno.setText(String.valueOf(position + 1)+". ");
        holder.tvTitle.setText(this.Chapters[position]);
        holder.index_rl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(context,DetailActivity.class);
                i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                i.putExtra("position", position);
                context.startActivity(i);
            }
        });

    }

    @Override
    public int getItemCount() {
        return this.Chapters.length;
    }
}
