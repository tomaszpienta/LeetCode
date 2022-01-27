import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllDuplicates {

    static List<Integer>  result, testList = Arrays.asList(1, null, 2, 1, 3, null, -1, 6, 1, 3);
    static int noumbreOfDiplicates = 2;

    public List<Integer> findAllDuplicate(List<Integer> testList, int noumbreOfDiplicates) {

        result = new ArrayList<>();
        int isDuplicated = 0;

        for (Integer sorted : testList) {
            if (sorted == null) {
                break;
            } else {
                for (int i = 1; i < testList.size(); i++) {
                    if (sorted.equals(testList.get(i))) {
                        isDuplicated++;
                    }
                    if (isDuplicated == noumbreOfDiplicates) {
                        result.add(testList.get(i));
                    }
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        //new FindAllDuplicates().findAllDuplicate(testList, noumbreOfDiplicates);
        List<Integer> allDuplicate = new FindAllDuplicates().findAllDuplicate(testList, noumbreOfDiplicates);
        System.out.println(allDuplicate);
    }
}
