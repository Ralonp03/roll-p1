package bayau;

import java.util.Scanner;
import java.util.Random;
/**
* @version 1.0
* @author Ricardo
* 
*
*/
public class pc1{

	public static void main(String[] args){
						dados d = new dados();
						Scanner sc = new Scanner(System.in);
										
						d.roll(sc.nextInt());
						sc.close();
	
						}



}

/**
* Esta clase se encarga de comparar el numero que introduces con el dado
* 
*
*/


class dados{
		int dado;
		/**
		* @param num Es el numero que crees que va a ser el dado
		*	
		*/
		void roll(int num){
		Random n = new Random();
		dado = n.nextInt(6)+1;
		
		if(compare(dado,num)){
		System.out.println("Has acertado!!! \ndijiste "+num+" y el dado fue "+dado);		
		}else{
					System.out.println("Has fallado, dijiste "+num+" y el dado fue "+dado+"\nIntentalo de nuevo");		
		}
			
		}
		
		/**
		*@return si el dado es igual al tuyo
		*
		*/
		boolean compare(int a,int b){
		if(a == b){
		return true;		
		}else{
		return false;
		}		
		
		}

}