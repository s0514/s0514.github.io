package org.javaro.lecture;
import java.util.Scanner;
public class MyHotel {
	public static void main(String[] args){
		Hotel myHotel = new Hotel("호텔");
        Scanner scan = new Scanner(System.in);
        System.out.print("이름 : ");
        String guest = scan.next();
        System.out.print("전화번호 : ");
        String PhoneNumber = scan.next();
        System.out.print("객실 번호 : ");
        String Room = scan.next();
        System.out.print("예약일 : ");
        String ReservationDate = scan.next();
        
        Room room1 = new Room(Room);
        room1.setReservationDate(ReservationDate); 
        room1.setRoomPrice("100000원");
       
        
        Guest guest1 = new Guest();
    
        guest1.setName(guest);
        guest1.setPhoneNumber(PhoneNumber);
        
        myHotel.addRoom(room1);
        myHotel.addGuest(guest1);
        
        System.out.println(Room+"호를 "+guest+"님이 예약");
        System.out.println("호텔 관리 시스템 생성");
        myHotel.printStatus();
        myHotel.checkOut(room1,guest1);
        System.out.println(room1+" 퇴실");
        myHotel.printStatus();
        myHotel.checkIn(room1);
    }
}
