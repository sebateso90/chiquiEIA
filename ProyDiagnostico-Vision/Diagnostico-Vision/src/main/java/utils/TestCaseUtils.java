package utils;

import model.AccionRecomendada;
import model.Ojo;
import model.Recomendacion;

public class TestCaseUtils {

	public static void print(String title) {
		System.out.println(title);
	}

	public static void print() {
		print("");
	}
	
	public static void print(Ojo ojo) {
		print();
		print("Ojo");
		print("Cornea: " + ojo.getCornea());
		print("Cristalino: " + ojo.getCristalino());
		print("Esclerotica: " + ojo.getEsclerotica());
		print("Iris: " + ojo.getIris());
		print("Pupila: " + ojo.getPupila());
		print("Retina: " + ojo.getRetina());
		print();
	}
	
	public static void assertResults(Recomendacion recomendacion, AccionRecomendada valorEsperado) {
		AccionRecomendada accion = recomendacion.getAccion();
		printResults(accion.toString(), valorEsperado.toString());
		assert(accion.isa(valorEsperado));
	}
	
	private static void printResults(String result, String expected) {
		print("Resultados");
		print("Esperaba: " + expected);
		print("Recibi: " + result);
		Boolean isOk = result.equals(expected);
		String condition = isOk ? "Ok" : "Fallo";
		print("Caso de prueba: "+ condition);
	}
}
