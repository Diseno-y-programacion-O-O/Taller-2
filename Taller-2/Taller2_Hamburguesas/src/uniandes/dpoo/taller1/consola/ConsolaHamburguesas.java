package uniandes.dpoo.taller1.consola;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

import uniandes.dpoo.taller1.modelo.Ingredientes;
import uniandes.dpoo.taller1.modelo.Restaurante;


public class ConsolaHamburguesas {

	private Restaurante restaurante;
	
	
	public void ejecutarAplicacion() throws FileNotFoundException, IOException
	{
		System.out.println("Bienvenido al corral");
		
		restaurante = new Restaurante();
		restaurante.ListaMenu = new HashMap<String, Menu>();
		
		boolean continuar = true;
		while (continuar)
		{
			try
			{
				mostrarMenu();
				int opcion_seleccionada = Integer.parseInt(input("\nPor favor selecciona una opción:\n"));
				if (opcion_seleccionada == 1 && restaurante != null)
					ejecutarCargarAlimentos();
				else if (opcion_seleccionada == 2 && restaurante != null)
					System.out.println("soy el 3\n");
				else if (opcion_seleccionada == 3 && restaurante != null)
					System.out.println("soy el 3\n");
				else if (opcion_seleccionada == 4 && restaurante != null)
				{
					System.out.println("Saliendo de la aplicación ...");
					continuar = false;
				}
				
				else if (restaurante == null)
				{
					System.out.println("\nTe recomendamos mirar primero el menú.");
				}
				
				else
				{
					System.out.println("\nPor favor seleccione una opción válida.");
				}
			}
			catch (NumberFormatException e)
			{
				System.out.println("Porfavor selecciona una opción válida.");
			}
		}
	}
	
	
	public void mostrarMenu()
	{
		System.out.println("\n¿En que te podemos colaborar?\n");
		System.out.println("1. Mostrar el menú");
		System.out.println("2. Iniciar un nuevo pedido");
		System.out.println("3. Consultar la información de un pedido dado su id");
		System.out.println("4. Salir de la aplicación");
	
	}
		
	
	//se crea para poder hacer que el usuario lea y ponga una opcion
	public String input(String mensaje)
	{
		try
		{
			System.out.print(mensaje + "\nOpción: ");
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			return reader.readLine();
		}
		catch (IOException e)
		{
			System.out.println("Error leyendo de la consola");
			e.printStackTrace();
		}
		return null;
	}
	
	//mostrar menu al usuario
	private void ejecutarCargarAlimentos() throws FileNotFoundException, IOException
	{
		System.out.println("\n" + "Cargando menu" + "\n");

			restaurante.cargarArchivoMenu();
					
			System.out.println("Se cargó el archivo " + restaurante + " con información.");
			
	}

	
	//main para comenzar aplicación
	public static void main(String[] args) throws FileNotFoundException, IOException
		
		{
			ConsolaHamburguesas consola = new ConsolaHamburguesas();
			consola.ejecutarAplicacion();
		}

}


