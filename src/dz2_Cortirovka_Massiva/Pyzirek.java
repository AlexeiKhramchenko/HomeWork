package dz2_Cortirovka_Massiva;
// Наверно я воспользовался не той библиотекой и мне понадобилось 2 часа что бы вникнуть и написать этот код
// поэтому решил его оставить тут, более легкий файл Pyzirekpolegche
class Pyzir {
    private long[] massiv;
    private int dlinna;

    public Pyzir(int max) {
        massiv = new long[max];
        dlinna = 0;
    }

    public void in (long chiclo){
            massiv[dlinna] = chiclo;
            dlinna++;
    }
    public void printer () {
        for (int i = 0; i < dlinna; i++) {
            System.out.print(massiv[i] + " ");
            System.out.println("");
        }
        System.out.println("--------");
    }
    public void swap ( int first , int second){
        long peremennaia = massiv[first];
        massiv[first] = massiv[second];
        massiv[second] = peremennaia;
    }
    public void zamena () {
        for (int out = dlinna - 1; out >= 1; out--) {
            for (int in = 0; in < out; in++) {
                if (massiv[in] > massiv[in + 1])
                    swap(in, in + 1);
            }
        }
    }
}

public class Pyzirek {
    public static void main(String[] args) {
        Pyzir array = new Pyzir (6);
        array.in(1);
        array.in(9);
        array.in(72);
        array.in(4);
        array.in(37);
        array.in(8);

        array.printer();
        array.zamena();
        array.printer();
    }
}