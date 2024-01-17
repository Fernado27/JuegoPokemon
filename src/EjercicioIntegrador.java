public class EjercicioIntegrador {
    public static void main(String[] args) {
        Squirtle squirtle = new Squirtle();
        Charmander charmander = new Charmander();
        Bulbassaur bulbassaur = new Bulbassaur();
        Pikachu pikachu = new Pikachu();

        squirtle.atacarAraniazo();
        squirtle.atacarHidrobomba();
        charmander.atacarMordisco();
        charmander.atacarLanzallamas();
        pikachu.atacarPlacaje();
        pikachu.atacarImpactrueno();
        bulbassaur.atacarDrenaje();
        bulbassaur.atacarParalizar();
    }
}
