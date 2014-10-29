package in.robotix.robotixapp;

import com.parse.Parse;
import com.parse.ParseAnalytics;
import com.parse.ParseInstallation;
import com.parse.PushService;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

public class Splash extends Activity{
	
	ImageView gear;  

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.splash);
		
		Parse.initialize(this, "81Pw2Nsh4EjEqg1A72kdu860223Axq7BNlp6VI2H", "holfwLyfp2OaXE3bxDO99GDIuXjhEqwes7RFprpJ");
		PushService.setDefaultPushCallback(this, PushNotifications.class);
		ParseInstallation.getCurrentInstallation().saveInBackground();
		ParseAnalytics.trackAppOpened(getIntent());
		
		initialisers();				
		
		Thread timer= new Thread()
		{
			public void run()
			{
				try
				{
					sleep(3000);
				}
				catch(InterruptedException e)
				{
					e.printStackTrace();
				}
				finally{
					Intent openMenu= new Intent("in.robotix.robotixapp.DBD");
					startActivity(openMenu);
				}
			}
		};
		timer.start();
		
	}
		
	
	private void initialisers() {
		// TODO Auto-generated method stub
		gear= (ImageView)findViewById(R.id.launchgear);
	}


}


