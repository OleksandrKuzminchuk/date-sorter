import java.time.LocalDate;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class IDateSorterImpl implements IDateSorter{
    private static final Predicate<LocalDate> NO_R = date -> !date.getMonth().name().contains("R");
    private static final Comparator<LocalDate> BY_MONTH_R_ASC_NO_R_DESC =
            Comparator.comparing(NO_R::test)
                    .thenComparing(date -> NO_R.test(date) ? (-1) * date.toEpochDay() : date.toEpochDay());

    @Override
    public Collection<LocalDate> sortDates(List<LocalDate> unsortedDates) {
        unsortedDates.forEach(Objects::requireNonNull);
        return unsortedDates.stream()
                .sorted(BY_MONTH_R_ASC_NO_R_DESC)
                .collect(Collectors.toList());
    }
}
