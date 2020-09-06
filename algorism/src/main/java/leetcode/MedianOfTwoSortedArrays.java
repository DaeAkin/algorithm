package leetcode;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
public class MedianOfTwoSortedArrays {

     public static void main(String[] args) {
        Solution solution = new Solution();
        assertThat(solution.findMedianSortedArrays(new int[]{1,3},new int[]{2})).isEqualTo(2.00000);

         assertThat(solution.findMedianSortedArrays(new int[]{1,2},new int[]{3,4})).isEqualTo(2.50000);

         assertThat(solution.findMedianSortedArrays(new int[]{0,0},new int[]{0,0})).isEqualTo(0.00000);

         assertThat(solution.findMedianSortedArrays(new int[]{},new int[]{1})).isEqualTo(1.00000);

         assertThat(solution.findMedianSortedArrays(new int[]{2},new int[]{})).isEqualTo(2.00000);

         System.out.println("테스트 성공");

         //소요시간 15분. 난이도 Hard
         //모범답안하고 비교해봤는데, 모범답안 코드가 개똥이다.
      }


      static class Solution {
              public double findMedianSortedArrays(int[] nums1, int[] nums2) {

                  List<Integer> collect1 = Arrays.stream(nums1)
                          .boxed()
                          .collect(Collectors.toList());

                  List<Integer> collect2 = Arrays.stream(nums2)
                          .boxed()
                          .collect(Collectors.toList());

                  List<Integer> ansCollect = Stream.concat(collect1.stream(), collect2.stream())
                          .sorted()
                          .collect(Collectors.toList());

                  int size = ansCollect.size();
                  if(size % 2 == 1) {
                      return ansCollect.get(size / 2 );
                  } {
                      return (ansCollect.get(size / 2 - 1) + ansCollect.get(size / 2 )) / 2.0;
                  }

              }
      }
}
