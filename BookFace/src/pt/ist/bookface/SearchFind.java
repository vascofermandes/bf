package pt.ist.bookface;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class SearchFind extends ListActivity {
	public void onCreate(Bundle icicle) {
		super.onCreate(icicle);
		

		String[] values = new String[] { "A Jangada de Pedra", "Ensaio Sobre a Cegueira"};
		// Use your own layout
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
				R.layout.row_find, R.id.label, values);
		setListAdapter(adapter);
	}

	@Override
	protected void onListItemClick(ListView l, View v, int position, long id) {
		Intent i = new Intent().setClass(getApplicationContext(),
				Ensaio.class);
		startActivity(i);	
	}
}

