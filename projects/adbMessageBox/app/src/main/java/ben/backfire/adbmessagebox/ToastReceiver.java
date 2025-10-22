package ben.backfire.adbmessagebox;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class ToastReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        // Get the message string from the adb command
        String message = intent.getStringExtra("message");

        // If no message was provided, use a default one
        if (message == null) {
            message = "Default message from ADB";
        }

        // Create and show the Toast (the auto-closing message)
        // Toast.LENGTH_LONG shows it for about 3.5 seconds
        // Toast.LENGTH_SHORT shows it for about 2 seconds
        Toast.makeText(context, message, Toast.LENGTH_LONG).show();
    }
}
