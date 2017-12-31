package tk.bamdevelopers.statussaverforwhatsapp.Adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import tk.bamdevelopers.statussaverforwhatsapp.R;
import tk.bamdevelopers.statussaverforwhatsapp.ViewHolder.SavedViewHolder;

/**
 * Created by malavan on 09/12/17.
 */

public class SavedAdapter extends RecyclerView.Adapter<SavedViewHolder> {


    @Override
    public SavedViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_image_post,parent,false);
        return new SavedViewHolder(view);
    }

    @Override
    public void onBindViewHolder(SavedViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
