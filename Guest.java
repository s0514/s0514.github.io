package org.javaro.lecture;

public class Guest {
	private String name;
	private String PhoneNumber;
	private String DataOfBairth;
    public Guest(){}

    public String getName() {
        return name;
    }
    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setPhoneNumber(String PhoneNumber) {
        this.PhoneNumber = PhoneNumber;
    }

    public String toString(){
        return "�̸� : "+this.getName()+", ��ȭ��ȣ : "+this.getPhoneNumber();
    }
}