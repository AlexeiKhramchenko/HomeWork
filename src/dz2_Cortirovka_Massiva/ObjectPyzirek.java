package dz2_Cortirovka_Massiva;
// Наверно я воспользовался не той библиотекой и мне понадобилось 2 часа что бы вникнуть и написать этот код
// поэтому решил его оставить тут, более легкий файл Pyzirekpolegche


public class ObjectPyzirek {
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