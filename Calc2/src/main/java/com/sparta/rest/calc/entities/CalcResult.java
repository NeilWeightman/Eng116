package com.sparta.rest.calc.entities;

public class CalcResult {
    private int first;
    private int second;
    private String operation;
    private int result;

    public CalcResult(int first, int second, String operation, int result) {
        this.first = first;
        this.second = second;
        this.operation = operation;
        this.result = result;
    }

    public int getFirst() {
        return first;
    }

    public void setFirst(int first) {
        this.first = first;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }
}
