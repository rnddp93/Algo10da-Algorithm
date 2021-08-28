import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution{
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[][]{{1, 4}, {3, 4}, {3, 10}})));
    }

    static int[] solution(int[][] coordis){
        int coordiSize = coordis.length;
        int coordiSize2 = coordis[0].length;
        List<Integer> commonList = new ArrayList<>();
        List<Integer> answerList = new ArrayList<>();

        for(int i = 0; i < coordis.length; i++){
            if(i == coordis.length - 1) break;
            for(int j = i + 1; j < coordiSize; j++){
                for(int z = 0; z < coordiSize2; z++){
                    if(coordis[i][z] == coordis[j][z]){
                        if(z==0){
                            commonList.add(0,coordis[i][z]);
                        }else{
                            commonList.add(coordis[i][z]);
                        }
                    }
                }
            }
        }

        Integer[] commonArr = commonList.toArray(new Integer[0]);
        System.out.println(Arrays.toString(commonArr));
        for(int i = 0; i < coordis.length; i++){
            for(int z = 0; z < coordiSize2; z++){
                if(z==0){
                    if(commonArr[0] == coordis[i][0] && commonArr[1] != coordis[i][1]){
                        answerList.add(coordis[i][1]);
                    }
                }else{
                    if(commonArr[1] == coordis[i][1] && commonArr[0] != coordis[i][0]){
                        answerList.add(0,coordis[i][0]);
                    }
                }
            }
        }
        Integer[] answerArr1 = answerList.toArray(new Integer[0]);
        int[] answerArr2= new int[answerArr1.length];

        for(int i = 0; i < answerArr1.length; i++){
            answerArr2[i] = answerArr1[i];
        }
        return answerArr2;
    }
}