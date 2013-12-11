package com.dejami.test;

import java.util.ArrayList;
import java.util.List;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

public class ImageAdapter extends BaseAdapter{
	
	Context mContext;
	ImageView mPlaceHolder = null;
	private static List<ImageView> mGalleryImages = new ArrayList<ImageView>();
	
	public ImageAdapter() {
		super();
		populateList();
	}
	
	public List<ImageView> getImageList(){
		return mGalleryImages;
	}
	
	private void populateList(){
		
		if(mPlaceHolder!=null){
			mGalleryImages.add(0, mPlaceHolder);
		}
		
		//TODO find the pictures we have already taken
		//add them to the list as ImageViews
		
	}
	
	public void setPlaceHolder(ImageView placeHolder){
		mPlaceHolder = placeHolder;
		populateList();
	}
	
	public void replacePlaceHolder(ImageView newImage){
		if(mPlaceHolder!=null){
			mGalleryImages.set(0, newImage);
		}
	}
	
	public void addImage(ImageView image){
		mGalleryImages.add(image);
	}
	
	@Override
	public int getCount() {
		return mGalleryImages.size();
	}

	@Override
	public ImageView getItem(int position) {
		return mGalleryImages.get(position);
	}

	@Override
	public long getItemId(int position) {
		return mGalleryImages.get(position).getId();
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		// TODO return the images we want
		
		return getItem(position);
	}

}
