package com.string;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class RepeatedWords {

	public static void main(String[] args) {
		DupWords("good morning good harsha good harsha");
	}

	
	
	static void DupWords(String sentence)
	{
		Map<String,Integer> map=new HashMap<String,Integer>();
		
		String[] str=sentence.split(" ");
		for(String word:str)
		{
			if(map.containsKey(word))
			{
				map.put(word.toLowerCase(),map.get(word.toLowerCase())+1);
			}
			else
			{
				map.put(word.toLowerCase(),1);
			}
		}
		
		Set<String> set=map.keySet();
		
		for(String set1:set)
		{
			System.out.println(set1+"="+map.get(set1));
		}
	}
}
