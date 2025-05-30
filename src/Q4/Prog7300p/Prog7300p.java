package Q4.Prog7300p;

import java.util.Arrays;

public class Prog7300p {
    public static void main(String[] args) {
        // And Neuron
        double[][] X_train = {
                {0,0},
                {0,1},
                {1,0},
                {1,1},
        };
        double[] y_train = {0,0,0,1};

        System.out.println("AND Neuron: ");
        var model = new Perceptron();
        model.fit(X_train, y_train, 15, 0.1);
        double[] y_pred = model.predict(X_train);
        System.out.println("Predicted: " + Arrays.toString(y_pred));
        System.out.println("Actual: " + Arrays.toString(y_train));
        System.out.println("Weights: " + Arrays.toString(model.getWeights()));
        System.out.println("Bias: " + model.getBias());


        // Not dataset
        X_train = new double[][]{
                {0},
                {1}
        };
        y_train = new double[]{1,0};

        System.out.println("\nNOT Neuron: ");
        model = new Perceptron();
        model.fit(X_train, y_train, 10, 0.1);
        y_pred = model.predict(X_train);
        System.out.println("Predicted: " + Arrays.toString(y_pred));
        System.out.println("Actual: " + Arrays.toString(y_train));
        System.out.println("Weights: " + Arrays.toString(model.getWeights()));
        System.out.println("Bias: " + model.getBias());

        // OR dataset
        X_train = new double[][]{
                {0,0},
                {0,1},
                {1,0},
                {1,1}
        };
        y_train = new double[]{0,1,1,1};

        System.out.println("\nOR Neuron: ");
        model = new Perceptron();
        model.fit(X_train, y_train, 20, 0.1);
        y_pred = model.predict(X_train);
        System.out.println("Predicted: " + Arrays.toString(y_pred));
        System.out.println("Actual: " + Arrays.toString(y_train));
        System.out.println("Weights: " + Arrays.toString(model.getWeights()));
        System.out.println("Bias: " + model.getBias());

        //NAND dataset
        X_train = new double[][]{
                {0,0},
                {0,1},
                {1,0},
                {1,1}
        };
        y_train = new double[]{1,1,1,0};

        System.out.println("\nNAND Neuron: ");
        model = new Perceptron();
        model.fit(X_train, y_train, 10, 0.1);
        y_pred = model.predict(X_train);
        System.out.println("Predicted: " + Arrays.toString(y_pred));
        System.out.println("Actual: " + Arrays.toString(y_train));
        System.out.println("Weights: " + Arrays.toString(model.getWeights()));
        System.out.println("Bias: " + model.getBias());

        //NOR dataset
        X_train = new double[][]{
                {0,0},
                {0,1},
                {1,0},
                {1,1}
        };
        y_train = new double[]{1,0,0,0};

        System.out.println("\nNOR Neuron: ");
        model = new Perceptron();
        model.fit(X_train, y_train, 27, 0.1);
        y_pred = model.predict(X_train);
        System.out.println("Predicted: " + Arrays.toString(y_pred));
        System.out.println("Actual: " + Arrays.toString(y_train));
        System.out.println("Weights: " + Arrays.toString(model.getWeights()));
        System.out.println("Bias: " + model.getBias());
    }
}
/*
AND Neuron:
Epoch 1 - Loss: 0.0
Epoch 2 - Loss: 0.25
Epoch 3 - Loss: 0.25
Epoch 4 - Loss: 0.25
Epoch 5 - Loss: 0.25
Epoch 6 - Loss: 0.25
Epoch 7 - Loss: 0.25
Epoch 8 - Loss: 0.25
Epoch 9 - Loss: 0.25
Epoch 10 - Loss: 0.25
Epoch 11 - Loss: 0.25
Epoch 12 - Loss: 0.25
Epoch 13 - Loss: 0.0
Epoch 14 - Loss: 0.0
Epoch 15 - Loss: 0.0
Predicted: [0.0, 0.0, 0.0, 1.0]
Actual: [0.0, 0.0, 0.0, 1.0]
Weights: [0.20823701523527463, 0.10252633634838992]
Bias: -0.2999999999999999

NOT Neuron:
Epoch 1 - Loss: 0.5
Epoch 2 - Loss: 0.5
Epoch 3 - Loss: 0.5
Epoch 4 - Loss: 0.5
Epoch 5 - Loss: 0.0
Epoch 6 - Loss: 0.0
Epoch 7 - Loss: 0.0
Epoch 8 - Loss: 0.0
Epoch 9 - Loss: 0.0
Epoch 10 - Loss: 0.0
Predicted: [1.0, 0.0]
Actual: [1.0, 0.0]
Weights: [-0.6416833003915688]
Bias: 0.6000000000000001

OR Neuron:
Epoch 1 - Loss: 0.0
Epoch 2 - Loss: 0.0
Epoch 3 - Loss: 0.0
Epoch 4 - Loss: 0.0
Epoch 5 - Loss: 0.0
Epoch 6 - Loss: 0.0
Epoch 7 - Loss: 0.0
Epoch 8 - Loss: 0.0
Epoch 9 - Loss: 0.0
Epoch 10 - Loss: 0.0
Epoch 11 - Loss: 0.0
Epoch 12 - Loss: 0.0
Epoch 13 - Loss: 0.0
Epoch 14 - Loss: 0.0
Epoch 15 - Loss: 0.0
Epoch 16 - Loss: 0.0
Epoch 17 - Loss: 0.0
Epoch 18 - Loss: 0.0
Epoch 19 - Loss: 0.0
Epoch 20 - Loss: 0.0
Predicted: [0.0, 1.0, 1.0, 1.0]
Actual: [0.0, 1.0, 1.0, 1.0]
Weights: [0.36045648171965183, 0.12927540149505545]
Bias: -0.09999999999999987

NAND Neuron:
Epoch 1 - Loss: 0.25
Epoch 2 - Loss: 0.25
Epoch 3 - Loss: 0.25
Epoch 4 - Loss: 0.25
Epoch 5 - Loss: 0.0
Epoch 6 - Loss: 0.0
Epoch 7 - Loss: 0.0
Epoch 8 - Loss: 0.0
Epoch 9 - Loss: 0.0
Epoch 10 - Loss: 0.0
Predicted: [1.0, 1.0, 1.0, 0.0]
Actual: [1.0, 1.0, 1.0, 0.0]
Weights: [-0.5394685738259871, -0.09951288091635735]
Bias: 0.6000000000000001

NOR Neuron:
Epoch 1 - Loss: 0.25
Epoch 2 - Loss: 0.25
Epoch 3 - Loss: 0.25
Epoch 4 - Loss: 0.25
Epoch 5 - Loss: 0.25
Epoch 6 - Loss: 0.25
Epoch 7 - Loss: 0.25
Epoch 8 - Loss: 0.25
Epoch 9 - Loss: 0.25
Epoch 10 - Loss: 0.25
Epoch 11 - Loss: 0.0
Epoch 12 - Loss: 0.0
Epoch 13 - Loss: 0.0
Epoch 14 - Loss: 0.0
Epoch 15 - Loss: 0.0
Epoch 16 - Loss: 0.0
Epoch 17 - Loss: 0.0
Epoch 18 - Loss: 0.0
Epoch 19 - Loss: 0.0
Epoch 20 - Loss: 0.0
Epoch 21 - Loss: 0.0
Epoch 22 - Loss: 0.0
Epoch 23 - Loss: 0.0
Epoch 24 - Loss: 0.0
Epoch 25 - Loss: 0.0
Epoch 26 - Loss: 0.0
Epoch 27 - Loss: 0.0
Predicted: [1.0, 0.0, 0.0, 0.0]
Actual: [1.0, 0.0, 0.0, 0.0]
Weights: [-0.4533832786883037, -0.492466957993286]
Bias: 0.4399999999999995

*/