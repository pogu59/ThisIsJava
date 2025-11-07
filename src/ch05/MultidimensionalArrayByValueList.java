package ch05;

public class MultidimensionalArrayByValueList {
    public static void main(String[] args) {
        int[][] scores = {{80,90,96}, {76,88}}; // 2차원 배열 2개의 반이 존재하고, 인덱스 0의 반은 3명, 인덱스 1의 반은 2명

        System.out.println("1차원 배열 길이(반의 수): "+scores.length);
        System.out.println("2차원 배열 길이(첫 번째 반의 학생 수): "+scores[0].length);
        System.out.println("2차원 배열 길이(두 번째 반의 학생 수): "+scores[1].length);

        System.out.println("scores[0][2]: "+scores[0][2]);
        System.out.println("scores[1][1]: "+scores[1][1]);

        int class1Sum = 0;
        for(int i=0; i<scores[0].length; i++){
            class1Sum += scores[0][i];
        }
        double class1Avg = (double) class1Sum / scores[0].length;
        System.out.println("첫 번째 반의 평균 점수: "+class1Avg);

        int class2Sum = 0;
        for(int i=0; i<scores[1].length; i++){
            class2Sum += scores[1][i];
        }
        double class2Avg = (double) class2Sum / scores[1].length;
        System.out.println("두 번째 반의 평균 점수: "+class2Avg);

        int totalStudent = 0;
        int totalSum = 0;
        for(int i=0; i<scores.length; i++){
            totalStudent += scores[i].length; //전체 학생 수 담기
            for(int j=0; j<scores[i].length; j++){
                totalSum += scores[i][j];
            }
        }

        double totalAvg = (double)totalSum/totalStudent;
        System.out.println("전체 학생의 평균 점수: "+totalAvg);
    }
}
