package dao;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Properties;




import javax.naming.InitialContext;





import vos.Abono;
import vos.Boleta;
import vos.Compra;
import vos.Espectaculo;
import vos.Funcion;
import vos.Persona;
import vos.Silla;
import vos.Sitio;

public class ConsultasDAO {

	private ArrayList<Object> recursos;
	
	private  Connection conexion;
	
//	private static String user;
//	
//	private static String password;
//	
//	private static String url;
//	
//	private static InitialContext context;
//	
//	private String driver;
	
//	Formatos para las fechas
	
	public static final String FORMATO_FECHA="dd/MM/yy";
	
    public ConsultasDAO()
    {
		// TODO Auto-generated constructor stub
    	
    	recursos= new ArrayList<>();
	}
    
//    private void inicializacionDatos(Connection conectionData)
//    {
////    	try{
////    		File arch= new File(conectionData);
////    		Properties prop= new Properties();
////    		FileInputStream in= new FileInputStream(arch);
////    		prop.load(in);
////    		in.close();
////    		this.url=prop.getProperty("url");
////    		this.user=prop.getProperty("usuario");
////    		this.password= prop.getProperty("clave");
////    		this.driver=prop.getProperty("driver");
////    		Class.forName(driver);
////    	} catch(Exception e){
////    		e.printStackTrace();
////    		
////    	}
//    	this.conexion=conectionData;
//    }
    
//    private static void establecerConexion()throws SQLException{
//    	System.out.println("Connecting to: "+ url + " With user: "+ user);
//    	conexion= DriverManager.getConnection(url,user,password);
//   	
//    }
    
    /**
     * 
     */
    public void cerrarRecursos()
    {
    	for (Object ob: recursos) 
    	{
    		if(ob instanceof PreparedStatement)
    		{
    			try 
    			{
					((PreparedStatement)ob).close();
				} 
    			catch (Exception e) 
    			{
					// TODO: handle exception
    				e.printStackTrace();
				}
    		}
			
		}
    }
    /**
     * 
     * @param con
     */
    public void setConn(Connection con)
    {
     this.conexion=con;	
    }
    
    public static void cerrarConneccion(Connection connection)throws SQLException{
    	try{
    		connection.close();
    		connection=null;
    		
    	} catch ( SQLException e) {
			// TODO: handle exception
    		System.err.print("SQLExcetion in closing Connection:");
    		e.printStackTrace();
    		throw e;
		}
    }
    //RFC1. CONSULTAR LAS FUNCIONES DE ESPECT�CULOS PROGRAMADOS EN FESTIVANDES 
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
    public ArrayList<Funcion> consultaFuncionesDeEspectaculosProgramados(Date fechaFuncion, String compania, String categoria, String lenguaje, boolean disponibilidadTraduccion )throws Exception
    {
    	ArrayList<Funcion> funciones= new ArrayList<>();
    	String SQL= "SELECT * FROM espectauclo NATURAL JOIN  funcion NATURAL JOIN compania NATURAL JOIN  categoria "
    			+ "WHERE fecha= '"+ fechaFuncion+ "'AND compania ='"+ compania+ "'AND categoria= '"+categoria
    			+"'AND lenguaje= '"+lenguaje+ "'AND disponibilidadTraduccion= "+true+ "'";
    	System.out.println("SQL stmt:"+SQL);
    	PreparedStatement prepStmt= conexion.prepareStatement(SQL);
    	recursos.add(prepStmt);
    	ResultSet rs=prepStmt.executeQuery();
    	while(rs.next())
    	{
    		Date fecha= rs.getDate("fecha");
    		int hora= rs.getInt("hora");
    		int id= rs.getInt("Id");
    		
    		funciones.add(new Funcion(fecha, hora, id));
    	}
    	return funciones;
    }
//    RFC2. CONSULTAR UN SITIO
    /**
     * 
     * @return
     * @throws Exception
     */
    public ArrayList<Sitio> consultarSitio()throws Exception
    {
    	ArrayList<Sitio> sitios= new ArrayList<>();
    	String SQL="SELECT fecha, hora,nombre,id,abierto, tipo, capacidad, apto, silleteria, proteccion, precio  FROM sitio  NATURAL JOIN funcion NATURAL JOIN localidad NATURAL JOIN espectaculo";
    	System.out.println("SQL stmt: "+SQL);
    	PreparedStatement prepStmt= conexion.prepareStatement(SQL);
    	recursos.add(prepStmt);
    	ResultSet rs= prepStmt.executeQuery();
    	while(rs.next())
    	{
    		int abierto=rs.getInt("ABIERTO");
    		String tipo= rs.getString("TIPO");
    		int capacidad= rs.getInt("CAPACIDAD");
    		int apto= rs.getInt("APTO");
    		String silleteria= rs.getString("SILLETERIA");
    		int proteccion= rs.getInt("PROTECCION");
    		int id= rs.getInt("ID");
    		String nombre= rs.getString("NOMBRE");
    		
    		sitios.add(new Sitio(abierto, tipo, capacidad, apto, silleteria, proteccion, id, nombre));
    	}
    	return sitios;
    }
//RFC3. GENERAR UN REPORTE DE UNA FUNCI�N
    /**
     * 
     * @param mLocalidad
     * @param registrado
     */
    public void generarReporteFuncion(Sitio mLocalidad, Persona registrado)
    {
     
    	String sql= "SELECT COUNT(COMPRA) FROM sitio= WHERE LOCALIDAD= '"+mLocalidad+"'AND persona.tipo= "+registrado+"'";
    	try{
    		
    			PreparedStatement ps=conexion.prepareStatement(sql);
    			ResultSet rs = ps.executeQuery();
    			while(rs.next()){
    				FileOutputStream fos = new FileOutputStream("Desktop/Test.pdf");
    				ObjectOutputStream out = new ObjectOutputStream(fos);
    				out.writeChars("NOMBRE DE LA FUNCION: ");
    				 int numBoletas=rs.getInt("SELECT COUNT(ID)FROM COMPRA");
    			     double producido=rs.getInt("SELECT SUM(COSTO) FROM COMPRA");
    				out.close();
    			}
    		
    	}
    	catch (Exception e) 
    	{
    		// TODO: handle exception
    	}

    }
    
//RFC4. GENERAR UN REPORTE DE ESPECT�CULO
    /**
     * 
     * @param mFuncion
     * @param mSitio
     * @param registrado
     */
    public void generarReporteEspectaculo(Funcion mFuncion, Sitio mSitio, Persona registrado)
    {
    	String sql= "SELECT COUNT (COMPRA) FROM SITIO WHERE SITIO= "+mSitio+ "'AND PERSONA.TIPO= "+registrado+"'AND FUNCION= "+ mFuncion+"'";
    	try{
    		PreparedStatement ps=conexion.prepareStatement(sql);
    		ResultSet rs= ps.executeQuery();
    		while(rs.next())
    		{
    			FileOutputStream fos = new FileOutputStream("Desktop/Test.pdf");
				ObjectOutputStream out = new ObjectOutputStream(fos);
				out.writeChars("Nombre espectaculo: "+mFuncion);
				 int numBoletas=rs.getInt("SELECT COUNT(ID)FROM COMPRA");
				 double producido=rs.getInt("SELECT SUM(COSTO) FROM COMPRA");
				 int capacidad= rs.getInt("SELECT CAPACIDAD FROM LOCALIDAD WHERE SITIO= "+ mSitio+"'");
				 double porcentajeOcupacion= numBoletas/capacidad;
    		}
    	}catch (Exception e) 
    	{
			// TODO: handle exception
		}
    }

    
    
//    public ArrayList<Funcion> consultarFuncionesDeEspectaculosProgramados(Date fechaFuncion,String compania,String categoria,String lenguaje,boolean disponibilidadTraduccion ) throws Exception
//    {
//    	PreparedStatement prepStmt=null;
//    	ArrayList<Espectaculo> espectaculos= new ArrayList<>();
//    	try{
//    	establecerConexion();
//    	String formatoFecha=" AND to_char(e.fecha_inicio, '"+FORMATO_FECHA + "')=";
//    	String SQL= "SELECT * FROM espectaculo natural join funcion natural join compania natural join categoria";
//    	prepStmt=conexion.prepareStatement(SQL);
//    	ResultSet rs=prepStmt.executeQuery();
//    	while(rs.next()){
//    		String nombre= rs.getString("NOMBRE");
//    		int id= Integer.parseInt(rs.getString("ID"));
//    		Date fecha=rs.getDate("DIA,MES, ANO");
//    		int hora= rs.getInt("HORA");
//    		
//    		espectaculos.add(new Funcion(fecha, hora, id, mEspectaculos, mSitio)))
//    	}
//    	}
//    	catch (SQLException e)
//    	{
//			// TODO: handle exception
//    		System.err.println("SQLException in executing: ");
//    		e.printStackTrace();
//    		throw e;
//		}
//    	
//    }

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
	public static ArrayList<Espectaculo> darFuncionesEspectaculo(String nombre, int duracion, String lenguaje,
			double costoP, String publico, String descripcion, String nombrecomp, Date fecha, int hora) {
		// TODO Auto-generated method stub
		return ConsultasDAO.darFuncionesEspectaculo(nombre, duracion, lenguaje, costoP, publico, descripcion, nombrecomp, fecha, hora);
	}

	/**
	 * 
	 * @param compra
	 * @throws SQLException
	 */
	public void addCompra(Compra compra) throws SQLException {
		// TODO Auto-generated method stub
boolean a = false;
		
		String sql = "SELECT * FROM SILLA WHERE ID ='" + compra.getSilla().getId() + "'";

		System.out.println("SQL stmt:" + sql);

		PreparedStatement prepStmt = conexion.prepareStatement(sql);
		recursos.add(prepStmt);
		ResultSet rs = prepStmt.executeQuery();

		while (rs.next()) {
			int id = Integer.parseInt(rs.getString("ID_COMPRA"));
			if(id != 00)
				a = true;
		}
		
		if(a == true){
			String sql2 = "INSERT INTO COMPRA VALUES(";
			sql += compra.getId() + ", ";
			sql += compra.getDuenio().getDuenio().getId() + ", ";
			sql += compra.getCosto() + ")";
			
			PreparedStatement prepStmt2 = conexion.prepareStatement(sql2);
			recursos.add(prepStmt2);
			prepStmt2.executeQuery();
			
			String sqlupdate = "UPDATE SILLA SET ID_COMPRA = " + compra.getId() + " WHERE ID = " + compra.getSilla().getId();
			PreparedStatement prepStmtupdt = conexion.prepareStatement(sqlupdate);
			recursos.add(prepStmtupdt);
			prepStmtupdt.executeQuery();
		}
		else{
			System.out.println("La silla con id " + compra.getSilla().getId() + " ya esta vendida.");
		}
	}

	/**
	 * 
	 * @param funcion
	 * @throws SQLException
	 */
	public void updtFncn(Funcion funcion) throws SQLException {
		// TODO Auto-generated method stub
		String sql = "UPDATE FUNCION SET PRESENTADA = 1 WHERE ID = " + funcion.getId();
		PreparedStatement prepStmt = conexion.prepareStatement(sql);
		recursos.add(prepStmt);
		prepStmt.executeQuery();
	}

	/**
	 * 
	 * @param persona
	 * @throws SQLException
	 */
	public void updtPrsonPrfrnc(Persona persona) throws SQLException {
		// TODO Auto-generated method stub
		
		String sql = "UPDATE PERSONA SET PREFERENCIA = " + persona.getPreferencia() + " WHERE ID = " +persona.getId();
		PreparedStatement prepStmt = conexion.prepareStatement(sql);
		recursos.add(prepStmt);
		prepStmt.executeQuery();
	}

	//---------------------------------------------------------------------
	//---------------------------------------------------------------------
	//-------------------------------------------------------------------I3

	/**
	 * 
	 * @param boleta
	 */
	public void devolverBoleta(Compra boleta) {
		// TODO Auto-generated method stub
		String sql = "UPDATE SILLA SET ID_COMPRA = 00 WHERE ID = " + boleta.getSilla().getId() + ";";
		PreparedStatement prepStmt = conexion.prepareStatement(sql);
		recursos.add(prepStmt);
		prepStmt.executeQuery();
		
		String sql2 = "INSTER INTO DEVOLUCION(ID_BOLETA) VALUES(" + boleta.getId() + ");";
		PreparedStatement prepStmt2 = conexion.prepareStatement(sql2);
		recursos.add(prepStmt2);
		prepStmt2.executeQuery();
	}

	/**
	 * 
	 * @param abono
	 */
	public void devolverAbono(Abono abono) {
		// TODO Auto-generated method stub
		ArrayList<Compra> boletas = abono.getBoletas();
		for (int i = 0; i < boletas.size(); i++) {
			Compra a = boletas.get(i);
			devolverBoleta(a);
		}
	}

	/**
	 * 
	 * @param abono
	 */
	public void registrarAbono(Abono abono) {
		// TODO Auto-generated method stub
		ArrayList<Compra> boletas = abono.getBoletas();
		for (int i = 0; i < boletas.size(); i++) {
			Compra a = boletas.get(i);
			addCompra(a);
		}
	}
}
