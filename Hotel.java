package org.javaro.lecture;
import java.util.ArrayList;
import org.javaro.lecture.Room;
import org.javaro.lecture.Guest;

public class Hotel {
	int TotalRoom = 16;
	public String hotelName;	public ArrayList<Room> rooms;	public ArrayList<Guest>guests;
    public Hotel(String hotelName){
        this.hotelName = hotelName;	rooms = new ArrayList<Room>(); guests = new ArrayList<Guest>();
    }
    public String getHotelName() {
        return hotelName;
    }
    public ArrayList<Room> getRooms() {
        return rooms;
    }
    public ArrayList<Guest> getGuest() {
        return guests;
    }
    public void addRoom(Room room){
    	this.rooms.add(room);
    }
    public void removeRoom(Room room){
        this.rooms.remove(room);
    }
    public void addGuest(Guest guest){
        this.guests.add(guest);
    }
    public void removeGuest(Guest guest){
        this.guests.remove(guest);
    }

    public boolean checkOut(Room room, Guest guest) {
        if (room.getGuest() == null) {
            room.setGuest(guest);
            return true;
        } else {
            return false;
        }
    }
    public boolean checkIn(Room room){
        if(room.getGuest()!= null){
            room.setGuest(null);
            return true;            
        }
        else{
        	return false;
        }
	}
    public ArrayList<Room> getRoomsForGuest(Guest guest){
        ArrayList<Room>result = new ArrayList<Room>();
        for(Room aRoom: this.getRooms()){
            if((aRoom.getGuest() != null)&&(aRoom.getGuest().getName().equals(guest.getName()))){
            	result.add(aRoom);
            }
        }
        return result;
    }
    public ArrayList<Room> getAvailableRooms(){
        ArrayList<Room> result = new ArrayList<Room>();
        for(Room aRoom: this.getRooms()){
            if(aRoom.getGuest() == null){
                result.add(aRoom);
            }
        }
        return result;
    }
    
    public ArrayList<Room> getUnavailableRooms(){
        ArrayList<Room> result = new ArrayList<Room>();
        for(Room aRoom: this.getRooms()){
            if(aRoom.getGuest() != null){
            	result.add(aRoom);
            }
        }
        return result;
    }
    public String toString(){
        return this.getHotelName()+"의 보유객실 : "+
                TotalRoom+", 예약자 : "+
                this.getGuest().size();

    }
    public void printStatus(){
        System.out.println("-- 객실 현황 --\n"+this.toString());
        for(Room aRoom : this.getRooms()){
            System.out.println(aRoom.toString());
        }
        System.out.println("현재 예약 가능한 객실 : "+(TotalRoom-this.getAvailableRooms().size()));
        System.out.println("--리포트 종료--");
    }
}
