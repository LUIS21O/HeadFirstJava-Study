public class LancadorFrase {


		public static void main (String [] args) {
		
		
			String [] listaPalavras1 = {"Flamengo", "Vasco", "Fluminense", "Botafogo", "Cruzeiro", "Atletico Mineiro", "Santos", "São Paulo", "Corinthians", "Palmeiras"};
		
		
			String [] listaPalavras2 = {"1 Colocado" , "2 Colocado","3 Colocado" , "4 Colocado","5 Colocado" , "6 Colocado","7 Colocado" , "8 Colocado", "9 Colocado", "10 Colocado"};
		
			String [] listaPalavras3 = {" Do campeonato regional", " Do campeonato brasileiro", " Da Copa do Brasil", " Da Libertadores da America"};
			
			
			int oneLength = listaPalavras1.length;
			int twoLength = listaPalavras2.length;
			int threeLength = listaPalavras3.length;
			
			
			
			java.util.Random randomGenerator = new java.util.Random ();
			
			int rand1 = randomGenerator.nextInt (oneLength);
			int rand2 = randomGenerator.nextInt (twoLength);
			int rand3 = randomGenerator.nextInt (threeLength);
			
			String frase = listaPalavras1 [rand1] + " " + listaPalavras2 [rand2]+ listaPalavras3 [rand3];
			
			System.out.println ("Status Time: " + frase);
		
		
		}



}