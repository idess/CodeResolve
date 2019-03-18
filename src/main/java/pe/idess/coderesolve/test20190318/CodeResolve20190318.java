package pe.idess.coderesolve.test20190318;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;

/**
 * 피보나치 배열은 0과 1로 시작하며, 다음 피보나치 수는 바로 앞의 두 피보나치 수의 합이 된다. 정수 N이 주어지면, N보다 작은 모든 짝수 피보나치 수의 합을 구하여라.
 * Fibonacci sequence starts with 0 and 1 where each fibonacci number is a sum of two previous fibonacci numbers. Given an integer N, find the sum of all even fibonacci numbers.
 * 예제)
 * Input: N = 12
 * Output: 10 // 0, 1, 2, 3, 5, 8 중 짝수인 2 + 8 = 10.
 */
@Slf4j
public class CodeResolve20190318 {
    public int resolve(int input) {
        int sum = 0;

        ArrayList<Integer> fibonacci = new ArrayList<>();
        fibonacci.add(0);
        fibonacci.add(1);

        int currIdx = 2;

        while (true) {
            int currSum = fibonacci.get(currIdx - 1) + fibonacci.get(currIdx - 2);
            if (currSum > input) break;
            if (currSum % 2 == 0) sum += currSum;
            fibonacci.add(currSum);
            currIdx++;
        }

        log.info("CodeResolve20190318 Input : {}, fibonacci: {}, sum: {}", input, fibonacci, sum);

        return sum;
    }
}
