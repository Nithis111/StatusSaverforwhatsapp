package tk.bamdevelopers.statussaverforwhatsapp.Adapter;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.provider.MediaStore;
import android.support.v4.content.CursorLoader;
import android.support.v4.content.FileProvider;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.bumptech.glide.Glide;

import java.io.File;
import java.io.Serializable;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;

import tk.bamdevelopers.statussaverforwhatsapp.Activity.GalleryActivity;
import tk.bamdevelopers.statussaverforwhatsapp.Activity.MainActivity;
import tk.bamdevelopers.statussaverforwhatsapp.BuildConfig;
import tk.bamdevelopers.statussaverforwhatsapp.Fragment.ImageFragment;
import tk.bamdevelopers.statussaverforwhatsapp.R;
import tk.bamdevelopers.statussaverforwhatsapp.Utils.UriGenerator;
import tk.bamdevelopers.statussaverforwhatsapp.ViewHolder.ImagesViewHolder;

import static android.content.Intent.FLAG_ACTIVITY_NEW_TASK;
import static android.provider.Settings.AUTHORITY;

/**
 * Created by malavan on 03/12/17.
 */

public class ImagesAdapter extends RecyclerView.Adapter<ImagesViewHolder> implements View.OnClickListener{

    private List<File> mImageFileList;
    private Context context;
    private List<Uri> mUriList;

    public ImagesAdapter(List<File> mImageFileList, Context context)
    {
        this.mImageFileList = mImageFileList;
        this.context = context;
    }


    @Override
    public ImagesViewHolder onCreateViewHolder(ViewGroup parent, int viewType)
    {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_image_post,parent,false);
        generateURI();

        view.setOnClickListener(this);
        return new ImagesViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ImagesViewHolder holder, final int position)
    {

        holder.setImage(mUriList.get(position),context);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context,GalleryActivity.class);
                Bundle bundle = new Bundle();
                bundle.putSerializable("urilist",(Serializable) mUriList);
                intent.putExtra("bundle",bundle);
                intent.putExtra("position",position);
                context.startActivity(intent);
            }
        });


    }



    @Override
    public int getItemCount() {
        return mImageFileList.size();
    }

    public void generateURI()
    {
       mUriList = UriGenerator.getURIFromFile(mImageFileList);



    }


    @Override
    public void onClick(View view) {

    }
}
