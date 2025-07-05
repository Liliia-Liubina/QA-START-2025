package org.prog.session3.phones;

public class AndroidPhone extends Phone implements ICamera {

    @Override
    public void toTakePhoto(int photos) {
        System.out.println("AndroidPhone takes " + photos + " photos");
    }
}