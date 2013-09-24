package pt.ist.bookface;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore.Images;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class Share extends Activity {
    /** Called when the activity is first created. */
	Button share_friends;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.share);
        share_friends = (Button) findViewById(R.id.share_friends);
       
        share_friends.setOnClickListener(share_friends_listener);

    }
    
    OnClickListener share_friends_listener = new OnClickListener() {
    	
    	public void onClick(View v) {
    		Intent i = new Intent().setClass(getApplicationContext(),
    				ShareFriends.class);
    		startActivity(i);		
    	}
    };
    
    OnClickListener add_new_listener = new OnClickListener() {
    	
    	public void onClick(View v) {
    		Intent i = new Intent().setClass(getApplicationContext(),
    				AddNewBook.class);
    		startActivity(i);		
    	}
    };


}