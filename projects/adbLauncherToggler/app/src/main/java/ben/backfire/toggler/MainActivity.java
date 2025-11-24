package ben.backfire.toggler;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

/**
 * This is the new, OPAQUE launcher activity.
 * The Firestick home screen will see this activity and show its banner.
 * Its only job is to immediately start the *real* TogglerActivity.
 */
public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // 1. Start your real, invisible TogglerActivity
        Intent intent = new Intent(this, TogglerActivity.class);
        startActivity(intent);

        // 2. Immediately close this launcher activity
        finish();
    }
}