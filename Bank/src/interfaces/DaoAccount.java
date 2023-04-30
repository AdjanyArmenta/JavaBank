
package interfaces;

import model.Account;


public interface DaoAccount {
    
    public void addAccount(Account client) throws Exception;
    public void deleteAccount(Account client) throws Exception;
}
