package client;

import java.net.MalformedURLException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import client_Dao.Dao_Package_Static;
import gui.FrmChinh;
import gui.FrmLogin;

public class Client {
    public static void main(String[] args) throws MalformedURLException, NotBoundException, RemoteException {
        String url = "rmi://26.139.190.148:7878/";
        
        Dao_Package_Static.init(url);
        
        FrmLogin frmLogin = new FrmLogin();
        frmLogin.setVisible(true);
    }
}



