package tk.bamdevelopers.statussaverforwhatsapp.Application;

import android.app.Application;
import android.os.Environment;
import android.os.StrictMode;

import java.io.File;

/**
 * Created by malavan on 09/12/17.
 */

public class StatusSaver extends Application{


    @Override
    public void onCreate() {
        super.onCreate();
        StrictMode.VmPolicy.Builder builder = new StrictMode.VmPolicy.Builder();
        StrictMode.setVmPolicy(builder.build());


        File folder = new File(Environment.getExternalStorageDirectory() +
                File.separator + "Status Saver");
        boolean success = true;
        if (!folder.exists()) {
            success = folder.mkdirs();
        }
        if (success) {
            // Do something on success
        } else {
            // Do something else on failure
        }
    }
    public Application getApplication()
    {
        return getApplication();
    }


}
