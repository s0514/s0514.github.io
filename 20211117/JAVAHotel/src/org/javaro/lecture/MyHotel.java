package org.javaro.lecture;
import java.util.Scanner;
public class MyHotel {
	public static void main(String[] args){
		Hotel myHotel = new Hotel("ȣ��");
        Scanner scan = new Scanner(System.in);
        System.out.print("�̸� : ");
        String guest = scan.next();
        System.out.print("��ȭ��ȣ : ");
        String PhoneNumber = scan.next();
        System.out.print("���� ��ȣ : ");
        String Room = scan.next();
        System.out.print("������ : ");
        String ReservationDate = scan.next();
        
        Room room1 = new Room(Room);
        room1.setReservationDate(ReservationDate); 
        room1.setRoomPrice("100000��");
       
        
        Guest guest1 = new Guest();
    
        guest1.setName(guest);
        guest1.setPhoneNumber(PhoneNumber);
        
        myHotel.addRoom(room1);
        myHotel.addGuest(guest1);
        
        System.out.println(Room+"ȣ�� "+guest+"���� ����");
        System.out.println("ȣ�� ���� �ý��� ����");
        myHotel.printStatus();
        myHotel.checkOut(room1,guest1);
        System.out.println(room1+" ���");
        myHotel.printStatus();
        myHotel.checkIn(room1);
    }
}
