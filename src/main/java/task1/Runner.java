package task1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Runner {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans1.xml");

        A a = context.getBean("a", A.class);
        System.out.println(a);

        B b = context.getBean("b", B.class);
        System.out.println(b);

        C c = context.getBean("c", C.class);
        System.out.println(c);

        D d = c.returnNewD();
        System.out.println("d: " + d);
        D dd = c.returnNewD();
        System.out.println("dd: " + dd);
        System.out.println(d == dd);

        E e = context.getBean("e", E.class);
        System.out.println(e);
        e.scream();

        F f = context.getBean("f", F.class);
        System.out.println(f);
        context.close();
    }
}
