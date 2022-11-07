import java.time.LocalDate;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        IDateSorter sorter = new IDateSorterImpl();
        List<LocalDate> list = new LinkedList<>();
        list.add(LocalDate.of(2022, 12, 1));
        list.add(LocalDate.of(2022, 2, 1));
        list.add(LocalDate.of(2022, 9, 1));
        list.add(LocalDate.of(2022, 1, 1));
        list.add(LocalDate.of(2022, 3, 1));
        list.add(LocalDate.of(2022, 4, 1));
        list.add(LocalDate.of(2022, 5, 1));
        list.add(LocalDate.of(2022, 6, 1));
        list.add(LocalDate.of(2022, 7, 1));
        list.add(LocalDate.of(2022, 8, 1));
        list.add(LocalDate.of(2022, 11, 1));
        list.add(LocalDate.of(2022, 10, 1));

        sorter.sortDates(list).forEach(System.out::println);
    }
}
