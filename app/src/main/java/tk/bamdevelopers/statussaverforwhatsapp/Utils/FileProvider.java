package tk.bamdevelopers.statussaverforwhatsapp.Utils;

import android.net.Uri;
import android.os.Environment;

import java.io.File;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static tk.bamdevelopers.statussaverforwhatsapp.Utils.UriGenerator.getURIFromFileSorted;

/**
 * Created by malavan on 03/12/17.
 */

public class FileProvider {
    public static List<File> getImageFiles() throws NullPointerException
    {
        try {


            String path = Environment.getExternalStorageDirectory().getPath() + "/WhatsApp/Media/.Statuses/";
            File directory = new File(path);
            File[] files = directory.listFiles();

            List<File> fileList = new ArrayList<>();
            for (int i = 0; i < files.length; i++) {


                if (files[i].getName().endsWith(".jpg")) {
                    fileList.add(files[i]);
                }
                //fileList.add(files[i]);
            }
            Collections.sort(fileList, new Comparator<File>() {

                @Override
                public int compare(File file1, File file2) {
                    long k = file1.lastModified() - file2.lastModified();
                    if (k > 0) {
                        return 1;
                    } else if (k == 0) {
                        return 0;
                    } else {
                        return -1;
                    }
                }
            });


            return fileList;

        }catch (NullPointerException e)
        {
            return new ArrayList<File>();
        }
    }


    public static List<File> getVideoFiles()

    {
        try {


            String path = Environment.getExternalStorageDirectory().getPath() + "/WhatsApp/Media/.Statuses/";
            File directory = new File(path);
            File[] files = directory.listFiles();

            List<File> fileList = new ArrayList<>();
            for (int i = 0; i < files.length; i++) {


                if (files[i].getName().endsWith(".mp4")) {
                    fileList.add(files[i]);
                }
                //fileList.add(files[i]);
            }
            Collections.sort(fileList, new Comparator<File>() {

                @Override
                public int compare(File file1, File file2) {
                    long k = file1.lastModified() - file2.lastModified();
                    if (k > 0) {
                        return 1;
                    } else if (k == 0) {
                        return 0;
                    } else {
                        return -1;
                    }
                }
            });


            return fileList;
        }catch (NullPointerException e)
        {
            return new ArrayList<File>();
        }
    }





    public static List<Uri> getUri()
    {
        List<File> e = getImageFiles();
        List<Uri> mResult = new ArrayList<>();

        for (int i=0;i<e.size();i++)
        {
            mResult.add(Uri.fromFile(e.get(i)));
        }

        return getURIFromFileSorted(mResult);

    }
}
