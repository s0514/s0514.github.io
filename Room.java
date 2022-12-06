package org.javaro.lecture;

public class Room {
	private String RoomNumber;	private String RoomPrice;	private String ReservationDate;	private Guest guest;
    public Room(String RoomNumber){this.RoomNumber = RoomNumber;}

    public String getRoomNumber() {
        return RoomNumber;
    }

    public void setRoomNumber(String RoomNumber) {
        this.RoomNumber = RoomNumber;
    }

    public String getRoomPrice() {
        return RoomPrice;
    }

    public void setRoomPrice(String RoomPrice) {
        this.RoomPrice = RoomPrice;
    }
    
    public String getReservationDate() {
        return ReservationDate;
    }

    public void setReservationDate(String ReservationDate) {
        this.ReservationDate = ReservationDate;
    }

    public Guest getGuest() {
        return guest;
    }

    public void setGuest(Guest guest) {
        this.guest = guest;
    }
    public String toString(){
        String available;
        if(this.getGuest() == null){
            available = "예약가능";
        }
        else{
        	available = "예약자 "+ this.getGuest().getName();
        	}
        return "객실 번호 : "+this.getRoomNumber()+", 객실 가격 : "+this.getRoomPrice()+", 예약일 : " + this.getReservationDate()+", "+available;
    }
}
