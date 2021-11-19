import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.io.IOException;

public class App {
    private static  Combinaison combinaison = new Combinaison();

    public static void main(String[] args) throws Exception {
        Start_Game();
    }


    public static void Start_Game() throws IOException, InterruptedException {
		Scanner input= new Scanner (System.in) ;
		int choice = 0;
		int[] tirage = new int[5];
		System.out.println("Bienvenue dans le PockerAs!");
		TimeUnit.SECONDS.sleep(1);
		System.out.println("Commencer?(1=oui)\t(2=non)");
		choice=input.nextInt();
		if(choice==1) {
            System.out.println("Choisissez l'Option:");
            TimeUnit.SECONDS.sleep(1);
            System.out.println("\t 1- Mode Solo");
            TimeUnit.SECONDS.sleep(1);
            System.out.println("\t \t 2- Mode Multijoueur");
            choice=input.nextInt();
            switch(choice){
            case 1:
            combinaison.Lancer_Solo(tirage);
            break;
            case 2:
                System.out.println("Oups! Nous n'avons pas pu finir la conception du tirage multijoueur! Excusez nous et revenez prochainement elle sera surement au pas! Merci");
                break;
                default:
                    System.out.println("rien ne corespond");
            }
    
		}
		else if(choice==2){
			System.out.println("Bye Bye!");
		}
        else if(choice<0 || choice>2){
            System.out.println("le choix est invalide! le programme va s'arreter");
        }


	}
}
