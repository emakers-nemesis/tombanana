package com.example.emakers.tombanana;

import android.text.Editable;

import java.io.Serializable;

/**
 * Created by unclear on 18/07/17.
 */

public class Bananeira implements Serializable{

    private static final long serialVersionUID = 1L;

    private float Pra; // Peso da raquis
    private float Cen; // Comprimento do engaco
    private float Den; // Diametro do engaco
    private int Npc; // Numero total de pencas por cacho
    private int Nfr; // Numero de frutos por cacho
    private float Psp; // Peso da segunda penca
    private float Pfr; // Peso do fruto
    private float Cef; // Comprimento do fruto
    private float Dfr; // Diametro do fruto
    private float Nfc; // Numero de folhas vivas na colheita

    public Bananeira(float pra, float cen, float den, int npc, int nfr, float psp, float pfr, float cef, float dfr, float nfc) {
        Pra = pra;
        Cen = cen;
        Den = den;
        Npc = npc;
        Nfr = nfr;
        Psp = psp;
        Pfr = pfr;
        Cef = cef;
        Dfr = dfr;
        Nfc = nfc;
    }

    public Bananeira(){}

    public float getCen() {
        return Cen;
    }

    public float getDen() {
        return Den;
    }

    public int getNpc() {
        return Npc;
    }

    public int getNfr() {
        return Nfr;
    }

    public float getPsp() {
        return Psp;
    }

    public float getPfr() {
        return Pfr;
    }

    public float getCef() {
        return Cef;
    }

    public float getDfr() {
        return Dfr;
    }

    public float getNfc() {
        return Nfc;
    }

    public void setPra(float pra) {
        Pra = pra;
    }

    public void setCen(float cen) {
        Cen = cen;
    }

    public void setDen(float den) {
        Den = den;
    }

    public void setNpc(int npc) {
        Npc = npc;
    }

    public void setNfr(int nfr) {
        Nfr = nfr;
    }

    public void setPsp(float psp) {
        Psp = psp;
    }

    public void setPfr(float pfr) {
        Pfr = pfr;
    }

    public void setCef(float cef) {
        Cef = cef;
    }

    public void setDfr(float dfr) {
        Dfr = dfr;
    }

    public void setNfc(float nfc) {
        Nfc = nfc;
    }

    public float getPra() {
        return Pra;
    }

}
