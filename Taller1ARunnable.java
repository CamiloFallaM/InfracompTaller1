package Taller1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Taller1ARunnable implements Runnable{
	
	int id;
	int numero;
	
	public Taller1ARunnable(int id, int numero)
	{
		this.id = id;
		this.numero = numero;
	}
	
	public void run()
	{
		try
		{
			
		if(id==0)
		{
			for(int i = 1; i<=numero; i++)
			{
				if(i%2!=0)
				{
					System.out.println(i);
					Thread.sleep(200);
				}
			}
		}
		else
		{
			for(int i = 1; i<=numero; i++)
			{
				if(i%2==0)
				{
					System.out.println(i);
					Thread.sleep(200);
				}
			}
		}
		
		}
		catch(Exception e) {}
	}
	
	
	public static void main(String[] args) throws IOException
	{  
	
		//Leer entrada estandar
		BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));
		int numero = Integer.parseInt(reader.readLine());
		Thread th1 = new Thread(new Taller1A(0, numero));
		Thread th2 = new Thread(new Taller1A(1, numero));
		System.out.println("");
		
		th1.start();
		th2.start();
		
	}
}
