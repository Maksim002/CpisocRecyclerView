package mainactivity.musicplayer.example.com.cpisoc;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class ClicVievHolder extends RecyclerView.ViewHolder {
    private ImageView imageView;
    private TextView textView;

    private RecyclerView recyclerView, recyclerView1, recyclerView2;

    public ClicVievHolder(@NonNull View itemView) {
        super(itemView);
        this.imageView = itemView.findViewById(R.id.imageV);
        this.textView = itemView.findViewById(R.id.textV);

        this.recyclerView = itemView.findViewById(R.id.listRes1);
        this.recyclerView1 = itemView.findViewById(R.id.listRes2);
        this.recyclerView2 = itemView.findViewById(R.id.listRes3);
    }
    public void setTatel(String tatel){
        textView.setText(tatel);
    }
    public void setImage(int imageId){
        imageView.setImageResource(imageId);
    }
    public void  setRecyclerV(int lestId){
     recyclerView.setItemViewCacheSize(lestId);
     recyclerView1.setItemViewCacheSize(lestId);
     recyclerView2.setItemViewCacheSize(lestId);
    }
}
