package com.dejami.test;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;

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
	
	EditText mUserIdText;
	EditText mPasswordText;
	Button mLoginButton;
	Intent mNextScreen;
	private static final String PASSWORD = "abc123";
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
		setContentView(R.layout.activity_login);
		
		mLoginButton = (Button) findViewById(R.id.login_button);
		mLoginButton.setOnClickListener(loginTouchListener);
		mUserIdText = (EditText) findViewById(R.id.user_id_field);
		mPasswordText = (EditText) findViewById(R.id.password_field);
		mNextScreen = new Intent(this, MainActivity.class);
	}
	
	OnClickListener loginTouchListener = new OnClickListener(){
		@Override
		public void onClick(View v) {
			if(checkLogin()){
				//proceed to MainActivity with a nice animated transition
				startActivity(mNextScreen);
				// TODO A successful login should also be remembered so that the user doesn’t
				//have to login again if the app is forcefully quit and re-launched again.
			}else{
				//allow the user to try again
				Log.i("login", "login failed! try again!");
			}
		}
	};
	
	private boolean checkLogin(){
		//Both fields are required to be non blank too and if one of them is blank,
		//a popup error should be shown to the user.
		if(mUserIdText.getEditableText().length()==0){
			Log.i("user id / password text", "blank field");
			//show popup error for blank fields
			mUserIdText.setError("User ID is blank. Please enter User ID.");
			mUserIdText.requestFocus();
			return false;
		}else if(mPasswordText.getEditableText().length()==0){
			mPasswordText.setError("Password is blank. Please enter a password.");
			mPasswordText.requestFocus();
			return false;
		}
		if(mPasswordText.getEditableText().toString().equals(PASSWORD)){
			Log.i("login", "login passed!");
			return true;
		}else{
			//a popup error should be displayed which the user can dismiss and attempt the login again
			mPasswordText.setError("Password is incorrect. Try again.");
			mPasswordText.requestFocus();
			return false;
		}
		
		//Log.i("user id text", mUserIdText.getEditableText().toString());
		//Log.i("password text", mPasswordText.getEditableText().toString());
	}
	
}
