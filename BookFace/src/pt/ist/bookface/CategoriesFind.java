package pt.ist.bookface;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.CheckedTextView;
import android.widget.ListView;
import android.widget.Toast;

public class CategoriesFind extends ListActivity {
	public void onCreate(Bundle icicle) {
			super.onCreate(icicle);
			String[] values = new String[] { "Health", "Portuguese", "Sports", "Romance",
					"History", "Fiction", "Finance", "Law" };
			ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
					android.R.layout.simple_list_item_checked, values);
			setListAdapter(adapter);
		}

		@Override
		protected void onListItemClick(ListView l, View v, int position, long id) {
			String item = (String) getListAdapter().getItem(position);
			Toast.makeText(this, item + " selected", Toast.LENGTH_LONG).show();
			CheckedTextView textView = (CheckedTextView)v;
			  textView.setChecked(!textView.isChecked());		}
	}

