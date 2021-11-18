package AccessB;

import AccessA.First;

public class Third  extends First {
    public static void main(String[] args){
        Third info = new Third();
        System.out.println(info.age);
        System.out.println(info.getAge());

    }
}