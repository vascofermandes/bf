package pt.ist.bookface;

import android.app.TabActivity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.widget.TabHost;

public class Tabs extends TabActivity{

	public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	    setContentView(R.layout.tabs);

	    Resources res = getResources(); // Resource object to get Drawables
	    TabHost tabHost = getTabHost();  // The activity TabHost
	    TabHost.TabSpec spec;  // Resusable TabSpec for each tab
	    Intent intent;  // Reusable Intent for each tab

	    // Create an Intent to launch an Activity for the tab (to be reused)
	    intent = new Intent().setClass(this, AllFind.class);

	    // Initialize a TabSpec for each tab and add it to the TabHost
	    spec = tabHost.newTabSpec("all").setIndicator("All",
	                      null)
	                  .setContent(intent);
	    tabHost.addTab(spec);

	    // Do the same for the other tabs
	    intent = new Intent().setClass(this, CategoriesFind.class);
	    spec = tabHost.newTabSpec("categories").setIndicator("Categories",
	                      null)
	                  .setContent(intent);
	    tabHost.addTab(spec);

	    intent = new Intent().setClass(this, TagsFind.class);
	    spec = tabHost.newTabSpec("tags").setIndicator("Tags",
	                      null)
	                  .setContent(intent);
	    tabHost.addTab(spec);
	    
	    intent = new Intent().setClass(this, SearchFind.class);
	    spec = tabHost.newTabSpec("search").setIndicator("Search",
	                      null)
	                  .setContent(intent);
	    tabHost.addTab(spec);

	    tabHost.setCurrentTab(0);
	}
	
}
