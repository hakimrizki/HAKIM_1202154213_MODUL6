package id.hakimrizki.hakim_1202154213_modul6.adapter;

import android.content.Context;
import android.support.v4.graphics.drawable.RoundedBitmapDrawable;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import id.hakimrizki.hakim_1202154213_modul6.R;
import id.hakimrizki.hakim_1202154213_modul6.model.Comment;

/**
 * Created by hakimrizki on 31/03/18.
 */

public class CommentAdapter extends RecyclerView.Adapter<CommentAdapter.ViewHolder> {

    Context context;
    List<Comment> commentList;
    RoundedBitmapDrawable rounded;

    public CommentAdapter(Context context, List<Comment> commentList) {
        this.context = context;
        this.commentList = commentList;
    }

    @Override
    public CommentAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_comment, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(CommentAdapter.ViewHolder holder, int position) {
        final Comment comment= commentList.get(position);

        holder.mUsername.setText(comment.getUsername());
        holder.mComment.setText(comment.getComment());
        holder.imageView.setImageResource(R.drawable.ic_account_circle_black_24dp);
    }

    @Override
    public int getItemCount() {
        return commentList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        TextView mUsername;
        TextView mComment;
        ImageView imageView;

        public ViewHolder(View itemView) {
            super(itemView);
            imageView=itemView.findViewById(R.id.img_avatar);
            mUsername=itemView.findViewById(R.id.tv_username);
            mComment=itemView.findViewById(R.id.tv_comment);
        }
    }
}
