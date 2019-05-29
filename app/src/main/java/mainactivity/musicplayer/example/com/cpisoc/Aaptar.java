package mainactivity.musicplayer.example.com.cpisoc;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Aaptar extends RecyclerView.Adapter<ClicVievHolder> {
    @NonNull
    @Override
    public ClicVievHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater layoutInflater = LayoutInflater.from(viewGroup.getContext());
       View view = layoutInflater.inflate(R.layout.item_clic_list, viewGroup, false);
       return new ClicVievHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ClicVievHolder clicVievHolder, int position) {
       switch (position){
           case 0:
               clicVievHolder.setImage(R.drawable.macrisift_ofes);
               clicVievHolder.setTatel("Microsoft");
               break;
           case 1:
               clicVievHolder.setImage(R.drawable.point);
               clicVievHolder.setTatel("Point");
               break;
           case 2:
               clicVievHolder.setImage(R.drawable.drave);
               clicVievHolder.setTatel("Drave");
               break;
           case 3:
               clicVievHolder.setImage(R.drawable.cop);
               clicVievHolder.setTatel("Cortana");
               break;
           case 4:
               clicVievHolder.setImage(R.drawable.xcel);
               clicVievHolder.setTatel("Excel");
               break;
           case 5:
               clicVievHolder.setImage(R.drawable.hreni_cacaata);
               clicVievHolder.setTatel("Name");
               break;
           case 6:
               clicVievHolder.setImage(R.drawable.macrisift_ofes);
               clicVievHolder.setTatel("Macrisift");
               break;
           case 7:
               clicVievHolder.setImage(R.drawable.voskl);
               clicVievHolder.setTatel("Info");
               break;
           case 8:
               clicVievHolder.setImage(R.drawable.xbox);
               clicVievHolder.setTatel("Xbox");
               break;
               default:
       }
    }

    @Override
    public int getItemCount() {
        return 9;
    }
}
