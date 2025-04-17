package bu.clinix.service;

import java.util.UUID;

public class GenerateIdPatient
{
	static String formIdString(char first, char second, String tab[]) {
		
		String idPatient =""+first + second+"-";
		for (int i = 0; i < tab.length; i++)
		{
			if(i== 3) {
				idPatient = idPatient+"-";
			}
			idPatient = idPatient+tab[i];
		}
		
		return idPatient;
	}
	
	public static String geneteIdPatient(int numero, String name, String sexe, String matricule) {
		String idPatient = matricule;
		String reference[] = {"0", "0", "0", "0", "0"};
		String tabAlphabet[] = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9",
				"A", "B", "C", "D", "E", "F",
				"G", "H", "I", "J", "K", "L",
				"M", "N", "O", "P", "Q", "R", "S", "T",
				"U", "V"};
		char first = 0;
		char second = 0; 
		
		try
		{
			first = name.charAt(0);
			second = sexe.charAt(0);
		} catch (Exception e)
		{
			idPatient = UUID.randomUUID().toString();
		}
		
		
		
		if(numero >= 32)
		{ int i = 0;
			while(numero >= 32 && i < reference.length) 
			{
				System.out.println("--------------numero--------------"+numero);
				int indice = numero % 32;
				numero = numero/32;
				
				
				System.out.println("---------------indice-------------"+indice+"----"+5%2+"----"+129%32);
				reference[(reference.length-1) -i ] = tabAlphabet[indice];
				if(numero < 32) 
				{
					System.out.println("--------------end numero---------------------"+indice);
					reference[(reference.length-1) - (i+1)] = tabAlphabet[numero];
					//break;
				}
				i = i+1;
			}
			idPatient = formIdString(first, second, reference);
			if(numero > 32) {
				idPatient = UUID.randomUUID().toString();
				System.out.println("------------------except-----------:"+idPatient);
			}
			for (int ii = 0; ii < reference.length; ii++)
			{
				System.out.println("----------------------------------on while----------------");
				System.out.println("["+ii+"]"+"-----------"+reference[ii]);
			}
		}
		else {
			reference[(reference.length-1)] = tabAlphabet[numero];
			
			for (int i = 0; i < reference.length; i++)
			{
				System.out.println("-------------------------in else-----------------------");
				System.out.println("["+i+"]"+"-----------"+reference[i]);
			}
			
			idPatient = formIdString(first, second, reference);
		}
		
		for (int i = 0; i < reference.length; i++)
		{
			System.out.println("-------------------------after all-----------------------");
			System.out.println("["+i+"]"+"-----------"+reference[i]);
		}
		
		System.out.println("---------------------------id ---after all---:"+idPatient);
		
		return idPatient;
	}
}
