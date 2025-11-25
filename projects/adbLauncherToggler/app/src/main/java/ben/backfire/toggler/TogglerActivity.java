package ben.backfire.toggler; // This is the full package name

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

/**
 * This is the main and only activity.
 * It is invisible and closes itself immediately after running.
 */
public class TogglerActivity extends Activity {

    private static final String TAG = "TogglerLauncher";
    private static final String CONTENT_TO_WRITE = "TOGGLER_LAUNCHER_EVENT";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Log.i(TAG, CONTENT_TO_WRITE);
        // No UI layout (setContentView) is called.
        finish();
    }
}
