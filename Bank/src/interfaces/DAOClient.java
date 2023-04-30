package interfaces;

import model.Client;


public interface DAOClient {
    
    public void addClient(Client client) throws Exception;
    public void modifyClient(Client client) throws Exception;
    public void deleteClient(Client client) throws Exception;
}
