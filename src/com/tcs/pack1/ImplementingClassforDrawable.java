package com.tcs.pack1;

public class ImplementingClassforDrawable {

	public static void main(String[] args) {
		
		
		Drawable d1=new Drawable()
				{
				
					@Override
					public int draw(int width)
					{
						System.out.println("Drawing width is :"+width);
						return width;
					}
				};
				
				d1.draw(5);

		Drawable d2=(width) ->{
			System.out.println("Drawing width from lambda is: "+width);
			return width;
		};
		
		
		int width=d2.draw(10);
		System.out.println("Returned Value is:"+width);
	
	
	}
}
