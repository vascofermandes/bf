package pt.ist.bookface;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class Main extends Activity {
	//teste guthub3
    /** Called when the activity is first created. */
	Button new_book, share, find_new_book, search, help;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        new_book = (Button) findViewById(R.id.new_book);
        share = (Button) findViewById(R.id.share_book);
        find_new_book = (Button) findViewById(R.id.find_book);
        search = (Button) findViewById(R.id.search);
        help = (Button) findViewById(R.id.help);

        help.setOnClickListener(help_listener);
        search.setOnClickListener(find_new_listener);
        new_book.setOnClickListener(add_new_listener);
        share.setOnClickListener(share_listener);
        find_new_book.setOnClickListener(search_listener);

    }
    
    OnClickListener help_listener = new OnClickListener() {
    
    	
    	public void onClick(View v) {
    		Toast.makeText(getApplicationContext(), R.string.mmhelptext,
    				Toast.LENGTH_LONG).show();
    	}
    };

    OnClickListener find_new_listener = new OnClickListener() {
    	
    	public void onClick(View v) {
    		Intent i = new Intent().setClass(getApplicationContext(),
    				FindNewBook.class);
    		startActivity(i);		
    	}
    };
    
    OnClickListener add_new_listener = new OnClickListener() {
    	
    	public void onClick(View v) {
    		Intent i = new Intent().setClass(getApplicationContext(),
    				Input.class);
    		startActivity(i);		
    	}
    };

    OnClickListener share_listener = new OnClickListener() {
    	
    	public void onClick(View v) {
    		Intent i = new Intent().setClass(getApplicationContext(),
    				Share.class);
    		startActivity(i);		
    	}
    };

   OnClickListener search_listener = new OnClickListener() {
    	
    	public void onClick(View v) {
    		Intent i = new Intent().setClass(getApplicationContext(),
    				Tabs.class);
    		startActivity(i);		
    	}
    };

}