package september.day04.three;

public class Queue {
    char[] q;
    int putloc, getloc;

    Queue(int size) {
        q = new char[size + 1];
        putloc = getloc = 0;
    }


     void put(char ch) {
        if (putloc == q.length - 1) {
            System.out.println("Очередь переполнена");
            return;
        }
         putloc++;
         q[putloc] = ch;
    }

    char get() {
        if (putloc == getloc) {
            System.out.println("Очередь пуста");
            return (char) 0;
        }
        getloc++;
        return q[getloc];
    }

}
