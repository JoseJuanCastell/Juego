package Juego;

import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Dimension;

import javax.swing.JFrame;

public class Juego extends Canvas {

	
	private static final long serialVersionUID = 1L;
	
	
	// Ponemos el ancho y alto que queremos de ventana.
	private static final int ANCHO = 800;
	private static final int ALTO = 600;
	//Le ponemos el nombre a la ventana del juego
	private static final String  NOMBRE = "Juego"; 
	
	private static JFrame ventana;
	
	private Juego() {
		//seteamos la ventana.
		setPreferredSize(new Dimension(ANCHO, ALTO));
		
		//iniciamos la venana
		ventana = new JFrame(NOMBRE);
		//para que podamos cerra la ventana.
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//aqui hacemos que no se pueda ajustar la ventana
		ventana.setResizable(false);
		//ponemos el layout
		ventana.setLayout(new BorderLayout());
		//ponemos la ventana en el centro del escriptorio
		ventana.add(this , BorderLayout.CENTER);
		//par que todo este dentro de la ventana ajustado
		ventana.pack();
		
		ventana.setLocationRelativeTo(null);
		//para hacer visible la ventana.
		ventana.setVisible(true);
	}
	
	public static void main(String[] args) {
		Juego juego = new Juego();
	}
}
