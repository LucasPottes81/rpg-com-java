public abstract class Personagem {
    protected String nome;
    protected int vida;
    protected int ataque;
    protected int vel_de_ataque;
    protected int defesa;

    public Personagem(String nome, int vida, int ataque, int vel_de_ataque, int defesa) {
        this.nome=nome;
        this.vida=vida;
        this.ataque=ataque;
        this.vel_de_ataque=vel_de_ataque;
        this.defesa=defesa;
    }

    public void atacar(Personagem alvo){
        int dano = (this.ataque*this.vel_de_ataque) - (alvo.vida+alvo.defesa);
        if(dano < 0)dano = 0;
        alvo.vida -=dano;
        System.out.println(this.nome + " atacou " + alvo.nome + " e causou " + dano + " de dano!");
    }
    public boolean estaVivo(){
        return vida > 0;
    }
    public String getNome(){
        return nome;
    }
    public int getVida(){
        return vida;
    }
    }







// Status a considerar: Vida, ataque, vel_de_ataque, defesa
// Cavaleiro: Vida=150, ataque=15, vel_de_ataque=8,defesa=20
// Mago: Vida=120, ataque=20, vel_de_ataque=12,defesa=10
// Arqueiro: Vida=100, ataque=12, vel_de_ataque=18,defesa=11
