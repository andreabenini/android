package ben.backfire.adbmessagebox;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;

// Note: We extend 'Activity', not 'AppCompatActivity' for simplicity here
public class DialogActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Get data from the intent (sent by our new receiver)
        String title = getIntent().getStringExtra("title");
        String message = getIntent().getStringExtra("message");

        // Set default values if the adb command didn't provide them
        if (title == null) title = "Alert";
        if (message == null) message = "Default message";

        // Create the Alert Dialog
        new AlertDialog.Builder(this)
                .setTitle(title)
                .setMessage(message)
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        // When "OK" is clicked, close this activity
                        finish();
                    }
                })
                .setOnCancelListener(new DialogInterface.OnCancelListener() {
                    @Override
                    public void onCancel(DialogInterface dialog) {
                        // If the user hits "back", also close this activity
                        finish();
                    }
                })
                .show();
    }
}