package BiblioClases;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;




public class GestorBBDD extends Conector {
	
	public void insertarLibro(Libro libro) throws SQLException {
		String sent ="INSERT INTO libros (titulo,autor,num_pag) VALUES (?,?,?)";
		PreparedStatement pt = con.prepareStatement(sent);
		pt.setString(1, libro.getTitulo());
		pt.setString(2, libro.getAutor());
		pt.setInt(3, libro.getNum_pag());
		
	}
	public void eliminarLibro(int id) throws SQLException {
		
		String sent="DELETE FROM arboles WHERE id=?";
		PreparedStatement pt = con.prepareStatement(sent);
		
		pt.setInt(1, id);
		pt.execute();
	}
	public Libro getLibro(int id) throws SQLException {
		Libro newLibro= new Libro();
		PreparedStatement pt = con.prepareStatement("SELECT * FROM libros where ID = ?");
		pt.setInt(1, id);
		ResultSet resultado=pt.executeQuery();
		
			
		newLibro.setId(resultado.getInt(1));
		newLibro.setTitulo(resultado.getString(2));
		newLibro.setAutor(resultado.getString(3));
		newLibro.setNum_pag(resultado.getInt(4));
			
		
			
			
		
		return newLibro;
		
	}
}
