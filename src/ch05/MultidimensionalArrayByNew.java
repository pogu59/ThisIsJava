package ch05;

public class MultidimensionalArrayByNew {
    public static void main(String[] args) {
        int[][] mathScores = new int[2][3];
        //2개의 반의 3명씩 들어가 있는 2차원 배열

        for(int i=0; i < mathScores.length; i++) {
            for(int j=0; j < mathScores[i].length; j++) {
                System.out.println("mathScores["+i+"]["+j+"] = "+mathScores[i][j]);
            }
        }
        System.out.println();
        mathScores[0][0] = 80;
        mathScores[0][1] = 83;
        mathScores[0][2] = 85;
        mathScores[1][0] = 86;
        mathScores[1][1] = 90;
        mathScores[1][2] = 92;
        int totalStudent = 0;
        int totalMathSum = 0;
        for(int i=0; i < mathScores.length; i++) {
            totalStudent += mathScores[i].length;
            for (int j=0; j < mathScores[i].length; j++) {
                totalMathSum += mathScores[i][j];
            }
        }
        System.out.println("전체 학생 평균:" + totalMathSum/totalStudent);
        
    }
}
