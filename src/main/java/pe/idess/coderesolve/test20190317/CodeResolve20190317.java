package pe.idess.coderesolve.test20190317;

import lombok.extern.slf4j.Slf4j;
import pe.idess.coderesolve.test20190318.CodeResolve20190318;

/**
 * 정수 배열(int array)가 주어지면 가장 큰 이어지는 원소들의 합을 구하시오. 단, 시간복잡도는 O(n).
 * Given an integer array, find the largest consecutive sum of elements.
 * 예제}
 * Input: [-1, 3, -1, 5]
 * Output: 7 // 3 + (-1) + 5
 *
 * Input: [-5, -3, -1]
 * Output: -1 // -1
 *
 * Input: [2, 4, -2, -3, 8]
 * Output: 9 // 2 + 4 + (-2) + (-3) + 8
 */
@Slf4j
public class CodeResolve20190317 {

    public CodeResolve20190317() {
        int input20190317_1[] = {-1, 3, -1, 5};
        int output20180317 = resolve(input20190317_1);
        log.info("CodeResolve20190317 input {} : output {}", input20190317_1, output20180317);

        int input20190317_2[] = {-5, -3, -1};
        output20180317 = resolve(input20190317_2);
        log.info("CodeResolve20190317 input {} : output {}", input20190317_2, output20180317);

        int input20190317_3[] = {2, 4, -2, -3, 8};
        output20180317 = resolve(input20190317_3);
        log.info("CodeResolve20190317 input {} : output {}", input20190317_3, output20180317);
    }

    public int resolve(int[] inputs) {
        int maxSum = inputs[0];
        int currentSum = inputs[0]; // 처음부터 이어지는 합계 혹은 최근에 가져온 값중 큰 값

        for (int i = 1; i < inputs.length; i++) {
            currentSum = Math.max(currentSum + inputs[i], inputs[i]);
            maxSum = Math.max(currentSum, maxSum);
        }

        return maxSum;
    }
}
