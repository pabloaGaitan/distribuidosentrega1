/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.javeriana.main;

import co.edu.javeriana.data.DataObject;
import co.edu.javeriana.thread.MainThread;
import co.edu.javeriana.thread.ColaServidorThread;
import co.edu.javeriana.thread.ServidorThread;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class DistribuidosCoordinador {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ServidorThread st = new ServidorThread();
        //ColaServidorThread cst = new ColaServidorThread();
        MainThread ct = new MainThread();
        //ColaClienteThread cct = new ColaClienteThread();
        st.start();
        //cst.start();
        ct.start();
        //cct.start();
    }
    
}
