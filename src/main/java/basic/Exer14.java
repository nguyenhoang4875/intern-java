package basic;

import java.util.ArrayList;
import java.util.List;

public class Exer14 {

    public List<Integer> findNumbers() {
        List<Integer> listNumber = new ArrayList<>();

        for (int i = 10; i < 99999; i++) {
            int sum;
            int temp;
            if (i / 100 == 0) {
                sum = 0;
                temp = i;
                for (int j = 1; j <= 2; j++) {
                    sum += (temp % 10) * (temp % 10);
                    temp = temp / 10;
                }
                if (sum == i) {
                    listNumber.add(i);
                }
            } else if (i / 1000 == 0) {
                sum = 0;
                temp = i;
                for (int j = 1; j <= 3; j++) {
                    sum += (temp % 10) * (temp % 10) * (temp % 10);
                    temp = temp / 10;
                }
                if (sum == i) {
                    listNumber.add(i);
                }
            } else if (i / 10000 == 0) {
                sum = 0;
                temp = i;
                for (int j = 1; j <= 4; j++) {
                    sum += (temp % 10) * (temp % 10) * (temp % 10) * (temp % 10);
                    temp = temp / 10;
                }
                if (sum == i) {
                    listNumber.add(i);
                }
            } else {
                sum = 0;
                temp = i;
                for (int j = 1; j <= 5; j++) {
                    sum += (temp % 10) * (temp % 10) * (temp % 10) * (temp % 10) * (temp % 10);
                    temp = temp / 10;
                }
                if (sum == i) {
                    listNumber.add(i);
                }
            }
        }
        return listNumber;
    }
}
