package in.robotix.robotixapp;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;

public class GeoAware extends Activity{
	
	final Context context = this;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.geoaware_complete);
		ImageView website= (ImageView)findViewById(R.id.www);
		ImageView pdfl= (ImageView)findViewById(R.id.pdf);
		ImageView phonel= (ImageView)findViewById(R.id.phone);
		ImageView locationl = (ImageView)findViewById(R.id.location);
		
		ImageView fb = (ImageView) findViewById(R.id.fb);
	       ImageView home = (ImageView) findViewById(R.id.home);
	       ImageView yt = (ImageView) findViewById(R.id.yt);
	       ImageView wp = (ImageView) findViewById(R.id.wp);
	       ImageView tw = (ImageView) findViewById(R.id.tw);
	       ImageView web= (ImageView) findViewById(R.id.web);
	       
	       	web.setOnClickListener(new View.OnClickListener() {
	           
	           @Override
	           public void onClick(View view) {
	               // Launching News Feed Screen
	        	Intent website= new Intent();
	   	        website.setAction(Intent.ACTION_VIEW);
	   	        website.addCategory(Intent.CATEGORY_BROWSABLE);
	   	        website.setData(Uri.parse("http://robotix.in/"));
	   	        startActivity(website);		
	           }
	       });
	       
	       home.setOnClickListener(new View.OnClickListener() {
	           
	           @Override
	           public void onClick(View view) {
	        	   Intent kraig = new Intent("in.robotix.robotixapp.DBD");
	   	           startActivity(kraig);
	           }
	       });
	       
	       fb.setOnClickListener(new View.OnClickListener() {
	           
	           @Override
	           public void onClick(View view) {
	               // Launching News Feed Screen
	        	Intent updates = new Intent();
	   	        updates.setAction(Intent.ACTION_VIEW);
	   	        updates.addCategory(Intent.CATEGORY_BROWSABLE);
	   	        updates.setData(Uri.parse("https://www.facebook.com/robotixiitkgp"));
	   	        startActivity(updates);		
	           }
	       });
	       
	       yt.setOnClickListener(new View.OnClickListener() {
	           
	           @Override
	           public void onClick(View view) {
	               // Launching News Feed Screen
	        	Intent updates = new Intent();
	   	        updates.setAction(Intent.ACTION_VIEW);
	   	        updates.addCategory(Intent.CATEGORY_BROWSABLE);
	   	        updates.setData(Uri.parse("http://www.youtube.com/robotixiitkgp"));
	   	        startActivity(updates);		
	           }
	       });
	       
	       wp.setOnClickListener(new View.OnClickListener() {
	           
	           @Override
	           public void onClick(View view) {
	               // Launching News Feed Screen
	        	Intent updates = new Intent();
	   	        updates.setAction(Intent.ACTION_VIEW);
	   	        updates.addCategory(Intent.CATEGORY_BROWSABLE);
	   	        updates.setData(Uri.parse("http://blog.robotix.in/"));
	   	        startActivity(updates);		
	           }
	       });
	       
	       tw.setOnClickListener(new View.OnClickListener() {
	           
	           @Override
	           public void onClick(View view) {
	               // Launching News Feed Screen
	        	Intent updates = new Intent();
	   	        updates.setAction(Intent.ACTION_VIEW);
	   	        updates.addCategory(Intent.CATEGORY_BROWSABLE);
	   	        updates.setData(Uri.parse("https://twitter.com/robotixiitkgp"));
	   	        startActivity(updates);		
	           }
	       });
		
		website.setOnClickListener(new View.OnClickListener() {
	           
	           @Override
	           public void onClick(View view) {
	               // Launching News Feed Screen
	        	Intent website= new Intent();
	   	        website.setAction(Intent.ACTION_VIEW);
	   	        website.addCategory(Intent.CATEGORY_BROWSABLE);
	   	        website.setData(Uri.parse("http://robotix.in/events/event/geoaware"));
	   	        startActivity(website);		
	           }
	       });
		pdfl.setOnClickListener(new View.OnClickListener() {
	           
	           @Override
	           public void onClick(View view) {
	               // Launching News Feed Screen
	        	Intent website= new Intent();
	   	        website.setAction(Intent.ACTION_VIEW);
	   	        website.addCategory(Intent.CATEGORY_BROWSABLE);
	   	        website.setData(Uri.parse("http://www.robotix.in/uploads/geoaware.pdf"));
	   	        startActivity(website);		
	           }
	       });
		phonel.setOnClickListener(new View.OnClickListener() {
	           
	           @Override
	           public void onClick(View view) {
	               // Launching News Feed Screen
	        	final Dialog dialog = new Dialog(context);
	   			dialog.setContentView(R.layout.geoaware_dialog);
	   			//dialog.getWindow().setBackgroundDrawable(new ColorDrawable(android.graphics.Color.TRANSPARENT));
	   			dialog.setTitle("Contact Details");
	    
	   			// set the custom dialog components - text, image and button	    
	   			Button dialogButton = (Button) dialog.findViewById(R.id.button1);
	   			// if button is clicked, close the custom dialog
	   			dialogButton.setOnClickListener(new OnClickListener() {
	   				@Override
	   				public void onClick(View v) {
	   					dialog.dismiss();
	   					Intent callIntent = new Intent(Intent.ACTION_CALL);
	   		        	callIntent.setData(Uri.parse("tel:09830503030"));
	   		        	startActivity(callIntent);
	   				}
	   			});
	    
	   			dialog.show();	
	           }
	       });
		locationl.setOnClickListener(new View.OnClickListener() {            
	           @Override
	           public void onClick(View view) {
	        	   Intent pushnot = new Intent("in.robotix.robotixapp.CAMPUSMAP");
	   	           startActivity(pushnot);		
	           }
	       });
}
}
