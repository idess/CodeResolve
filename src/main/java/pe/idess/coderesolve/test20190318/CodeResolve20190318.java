package pe.idess.coderesolve.test20190318;

/**
 * 정수 배열(int array)가 주어지면 가장 큰 이어지는 원소들의 합을 구하시오. 단, 시간복잡도는 O(n).
 * Given an integer array, find the largest consecutive sum of elements.
 */
public class CodeResolve20190318 {

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
