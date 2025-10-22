package ben.backfire.adbmessagebox;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class DialogReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        // Create a new intent to launch our DialogActivity
        Intent i = new Intent(context, DialogActivity.class);

        // Pass all the data (title, message) from the adb command to the new activity
        i.putExtras(intent.getExtras());

        // **THIS IS CRITICAL**
        // You MUST add this flag when starting an Activity from a background receiver
        i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);

        context.startActivity(i);
    }
}
