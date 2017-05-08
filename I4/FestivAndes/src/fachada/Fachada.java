package fachada;

import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Properties;

import javax.print.attribute.standard.RequestingUserName;

import dao.ConsultasDAO;
import vos.Abono;
import vos.Boleta;
import vos.Compania;
import vos.Compra;
import vos.Espectaculo;
import vos.Funcion;
import vos.ListaFunciones;
import vos.ListaSitios;
import vos.Localidad;
import vos.Persona;
import vos.Recibo;
import vos.Sitio;

public class Fachada {
	/**
	 * Atributo estático que contiene el path relativo del archivo que tiene los datos de la conexión
	 */
	private static final String CONNECTION_DATA_FILE_NAME_REMOTE = "/conexion.properties";

	/**
	 * Atributo estático que contiene el path absoluto del archivo que tiene los datos de la conexión
	 */
	private  String connectionDataPath;

	/**
	 * Atributo que guarda el usuario que se va a usar para conectarse a la base de datos.
	 */
	private String user;

	/**
	 * Atributo que guarda la clave que se va a usar para conectarse a la base de datos.
	 */
	private String password;

	/**
	 * Atributo que guarda el URL que se va a usar para conectarse a la base de datos.
	 */
	private String url;

	/**
	 * Atributo que guarda el driver que se va a usar para conectarse a la base de datos.
	 */
	private String driver;
	
	/**
	 * Conexión a la base de datos
	 */
	private Connection conn;

	private ArrayList personas;
	
	/**
	 * Método constructor de la clase VideoAndesMaster, esta clase modela y contiene cada una de las 
	 * transacciones y la logia de negocios que estas conllevan.
	 * <b>post: </b> Se crea el objeto VideoAndesMaster, se inicializa el path absoluto de el archivo de conexión y se
	 * inicializa los atributos que se usan par la conexión a la base de datos.
	 * @param contextPathP - path absoluto en el servidor del contexto del deploy actual
	 */
	public Fachada(String contextPathP) {
		connectionDataPath = contextPathP + CONNECTION_DATA_FILE_NAME_REMOTE;
		initConnectionData();
	}

	/*
	 * Método que  inicializa los atributos que se usan para la conexion a la base de datos.
	 * <b>post: </b> Se han inicializado los atributos que se usan par la conexión a la base de datos.
	 */
	private void initConnectionData() {
		try {
			File arch = new File(this.connectionDataPath);
			Properties prop = new Properties();
			FileInputStream in = new FileInputStream(arch);
			prop.load(in);
			in.close();
			this.url = prop.getProperty("url");
			this.user = prop.getProperty("usuario");
			this.password = prop.getProperty("clave");
			this.driver = prop.getProperty("driver");
			Class.forName(driver);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Método que  retorna la conexión a la base de datos
	 * @return Connection - la conexión a la base de datos
	 * @throws SQLException - Cualquier error que se genere durante la conexión a la base de datos
	 */
	private Connection darConexion() throws SQLException {
		System.out.println("Connecting to: " + url + " With user: " + user);
		return DriverManager.getConnection(url, user, password);
	}

	////////////////////////////////////////
	///////Transacciones////////////////////
	////////////////////////////////////////
	
//	public Persona registrarUsuario(String nombre, int edad, int tipo){
//		Persona p = ConsultasDAO.registrarPersona(nombre, edad, tipo);
//		return p;
//		
//	}
	
	/**
	 * 
	 * @param compra
	 * @throws Exception
	 */
	public void addCompra(Compra compra) throws Exception {
		ConsultasDAO  daoconsultas= new ConsultasDAO();		try 
		{
			//////Transacción
			this.conn = darConexion();
			daoconsultas.setConn(conn);
			daoconsultas.addCompra(compra);
			conn.commit();

		} catch (SQLException e) {
			System.err.println("SQLException:" + e.getMessage());
			e.printStackTrace();
			throw e;
		} catch (Exception e) {
			System.err.println("GeneralException:" + e.getMessage());
			e.printStackTrace();
			throw e;
		} finally {
			try {
				daoconsultas.cerrarRecursos();
				if(this.conn!=null)
					this.conn.close();
			} catch (SQLException exception) {
				System.err.println("SQLException closing resources:" + exception.getMessage());
				exception.printStackTrace();
				throw exception;
			}
		}
	}
	
	/**
	 * 
	 * @param persona
	 * @throws Exception
	 */
	public void updatePreferenciaPersona(Persona persona) throws Exception {
		ConsultasDAO  daoconsultas= new ConsultasDAO();
		try 
		{
			//////Transacci�n
			this.conn = darConexion();
			daoconsultas.setConn(conn);
			daoconsultas.updtPrsonPrfrnc(persona);
			conn.commit();

		} catch (SQLException e) {
			System.err.println("SQLException:" + e.getMessage());
			e.printStackTrace();
			throw e;
		} catch (Exception e) {
			System.err.println("GeneralException:" + e.getMessage());
			e.printStackTrace();
			throw e;
		} finally {
			try {
				daoconsultas.cerrarConneccion(conn);
				if(this.conn!=null)
					this.conn.close();
			} catch (SQLException exception) {
				System.err.println("SQLException closing resources:" + exception.getMessage());
				exception.printStackTrace();
				throw exception;
			}
		}
	}
	
	/**
	 * 
	 * @param funcion
	 * @throws Exception
	 */
	public void updateFunctionToPresented(Funcion funcion) throws Exception {
		ConsultasDAO  daoconsultas= new ConsultasDAO();
		try 
		{
			//////Transacci�n
			this.conn = darConexion();
			daoconsultas.setConn(conn);
			daoconsultas.updtFncn(funcion);
			conn.commit();

		} catch (SQLException e) {
			System.err.println("SQLException:" + e.getMessage());
			e.printStackTrace();
			throw e;
		} catch (Exception e) {
			System.err.println("GeneralException:" + e.getMessage());
			e.printStackTrace();
			throw e;
		} finally {
			try {
				daoconsultas.cerrarConneccion(conn);
				if(this.conn!=null)
					this.conn.close();
			} catch (SQLException exception) {
				System.err.println("SQLException closing resources:" + exception.getMessage());
				exception.printStackTrace();
				throw exception;
			}
		}
	}
	
	/**
	 * 
	 * @param nombre
	 * @param duracion
	 * @param lenguaje
	 * @param costoP
	 * @param publico
	 * @param descripcion
	 * @param nombrecomp
	 * @param fecha
	 * @param hora
	 * @return
	 */
	public ArrayList<Espectaculo> darFuncionesEspectaculo(String nombre, int duracion, String lenguaje, double costoP, String publico, String descripcion, String nombrecomp, Date fecha, int hora){
		return ConsultasDAO.darFuncionesEspectaculo(nombre, duracion, lenguaje, costoP, publico, descripcion, nombrecomp, fecha, hora);
	}
	
	/**
	 * 
	 * @param fechaFuncion
	 * @param compania
	 * @param categoria
	 * @param lenguaje
	 * @param disponibilidadTraduccion
	 * @return
	 * @throws Exception
	 */
	public ListaFunciones consultaFuncionesDeEspectaculosProgramados(Date fechaFuncion, String compania, String categoria, String lenguaje, boolean disponibilidadTraduccion )throws Exception
	{
		ArrayList<Funcion> funciones;
		ConsultasDAO  daoconsultas= new ConsultasDAO();
		try {
			this.conn=darConexion();
			daoconsultas.setConn(conn);
			funciones=daoconsultas.consultaFuncionesDeEspectaculosProgramados(fechaFuncion, compania, categoria, lenguaje, disponibilidadTraduccion);
			
		} catch (SQLException e) {
			// TODO: handle exception
			System.err.println("SQLException:" + e.getMessage());
			e.printStackTrace();
			throw e;
		} catch (Exception e) {
			// TODO: handle exception
			System.err.println("GeneralException:" + e.getMessage());
			e.printStackTrace();
			throw e;
		}finally{
			try {
				daoconsultas.cerrarRecursos();
				if(this.conn!=null)
					this.conn.close();
				
			} catch (SQLException exception) {
				// TODO: handle exception
				System.err.println("SQLException closing resources:" + exception.getMessage());
				exception.printStackTrace();
				throw exception;
			}
		}
		return new ListaFunciones(funciones);
	}
	
	/**
	 * 
	 * @return
	 * @throws Exception
	 */
	public ListaSitios consultarSitio() throws Exception
	{
		ArrayList<Sitio> sitios;
		ConsultasDAO  daoconsultas= new ConsultasDAO();
		try {
			this.conn=darConexion();
			daoconsultas.setConn(conn);
			sitios=daoconsultas.consultarSitio();

		} catch (SQLException e) {
			// TODO: handle exception
			System.err.println("SQLException:" + e.getMessage());
			e.printStackTrace();
			throw e;
		}catch (Exception e) {
			// TODO: handle exception
			System.err.println("GeneralException:" + e.getMessage());
			e.printStackTrace();
			throw e;
		}finally{
			try {
				daoconsultas.cerrarRecursos();
				if(this.conn!=null)
					this.conn.close();

			} catch (SQLException exception) {
				// TODO: handle exception
				System.err.println("SQLException closing resources:" + exception.getMessage());
				exception.printStackTrace();
				throw exception;
			}
		}
		return new ListaSitios(sitios);
	}
	
	/**
	 * 
	 * @param mLocalidad
	 * @param registrado
	 * @throws Exception
	 */
	public void generarReporteFuncion(Sitio mLocalidad, Persona registrado) throws Exception
	{
		ConsultasDAO daoConsulta= new ConsultasDAO();
		try {
			this.conn=darConexion();
			daoConsulta.setConn(conn);
			daoConsulta.generarReporteFuncion(mLocalidad, registrado);
		} catch (SQLException e) {
			// TODO: handle exception
			System.err.println("SQLException:" + e.getMessage());
			e.printStackTrace();
			throw e;
		}catch (Exception e) {
			// TODO: handle exception
			System.err.println("GeneralException:" + e.getMessage());
			e.printStackTrace();
			throw e;
		}finally{
			try {
				daoConsulta.cerrarRecursos();
				if(this.conn!=null)
					this.conn.close();

			} catch (SQLException exception) {
				// TODO: handle exception
				System.err.println("SQLException closing resources:" + exception.getMessage());
				exception.printStackTrace();
				throw exception;
			}
		}
	}
	
	/**
	 * 
	 * @param mFuncion
	 * @param mSitio
	 * @param registrado
	 * @throws Exception
	 */
	public void generarReporteEspectaculo(Funcion mFuncion, Sitio mSitio, Persona registrado)throws Exception
	{
		ConsultasDAO daoConsulta= new ConsultasDAO();
		try{
			this.conn=darConexion();
			daoConsulta.setConn(conn);
			daoConsulta.generarReporteEspectaculo(mFuncion, mSitio, registrado);
		}catch (SQLException e) {
			// TODO: handle exception
			System.err.println("SQLException:" + e.getMessage());
			e.printStackTrace();
			throw e;
		}catch (Exception e) {
			// TODO: handle exception
			System.err.println("GeneralException:" + e.getMessage());
			e.printStackTrace();
			throw e;
		}finally{
			try {
				daoConsulta.cerrarRecursos();
				if(this.conn!=null)
					this.conn.close();

			} catch (SQLException exception) {
				// TODO: handle exception
				System.err.println("SQLException closing resources:" + exception.getMessage());
				exception.printStackTrace();
				throw exception;
			}
		}
	}
	
	//--------------------------------------------------------------------I3
	/**
	 * 
	 * @param boleta
	 * @throws Exception
	 */
	public void devolverBoleta(Compra boleta) throws Exception {
		ConsultasDAO  daoconsultas= new ConsultasDAO();
		try 
		{
			//////Transacci�n
			this.conn = darConexion();
			daoconsultas.setConn(conn);
			daoconsultas.devolverBoleta(boleta);
			conn.commit();

		} catch (SQLException e) {
			System.err.println("SQLException:" + e.getMessage());
			e.printStackTrace();
			throw e;
		} catch (Exception e) {
			System.err.println("GeneralException:" + e.getMessage());
			e.printStackTrace();
			throw e;
		} finally {
			try {
				daoconsultas.cerrarConneccion(conn);
				if(this.conn!=null)
					this.conn.close();
			} catch (SQLException exception) {
				System.err.println("SQLException closing resources:" + exception.getMessage());
				exception.printStackTrace();
				throw exception;
			}
		}
	}
	
	/**
	 * 
	 * @param abono
	 * @throws Exception
	 */
	public void devolverAbono(Abono abono) throws Exception {
		ConsultasDAO  daoconsultas= new ConsultasDAO();
		try 
		{
			//////Transacci�n
			this.conn = darConexion();
			daoconsultas.setConn(conn);
			daoconsultas.devolverAbono(abono);
			conn.commit();

		} catch (SQLException e) {
			System.err.println("SQLException:" + e.getMessage());
			e.printStackTrace();
			throw e;
		} catch (Exception e) {
			System.err.println("GeneralException:" + e.getMessage());
			e.printStackTrace();
			throw e;
		} finally {
			try {
				daoconsultas.cerrarConneccion(conn);
				if(this.conn!=null)
					this.conn.close();
			} catch (SQLException exception) {
				System.err.println("SQLException closing resources:" + exception.getMessage());
				exception.printStackTrace();
				throw exception;
			}
		}
	}
	
	public void registrarAbono(Abono abono) throws Exception {
		ConsultasDAO  daoconsultas= new ConsultasDAO();
		try 
		{
			//////Transacci�n
			this.conn = darConexion();
			daoconsultas.setConn(conn);
			daoconsultas.registrarAbono(abono);
			conn.commit();

		} catch (SQLException e) {
			System.err.println("SQLException:" + e.getMessage());
			e.printStackTrace();
			throw e;
		} catch (Exception e) {
			System.err.println("GeneralException:" + e.getMessage());
			e.printStackTrace();
			throw e;
		} finally {
			try {
				daoconsultas.cerrarConneccion(conn);
				if(this.conn!=null)
					this.conn.close();
			} catch (SQLException exception) {
				System.err.println("SQLException closing resources:" + exception.getMessage());
				exception.printStackTrace();
				throw exception;
			}
		}
	}
	
	public void registrarCompraMultiple(Recibo multbol) throws Exception
	{

		ConsultasDAO daoConsulta= new ConsultasDAO();
		try{
			this.conn=darConexion();
			daoConsulta.setConn(conn);
			daoConsulta.registrarCompraMultiplesBoletas(multbol);
		}catch (SQLException e) {
			// TODO: handle exception
			System.err.println("SQLException:" + e.getMessage());
			e.printStackTrace();
			throw e;
		}catch (Exception e) {
			// TODO: handle exception
			System.err.println("GeneralException:" + e.getMessage());
			e.printStackTrace();
			throw e;
		}finally{
			try {
				daoConsulta.cerrarRecursos();
				if(this.conn!=null)
					this.conn.close();

			} catch (SQLException exception) {
				// TODO: handle exception
				System.err.println("SQLException closing resources:" + exception.getMessage());
				exception.printStackTrace();
				throw exception;
			}
		}	
	}
	
	public void cancelarUnaFuncion(Funcion fun, Abono s)throws Exception
	{

		ConsultasDAO daoConsulta= new ConsultasDAO();
		try{
			this.conn=darConexion();
			daoConsulta.setConn(conn);
			daoConsulta.cancelarUnaFuncion(fun, s);
		}catch (SQLException e) {
			// TODO: handle exception
			System.err.println("SQLException:" + e.getMessage());
			e.printStackTrace();
			throw e;
		}catch (Exception e) {
			// TODO: handle exception
			System.err.println("GeneralException:" + e.getMessage());
			e.printStackTrace();
			throw e;
		}finally{
			try {
				daoConsulta.cerrarRecursos();
				if(this.conn!=null)
					this.conn.close();

			} catch (SQLException exception) {
				// TODO: handle exception
				System.err.println("SQLException closing resources:" + exception.getMessage());
				exception.printStackTrace();
				throw exception;
			}
		}
	}
	
	//-------------------------------------------------------------------I4
	//RFC9. CONSULTAR ASISTENCIA A FESTIVANDES
	public void consultAsistenciaFestivandes(Persona per, Funcion fun, Compania com, Compra compr)throws Exception
	{
		ConsultasDAO daoConsulta= new ConsultasDAO();
		try{
			this.conn=darConexion();
			daoConsulta.setConn(conn);
			daoConsulta.consultAsistenciaFestivandes(per, fun, com, compr);
		}catch (SQLException e) {
			// TODO: handle exception
			System.err.println("SQLException:" + e.getMessage());
			e.printStackTrace();
			throw e;
		}catch (Exception e) {
			// TODO: handle exception
			System.err.println("GeneralException:" + e.getMessage());
			e.printStackTrace();
			throw e;
		}finally{
			try {
				daoConsulta.cerrarRecursos();
				if(this.conn!=null)
					this.conn.close();

			} catch (SQLException exception) {
				// TODO: handle exception
				System.err.println("SQLException closing resources:" + exception.getMessage());
				exception.printStackTrace();
				throw exception;
			}
		}
	}
	
	//RFC10. CONSULTAR ASISTENCIA A FESTIVANDES � RFC9-v2
	public void consultAsistenciaVersion2(Persona per, Funcion fun, Compania com, Compra compr)throws SQLException
	{
		ConsultasDAO daoConsulta= new ConsultasDAO();
		try{
			this.conn=darConexion();
			daoConsulta.setConn(conn);
			daoConsulta.consultAsistenciaVersion2(per, fun, com, compr);
		}catch (SQLException e) {
			// TODO: handle exception
			System.err.println("SQLException:" + e.getMessage());
			e.printStackTrace();
			throw e;
		}catch (Exception e) {
			// TODO: handle exception
			System.err.println("GeneralException:" + e.getMessage());
			e.printStackTrace();
			throw e;
		}finally{
			try {
				daoConsulta.cerrarRecursos();
				if(this.conn!=null)
					this.conn.close();

			} catch (SQLException exception) {
				// TODO: handle exception
				System.err.println("SQLException closing resources:" + exception.getMessage());
				exception.printStackTrace();
				throw exception;
			}
		}
	}
	
	//RFC11. CONSULTAR COMPRAS DE BOLETAS
	public void consultCompraBoletas(Persona per, Date fecha, Espectaculo esp,Localidad loc, Funcion fun, Sitio sit) throws SQLException
	{
		ConsultasDAO daoConsulta= new ConsultasDAO();
		try{
			this.conn=darConexion();
			daoConsulta.setConn(conn);
			daoConsulta.consultCompraBoletas(per, fecha, esp, loc, fun, sit);
		}catch (SQLException e) {
			// TODO: handle exception
			System.err.println("SQLException:" + e.getMessage());
			e.printStackTrace();
			throw e;
		}catch (Exception e) {
			// TODO: handle exception
			System.err.println("GeneralException:" + e.getMessage());
			e.printStackTrace();
			throw e;
		}finally{
			try {
				daoConsulta.cerrarRecursos();
				if(this.conn!=null)
					this.conn.close();

			} catch (SQLException exception) {
				// TODO: handle exception
				System.err.println("SQLException closing resources:" + exception.getMessage());
				exception.printStackTrace();
				throw exception;
			}
		}
	}

	//	RFC12. CONSULTAR LOS BUENOS CLIENTES

	public void consultarLosBuenosClientes() throws Exception {
		ConsultasDAO daoConsulta= new ConsultasDAO();
		try{
			this.conn=darConexion();
			daoConsulta.setConn(conn);
			daoConsulta.darLosBuenos();
		}catch (SQLException e) {
			// TODO: handle exception
			System.err.println("SQLException:" + e.getMessage());
			e.printStackTrace();
			throw e;
		}catch (Exception e) {
			// TODO: handle exception
			System.err.println("GeneralException:" + e.getMessage());
			e.printStackTrace();
			throw e;
		}finally{
			try {
				daoConsulta.cerrarRecursos();
				if(this.conn!=null)
					this.conn.close();

			} catch (SQLException exception) {
				// TODO: handle exception
				System.err.println("SQLException closing resources:" + exception.getMessage());
				exception.printStackTrace();
				throw exception;
			}
		}
	}
}
