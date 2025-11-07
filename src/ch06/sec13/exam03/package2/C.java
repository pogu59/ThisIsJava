package ch06.sec13.exam03.package2;

import ch06.sec13.exam03.package1.*;

public class C {
    public C() {
        A a = new A();
        //패키지 또한 다르기 때문에 private, default 접근 불가

        a.field1 = 1;
      /*a.field2 = 1;
        a.field3 = 1; */

        a.method1();
      /*a.method2();
        a.method3();*/

    }
}
