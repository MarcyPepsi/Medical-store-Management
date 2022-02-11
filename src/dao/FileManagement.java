/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;
import model.Client;
import model.Company;
import model.Drug;
import model.Order;

/**
 *
 * @author Marcy GADEU
 */
public class FileManagement {
     public static void saveDrugs() throws ClassNotFoundException, IOException {
        try ( // Create an output stream for file array.dat
                ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("src\\dao\\drug.dat", false));) {
            // Write arrays to the object output stream
            output.writeObject(Database.listOfDrugs);
        }
    }

    public static void getDrugs() throws ClassNotFoundException, IOException {
     try ( // Create an input stream for file array.dat
                ObjectInputStream input
                = new ObjectInputStream(new FileInputStream("src\\dao\\drug.dat"));) 
        {
            Database.listOfDrugs.clear();
            List<Drug> list = (List<Drug>) (input.readObject());
            if(list != null)
                Database.listOfDrugs.addAll(list);
        }
    }
    public static void saveDrugID() throws ClassNotFoundException, IOException {
        try ( // Create an output stream for file array.dat
                
                ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("src\\dao\\drugID.dat", false));) {
            // Write arrays to the object output stream
            
            output.writeObject(Database.drugID);
        }
    }
    public static void getDrugID() throws ClassNotFoundException, IOException {
      try ( // Create an input stream for file array.dat
                ObjectInputStream input
                = new ObjectInputStream(new FileInputStream("src\\dao\\drugID.dat"));) 
        {
           Database.drugID = (int)input.readObject();
        } 
    }
    public static void saveOrderID() throws ClassNotFoundException, IOException {
        try ( // Create an output stream for file array.dat
                
                ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("src\\dao\\orderID.dat", false));) {
            // Write arrays to the object output stream
            
            output.writeObject(Database.orderID);
        }
    }
    public static void getOrderID() throws ClassNotFoundException, IOException {
      try ( // Create an input stream for file array.dat
                ObjectInputStream input
                = new ObjectInputStream(new FileInputStream("src\\dao\\orderID.dat"));) 
        {
           Database.orderID = (int)input.readObject();
        } 
    }
    public static void saveClientID() throws ClassNotFoundException, IOException {
        try ( // Create an output stream for file array.dat
                
                ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("src\\dao\\clientID.dat", false));) {
            // Write arrays to the object output stream
            
            output.writeObject(Database.clientID);
        }
    }
    public static void getClientID() throws ClassNotFoundException, IOException {
      try ( // Create an input stream for file array.dat
                ObjectInputStream input
                = new ObjectInputStream(new FileInputStream("src\\dao\\clientID.dat"));) 
        {
           Database.clientID = (int)input.readObject();
        } 
    }
    public static void saveFinance() throws ClassNotFoundException, IOException {
        try ( // Create an output stream for file array.dat
                
                ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("src\\dao\\finance.dat", false));) {
            // Write arrays to the object output stream
            
            output.writeObject(Database.finance);
        }
    }
    public static void getFinance() throws ClassNotFoundException, IOException {
      try ( // Create an input stream for file array.dat
                ObjectInputStream input
                = new ObjectInputStream(new FileInputStream("src\\dao\\finance.dat"));) 
        {
           Database.finance = (int)input.readObject();
        } 
    }
    public static void saveNumberOfClients() throws ClassNotFoundException, IOException {
        try ( // Create an output stream for file array.dat
                
                ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("src\\dao\\clientNumber.dat", false));) {
            // Write arrays to the object output stream
            
            output.writeObject(Database.numberOfClients);
        }
    }
    public static void getNumberOfClients() throws ClassNotFoundException, IOException {
      try ( // Create an input stream for file array.dat
                ObjectInputStream input
                = new ObjectInputStream(new FileInputStream("src\\dao\\clientNumber.dat"));) 
        {
           Database.numberOfClients = (int)input.readObject();
        } 
    }
    public static void saveOrder() throws ClassNotFoundException, IOException {
        try ( // Create an output stream for file array.dat
                ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("src\\dao\\order.dat", false));) {
            // Write arrays to the object output stream
            output.writeObject(Database.listOfOrders);
        }
    }

    public static void getOrders() throws ClassNotFoundException, IOException {
     try ( // Create an input stream for file array.dat
                ObjectInputStream input
                = new ObjectInputStream(new FileInputStream("src\\dao\\order.dat"));) 
        {
            Database.listOfOrders.clear();
            List<Order> list = (List<Order>) (input.readObject());
            if(list != null)
                Database.listOfOrders.addAll(list);
        }
    }
    public static void saveClients() throws ClassNotFoundException, IOException {
        try ( // Create an output stream for file array.dat
                ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("src\\dao\\client.dat", false));) {
            // Write arrays to the object output stream
            output.writeObject(Database.listOfClients);
        }
    }

    public static void getClients() throws ClassNotFoundException, IOException {
     try ( // Create an input stream for file array.dat
                ObjectInputStream input
                = new ObjectInputStream(new FileInputStream("src\\dao\\client.dat"));) 
        {
            Database.listOfClients.clear();
            List<Client> list = (List<Client>) (input.readObject());
            if(list != null)
                Database.listOfClients.addAll(list);
        }
    }
    public static void saveCompanies() throws ClassNotFoundException, IOException {
        try ( // Create an output stream for file array.dat
                ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("src\\dao\\company.dat", false));) {
            // Write arrays to the object output stream
            output.writeObject(Database.listOfCompanies);
        }
    }

    public static void getCompanies() throws ClassNotFoundException, IOException {
     try ( // Create an input stream for file array.dat
                ObjectInputStream input
                = new ObjectInputStream(new FileInputStream("src\\dao\\company.dat"));) 
        {
            Database.listOfCompanies.clear();
            List<Company> list = (List<Company>) (input.readObject());
            if(list != null)
                Database.listOfCompanies.addAll(list);
        }
    }
     public static void saveCompanyID() throws ClassNotFoundException, IOException {
        try ( // Create an output stream for file array.dat
                
                ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("src\\dao\\companyID.dat", false));) {
            // Write arrays to the object output stream
            
            output.writeObject(Database.companyID);
        }
    }
    public static void getCompanyID() throws ClassNotFoundException, IOException {
      try ( // Create an input stream for file array.dat
                ObjectInputStream input
                = new ObjectInputStream(new FileInputStream("src\\dao\\companyID.dat"));) 
        {
           Database.companyID = (int)input.readObject();
        } 
    }
    
    
}
