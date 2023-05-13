package util;

public class AnnUtils {

    public static double[][] transpose(double[][] elems){
        int rowSize= elems.length;
        int columnSize= elems[0].length;
        double [][] result = new double[columnSize][rowSize];
        for(int i=0;i<columnSize;i++){
            for(int j=0;j<rowSize;j++){
                result[i][j]=elems[j][i];
            }
        }
        return result;
    }

    public static double[] getColumn(double[][] elems,int column){
        double[] result = new double[elems.length];
        for(int i=0;i<elems.length;i++){
            result[i]=elems[i][column];
        }
        return result;
    }

    public static void print(double [][] elems){
        for(int i=0;i<elems.length;i++){
            for(int j=0;j<elems[0].length;j++){
                System.out.print(elems[i][j]+ " ");
            }
            System.out.println();
        }
    }

    public static void printColumn(double[] elems){
        for (int i=0;i<elems.length;i++){
            System.out.print(elems[i]+ " ");
        }
    }

    public static double sumFunction(double[] input, double[] weight){
        double result = 0.0;
        for(int i=0;i<input.length;i++){
            result+=input[i]*weight[i];
        }
        return result;
    }

    public static boolean fNet(double[] input, double [] weight, double output,double threshold){
        double result = sumFunction(input,weight);
        return result>threshold && result==output;
    }

    public static double[] leaning (double[][] inputs, double[] sWeights, double threshold, double learningCoefficient){
        double[][] transpose = transpose(inputs);
        int inputSize = inputs.length;
        int learnedSize=0;
        while(learnedSize != inputSize){
            
        }

    }



    public static void main(String[] args) {
        double [][] elems = {{1,2,3,4,5},{2,3,4,5,6},{3,4,5,6,7}};
        double [][] transpose=transpose(elems);
        double [] zeroColumn = getColumn(transpose,2);
        print(transpose);
        printColumn(zeroColumn);

        double[] weight={-0.2,0.6,0.2,-0.1,0.4};
        System.out.println();
        System.out.println(sumFunction(zeroColumn,weight));

    }
}
