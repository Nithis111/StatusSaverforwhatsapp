package tk.bamdevelopers.statussaverforwhatsapp.Adapter;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v4.app.ShareCompat;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.io.File;
import java.util.List;

import tk.bamdevelopers.statussaverforwhatsapp.Activity.MainActivity;
import tk.bamdevelopers.statussaverforwhatsapp.R;
import tk.bamdevelopers.statussaverforwhatsapp.Utils.UriGenerator;
import tk.bamdevelopers.statussaverforwhatsapp.ViewHolder.VideoViewHolder;

/**
 * Created by malavan on 09/12/17.
 */

public class VideoAdapter extends RecyclerView.Adapter<VideoViewHolder> {

    private List<File> mVideoFileList;
    private Context context;
    private List<Uri> mUriList;


    public VideoAdapter(List<File> mVideoFileList, Context context) {
        this.mVideoFileList = mVideoFileList;
        this.context = context;
        generateURI();
    }

    @Override
    public VideoViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_video_post,parent,false);
        return new VideoViewHolder(view);
    }

    @Override
    public void onBindViewHolder(VideoViewHolder holder, final int position) {


        holder.setVideo(mUriList.get(position),context);
        Log.d("URi video", "Message"+mUriList.get(position));



    }

    @Override
    public int getItemCount() {
        return mVideoFileList.size();
    }

    public void generateURI()
    {
        mUriList = UriGenerator.getURIFromFile(mVideoFileList);




    }
}
