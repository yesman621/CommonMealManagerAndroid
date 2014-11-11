package com.example.cmm;


import android.support.v7.app.ActionBarActivity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends ActionBarActivity {

	ImageButton toRepas;
	final Context context = this;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		toRepas=(ImageButton) findViewById(R.id.imageButton1);
		toRepas.setOnClickListener(new toRepasList());
	}
	
	public class toRepasList implements OnClickListener
	{
		
		public void onClick(View arg0) {

		    Intent intent = new Intent(context, ListeRepas.class);
		    
		    
            startActivity(intent);   

		}

	}


}
