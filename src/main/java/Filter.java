import java.util.List;
import java.util.stream.Collectors;

public class Filter {
    protected int threshold;

    public Filter(int threshold) {
        this.threshold = threshold;
    }

    public List<Integer> filterOut(List<Integer> source) {
        Logger logger = Logger.getInstance();
        List<Integer> result = source.stream()
                .filter(i -> {
                            if (i < threshold) {
                                logger.log("Элемент " + i + " проходит");
                            } else {
                                logger.log("Элемент " + i + " не проходит");
                            }
                            return i < threshold;
                        }
                ).collect(Collectors.toList());
        logger.log("Прошло фильтр " + result.size() + " элемента из " + source.size());
        return result;
    }
}
