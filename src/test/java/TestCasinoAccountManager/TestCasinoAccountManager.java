package TestCasinoAccountManager;

import com.github.zipcodewilmington.casino.CasinoAccount;
import com.github.zipcodewilmington.casino.CasinoAccountManager;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class TestCasinoAccountManager {

    @Test
    public void testRegisterAccount(){
        CasinoAccountManager expectedManager = new CasinoAccountManager();
        CasinoAccount expectedAccount=new CasinoAccount("John","John1");
        expectedManager.registerAccount(expectedAccount);

        CasinoAccountManager actualManager = new CasinoAccountManager();
        CasinoAccount actualAccount = actualManager.createAccount("John","John1");
        actualManager.registerAccount(actualAccount);

        Assert.assertEquals(
                expectedManager.getAccount("John","John1").getPassword(),
                actualManager.getAccount("John","John1").getPassword()
        );

        Assert.assertEquals(
                expectedManager.getAccount("John","John1").getUsername(),
                actualManager.getAccount("John","John1").getUsername()
        );
    }
}
