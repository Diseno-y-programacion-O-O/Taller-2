package uniandes.dpoo.taller1.modelo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;


public class Restaurante {

	public Restaurante() {

	}
	
	//MENU CARGA DE DATOS
	
	public HashMap <String, Menu> ListaMenu;
	
	public void cargarArchivoMenu() throws FileNotFoundException, IOException
	{
		
		// Abrir el archivo y leerlo línea por línea usando un BufferedReader
		
		File fileMenu = new File("data/menu.txt");
		BufferedReader br = new BufferedReader(new FileReader(fileMenu));
		String linea_menu = br.readLine();
		
		// Cuando se llegue al final del archivo, linea tendrá el valor null
	
		while (linea_menu != null)
		{
			// Separar los valores que estaban en una línea
			
			String[] partes = linea_menu.split(";");
			String nombreProducto = partes[0];
			int valorProducto = Integer.parseInt(partes[1]);

			// Si el ingrediente no existe, lo agrega al map de ingredientes
	
			Menu elMenu = ListaMenu.get(nombreProducto);
			if (elMenu == null)
			{
				elMenu = new Menu(nombreProducto, valorProducto);
				ListaMenu.put(nombreProducto, elMenu);
			}	

			linea_menu = br.readLine(); 
		}

		br.close();

		System.out.println(ListaMenu);

	}
	
	
	
	//INGREDIENTES CARGA DE DATOS
	
	public HashMap <String, Ingredientes> ListaIngredientes;	
	
	public void cargarArchivoIngredientes() throws FileNotFoundException, IOException
	{
		
		// Abrir el archivo y leerlo línea por línea usando un BufferedReader
		
		File fileIngredientes = new File("data/ingredientes.txt");
		BufferedReader br = new BufferedReader(new FileReader(fileIngredientes));
		String linea_ingredientes = br.readLine();
		
		// Cuando se llegue al final del archivo, linea tendrá el valor null
	
		while (linea_ingredientes != null)
		{
			// Separar los valores que estaban en una línea
			
			String[] partes = linea_ingredientes.split(",");
			String nombreIngrediente = partes[0];
			int valorIngrediente = Integer.parseInt(partes[1]);

			// Si el ingrediente no existe, lo agrega al map de ingredientes
	
			Ingredientes losIngredientes = ListaIngredientes.get(nombreIngrediente);
			if (losIngredientes == null)
			{
				losIngredientes = new Ingredientes (nombreIngrediente, valorIngrediente);
				ListaIngredientes.put(nombreIngrediente, losIngredientes);
			}	

			linea_ingredientes = br.readLine(); 
		}

		br.close();

		System.out.println(ListaIngredientes);

	}
	
	
	
	//COMBOS CARGA DE DATOS
	
	public HashMap <String, Combos> ListaCombos;
	
	public void cargarArchivoCombo() throws FileNotFoundException, IOException
	{

		// Abrir el archivo y leerlo línea por línea usando un BufferedReader
		
		File fileCombos = new File("data/combos.txt");
		BufferedReader br = new BufferedReader(new FileReader(fileCombos));
		String linea_combos = br.readLine();
		
		// Cuando se llegue al final del archivo, linea tendrá el valor null
	
		while (linea_combos != null)
		{
			// Separar los valores que estaban en una línea
			
			String[] partes = linea_combos.split(",");
			String nombreCombo = partes[0];
			int descuentoCombo = Integer.parseInt(partes[1]);
			String itemUnoCombo = partes[2];
			String itemDosCombo = partes[3];
			String itemTresCombo = partes[4];

			// Si el combo no existe, lo agrega al map de combo
	
			Combos losCombos = ListaCombos.get(nombreCombo);
			if (losCombos == null)
			{
				losCombos = new Combos (nombreCombo, descuentoCombo,itemUnoCombo,itemDosCombo,itemTresCombo);
				ListaCombos.put(nombreCombo, losCombos);
			}	

			linea_combos = br.readLine(); 
		}

		br.close();

		System.out.println(ListaCombos);

	}
		
}





	

