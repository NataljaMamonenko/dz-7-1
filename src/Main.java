public class Main {
    public static void main(String[] args) {
        for (Planet planet : Planet.values()) {
            System.out.println(planet.name() + " - Position: " + planet.getPosition() + ", Distance from previous planet: "
                    + planet.getDistanceFromPrevious() + ", Distance from the sun: " + planet.getDistanceFromSun()
                    + ", Radius: " + planet.getRadius() + ", Previous planet: "
                    + (planet.getPrevious() != null ? planet.getPrevious().name() : "None"));
        }
    }
}