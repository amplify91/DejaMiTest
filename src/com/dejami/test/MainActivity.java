package com.dejami.test;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

/**
 * The main navigation screen for DejaMi test app.
 * 
 * The main navigation screen consists of two buttons or menu items at the bottom of the
 * screen that are always displayed.  On Android, you can choose to use the standard menu
 * display mechanism that is invoked when the user hits the menu button on the device.
 * The first item in the menu is labeled Capture and can have an optional image. The
 * second button is labeled Gallery and can also have an optional image. When Capture
 * is pressed, the Capture screen appears.  When the Gallery button is pressed, the Gallery screen appears.
 */

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
		
		setContentView(R.layout.activity_main);

	}
	
}
