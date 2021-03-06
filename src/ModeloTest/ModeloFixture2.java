package ModeloTest;

import modelo.Administrador;
import modelo.Cliente;
import modelo.Colaborador;
import modelo.Modelo;
import modelo.Servicio;
import modelo.Tarea;

public class ModeloFixture2 {
	
	public Modelo modelo = new Modelo();
	public Administrador admin;
	public Colaborador colab1;
	public Colaborador colab2;
	public Cliente client1;
	public Cliente client2;
	public Servicio serv;
	public Tarea tarea;
	public Tarea tarea2;
	
	public ModeloFixture2() {
		
	}
	
	public void setUp() {
		admin = new Administrador("Carlos Rico","crico@crico.com.ar","223457898","crico","felipefelipe");
		colab1 = new Colaborador("Felipe Evans","fevans@gmail.com","223415984","fevans","empiezacon8");
		colab2 = new Colaborador("nada","nada@gmail.com","000","nada","nadapass");
		client1 = new Cliente("Paco Martinez", "paco_negocios@fimdp.com.ar","22624579","2168491","emprendedor","emprendedoresmdp");
		client2 = new Cliente("Jhon Ford", "jhon_contact@gmail.com","22624579","2168491","emprendedor","emprendedoresmdp");
		serv = new Servicio("Servicio1","fijo",300);
		tarea = new Tarea(colab1,client1,serv);
		tarea2 = new Tarea(colab2,client2,serv);
		modelo.addUsuario(colab1);
		modelo.addUsuario(colab2);
		modelo.addTarea(colab1,tarea);
		modelo.addTarea(colab2,tarea2);
		modelo.setUsserActual(colab1);
		modelo.addCliente(client1);
	}
	
	public void tearDown() {
		modelo = new Modelo();
	}
	
}