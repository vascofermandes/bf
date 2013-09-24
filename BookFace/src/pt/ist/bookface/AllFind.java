package pt.ist.bookface;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class AllFind extends ListActivity {
	public void onCreate(Bundle icicle) {
		super.onCreate(icicle);
		String[] values = new String[] { "Ensaio Sobre a Cegueira", "Steve Jobs", "Feast Day of Fools: A Novel",
				"1Q84", "The Marriage Plot: A Novel", "A Jangada de Pedra", "The Night Circus", "Rock Seen",
				"Linux", "OS/2" };
		// Use your own layout
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
				R.layout.row_find, R.id.label, values);
		setListAdapter(adapter);
	}

	@Override
	protected void onListItemClick(ListView l, View v, int position, long id) {
		String item = (String) getListAdapter().getItem(position);
		Toast.makeText(this, item + " selected", Toast.LENGTH_LONG).show();
	}
}

