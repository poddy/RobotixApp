package in.robotix.robotixapp;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

import org.json.JSONException;
import org.json.JSONObject;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.Html;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class PushNotifications extends Activity{
	
	private static final String BULLET_SYMBOL = "&#8226";
	
	private static final String TAG = "MyNotificationsReceiver";
	
	String notificationText="";
	String filename="notifs";
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.notifications_complete);
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
		Intent intent = getIntent();
		Bundle extras = intent.getExtras(); 
		 try {
		      JSONObject json = new JSONObject(intent.getExtras().getString("com.parse.Data"));
		      notificationText = json.getString("alert")+ "\n";
		    } catch (JSONException e) {
		      Log.d(TAG, "JSONException: " + e.getMessage());
		    }
		 TextView notify = (TextView)findViewById(R.id.notif);
		 TextView stored_notify = (TextView)findViewById(R.id.stored_notif);
		 //notify.append(Html.fromHtml(BULLET_SYMBOL + notificationText));
		 
		 StringBuffer stringBuffer = new StringBuffer();
		 try{
			 BufferedReader inputReader = new BufferedReader(new InputStreamReader(  
                     openFileInput(filename)));  
             String inputString="";  
             //Reading data line by line and storing it into the stringbuffer               
             while ((inputString = inputReader.readLine()) != null) {  
            	 stringBuffer.append(inputString + "\n");
//	         FileInputStream fin = openFileInput(filename);
//	         int c;
//	         String temp="";
//	         while( (c = fin.read()) != -1){
//	            temp = temp + Character.toString((char)c);
	         }
	         notificationText= "-> " + notificationText;
	         notify.setText(notificationText);
	         stored_notify.setText(stringBuffer.toString());
	      	}catch(Exception e){

	      }
//		 try {  
//             //Attaching BufferedReader to the FileInputStream by the help of InputStreamReader  
//			 BufferedReader inputReader = new BufferedReader(new InputStreamReader(  
//             openFileInput(filename)));  
//             String inputString;
//             //Reading data line by line and storing it into the stringbuffer                
//             while ((inputString = inputReader.readLine()) != null) {  
//                 notify.append(Html.fromHtml(BULLET_SYMBOL + inputString + "\n"));
//                 notify.append(Html.fromHtml(BULLET_SYMBOL + notificationText + "\n"));
//             }                 
//         } catch (IOException e) {
//             e.printStackTrace();
//         } 
		 notificationText = notify.getText().toString() + stored_notify.getText().toString();
	      try {
	         FileOutputStream fOut = openFileOutput(filename,MODE_WORLD_READABLE);
	         fOut.write(notificationText.getBytes());
	         fOut.close();
	         Toast.makeText(getBaseContext(),"file saved",
	         Toast.LENGTH_SHORT).show();
	      } catch (Exception e) {
	         // TODO Auto-generated catch block
	         e.printStackTrace();
	      }
//		 try {
//				FileOutputStream fOut = openFileOutput(filename,MODE_WORLD_READABLE);
//				notificationText = notify.getText().toString();
//				fOut.write(notificationText.getBytes());	
//				fOut.close();
//			} catch (FileNotFoundException e) {e.printStackTrace();}  
//	         catch (IOException e) {e.printStackTrace();}
		 
	}
}
