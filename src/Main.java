import java.util.Scanner;

public class Main{

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("--RPG COM JAVA--⚔️");
    System.out.println("Digite o nome do seu personagem: ");
    String nome = sc.nextLine();

    System.out.println("✅Escolha sua classe:");
    System.out.println("1 - Cavaleiro");
    System.out.println("2 - Mago");
    System.out.println("3 - Arqueiro");
    System.out.println("4 - Desistir do jogo");
    int escolha = sc.nextInt();

    Personagem personagem;

    switch (escolha){
        case 1:
            personagem = new Cavaleiro(nome);
            System.out.println("Classe escolhida: Cavaleiro");
            break;
        case 2:
            personagem = new Mago(nome);
            System.out.println("Classe escolhida: Mago");
            break;
        case 3:
            personagem = new Arqueiro(nome);
            System.out.println("Classe escolhida: Arqueiro");
            break;
        case 4:
            System.out.println("Desistência");
            return;
        default:
            System.out.println("Opção inválida!");
            return;
    }
    Goblin goblin = new Goblin("Goblin");

    System.out.println("Um " + goblin.getNome() + " apareceu!");
    System.out.println("========================");

    while (personagem.estaVivo() && goblin.estaVivo()){
        personagem.atacar(goblin);

        if(goblin.estaVivo()){
            goblin.atacar(personagem);
        }

        System.out.println(personagem.getNome()+ "- Vida: " + personagem.getVida());
        System.out.println(goblin.getNome()+ "- Vida: " + goblin.getVida());
        System.out.println("-------------");
    }
    if(personagem.estaVivo()){
        System.out.println("Você derrotou o " + goblin.getNome());
    } else{
        System.out.println(("Você foi derrotado..."));
    }
}
}
