public class Combinaison extends App{
	public void Lancer_Solo(int[] tirage) {
		java.util.Arrays.sort(tirage);
		
		for (int i=0; i<5; i++){
		 tirage[i] = (int) (Math.random()*6+1);
		 System.out.print(tirage[i]+" ");	}	 
		Si_C_est_Un_Pocker(tirage);
		Si_C_est_Un_carre(tirage);
		Si_c_est_Un_Full(tirage);
		Si_C_est_La_Grande_Suite(tirage);
		Si_C_est_Un_Brelan(tirage);
		Si_C_est_La_Petite_Suite(tirage);
		Si_C_est_La_Double_Paire(tirage);
		Si_C_est_Une_Paire(tirage);
		Si_Ce_N_est_Rien(tirage);
	}
    public static void Si_C_est_Un_Pocker(int[] tirage) {
        if(tirage[0]==tirage[1]&& tirage[1]==tirage[2] && tirage[2]==tirage[3]&& tirage[3]==tirage[4]) {
            System.out.println("Bravoo! C'est un Poker");
        }
    }
    public static void Si_C_est_Un_carre(int[] tirage) {
        if(tirage[0]==tirage[1]&& tirage[1]==tirage[2] && tirage[2]== tirage[3]) {
            System.out.println("Pas mal le carré!");
            System.out.println("T'étais proche du pocker");
        }
        
    }
    public static void Si_c_est_Un_Full(int[] tirage) {
         if(tirage[0]==tirage[1]&& tirage[1]==tirage[2] && tirage[3]==tirage[4]) {
            System.out.println("Un full!");
        }
        
    }
    public static void Si_C_est_La_Grande_Suite(int[] tirage) {
        if(tirage[1]==(tirage[0]+1)&& tirage[2]==(tirage[1]+1)&& tirage[3]==(tirage[2]+1)&& tirage[4]==(tirage[3]+1)){
            System.out.println("Les chiffre se suivent consécutivement! C'est une grande suite!");	
        }
    }
    public static void Si_C_est_Un_Brelan(int[] tirage) {
        if((tirage[0]==tirage[1]&& tirage[1]==tirage[2] && tirage[3]!=tirage[4])|| (tirage[1]==tirage[2]&& tirage[2]==tirage[3]&& tirage[3]!=tirage[4] && tirage[3]!=tirage[0]&& tirage[4]!=tirage[0])|| (tirage[2]==tirage[3]&& tirage[3]==tirage[4]&& tirage[4]!=tirage[0] && tirage[4]!=tirage[1] && tirage[1]!=tirage[0])) {
            System.out.println("Un brelan! Wao!");
            
        }
    }
    public static void Si_C_est_La_Petite_Suite(int[] tirage) {
        if (tirage[0]==tirage[1]&& tirage[1]==tirage[2] && tirage[2]==tirage[3] && tirage[3]!=tirage[4]) {
            System.out.println("C'est une petite suite!");
        }
    }
    public static void Si_C_est_La_Double_Paire(int[] tirage) {
        if (tirage[0]==tirage[1]&& tirage[2]==tirage[3] && tirage[4]!= tirage[0] && tirage[4]!=tirage[2]) {
            System.out.println("C'est une double paire!");
        }
    }
    public static void Si_C_est_Une_Paire(int[] tirage) {
        if ((tirage[1]==tirage[2] && tirage[1]!= tirage[0] && tirage [1]!=tirage[3]&& tirage[1]!=tirage[4])||(tirage[0]==tirage[1] && tirage[1]!=tirage[2] && tirage[2]!= tirage[3] && tirage[3]!=tirage[4] && tirage[1]!=tirage[3] && tirage[1]!=tirage[4])	||	(tirage[1]==tirage[2] && tirage[0]!=tirage[2] && tirage[2]!= tirage[3] && tirage[3]!=tirage[4] && tirage[1]!=tirage[3] && tirage[1]!=tirage[4])	||(tirage[2]==tirage[3] && tirage[3]!=tirage[0] && tirage[3]!= tirage[1] && tirage[3]!=tirage[4] )	|| 	(tirage[3]==tirage[4] && tirage[3]!=tirage[2] && tirage[3]!= tirage[0] && tirage[3]!=tirage[1] ) ) {
            System.out.println("C'est une simple paire!");
        }
    }
    public static void Si_Ce_N_est_Rien(int[] tirage) {
        if(tirage[0]!=tirage[1]&& tirage[1]!=tirage[2] && tirage[2]!=tirage[3]&& tirage[3]!=tirage[4]) {
            System.out.println("Raté! tu n'a pas eu de combinaison");
        }
    }
}
