package mainactivity.musicplayer.example.com.cpisoc;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class AaptarList extends RecyclerView.Adapter<ClicVievHolder> {

    @NonNull
    @Override
    public ClicVievHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater layoutInflater = LayoutInflater.from(viewGroup.getContext());
       View view = layoutInflater.inflate(R.layout.item_clic, viewGroup, false);
       return new ClicVievHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ClicVievHolder clicVievHolder, int position) {
       if (clicVievHolder == null){
           clicVievHolder.setRecyclerV(R.id.listRes1);
       }
    }

    @Override
    public int getItemCount() {
        return 9;
    }
}
