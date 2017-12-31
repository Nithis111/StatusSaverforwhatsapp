package tk.bamdevelopers.statussaverforwhatsapp.ViewHolder;

import android.content.Context;
import android.media.Image;
import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;

import tk.bamdevelopers.statussaverforwhatsapp.R;

/**
 * Created by malavan on 03/12/17.
 */

public class ImagesViewHolder extends RecyclerView.ViewHolder{

    public ImageView mImage;


    public ImagesViewHolder(View itemView)
    {
        super(itemView);
        mImage = (ImageView)itemView.findViewById(R.id.image_status);

    }
    public void setImage(Uri e, Context context)
    {
        Glide.with(context)
                .load(e)
                .thumbnail(0.5f)
                .skipMemoryCache(true)
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .into(mImage);
    }
}
