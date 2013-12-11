package com.dejami.test;

import java.security.spec.MGF1ParameterSpec;
import java.util.List;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;

public class ImageAdapter extends ArrayAdapter<ImageView>{
	
	
	Context mContext;
	static List<ImageView> mGalleryImages = null;
	
	public ImageAdapter(Context context) {
		super(context, R.layout.gallery_image, getGalleryImages()); //TODO make sure this second argument works. It might break the layout.
		mContext = context;
	}
	
	private static List<ImageView> getGalleryImages(){
		//get the images from memory as a List
		return mGalleryImages;
	}
	
	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ImageView getItem(int position) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		// TODO return the images we want
		return null;
	}

}
