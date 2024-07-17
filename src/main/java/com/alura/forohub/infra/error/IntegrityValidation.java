package com.alura.forohub.infra.error;

public class IntegrityValidation extends RuntimeException {
    public IntegrityValidation(String s) {
        super(s);
    }
}