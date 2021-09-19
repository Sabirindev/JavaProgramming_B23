package day47_OOP_Inheritance_FinalKeyWord_RECAP.phoneTask;

public final class IPhone extends Phone{ // IPhone is a Phone

    public IPhone(String model,String size,String color,double price){
        super("Iphone",model,size,color,price);
    }

    @Override
    public void call(long phoneNumber) {
        System.out.println("Apple' iphone is calling "+phoneNumber);
    }

    public void call(long phone1,long phone2){
        call(phone1);
        call(phone2);
    }

    public void call(long phone1,long phone2, long phone3 ){
        call(phone1,phone2);
        call(phone3);
    }

    @Override
    public void text(long phoneNumber) {
        System.out.println("Apple' iphone is texting "+phoneNumber);
    }

    public final void faceTime(long phoneNumber){
        System.out.println(" Apple' iphone is doing facetime "+phoneNumber);
    }

    public final void faceTime(long phone1, long phone2){
        faceTime(phone1);
        faceTime(phone2);
    }
}
