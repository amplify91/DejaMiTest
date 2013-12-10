package com.dejami.test;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

/**
 * The login screen for DejaMi test app.
 * 
 * The first screen is a Login screen. When the app launches, present a form to the user with a
 * User ID field, Password field, and Login button. The placeholder text should be “User ID” in
 * the User ID field and “Password” in the Password field. A person eavesdropping on the user’s
 * screen should not be able to tell what password characters were typed. Clicking the Login
 * button should forward control to a function where you check for valid User ID and Password.
 * Both fields are required to be non blank too and if one of them is blank, a popup error should
 * be shown to the user.  If the password check succeeds, the main navigation screen described
 * below should be displayed and replace the login screen with a nice animated transition.
 * If the login fails, a popup error should be displayed which the user can dismiss and attempt
 * the login again. You can use a hard coded password to validate against. A successful login
 * should also be remembered so that the user doesn’t have to login again if the app is
 * forcefully quit and re-launched again.
 */

public class LoginActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
		
		setContentView(R.layout.activity_login);

	}
	
}
