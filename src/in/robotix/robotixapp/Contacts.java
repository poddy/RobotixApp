package in.robotix.robotixapp;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Contacts extends Activity implements View.OnClickListener{
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.contacts_complete);
		
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
	       
	       TextView thd1= (TextView)findViewById(R.id.hd1);
	       TextView thd2= (TextView)findViewById(R.id.hd2);
	       TextView thp1= (TextView)findViewById(R.id.hp1);
	       TextView thp2= (TextView)findViewById(R.id.hp2);
	       TextView tev111= (TextView)findViewById(R.id.ev111);
	       TextView tev112= (TextView)findViewById(R.id.ev112);
	       TextView tev121= (TextView)findViewById(R.id.ev121);
	       TextView tev122= (TextView)findViewById(R.id.ev122);
	       TextView tev211= (TextView)findViewById(R.id.ev211);
	       TextView tev212= (TextView)findViewById(R.id.ev212);
	       TextView tev221= (TextView)findViewById(R.id.ev221);
	       TextView tev222= (TextView)findViewById(R.id.ev222);
	       TextView tev311= (TextView)findViewById(R.id.ev311);
	       TextView tev312= (TextView)findViewById(R.id.ev312);
	       TextView tev321= (TextView)findViewById(R.id.ev321);
	       TextView tev322= (TextView)findViewById(R.id.ev322);
	       TextView tev411= (TextView)findViewById(R.id.ev411);
	       TextView tev412= (TextView)findViewById(R.id.ev412);
	       TextView tev511= (TextView)findViewById(R.id.ev511);
	       TextView tev512= (TextView)findViewById(R.id.ev512);
	       TextView tev611= (TextView)findViewById(R.id.ev611);
	       TextView tev612= (TextView)findViewById(R.id.ev612);
	       TextView tev621= (TextView)findViewById(R.id.ev621);
	       TextView tev622= (TextView)findViewById(R.id.ev622);
	       
	       thd1.setOnClickListener(new View.OnClickListener() {
	           
	           @Override
	           public void onClick(View view) {
	               // Launching News Feed Screen
	        	Intent callIntent = new Intent(Intent.ACTION_CALL);
	        	callIntent.setData(Uri.parse("tel:09564642395"));
	        	startActivity(callIntent);
	           }
	       });
	       
	       thp1.setOnClickListener(new View.OnClickListener() {
	           
	           @Override
	           public void onClick(View view) {
	               // Launching News Feed Screen
	        	Intent callIntent = new Intent(Intent.ACTION_CALL);
	        	callIntent.setData(Uri.parse("tel:09800043264"));
	        	startActivity(callIntent);
	           }
	       });
			tev111.setOnClickListener(new View.OnClickListener() {
				           
				           @Override
				           public void onClick(View view) {
				               // Launching News Feed Screen
				        	Intent callIntent = new Intent(Intent.ACTION_CALL);
				        	callIntent.setData(Uri.parse("tel:08101446798"));
				        	startActivity(callIntent);
				           }
				       });
		tev121.setOnClickListener(new View.OnClickListener() {
		    
		    @Override
		    public void onClick(View view) {
		        // Launching News Feed Screen
		 	Intent callIntent = new Intent(Intent.ACTION_CALL);
		 	callIntent.setData(Uri.parse("tel:09475618213"));
		 	startActivity(callIntent);
		    }
		});
		tev211.setOnClickListener(new View.OnClickListener() {
		    
		    @Override
		    public void onClick(View view) {
		        // Launching News Feed Screen
		 	Intent callIntent = new Intent(Intent.ACTION_CALL);
		 	callIntent.setData(Uri.parse("tel:08900640470"));
		 	startActivity(callIntent);
		    }
		});
		tev221.setOnClickListener(new View.OnClickListener() {
		    
		    @Override
		    public void onClick(View view) {
		        // Launching News Feed Screen
		 	Intent callIntent = new Intent(Intent.ACTION_CALL);
		 	callIntent.setData(Uri.parse("tel:08101446795"));
		 	startActivity(callIntent);
		    }
		});
		tev311.setOnClickListener(new View.OnClickListener() {
		    
		    @Override
		    public void onClick(View view) {
		        // Launching News Feed Screen
		 	Intent callIntent = new Intent(Intent.ACTION_CALL);
		 	callIntent.setData(Uri.parse("tel:09836305633"));
		 	startActivity(callIntent);
		    }
		});
		tev321.setOnClickListener(new View.OnClickListener() {
		    
		    @Override
		    public void onClick(View view) {
		        // Launching News Feed Screen
		 	Intent callIntent = new Intent(Intent.ACTION_CALL);
		 	callIntent.setData(Uri.parse("tel:09564642395"));
		 	startActivity(callIntent);
		    }
		});
		tev411.setOnClickListener(new View.OnClickListener() {
		    
		    @Override
		    public void onClick(View view) {
		        // Launching News Feed Screen
		 	Intent callIntent = new Intent(Intent.ACTION_CALL);
		 	callIntent.setData(Uri.parse("tel:09836305633"));
		 	startActivity(callIntent);
		    }
		});
		tev511.setOnClickListener(new View.OnClickListener() {
		    
		    @Override
		    public void onClick(View view) {
		        // Launching News Feed Screen
		 	Intent callIntent = new Intent(Intent.ACTION_CALL);
		 	callIntent.setData(Uri.parse("tel:09830503030"));
		 	startActivity(callIntent);
		    }
		});
		tev611.setOnClickListener(new View.OnClickListener() {
		    
		    @Override
		    public void onClick(View view) {
		        // Launching News Feed Screen
		 	Intent callIntent = new Intent(Intent.ACTION_CALL);
		 	callIntent.setData(Uri.parse("tel:07407651462"));
		 	startActivity(callIntent);
		    }
		});
		tev621.setOnClickListener(new View.OnClickListener() {
		    
		    @Override
		    public void onClick(View view) {
		        // Launching News Feed Screen
		 	Intent callIntent = new Intent(Intent.ACTION_CALL);
		 	callIntent.setData(Uri.parse("tel:08001620212"));
		 	startActivity(callIntent);
		    }
		});
		
		thd2.setOnClickListener(new View.OnClickListener() {		    
		    @Override
		    public void onClick(View view) {
		        // Launching News Feed Screen
		    	Intent emailIntent = new Intent(android.content.Intent.ACTION_SEND);
		    	emailIntent.setType("message/rfc822");
		    	emailIntent.putExtra(Intent.EXTRA_EMAIL, new String[]{"monika@robotix.in"});
		    	startActivity(Intent.createChooser(emailIntent, "Send Email"));
		    }
		});
		thp2.setOnClickListener(new View.OnClickListener() {		    
		    @Override
		    public void onClick(View view) {
		        // Launching News Feed Screen
		    	Intent emailIntent = new Intent(android.content.Intent.ACTION_SEND);
		    	emailIntent.setType("message/rfc822");
		    	emailIntent.putExtra(Intent.EXTRA_EMAIL, new String[]{"shwetanshu.gupta@ktj.in"});
		    	startActivity(Intent.createChooser(emailIntent, "Send Email"));
		    }
		});
		
		tev112.setOnClickListener(new View.OnClickListener() {		    
		    @Override
		    public void onClick(View view) {
		        // Launching News Feed Screen
		    	Intent emailIntent = new Intent(android.content.Intent.ACTION_SEND);
		    	emailIntent.setType("message/rfc822");
		    	emailIntent.putExtra(Intent.EXTRA_EMAIL,new String[]{"yogesh@robotix.in"});
		    	startActivity(Intent.createChooser(emailIntent, "Send Email"));
		    }
		});
		tev122.setOnClickListener(new View.OnClickListener() {		    
		    @Override
		    public void onClick(View view) {
		        // Launching News Feed Screen
		    	Intent emailIntent = new Intent(android.content.Intent.ACTION_SEND);
		    	emailIntent.setType("message/rfc822");
		    	emailIntent.putExtra(Intent.EXTRA_EMAIL, new String[]{"anushka@robotix.in"});
		    	startActivity(Intent.createChooser(emailIntent, "Send Email"));
		    }
		});
		tev212.setOnClickListener(new View.OnClickListener() {		    
		    @Override
		    public void onClick(View view) {
		        // Launching News Feed Screen
		    	Intent emailIntent = new Intent(android.content.Intent.ACTION_SEND);
		    	emailIntent.setType("message/rfc822");
		    	emailIntent.putExtra(Intent.EXTRA_EMAIL, new String[]{"deepak@robotix.in"});
		    	startActivity(Intent.createChooser(emailIntent, "Send Email"));
		    }
		});
		tev222.setOnClickListener(new View.OnClickListener() {		    
		    @Override
		    public void onClick(View view) {
		        // Launching News Feed Screen
		    	Intent emailIntent = new Intent(android.content.Intent.ACTION_SEND);
		    	emailIntent.setType("message/rfc822");
		    	emailIntent.putExtra(Intent.EXTRA_EMAIL, new String[]{"payal@robotix.in"});
		    	startActivity(Intent.createChooser(emailIntent, "Send Email"));
		    }
		});
		tev312.setOnClickListener(new View.OnClickListener() {		    
		    @Override
		    public void onClick(View view) {
		        // Launching News Feed Screen
		    	Intent emailIntent = new Intent(android.content.Intent.ACTION_SEND);
		    	emailIntent.setType("message/rfc822");
		    	emailIntent.putExtra(Intent.EXTRA_EMAIL, new String[]{"rahuljhawar@robotix.in"});
		    	startActivity(Intent.createChooser(emailIntent, "Send Email"));
		    }
		});
		tev322.setOnClickListener(new View.OnClickListener() {		    
		    @Override
		    public void onClick(View view) {
		        // Launching News Feed Screen
		    	Intent emailIntent = new Intent(android.content.Intent.ACTION_SEND);
		    	emailIntent.setType("message/rfc822");
		    	emailIntent.putExtra(Intent.EXTRA_EMAIL, new String[]{"monika@robotix.in"});
		    	startActivity(Intent.createChooser(emailIntent, "Send Email"));
		    }
		});
		tev412.setOnClickListener(new View.OnClickListener() {		    
		    @Override
		    public void onClick(View view) {
		        // Launching News Feed Screen
		    	Intent emailIntent = new Intent(android.content.Intent.ACTION_SEND);
		    	emailIntent.setType("message/rfc822");
		    	emailIntent.putExtra(Intent.EXTRA_EMAIL, new String[]{"rahuljhawar@robotix.in"});
		    	startActivity(Intent.createChooser(emailIntent, "Send Email"));
		    }
		});
		tev512.setOnClickListener(new View.OnClickListener() {		    
		    @Override
		    public void onClick(View view) {
		        // Launching News Feed Screen
		    	Intent emailIntent = new Intent(android.content.Intent.ACTION_SEND);
		    	emailIntent.setType("message/rfc822");
		    	emailIntent.putExtra(Intent.EXTRA_EMAIL,new String[]{"shushman@robotix.in"});
		    	startActivity(Intent.createChooser(emailIntent, "Send Email"));
		    }
		});
		tev612.setOnClickListener(new View.OnClickListener() {		    
		    @Override
		    public void onClick(View view) {
		        // Launching News Feed Screen
		    	Intent emailIntent = new Intent(android.content.Intent.ACTION_SEND);
		    	emailIntent.setType("message/rfc822");
		    	emailIntent.putExtra(Intent.EXTRA_EMAIL, new String[]{"soumyadeep@robotix.in"});
		    	startActivity(Intent.createChooser(emailIntent, "Send Email"));
		    }
		});
		tev622.setOnClickListener(new View.OnClickListener() {		    
		    @Override
		    public void onClick(View view) {
		        // Launching News Feed Screen
		    	Intent emailIntent = new Intent(android.content.Intent.ACTION_SEND);
		    	emailIntent.setType("message/rfc822");
		    	emailIntent.putExtra(Intent.EXTRA_EMAIL, new String[]{"mrinal@robotix.in"});
		    	startActivity(Intent.createChooser(emailIntent, "Send Email"));
		    }
		});		
	}
	
	public void onClick(View view) {
		// TODO Auto-generated method stub
		switch(view.getId())
		{
		/*case R.id.yp:
			Intent yp = new Intent();
			yp.setAction(Intent.ACTION_VIEW);
			yp.addCategory(Intent.CATEGORY_BROWSABLE);
			yp.setData(Uri.parse("https://www.facebook.com/yogesh.poddar.77?fref=ts"));
	        startActivity(yp);
			break;	*/
		
		}
	}

}
