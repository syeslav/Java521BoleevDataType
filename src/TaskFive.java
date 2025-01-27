public class TaskFive {
    //Todo:5.	Дано расстояние L в сантиметрах.
    // Используя операцию деления нацело,
    // найти количество полных метров в нем (1 метр = 100 см).
        public static void main(String[] args) {
            int l, cm, m;
            l = 120;
            cm = 100;

            m = l / cm;

            System.out.println("Кол-во метров = " + m);
        }
}
