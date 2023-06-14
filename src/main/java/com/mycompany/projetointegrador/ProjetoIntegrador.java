/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projetointegrador;

/**
 *
 * @author Carina
 */
public class ProjetoIntegrador {

    public static void main(String[] args) {
        try{
        TelaDeLogin tdl = new TelaDeLogin();
        tdl.setVisible(true);
        }catch(Exception e){
        e.printStackTrace();
        }
    }
}
