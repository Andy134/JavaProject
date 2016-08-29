/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author TuanAnh
 */
public class Marker {
    private String title;
    private String lon;
    private String lat;
    
    private String type;
    private String description;
    private String markerSize;
    private String markerSymbol;
    private String markerColor;
    private String stroke;
    private String strokeOpacity;
    private String fill;
    private String fillOpacity;

    
    public Marker(){};

    public Marker(String title, String lon, String lat) {
        this.title = title;
        this.lon = lon;
        this.lat = lat;
    }
    
    
    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return the lon
     */
    public String getLon() {
        return lon;
    }

    /**
     * @param lon the lon to set
     */
    public void setLon(String lon) {
        this.lon = lon;
    }

    /**
     * @return the lat
     */
    public String getLat() {
        return lat;
    }

    /**
     * @param lat the lat to set
     */
    public void setLat(String lat) {
        this.lat = lat;
    }

    /**
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the markerSize
     */
    public String getMarkerSize() {
        return markerSize;
    }

    /**
     * @param markerSize the markerSize to set
     */
    public void setMarkerSize(String markerSize) {
        this.markerSize = markerSize;
    }

    /**
     * @return the markerSymbol
     */
    public String getMarkerSymbol() {
        return markerSymbol;
    }

    /**
     * @param markerSymbol the markerSymbol to set
     */
    public void setMarkerSymbol(String markerSymbol) {
        this.markerSymbol = markerSymbol;
    }

    /**
     * @return the markerColor
     */
    public String getMarkerColor() {
        return markerColor;
    }

    /**
     * @param markerColor the markerColor to set
     */
    public void setMarkerColor(String markerColor) {
        this.markerColor = markerColor;
    }

    /**
     * @return the stroke
     */
    public String getStroke() {
        return stroke;
    }

    /**
     * @param stroke the stroke to set
     */
    public void setStroke(String stroke) {
        this.stroke = stroke;
    }

    /**
     * @return the strokeOpacity
     */
    public String getStrokeOpacity() {
        return strokeOpacity;
    }

    /**
     * @param strokeOpacity the strokeOpacity to set
     */
    public void setStrokeOpacity(String strokeOpacity) {
        this.strokeOpacity = strokeOpacity;
    }

    /**
     * @return the fill
     */
    public String getFill() {
        return fill;
    }

    /**
     * @param fill the fill to set
     */
    public void setFill(String fill) {
        this.fill = fill;
    }

    /**
     * @return the fillOpacity
     */
    public String getFillOpacity() {
        return fillOpacity;
    }

    /**
     * @param fillOpacity the fillOpacity to set
     */
    public void setFillOpacity(String fillOpacity) {
        this.fillOpacity = fillOpacity;
    }
    
    
}
