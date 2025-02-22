public class Main {
    public static void main(String[] args) {

        //задача 1: Калькулятор
        Calculator calc = Calculator.instance.get();

        try {
            int a = calc.plus.apply(1, 2);
            int b = calc.minus.apply(1, 1);
            int c = calc.devide.apply(a, b);
            calc.println.accept(c);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }

        //задача 2: Работяга
        OnTaskDoneListener listener = System.out::println;
        Worker worker = new Worker(listener);
        worker.start();

        Worker w = new Worker(s -> System.out.println(s + ". Вы хорошо поработали"));
        w.start();
    }
}