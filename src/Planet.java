public enum Planet {
    MERCURY(1, 0, 2439.7, null, 57.9),
    VENUS(2, 108.2, 6051.8, MERCURY, 108.9),
    EARTH(3, 149.6, 6371.0, VENUS, 152.1),
    MARS(4, 227.9, 3389.5, EARTH, 249.2),
    JUPITER(5, 778.3, 69911, MARS, 816.6),
    SATURN(6, 1427, 58232, JUPITER, 1514),
    URANUS(7, 2871, 25362, SATURN, 3004),
    NEPTUNE(8, 4497, 24622, URANUS, 0);

    private final int position;
    private final double distanceFromPrevious;
    private final double distanceFromSun;
    private final double radius;
    private final Planet previous;
    Planet(int position, double distanceFromPrevious, double radius, Planet previous, double distanceFromSun) {
        this.position = position;
        this.distanceFromPrevious = distanceFromPrevious;
        this.radius = radius;
        this.previous = previous;

        if (previous == null) {
            this.distanceFromSun = distanceFromSun;
        } else {
            this.distanceFromSun = previous.getDistanceFromSun() + distanceFromPrevious;
        }
    }

    public int getPosition() {
        return position;
    }

    public double getDistanceFromPrevious() {
        return distanceFromPrevious;
    }

    public double getDistanceFromSun() {
        return distanceFromSun;
    }
    public double getRadius() {
        return radius;
    }

    public Planet getPrevious() {
        return previous;
    }
}
