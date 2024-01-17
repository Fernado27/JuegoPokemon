public class Bulbassaur extends pokemon implements IPlanta{

    public Bulbassaur() {
    }

    @Override
    protected void atacarPlacaje() {
        System.out.println("Hola soy Bulbassaur y este es mi ataque placaje");

    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("Hola soy Bulbassaur y este es mi ataque araniazo");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Hola soy Bulbassaur y este es mi ataque Mordisco");
    }

    @Override
    public void atacarDrenaje() {
        System.out.println("Hola soy Bulbassaur y este es mi ataque drenaje");
    }

    @Override
    public void atacarParalizar() {
        System.out.println("Hola soy Bulbassaur y este es mi ataque paralizar");
    }
}
