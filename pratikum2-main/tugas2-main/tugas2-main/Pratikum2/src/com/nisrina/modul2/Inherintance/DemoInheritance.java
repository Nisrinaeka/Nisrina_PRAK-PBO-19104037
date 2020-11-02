package com.nisrina.modul2.Inherintance;

public class DemoInheritance {
        public static void main( string[] args) {
            A superclass = new A();
            B subclass = new B();

            system.out.println("Masukin data ke SuperClass");
            superclass.x = 10;
            superclass.y = 50;
            superclass.printXY();

            subclass.x = 30;
            subclass.y = 40;
            subclass.z = 10;
            subclass.printXY();
            subclass.sunValue();

        }
    }
}
