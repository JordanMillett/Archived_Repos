/* 
    NAME:   Jordan Millett
    CLASS:  Comp Sci 2
    DATE:   2/1/2017

    PURPOSE:  Type a description of your program here.
 */

import cs1.Keyboard;

public class Main
{
	public static void main(String[] args)
	{
		System.out.print("Length : ");
		int length = Keyboard.readInt();
		System.out.print("Width : ");
		int width = Keyboard.readInt();
		System.out.print("Area : ");
		System.out.println(length * width);
	}
}
