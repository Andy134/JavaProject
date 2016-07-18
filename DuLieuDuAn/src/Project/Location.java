/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project;

/**
 *
 * @author tuananh
 */
public class Location {
    private String lat;
    private String lon;
    public String getLongtitude() {
        return lon;
    }

    /**
     * @param longtitude the longtitude to set
     */
    public void setLongtitude(String longtitude) {
        this.lon = longtitude;
    }

    /**
     * @return the latitude
     */
    public String getLatitude() {
        return lat;
    }

    /**
     * @param latitude the latitude to set
     */
    public void setLatitude(String latitude) {
        this.lat = latitude;
    }
}
