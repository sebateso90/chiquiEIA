package backward;

import static utils.TestCaseUtils.assertResults;
import static utils.TestCaseUtils.print;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.kie.api.runtime.rule.Agenda;
import org.kie.api.runtime.rule.FactHandle;

import model.AccionRecomendada;
import model.Cornea;
import model.Cristalino;
import model.Esclerotica;
import model.Iris;
import model.Ojo;
import model.Pupila;
import model.Recomendacion;
import model.Retina;
import utils.KnowledgeSessionHelper;

public class BackwardTestCases {

	// Buscar archivo kmodule.xml. El nombre de la sesion debe ser igual al
	// configurado en ese archivo
	String K_SESSION_NAME = "kbackward-chaining-session";

	KieSession sessionStatefull;
	static KieContainer kieContainer;

	FactHandle ojoDir;
	
	public BackwardTestCases() {
	}
	
	@BeforeClass
	public static void beforeallTestSetup() {
		kieContainer = KnowledgeSessionHelper.createRuleBase();
	}
	
	private void prepareKnowledgeSession() {
		sessionStatefull = KnowledgeSessionHelper.getStatefulKnowledgeSessionWithCallback(kieContainer, K_SESSION_NAME);
        
		Agenda agenda = sessionStatefull.getAgenda();
		// En primer lugar, se tiene la ultima fase de reglas a ejecutar
		agenda.getAgendaGroup("Prescripcion de problema de vision").setFocus();
		agenda.getAgendaGroup("Diagnostico Pupila").setFocus();
		agenda.getAgendaGroup("Diagnostico Retina").setFocus();
		agenda.getAgendaGroup("Diagnostico cristalino").setFocus();
		agenda.getAgendaGroup("Diagnostico cornea").setFocus();
		agenda.getAgendaGroup("Diagnostico preliminar").setFocus();
	}
	
	@Before
	public void setUp() {
		print("----------Start----------");
		print();
		this.prepareKnowledgeSession(); // Inicializa una nueva base de hechos
	}
	
	@After
	public void tearDown() {
		print();
		print("----------End----------");
		print();
	}
	
	@Test
	public void operacionConLaserTest() {
		
		print("Caso de prueba: Operacion Con Laser");
		Cornea cornea = new Cornea();
		Cristalino cristalino = new Cristalino();
		Esclerotica esclerotica = new Esclerotica();
		Iris iris = new Iris();
		Pupila pupila = new Pupila();
		Retina retina = new Retina();

		Ojo ojo = new Ojo(cornea, cristalino, esclerotica, iris, pupila, retina);
		
		print(ojo);
		sessionStatefull.insert(ojo);
		sessionStatefull.fireAllRules();

		Recomendacion recomendacion = ojo.getRecomendacion();
		AccionRecomendada valorEsperado = AccionRecomendada.OperacionConLaser;
		assertResults(recomendacion, valorEsperado);
	}


}
