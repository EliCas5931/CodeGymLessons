package LevelThree;

public class HelloStarcraft {

//    Create 5 Zerg units, 3 Protoss units and 4 Terran units.
//    Give them all unique names.
//
//            Requirements:
//            •	Don't change the Zerg, Protoss, and Terran classes.
//            •	Create 5 Zerg objects and name each of them.
//            •	Create 3 Protoss objects and name each of them.
//            •	Create 4 Terran objects and name each of them.

    public static void main(String[] args) {
        //write your code here
        Zerg z1 = new Zerg();
        z1.name = "Andy";

        Zerg z2 = new Zerg();
        z2.name = "Bobby";

        Zerg z3 = new Zerg();
        z3.name =  "Cody";

        Zerg z4 = new Zerg();
        z4.name = "Dylan";

        Zerg z5 = new Zerg();
        z5.name = "Ethan";

        Protoss p1 = new Protoss();
        p1.name = "Frank";

        Protoss p2 = new Protoss();
        p2.name = "George";

        Protoss p3 = new Protoss();
        p3.name = "Henry";

        Terran t1 = new Terran();
        t1.name = "Ian";

        Terran t2 = new Terran();
        t2.name = "Jake";

        Terran t3 = new Terran();
        t3.name = "Kyle";

        Terran t4 = new Terran();
        t4.name = "Liam";

    }

    public static class Zerg {
        public String name;
    }

    public static class Protoss {
        public String name;
    }

    public static class Terran {
        public String name;
    }

}
