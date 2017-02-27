package jp.setsulla.aura.picture;

import android.app.Activity;
import android.hardware.display.VirtualDisplay;
import android.media.ImageReader;
import android.media.projection.MediaProjection;
import android.media.projection.MediaProjectionManager;

/**
 * Created by setsulla on 2017/02/28.
 */
public class Picture {
    private Activity mActivity;
    private MediaProjectionManager mMPM;
    private MediaProjection mMP;
    private VirtualDisplay mvd;

    private ImageReader mIR;

    public Picture(Activity activity){
        this.mActivity = activity;
    }
}
