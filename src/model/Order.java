/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;

/**
 *
 * @author Marcy GADEU
 */
public class Order implements Serializable{
     private int orderID;
    private String itemName;
    private int quantity;
    private int unitprice;
    private int total;
    
}
