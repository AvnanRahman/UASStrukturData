package UAS;

import java.util.Scanner;

public class DoubleLink {
    private Node first;
    private Node last;
    // Node newNode = new Node(dat1, dat2);

    public DoubleLink() {
        first = null;
        last = null;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public void insertFirst(String name, int nim, char gender) {
        Node newNode = new Node(name, nim, gender);
        if (isEmpty()) {
            last = newNode;
        } else {
            first.previous = newNode;
        }
        newNode.next = first;
        first = newNode;
    }

    public void insertLast(String name, int nim, char gender) {
        Node newNode = new Node(name, nim, gender);
        if (isEmpty()) {
            first = newNode;
        } else {
            last.next = newNode;
            newNode.previous = last;
        }
        last = newNode;
    }

    public Node deleteFirst() {
        Node temp = first;
        if (first.next == null) {
            first = null;
        } else {
            last.previous.next = null;
        }
        first = first.next;
        return temp;
    }

    public Node deleteLast() {
        Node temp = last;
        if (first.next == null) {
            first = null;
        } else {
            last.previous.next = null;
        }
        last = last.previous;
        return temp;
    }

    public boolean insertAfter(int dat, String name, int nim, char gender) {
        Node index = first;
        while (index.Nim != dat) {
            index = index.next;
            if (index == null) {
                return false;
            }
        }
        Node newNode = new Node(name, nim, gender);
        if (index == last) {
            last = newNode;
        } else {
            newNode.next = index.next;
            index.next.previous = newNode;
        }
        newNode.previous = index;
        index.next = newNode;
        return true;
    }

    public Node hapus(int dat) {
        Node index = first;
        while (index.Nim != dat) {
            index = index.next;
            if (index == null) {
                return null;
            }
        }
        if (index == first) {
            first = index.next;
        } else {
            index.previous.next = index.next;
        }

        if (index == last) {
            last = index.previous;
        } else {
            index.next.previous = index.previous;
        }
        return index;
    }

    public void tampilMaju() {
        System.out.println("List (First-->Last) : ");
        Node index = first;
        while (index != null) {
            index.tampilNode();
            index = index.next;
        }
        System.out.println("");
    }

    public void tampilMundur() {
        System.out.println("List (Last-->First) : ");
        Node index = last;
        while (index != null) {
            index.tampilNode();
            index = index.previous;
        }
        System.out.println("");
    }

    public void insertSort(String name, int nim, char gender) {
        char laki = 'L';
        char cewe = 'W';

        Node index = first;

        if (gender == 'l' || gender == 'L') {
            gender = 'L';
            if (isEmpty()) {
                insertFirst(name, nim, gender);
            } else {
                while (index.next != null && index.next.Gender != cewe && index.Nim >= index.next.Nim) {
                    index = index.next;
                }
                Node newNode = new Node(name, nim, gender);
                if (index == last) {
                    last = newNode;
                } else {
                    newNode.next = index.next;
                    index.next.previous = newNode;
                }
                newNode.previous = index;
                index.next = newNode;
            }

        } else if (gender == 'w' || gender == 'w') {
            boolean itr = true;
            gender = 'W';
            if (isEmpty()) {
                insertLast(name, nim, gender);
            } else {
                while (index.next != null && itr) {
                    while (index.next != null && index.next.Gender == laki) {
                        index = index.next;
                    }
                    while (index.next != null && index.Nim >= index.next.Nim) {
                        index = index.next;
                    }
                    itr = false;
                }

                Node newNode = new Node(name, nim, gender);
                if (index == last) {
                    last = newNode;
                } else {
                    newNode.next = index.next;
                    index.next.previous = newNode;
                }
                newNode.previous = index;
                index.next = newNode;
            }

        } else {
            System.out.println("");
            System.out.println("Masukkan Jenis kelamin L/W!!!");
        }

    }
}
