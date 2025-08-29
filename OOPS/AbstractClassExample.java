public class AbstractClassExample {
    public static void main(String[] args) {
        College c = new KIIET();  
        c.Register();
        c.Infrastructure();
        c.Students();
        c.Staff();
        c.medicalFacility();
    }
}

abstract class College {
    abstract void Register();
    abstract void Infrastructure();
    abstract void Students();
    abstract void Staff();

    void medicalFacility() {
        System.out.println("Medical facilities are optional");
    }
}

class KIIET extends College {
    void Register() {
        System.out.println("Register for KIET");
    }
    void Infrastructure() {
        System.out.println("Good Infrastructure");
    }
    void Students() {
        System.out.println("Many Students");
    }
    void Staff() {
        System.out.println("Many Faculties");
    }
    void medicalFacility() {
        System.out.println("Medical facilities available at KIET");
    }
}
