package tk.bamdevelopers.statussaverforwhatsapp.Utils;

import android.net.Uri;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by malavan on 03/12/17.
 */

public class UriGenerator {
    public static List<Uri> getURIFromFile(List<File> e)
    {
        List<Uri> mResult = new ArrayList<>();

        for (int i=0;i<e.size();i++)
        {
            mResult.add(Uri.fromFile(e.get(i)));
        }

        return getURIFromFileSorted(mResult);

    }



    public static List<Uri> getURIFromFileSorted(List<Uri> e)
    {
        List<Uri> mResult = new ArrayList<>();

        for (int i=e.size()-1;i>=0;i--)
        {
            mResult.add(e.get(i));
        }

        return mResult;

    }
}
