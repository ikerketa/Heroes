public class HeroeJuego {

    public static void main(String[] args) {

        // Variables del personaje
        String nombre = "Alex";
        String clase = "Guerrero";

        int nivel = 1;
        int vida = 150;
        int monedas = 50;

        double velocidad = 4.5;

        boolean tieneMascota = true;

        // Mostrar información
        System.out.println("=== CREA TU HEROE ===");
        System.out.println("Nombre: " + nombre);
        System.out.println("Clase: " + clase);
        System.out.println("Nivel: " + nivel);
        System.out.println("Vida: " + vida);
        System.out.println("Monedas: " + monedas);
        System.out.println("Velocidad: " + velocidad);
        System.out.println("¿Tiene mascota? " + tieneMascota);

        // El héroe encuentra un tesoro
        monedas = monedas + 50;

        // Sube de nivel
        nivel = nivel + 1;

        System.out.println("\n=== DESPUES DE LA AVENTURA ===");
        System.out.println("Nivel actual: " + nivel);
        System.out.println("Monedas actuales: " + monedas);
    }
}