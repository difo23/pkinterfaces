package pkinterfaces;


abstract class MultiplesSonidos implements ReproductorSonido {
	public static void main(String[] args)
	{
		Perro p= new Perro();
		Ventana v= new Ventana();
		p.emiteSonido();
		v.emiteSonido();
	}

}