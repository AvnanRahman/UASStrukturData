package UAS;

import java.util.Scanner;

public class Node {
    public int Nim;
    public String Name;
    public char Gender;
    public Node next; // pointer next
    public Node previous; // pointer sebelumnya

    public Node(String name, int nim, char gender) {
        Name = name;
        Nim = nim;
        Gender = gender;
    }

    public void tampilNode() {
        System.out.println("{" + Name + ", " + Nim + ", " + Gender + "}");
    }
}
// END OF NODE