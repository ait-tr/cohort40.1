package lesson_24.code.lessoncode.arrayWithOutInterfaces;

public class Sklad {

    Device[] devices = new Device[5];

    public void fillSklad(){

        Computer computer1 = new Computer("MacBook", "MacBook Pro M1", 16,"M1");
        Computer computer2 = new Computer("Acer", "Aser computer", 17,"i5");
        Computer computer3 = new Computer("Asus", "Asus Computer", 15,"i7");

        TV tv1 = new TV("LG", "LG 3401", 34,"LED");
        TV tv2 = new TV("SAMSUNG", "5250", 52,"OLED");

        devices[0] = computer1;
        devices[1] = computer2;
        devices[2] = computer3;
        devices[3] = tv1;
        devices[4] = tv2;

    }

    public Device finByName(String searchName){
        for (int i = 0; i < devices.length; i++) {
            if (devices[i].name.equals(searchName)){
                return devices[i];
            }
        }
        return null;
    }

}
