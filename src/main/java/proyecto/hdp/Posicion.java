
package proyecto.hdp;


public class Posicion {
    private double lat;
    private double lon;

    public Posicion (double lat, double lon) {
        this.lat = lat;
        this.lon = lon;
    }

    Posicion() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getLon() {
        return lon;
    }

    public void setLon(double lon) {
        this.lon = lon;
    }
}
