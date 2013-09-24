package pt.ist.bookface;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class WarAndPeace extends Activity {
    /** Called when the activity is first created. */
	Button copyUrl;
	Button home;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.war_and_face);
        home = (Button) findViewById(R.id.home);

        home.setOnClickListener(home_listener);

    }
    
    OnClickListener home_listener = new OnClickListener() {
    
    	
    	public void onClick(View v) {
    		Intent i = new Intent().setClass(getApplicationContext(),
    				Main.class);
    		startActivity(i);
    	}
    };



}