package AdministradorTest;

import java.util.ArrayList;
import java.util.HashMap;

import modelo.*;

public class AdminFixture1 {
	Administrador admin;
	Colaborador colab1;
	Colaborador colab2;
	Cliente client;
	Servicio serv;
	Tarea tarea;
	
	public AdminFixture1() {
	
	}
	
	public void setUp() {
		admin = new Administrador("Juan Gonzales","juangonza@hotmail.com","2262124785","juan2018","334455");
		colab1 = new Colaborador("Juan Gonzales", "eljuancho22@hotmail.com","223451252","juanjuan", "123");
		colab2 = new Colaborador("Roberto Perez", "robertoP78@hotmail.com","2234345345","robin78", "444");
		client = new Cliente("Paco Martinez", "paco_negocios@fimdp.com.ar", "2262457896", "23124578", "emprendedor", "emprendedoresmdp");
		serv = new Servicio("Servicio1","fijo",300);
		tarea = new Tarea(colab1,client,serv);
		HashMap<Colaborador,ArrayList<Tarea>> mapa = new HashMap<Colaborador,ArrayList<Tarea>>();
		ArrayList<Tarea> lista = new ArrayList<Tarea>();
		lista.add(tarea); mapa.put(colab1, lista);
		admin.setBaseTareas(mapa);
	}
	
	public void tearDown() {
		
	}
	
	
}
