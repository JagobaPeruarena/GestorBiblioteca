package BiblioClases;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;




public class GestorBBDD extends Conector {
	public ArrayList<Libro> getLibros(){

		ArrayList<Libro> libros = new ArrayList<Libro>();
		PreparedStatement st;
		try {
			st = con.prepareStatement("");
			ResultSet rs = st.executeQuery("select * from libros");

			Libro libro;
			while (rs.next()) {
				libro = new Libro();
				libro.setId(rs.getInt("id"));
				libro.setTitulo(rs.getString("titulo"));
				libro.setAutor(rs.getString("autor"));
				
				
				libros.add(libro);
			}
			return libros;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public void insertarLibro(Libro libro) throws SQLException {
		String sent ="INSERT INTO libros (titulo,autor,num_pag) VALUES (?,?,?)";
		PreparedStatement pt = con.prepareStatement(sent);
		pt.setString(1, libro.getTitulo());
		pt.setString(2, libro.getAutor());
		pt.setInt(3, libro.getNum_pag());
		
	}
	public void eliminarLibro(int id) throws SQLException {
		
		String sent="DELETE FROM biblioteca WHERE id=?";
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
	public ArrayList<Socio> getSocios(){

		ArrayList<Socio> Socios = new ArrayList<Socio>();
		PreparedStatement st;
		try {
			st = con.prepareStatement("");
			ResultSet rs = st.executeQuery("select * from libros");

			Socio Socio;
			while (rs.next()) {
				Socio = new Socio();
				Socio.setId(rs.getInt(1));
				Socio.setNombre(rs.getString(2));
				Socio.setApellido(rs.getString(3));
				Socio.setDireccion(rs.getString(4));
				Socio.setPoblacion(rs.getString(5));
				Socio.setProvincia(rs.getString(6));	
				Socio.setDni(rs.getString(7));
				
				
				Socios.add(Socio);
			}
			return Socios;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	public void insertarSocio(Socio Socio) throws SQLException {
		String sent ="INSERT INTO socios (nombre,apellido,direccion, poblacion,provincia,dni) VALUES (?,?,?,?,?,?)";
		PreparedStatement pt = con.prepareStatement(sent);
		pt.setString(1, Socio.getNombre());
		pt.setString(1, Socio.getApellido());
		pt.setString(1, Socio.getDireccion());
		pt.setString(1, Socio.getPoblacion());
		pt.setString(1, Socio.getProvincia());
		pt.setString(1, Socio.getDni());
		
	}
	public void eliminarSocio(int id) throws SQLException {
		
		String sent="DELETE FROM biblioteca WHERE id=?";
		PreparedStatement pt = con.prepareStatement(sent);
		
		pt.setInt(1, id);
		pt.execute();
	}
	public Socio getSocio(int id) throws SQLException {
		Socio newSocio= new Socio();
		PreparedStatement pt = con.prepareStatement("SELECT * FROM socios where ID = ?");
		pt.setInt(1, id);
		ResultSet resultado=pt.executeQuery();
		
			
		newSocio.setId(resultado.getInt(1));
		newSocio.setNombre(resultado.getString(2));
		newSocio.setApellido(resultado.getString(3));
		newSocio.setDireccion(resultado.getString(4));
		newSocio.setPoblacion(resultado.getString(5));
		newSocio.setProvincia(resultado.getString(6));	
		newSocio.setDni(resultado.getString(7));
			
			
		
		return newSocio;
		
	}
}
