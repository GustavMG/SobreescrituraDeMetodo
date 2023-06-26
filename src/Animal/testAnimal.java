package Animal;

public class testAnimal {

	public static void main(String[] args) {
		
		//Creamos un animal, en este momento usamos el metodo que imprime "hacer sonido", y cuando definimos que este animal es un gato, se sobreescribe el metodo y se cambia por "Miau miau"
		
		Animal chimuelito = new Gato();	//Miau Miau
		Animal Godzilla = new Animal();	//Hacer sonido
		
		chimuelito.hacerSonido();
		Godzilla.hacerSonido();
	}

}
