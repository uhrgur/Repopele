package datos;

import java.util.ArrayList;

import model.Pelicula;

public interface IDao {

	public ArrayList<Pelicula> daoLista();
	public void daoEliminarPelicula(String elm);
	Pelicula daoBuscarPelicula(String pelele);
	void daoAnadirPelicula(Pelicula pelicula);
	void daoModificarPelicula(String elm, Pelicula pelicula);
	
}
