package tk.bamdevelopers.statussaverforwhatsapp.ViewHolder;

import android.content.Context;
import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.VideoView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;

import butterknife.BindView;
import butterknife.ButterKnife;
import tk.bamdevelopers.statussaverforwhatsapp.R;
import tk.bamdevelopers.statussaverforwhatsapp.Views.SquareImage;

/**
 * Created by malavan on 09/12/17.
 */

public class VideoViewHolder extends RecyclerView.ViewHolder{

    @BindView(R.id.post_video)
    public SquareImage mVideo;



    public VideoViewHolder(View itemView) {
        super(itemView);
        ButterKnife.bind(this,itemView);


    }

    public void setVideo(Uri e, Context context)
    {
        Log.d("Hey",e.toString());
        Glide
                .with(context)
                .load(e)
//                .diskCacheStrategy(DiskCacheStrategy.RESULT)
                .into(mVideo);
    }
}
