/**
 * 
 */

package br.com.decimal.fretado.entity;

/**
 * @author Vitor Hugo Oliveira
 *
 */
public class Marker {

	private int lat;
	private int lng;
	private String message;

	public int getLat() {
		return lat;
	}

	public void setLat(int lat) {
		this.lat = lat;
	}

	public int getLng() {
		return lng;
	}

	public void setLng(int lng) {
		this.lng = lng;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
