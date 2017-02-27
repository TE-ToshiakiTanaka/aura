package jp.setsulla.aura.picture;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;

import jp.setsulla.aura.MessageManager;

/**
 * Created by setsulla on 2017/02/28.
 */
public class GetScreenShotRunnable implements Runnable {
    public static final String SCREENSHOT = "jp.setsulla.aura.SCREENSHOT";
    private final Context mOrigContext;
    private final Intent mOrigIntent;
    private final int mActionId;

    public GetScreenShotRunnable(Context context, Intent intent, int id) {
        mOrigContext = context;
        mOrigIntent = intent;
        mActionId = id;
    }

    @Override
    public void run() {
        new Picture(((Activity) mOrigContext));
        MessageManager.getInstance().sendMessage(mActionId, true, mOrigIntent);
    }
}
