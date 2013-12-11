package com.dejami.test;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.hardware.Camera;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.Toast;

/**
 * The main navigation screen for DejaMi test app.
 * 
 * The main navigation screen consists of two buttons or menu items at the bottom of the
 * screen that are always displayed.  On Android, you can choose to use the standard menu
 * display mechanism that is invoked when the user hits the menu button on the device.
 * The first item in the menu is labeled Capture and can have an optional image. The
 * second button is labeled Gallery and can also have an optional image. When Capture
 * is pressed, the Capture screen appears.  When the Gallery button is pressed, the Gallery screen appears.
 * 
 * The Capture screen is created from this screen with startActivityForResult(). When it is finished
 * taking or selecting a picture, the application comes back here to call onActivityResult() where it will
 * then proceed to the Gallery screen.
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

public class MainActivity extends Activity {
	
	Intent mCaptureScreen;
	Intent mGalleryScreen;
	Button mCaptureButton;
	Button mGalleryButton;
	
	Camera mCamera;
	private static final int CAMERA_REQUEST_CODE = 99;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
		setContentView(R.layout.activity_main);
		
		mCaptureScreen = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
		mGalleryScreen = new Intent(this, GalleryActivity.class);
		mCaptureButton = (Button) findViewById(R.id.capture_button);
		mGalleryButton = (Button) findViewById(R.id.gallery_button);
		mCaptureButton.setOnClickListener(captureTouchListener);
		mGalleryButton.setOnClickListener(galleryTouchListener);
	}
	
	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
	    if (requestCode == CAMERA_REQUEST_CODE) {
	        if (resultCode == RESULT_OK) {
	        	
	        	startActivity(mGalleryScreen);
	            // Image captured and saved to fileUri specified in the Intent
	            Toast.makeText(this, "Image saved to:\n" +
	                     data.getData(), Toast.LENGTH_LONG).show();
	        } else if (resultCode == RESULT_CANCELED) {
	            // User cancelled the image capture
	        } else {
	            // Image capture failed, advise user
	        }
	    }
	}
	
	OnClickListener captureTouchListener = new OnClickListener(){
		@Override
		public void onClick(View v) {
			//startActivity(mCaptureScreen);
			if (getApplicationContext().getPackageManager().hasSystemFeature(PackageManager.FEATURE_CAMERA)){
		        // display a native camera control to allow the user to take a snapshot with the camera
				startActivityForResult(mCaptureScreen, CAMERA_REQUEST_CODE);
		    } else {
		        // allow the user to select a photo from the device
		    	startActivity(mGalleryScreen);
		    }
		}
	};
	
	OnClickListener galleryTouchListener = new OnClickListener(){
		@Override
		public void onClick(View v) {
			startActivity(mGalleryScreen);
		}
	};
	
}
