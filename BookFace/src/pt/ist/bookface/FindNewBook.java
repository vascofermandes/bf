package pt.ist.bookface;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class FindNewBook extends Activity {
    /** Called when the activity is first created. */
	ImageButton fernandes, amazon, bertrand;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.find_new);
        fernandes = (ImageButton) findViewById(R.id.fernandes);
        amazon = (ImageButton) findViewById(R.id.amazon);
        bertrand = (ImageButton) findViewById(R.id.bertrand);
     

        fernandes.setOnClickListener(store_listener);
        amazon.setOnClickListener(store_listener);
        bertrand.setOnClickListener(store_listener);
    }
    
    OnClickListener store_listener = new OnClickListener() {
    
    	
    	public void onClick(View v) {
    		Toast.makeText(getApplicationContext(), "Open the online store",
    				Toast.LENGTH_LONG).show();
    		Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.amazon.com"));  
    		intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
    		getApplicationContext().startActivity(intent);
    	}
    };
}