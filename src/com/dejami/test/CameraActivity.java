package com.dejami.test;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

/**
 * The camera screen for DejaMi test app.
 * 
 * The Capture screen simply displays a native camera control to allow the user to take
 * a snapshot with the camera. If the camera is not detected, you can choose to allow
 * the user to select a photo from the device. Once the user selects a photo or takes
 * a snapshot, the Gallery screen appears immediately with a placeholder image (can
 * be any image) at the top of the gallery where the photo you just selected will
 * eventually appear. At the same time, resize the photo to 640 wide by whatever
 * height in order to keep the same aspect ratio.  The resize should be done in a
 * background thread. When the resize is done, the photo should be displayed where
 * the placeholder image is and the placeholder should be removed.
 */

public class CameraActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
		
		setContentView(R.layout.activity_camera);

	}
	
}
