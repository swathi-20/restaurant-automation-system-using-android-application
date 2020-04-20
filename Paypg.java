package com.example.orderhere;

import java.util.ArrayList;

import android.os.Bundle;
import android.app.Activity;
import android.telephony.gsm.SmsManager;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class Paypg extends Activity {
	ArrayList<String> selt=new ArrayList<String>();
	Button b;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_paypg);
		
	}
	public void sds(View view)
	{
		boolean checked=((CheckBox)view).isChecked();
		switch (view.getId())
		{
		case R.id.checkBox1:
		if(checked)
		{
			selt.add("TableNo1 Payment");
		}
		else
		{
			selt.remove("TableNo1 Payment");
		}
		break;
		case R.id.checkBox2:
			if(checked)
			{
				selt.add("TableNo2 Payment");
			}
			else
			{
				selt.remove("TableNo2 Payment");
			}
			break;
		case R.id.checkBox3:
			if(checked)
			{
				selt.add("TableNo3 Payment");
			}
			else
			{
				selt.remove("TableNo3 Payment");
			}
			break;
		case R.id.checkBox4:
			if(checked)
			{
				selt.add("TableNo4 Payment");
			}
			else
			{
				selt.remove("TableNo4 Payment");
			}
			break;
		case R.id.checkBox5:
			if(checked)
			{
				selt.add("TableNo5 Payment");
			}
			else
			{
				selt.remove("TableNo5 Payment");
			}
			break;
		}
	}
	public void dfd(View view)
	{
		String Ded="";
		for(String dfg:selt)
		{
			Ded=Ded+dfg+"\n";
		}
		String s="9444307815";
		try
		{
			SmsManager m=SmsManager.getDefault();
			m.sendTextMessage(s, null, Ded, null, null);
			Toast.makeText(getApplicationContext(), "Please wait for 5 min waiter will be at your place", Toast.LENGTH_LONG).show();
		}
		catch(Exception e)
		{
			Toast.makeText(getApplicationContext(), "sorry retry", Toast.LENGTH_SHORT).show();
			
		}
		
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.paypg, menu);
		return true;
	}

}
