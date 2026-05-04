package com.visal.learning.method.reference;

public class MyFinder implements Finder{

	@Override
	public int Find(String source, String textToFind) {
		// TODO Auto-generated method stub
		return source.indexOf(textToFind);
	}
	

}
