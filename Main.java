import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        List<Tovar> tovars = new ArrayList<>();
        tovars.add(new Tovar(1,"Наушники", 9.67));
        tovars.add(new Tovar(2,"Лампа", 3.44));
        tovars.add(new Tovar(3,"Стул", 44.23));
        tovars.add(new Tovar(4,"Зеркало", 11.34));
        tovars.add(new Tovar(5,"Корзина", 4.71));
        tovars.add(new Tovar(6,"Телефон", 237.09));
        tovars.add(new Tovar(7,"Блокнот", 0.69));
        System.out.println(tovars);
        Scanner scanner = new Scanner(System.in);
        List<Tovar> korzina = new ArrayList<>();
        while (true){ //бесконечно работает пока тру
            System.out.println("Введите номер товара, который хотите добавить в корзину, или 0 - чтобы закончить");
            int nomerTovara = scanner.nextInt();
            if (nomerTovara ==0){
                break;
            }
           boolean k = false;
            for (Tovar tovar : tovars){
                if (tovar.getNumber()==nomerTovara){
                    korzina.add(tovar);
                    System.out.println(tovar.getName()+". Добавлено в корзину!");
                    k=true;
                    break;
                }
            }
            if (!k){
                System.out.println("Неправильный код товара! Повторите снова.");
            }}
            if (!korzina.isEmpty()) { //если не пустая, проверка не пустой ли объект
                System.out.println("Твоя корзина: \n");
                double itogo = 0;
                for (Tovar tovar : korzina) {
                    System.out.println(tovar);
                    itogo += tovar.getCena();
                }
                System.out.printf("Итого: %.2f", itogo);
            } else {
                System.out.println("Корзина пуста!");
            }
            scanner.close();
    }
}
