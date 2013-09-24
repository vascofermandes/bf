package pt.ist.bookface;

import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class AddNewBook extends Activity {
    /** Called when the activity is first created. */
	Button new_book, share, find_new_book, search, help, add;
	ImageButton add_image;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add_new);

        add = (Button) findViewById(R.id.add);
        
        help = (Button) findViewById(R.id.help);

        add_image = (ImageButton) findViewById(R.id.add_image);
        
        help.setOnClickListener(help_listener);
  
        add.setOnClickListener(add_listener);
        
        add_image.setOnClickListener(add_photo_listener);
    }
    
    OnClickListener help_listener = new OnClickListener() {
    
    	
    	public void onClick(View v) {
    		Toast.makeText(getApplicationContext(), R.string.mmhelptext,
    				Toast.LENGTH_LONG).show();
    	}
    };

    OnClickListener add_listener = new OnClickListener() {
    	
    	public void onClick(View v) {
    		Intent i = new Intent().setClass(getApplicationContext(),
    				WarAndPeace.class);
    		startActivity(i);		
    	}
    };

    OnClickListener add_photo_listener = new OnClickListener() {
    	
    	public void onClick(View v) {
    		add_image.setImageResource(R.drawable.thumbnail_book_cover);
    	}
    };

    
}