package Ajio_Run;

import org.testng.annotations.Test;

import AjioShopping.Ajio_Shopping;

public class Ajio_Run 
{
	@Test
	void Run()
	{
		Ajio_Shopping aj=new Ajio_Shopping();

		aj.ajio();
	}
}
