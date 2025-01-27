public class TaskEight {
    //Todo: даны два ненулевых числа.
    // Найти сумму, разность, произведение и частное их квадратов.
    public static void main(String[] args) {
        int a,b,sum,raz,pro;
        double has;
        a = 1;
        b = 3;

        a = a * a;
        b = b * b;


        sum = a + b;
        raz = a - b;
        pro = a * b;
        has = a / b;

        System.out.println("Сумма = "+ sum);
        System.out.println("Разность = " + raz);
        System.out.println("Произведение = " + pro);
        System.out.println("Частное = " + has);

    }
}
