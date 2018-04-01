package id.hakimrizki.hakim_1202154213_modul6.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.List;

import id.hakimrizki.hakim_1202154213_modul6.DetailActivity;
import id.hakimrizki.hakim_1202154213_modul6.model.Post;
import id.hakimrizki.hakim_1202154213_modul6.R;

/**
 * Created by hakimrizki on 30/03/18.
 */

public class PostAdapter extends RecyclerView.Adapter<PostAdapter.MyViewHolder> {

    private Context context;
    private List<Post> posts;


    public PostAdapter(Context context, List<Post> posts) {
        this.context = context;
        this.posts = posts;
    }

    @Override
    public PostAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_post, parent, false);
        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(PostAdapter.MyViewHolder holder, int position) {
        final Post post= posts.get(position);

        holder.mUsername.setText(post.getUsername());

        Glide.with(context)
                .load(post.getImagePost())
                .into(holder.mImagePost);

        holder.mTitlePost.setText(post.getTitlePost());

        holder.mPost.setText(post.getPost());

        holder.cardViewPost.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, DetailActivity.class);
                intent.putExtra("id",post.getId());
                intent.putExtra("Username",post.getUsername());
                intent.putExtra("image",post.getImagePost());
                intent.putExtra("Title",post.getTitlePost());
                intent.putExtra("Post",post.getPost());
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return posts.size();
    }


    public class MyViewHolder extends RecyclerView.ViewHolder{

        public TextView mUsername;
        public TextView mTitlePost;
        public TextView mPost;
        public ImageView mImagePost;
        public CardView cardViewPost;

        public MyViewHolder(View itemView) {
            super(itemView);
            mUsername= itemView.findViewById(R.id.tv_username);
            mTitlePost = itemView.findViewById(R.id.tv_title_post);
            mPost = itemView.findViewById(R.id.tv_post);
            mImagePost=itemView.findViewById(R.id.img_post);
            cardViewPost= itemView.findViewById(R.id.cardViewPost);
        }
    }
}
