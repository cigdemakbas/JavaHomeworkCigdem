package org.example.HomeworkJan1;

public class Q47 {
}
class C1{
    C1 obj1= (C1) new C2();
}
class C2 extends C1{
    C2 obj2= (C2) new C3();
    C2 onj3= (C2) new C1();
}
class C3 extends C2{
    C3 onj4= (C3) obj2;

}

