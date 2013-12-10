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
 * if the app is restarted. The width the of the photos should be the full width of the
 * screen and the height of the photo should be adjusted so as not to change the aspect
 * ratio of the photo.  The user should be able to tap and drag vertically to scroll through all the photos.  This screen should be implemented to use as little memory as possible so as not to run out of memory if too many photos are taken.
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
