package com.example.cmm;

import java.util.ArrayList;
import java.util.List;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ListeRepas extends ActionBarActivity {

	public class Repasdesc {
        String Jour;
        String Heure,nomplat,parti;
    }
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.listerepas);
		

		
		ListView lv=(ListView)findViewById(R.id.listView1);
		
		

		
		List<String>t=getDataForListView();
		
		ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(
                this, 
                android.R.layout.simple_list_item_1,
                t );

        lv.setAdapter(arrayAdapter); 
	}
	 
	public List<String> getDataForListView()
    {
		List<String> cList=new ArrayList<String>();

		ArrayList<Participant> pp=new ArrayList<Participant>();
		pp.add(new Participant("Jean", "Marie"));
		pp.add(new Participant("Jean", "Pierre"));
		pp.add(new Participant("Jean", "Loup"));
		
		ArrayList<Repas> r=new ArrayList<Repas>();
		r.add(new Repas("1","Choucroute","20:00",true,pp));
		r.add(new Repas("2","Choucroute","20:00",true,pp));
		r.add(new Repas("3","Choucroute","20:00",true,pp));
		r.add(new Repas("6","Choucroute","20:00",true,pp));
		r.add(new Repas("4","Choucroute","20:00",true,pp));
		r.add(new Repas("5","Choucroute","20:00",true,pp));
		
		
		for(Repas re:r)
			cList.add(re.toString());

        return cList;

    }
	
}