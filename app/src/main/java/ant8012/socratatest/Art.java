package ant8012.socratatest;

import com.socrata.android.client.SodaEntity;
import com.socrata.android.client.SodaField;
import com.socrata.android.soql.datatypes.Location;

/**
 * Created by Antony on 3/20/2016.
 *  Represents an instance of an entry in the Austin Art database
 *  http://www.opendatanetwork.com/dataset/data.austintexas.gov/yqxj-7evp
 *  Can be used as a point of abstraction between what the UI activity sees and what the Socrata API sets
 */

@SodaEntity
public class Art {

    @SodaField("artist_full_name")
    private String artist_full_name;

    @SodaField("art_title")
    private String art_title;

    @SodaField("art_location_name")
    private String art_location_name;

    @SodaField("art_location_street_address")
    private String art_location_street_address;

    @SodaField("art_location_city")
    private String art_location_city;

    @SodaField("art_location_state")
    private String art_location_state;

    @SodaField("art_location_zip")
    private String art_location_zip;

    @SodaField("images")
    private String images;

    @SodaField("web_detail_page")
    private String web_detail_page;

    @SodaField("location")
    private Location location;

    public String getArtist_full_name() {
        return artist_full_name;
    }

    public void setArtist_full_name(String artist_full_name) {
        this.artist_full_name = artist_full_name;
    }

    public String getArt_title() {
        return art_title;
    }

    public void setArt_title(String art_title) {
        this.art_title = art_title;
    }

    public String getArt_location_name() {
        return art_location_name;
    }

    public void setArt_location_name(String art_location_name) {
        this.art_location_name = art_location_name;
    }

    public String getArt_location_street_address() {
        return art_location_street_address;
    }

    public void setArt_location_street_address(String art_location_street_address) {
        this.art_location_street_address = art_location_street_address;
    }

    public String getArt_location_city() {
        return art_location_city;
    }

    public void setArt_location_city(String art_location_city) {
        this.art_location_city = art_location_city;
    }

    public String getArt_location_state() {
        return art_location_state;
    }

    public void setArt_location_state(String art_location_state) {
        this.art_location_state = art_location_state;
    }

    public String getArt_location_zip() {
        return art_location_zip;
    }

    public void setArt_location_zip(String art_location_zip) {
        this.art_location_zip = art_location_zip;
    }

    public String getImages() {
        return images;
    }

    public void setImages(String images) {
        this.images = images;
    }

    public String getWeb_detail_page() {
        return web_detail_page;
    }

    public void setWeb_detail_page(String web_detail_page) {
        this.web_detail_page = web_detail_page;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }
}
