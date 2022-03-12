package lesson22;

import lesson22.dto.Account;
import org.junit.Assert;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.math.BigDecimal;
import java.util.List;

public class AverageServiceTest2 {
    @Test
    public void shouldGetMaxBalance(){
        AccountService accountService = new AccountService();
        AccountDao mock = Mockito.mock(AccountDao.class);
        Mockito.when(mock.getAccounts()).thenReturn(
                List.of(Account.builder()
                        .balance(BigDecimal.valueOf(1000))
                        .build()));
        Assert.assertEquals(BigDecimal.valueOf(1000), accountService.getMaxBalance(mock));
    }
}
