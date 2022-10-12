package com.java.Tv;


public class HyerimCaptionTv extends Tv{
	
	boolean caption;
	
	void displayCaption(String text) {
		if(caption) {
			System.out.println(text);
		}
	}
	public static void main(String[] args) {
		HyerimCaptionTv htv = new HyerimCaptionTv();
		htv.channel = 50;
		System.out.println(htv.channel);
		htv.ChannelDown();
		System.out.println(htv.channel);
		htv.ChannelUp();
		System.out.println(htv.channel);
		
		
		htv.caption = true;
		htv.displayCaption("¿À´Ã ³¯¾¾ °³Ãß¿ò.");
		
		I3dTv dd = new I3dTv();
		dd.i4d = true;
		dd.i4dPower();
		

	}
}
