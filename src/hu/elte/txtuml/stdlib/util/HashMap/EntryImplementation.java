package hu.elte.txtuml.stdlib.util.HashMap;

import java.util.HashMap;
import java.util.Map;


public class  EntryImplementation implements Entry
{
	 String key;
	 String value;
	// Entry<String, String> map= (Entry<String, String>) new HashMap<String, String>();

	public EntryImplementation(String key, String value) 
	{
		this.key = key;
		this.value = value;
	}


	public boolean equals(Entry entry) 
	{
		if(entry instanceof EntryImplementation)
		{
			EntryImplementation entry_class = (EntryImplementation)entry;
			return key.equals(entry_class.key)&&value.equals(entry_class.value);
		}
		else
		{
			return false;
		}
	}

	@Override
	public String getKey() {
		return key;
	}

	@Override
	public String getValue() {
		return value;
	}



	@Override
	public String setValue(String v) 
	{
		String old_value=value;
		value=v;
		return old_value;
	}

}