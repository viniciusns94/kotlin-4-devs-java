package org.example.section06._0602;

public class Animal {

    private final String mNome;
    private final String mTipo;
    private Integer mPeso;

    public Animal(String nome, String tipo, Integer peso) {
        this.mNome = nome;
        this.mTipo = tipo;
        this.mPeso = peso;
    }

    public String show() {
        return mNome + " é um " + mTipo + " e pesa " + mPeso + " kg";
    }

    public String getmNome() {
        return mNome;
    }

    public String getmTipo() {
        return mTipo;
    }

    public Integer getmPeso() {
        return mPeso;
    }

    public void setmPeso(Integer mPeso) {
        this.mPeso = mPeso;
    }
}
