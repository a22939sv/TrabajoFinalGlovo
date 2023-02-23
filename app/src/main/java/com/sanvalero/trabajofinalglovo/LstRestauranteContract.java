package com.sanvalero.trabajofinalglovo;

import com.sanvalero.trabajofinalglovo.entities.Restaurante;

import java.util.ArrayList;

public class LstRestauranteContract {
    public interface View{
        void successLstRestaurante(ArrayList<Restaurante> lstRestaurante, String msg);
        void failureLstRestaurante(String err);
    }
    public interface Presenter{
        // CASO DE USO
        void lstRestaurante(Restaurante restaurante);
    }
    public interface Model{
        interface OnLstRestauranteListener{
            void onSuccess(ArrayList<Restaurante> lstRestaurante);
            void onFailure(String error);
        }
        void lstRestauranteWS(Restaurante restaurante, OnLstRestauranteListener onLstRestauranteListener);
    }
}
