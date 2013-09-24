package pt.ist.bookface;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore.Images;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Input extends Activity {
    /** Called when the activity is first created. */
	TextView manual;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.input);
        manual = (TextView) findViewById(R.id.manual_input);
       
        manual.setOnClickListener(share_friends_listener);

    }
    
    OnClickListener share_friends_listener = new OnClickListener() {
    	
    	public void onClick(View v) {
    		Intent i = new Intent().setClass(getApplicationContext(),
    				AddNewBook.class);
    		startActivity(i);		
    	}
    };
    
    


}