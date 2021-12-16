package com.calculator.utils;

import com.calculator.Token;

public class CheckForCalculationErrors {
    public static void checkArithmeticErrors(Token operator, double left, double right) {
        switch(operator.getType()){
            case EXP:
                if(left == 0.0 && right == 0.0){
                    throw new Error("Indeterminate form was encountered :'(");
                }
                else if(left == 1.0 && Double.isInfinite(right)){
                    throw new Error("Indeterminate form was encountered :'(");
                }
                else if(left == -1.0 && Double.isInfinite(right)){
                    throw new Error("Indeterminate form was encountered :'(");
                }
                else if(Double.isInfinite(left) && right == 0.0){
                    throw new Error("Indeterminate form was encountered :'(");
                }
            case STAR:
                if((Double.isInfinite(left) && right == 0.0) || (Double.isInfinite(right) && left == 0.0)){
                    throw new Error("Indeterminate form was encountered :'(");
                }
            case SLASH:
                if(right == 0.0) {
                    if(left == 0.0) {
                        throw new Error("Indeterminate form was encountered :'(");
                    }
                    throw new Error("Divide by 0 error >:(");
                }
                if(Double.isInfinite(left) && Double.isInfinite(right)) {
                    throw new Error("Indeterminate form was encountered :'(");
                }
            case MINUS:
                if(Double.isInfinite(left) && Double.isInfinite(right)){
                    throw new Error("Indeterminate form was encountered :'(");
                }

        }

    }
}
