package org.prog.session3;

import org.prog.session3.phones.AndroidPhone;
import org.prog.session3.phones.ICamera;
import org.prog.session3.phones.IPhone;
import org.prog.session3.poly.Mazda;

public class HomeWork3Auto {

    public static void toTakePhoto(ICamera androidPhone) {
        androidPhone.toTakePhoto(2);

    }
    public static void main(String[] args) {
           Mazda mazda = new Mazda();
           AndroidPhone androidPhone = new AndroidPhone();
           IPhone iPhone = new IPhone();

           toTakePhoto(androidPhone);
           toTakePhoto(iPhone);
           System.out.println("_______________________________________");


           mazda.driveTo("Kyiv");
           System.out.println("_______________________________________");
           mazda.driveTo("Kyiv", "Odessa");
           System.out.println("_______________________________________");
           mazda.driveTo("Kyiv", "Odessa", "Uman");
           System.out.println("_______________________________________");
           mazda.driveTo("Lviv", "Kyiv", "Vinnytsia", 4);
           System.out.println("_______________________________________");
           mazda.driveTo("Kyiv", "Odessa", "gas station", 4, 100);
    }



}
