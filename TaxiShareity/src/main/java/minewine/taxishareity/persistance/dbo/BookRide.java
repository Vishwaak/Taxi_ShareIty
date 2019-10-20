/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minewine.taxishareity.persistance.dbo;

/**
 *
 * @author xerous
 */
public class BookRide {
    private String pickup_loc;
    private String drop_loc;
    private String No_people;
    private String time;
    private String date;

    
    public BookRide(String pickup_loc,String drop_loc,String No_people,String time,String date){
        
        this.pickup_loc = pickup_loc;
        this.drop_loc = drop_loc;
        this.No_people = No_people;
        this.time = time;
        this.date = date;
    }
    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getPickup_loc() {
        return pickup_loc;
    }

    public void setPickup_loc(String pickup_loc) {
        this.pickup_loc = pickup_loc;
    }

    public String getDrop_loc() {
        return drop_loc;
    }

    public void setDrop_loc(String drop_loc) {
        this.drop_loc = drop_loc;
    }

    public String getNo_people() {
        return No_people;
    }

    public void setNo_people(String No_people) {
        this.No_people = No_people;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
      
}
