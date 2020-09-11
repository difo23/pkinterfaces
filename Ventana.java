package pkinterfaces;

public class Ventana implements ReproductorSonido {
	public void emiteSonido()
	{
		java.awt.Toolkit.getDefaultToolkit().beep();
	}
}