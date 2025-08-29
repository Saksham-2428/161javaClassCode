package KIET;

public class encapsulation {
    public static void main(String[] args) {
        encapsulationInstance obj = new encapsulationInstance();
        obj.setPin(123);
        obj.setAmount(999);
        System.out.println(obj.getAmount());
        System.out.println(obj.getupiPin());
    }    
    
}
