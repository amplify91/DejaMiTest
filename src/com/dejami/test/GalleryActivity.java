package com.dejami.test;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

/**
 * The gallery screen for DejaMi test app.
 * 
 * The Gallery screen displays all of the photos taken or selected with the Capture screen.
 * The photos are displayed in reverse chronological order from when they were taken so the
 * newest photos appear at the top of the list. Don’t worry about remembering the photos
 * if the app is restarted. The width of the photos should be the full width of the
 * screen and the height of the photo should be adjusted so as not to change the aspect
 * ratio of the photo.  The user should be able to tap and drag vertically to scroll through
 * all the photos.  This screen should be implemented to use as little memory as possible so 
 * as not to run out of memory if too many photos are taken.
 * 
 * Once the user selects a photo or takes
 * a snapshot, the Gallery screen appears immediately with a placeholder image (can
 * be any image) at the top of the gallery where the photo you just selected will
 * eventually appear. At the same time, resize the photo to 640 wide by whatever
 * height in order to keep the same aspect ratio.  The resize should be done in a
 * background thread. When the resize is done, the photo should be displayed where
 * the placeholder image is and the placeholder should be removed.
 */

public class GalleryActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
		setContentView(R.layout.activity_gallery);
	}
	
}
